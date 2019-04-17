package studentmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import studentmanagement.data_access.StudentDao;
import studentmanagement.models.Student;
import studentmanagement.util.UserInputService;

@Component
public class StudentManagementConsoleImpl implements StudentManagement {

	private UserInputService scannerService;
	private StudentDao studentDaoList;

	@Autowired
	public StudentManagementConsoleImpl(UserInputService theScannerService, StudentDao theStudentDao) {
		this.scannerService = theScannerService;
		this.studentDaoList = theStudentDao;
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
