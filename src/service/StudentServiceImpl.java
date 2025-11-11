package service;

import model.Student;
import model.Subject;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    // store a student data here
    static List<Student> students = new ArrayList<>();

    // Add a student
    public boolean addStudent(Student student) {
        return students.add(student);
    }

    // view all students
    public List<Student> getStudent() {
        return students;
    }

    public Student getById(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                return students.get(i);
            }

        }
        return null;
    }

    // update method
    public void update(String grade, int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.get(i).setGrade(grade);
            }

        }

    }

    // remove method
    public void removeStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(students.get(i));
            }
        }
    }
    public  int calculateTotalMarks(List<Subject> subjects){
      return  subjects.stream().mapToInt(Subject::getMarks)
                .sum();



    }
}
