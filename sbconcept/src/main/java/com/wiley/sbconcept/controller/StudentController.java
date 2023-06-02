package com.wiley.sbconcept.controller;

//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.wiley.sbconcept.model.Course;
//import com.wiley.sbconcept.model.Student;
//import com.wiley.sbconcept.repository.CourseRepository;
//import com.wiley.sbconcept.repository.StudentRepository;
//
//@RestController
//@RequestMapping("/api/student/course")
public class StudentController {

//	@Autowired
//	private StudentRepository studentRepo;
//	
//	@Autowired
//	private CourseRepository courseRepo;
//	
//	@PostMapping
//	public Student createStudent(@RequestBody Student student) {
//		return studentRepo.save(student);
//	}
//	
//	@GetMapping
//	public List<Student> findAllStudent(){
//		return studentRepo.findAll();
//	}
//	
//	@GetMapping("/{studentId}")
//	public Student findStudentById(@PathVariable Long stdId) {
//		return studentRepo.findById(stdId).orElse(null);
//	}
//	
//	@GetMapping("/{studentName}")
//	public List<Student> findStudentByName(@PathVariable String stdName){
//		return studentRepo.findByName(stdName);
//	}
//	
//	@GetMapping("/search/{price}")
//	public List<Course> findCourseLessThanPrice(@PathVariable double price){
//		return courseRepo.findByLessThanPrice(price);
//	}
}
