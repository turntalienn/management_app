package com.turntalien.sms.service.impl;

import com.turntalien.sms.entity.Student;
import com.turntalien.sms.repository.StudentRepository;
import com.turntalien.sms.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    //injecting the StudentRepository interface, this gives access to JPA methods
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository){
        super();
        this.studentRepository = studentRepository;
    }

    //list all data
    @Override
    public List<Student> getAllStudents() {
       return studentRepository.findAll();
    }

    //saving
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    //read
    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    //update
    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

   //delete
    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

}
