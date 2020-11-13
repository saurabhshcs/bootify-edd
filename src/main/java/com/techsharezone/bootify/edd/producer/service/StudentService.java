package com.techsharezone.bootify.edd.producer.service;

/*
 * @created 13/11/2020 -03:31
 * @project bootify-edd
 * @author  saurabhshcs
 */

import com.techsharezone.bootify.edd.producer.model.EventType;
import com.techsharezone.bootify.edd.producer.model.Student;
import com.techsharezone.bootify.edd.producer.model.StudentEventDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;

public class StudentService {

    private static final Logger LOG = LoggerFactory.getLogger(StudentService.class);

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Value("${student.create.queue}")
    String studentCreateQueue;

    public String createStudent(final Student student){

        publishEventToRabbitMq(EventType.NEW_STUDENT_CONFIRMATION, student.getEmail());

        final String response = "[" + student.getEmail() + "] created successfully.";
        return response;
    }

    @Async
    private void  publishEventToRabbitMq(final EventType eventType, final String email){

        final StudentEventDto studentEventDto = StudentEventDto.create(eventType, email);
        rabbitTemplate.convertAndSend(studentCreateQueue, studentEventDto);
        LOG.info("Message successfully sent to the rabbitMq.");
    }
}
