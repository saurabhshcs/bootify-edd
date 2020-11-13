package com.techsharezone.bootify.edd.producer.controller;

/*
 * @created 13/11/2020 -03:46
 * @project bootify-edd
 * @author  saurabhshcs
 */

import com.techsharezone.bootify.edd.producer.model.Student;
import com.techsharezone.bootify.edd.producer.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/student")
public class StudentController {
    
    private final static Logger LOG = LoggerFactory.getLogger(StudentController.class);
    
    @Autowired
    private StudentService service;

    @PostMapping("/create")
    public ResponseEntity<String> createStudent(@RequestBody final Student student){
        LOG.info("Creating new student as " + student.toString());
        final String response = service.createStudent(student);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
