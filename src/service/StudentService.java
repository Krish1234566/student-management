package service;

import model.Student;

import java.util.List;

public interface StudentService {
    public boolean addStudent(Student student);
    public List<Student> getStudent();
    public Student getById(int id);
    public void update(String grade, int id);
    public void removeStudent(int id);

}
