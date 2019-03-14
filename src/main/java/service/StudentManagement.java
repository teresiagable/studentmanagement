package service;

import java.util.List;

import models.Student;

public interface StudentManagement {
	Student create();
	Student save(Student student);
	Student find(int id);
	Student remove(int id);
	List<Student> findAll();
	Student edit(Student student);

}
