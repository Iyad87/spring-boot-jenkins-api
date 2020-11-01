package com.iyadAltoubah;


import com.iyadAltoubah.entity.Student;
import com.iyadAltoubah.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class);

    }

    @Bean
    public CommandLineRunner sampleData(StudentRepository studentRepository){


        return (args) -> {
            studentRepository.save(new Student("Iyda Altouba","1233AB",90));
            studentRepository.save(new Student("Ahmad Said","3300SD",80));
            studentRepository.save(new Student("Abdul Mo","3434DF",99));
            studentRepository.save(new Student("Zain Mossa","3416SS",96));

        };
    }
}
