package com.example.SpringDataJPA;

import com.example.SpringDataJPA.model.Student;
import com.example.SpringDataJPA.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

//		create repo object
		StudentRepo studentRepo = context.getBean(StudentRepo.class);


//		create object for a student
		Student studentObj = context.getBean(Student.class);
		Student studentObj2 = context.getBean(Student.class);
		Student studentObj3 = context.getBean(Student.class);

//		studentObj.setRollNo(1);
//		studentObj.setsName("John");
//		studentObj.setMarks(76);
//
//		studentObj2.setRollNo(2);
//		studentObj2.setsName("Mary");
//		studentObj2.setMarks(90);
//
//		studentObj3.setRollNo(3);
//		studentObj3.setsName("Jane");
//		studentObj3.setMarks(80);
//
//		studentRepo.save(studentObj);
//		studentRepo.save(studentObj2);
//		studentRepo.save(studentObj3);

		List<Student> students = studentRepo.findAll();
		for(Student s : students) {
			System.out.println(s.toString());
		}

	}

}
