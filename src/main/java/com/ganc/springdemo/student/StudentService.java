package com.ganc.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
                new Student("ganc","anc", LocalDate.now(),"ganc@anc",41),
                new Student("ganc2","anc", LocalDate.now(),"ganc@anc",42)
        );
    }
}
