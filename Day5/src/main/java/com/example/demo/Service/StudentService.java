package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository stu;
	
	 public Student saveDetails(Student s)
	 {
	 	return stu.save(s);
	 }
	 public List<Student> getAllDetails()
	 {
	 	return stu.findAll();
	 }
	
	 public Student updateStudent(int id, Student student) {
	        Student existingStudent = stu.findById(id).orElse(null);
	        existingStudent.setStudentName(student.getStudentName());
	        existingStudent.setDepartmentName(student.getDepartmentName());
	        existingStudent.setMailid(student.getMailid());
	        return stu.save(existingStudent);
	    }
	 public void deleteDepartmentById(int id)
	    {
	        stu.deleteById(id);
	    }
}
