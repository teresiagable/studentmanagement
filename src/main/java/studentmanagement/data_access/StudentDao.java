package studentmanagement.data_access;

import java.util.List;

import studentmanagement.models.Student;

public interface StudentDao {

	Student saveStudent(Student student);
	Student findById(int id);
	List<Student>findAll();
	boolean deleteStudent(int id);
}
