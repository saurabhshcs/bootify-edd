package com.techsharezone.bootify.edd.producer.configuration;

/*
 * @created 13/11/2020 -03:26
 * @project bootify-edd
 * @author  saurabhshcs
 */

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class RabbitMqConfigForProducer {

    @Value("${student.create.queue}")
    String studentCreateQueue;

    @Bean
    Queue queue(){
        return new Queue(studentCreateQueue);
    }

    @Bean
    @Primary
    Jackson2JsonMessageConverter producerJackson2MessageConverter(){
        return new Jackson2JsonMessageConverter();
    }
}
