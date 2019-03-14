package service;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import data_access.StudentDao;
import models.Student;
import util.UserInputService;

public class StudentManagementConsoleImpl implements StudentManagement {

	private UserInputService scannerService;
	private StudentDao studentDaoList;

	public StudentManagementConsoleImpl() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
		this.scannerService = context.getBean(UserInputService.class);
		this.studentDaoList = context.getBean(StudentDao.class);
	}

	@Override
	public String toString() {
		return "StudentManagementConsoleImpl [scannerService=" + scannerService + ", studentDaoList=" + studentDaoList
				+ "]";
	}

	@Override
	public Student create() {
		String nisse = scannerService.getString();
		return new Student(nisse);
	}
	@Override
	public Student save(Student student) {
		return studentDaoList.saveStudent(student);
	}

	@Override
	public Student find(int id) {
		return studentDaoList.findById(id);
	}

	@Override
	public Student remove(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentDaoList.findAll();
	}
	@Override
	public Student edit(Student student) {
		return new Student("EDIT!");
	}
}
