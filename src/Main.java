import model.Subject;
import service.StudentServiceImpl;
import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        StudentServiceImpl studentDetail = new StudentServiceImpl();
        int choice = 0;
        while (true) {

            System.out.println("enter choice for operation");
            System.out.println("1: Add student");
            System.out.println("2: Display students");
            System.out.println("3: Get student By ID");
            System.out.println("4: Remove student");
            System.out.println("5: Update the student Details");
            System.out.println("6: Get student by group");

            System.out.println("6: Ex");
            System.out.println("6: Exit");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter student id ");
                    int id = sc.nextInt();
                    System.out.println("enter name ");
                    String name = sc.next();
                    System.out.println("enter fathername ");
                    String fatherName = sc.next();
                    System.out.println("enter grade ");
                    String grade = sc.next();
                    System.out.println("enter gender ");
                    String gender = sc.next();
                    System.out.println("enter date of birth ");
                    String dateOfBirth = sc.next();
                    System.out.println("enter roll number ");
                    int rollNumber = sc.nextInt();
                    System.out.println("enter section ");
                    char section = sc.next().charAt(0);
                    System.out.println("enter phone number");
                    long phoneNumber = sc.nextLong();
                    System.out.println("enter subject telugu marks");
                    int marksTelugu = sc.nextInt();
                    System.out.println("enter subject english marks");
                    int marksEnglish= sc.nextInt();
                    System.out.println("enter subject maths marks");
                    int marksMaths = sc.nextInt();
                    System.out.println("enter subject science marks");
                    int marksScience = sc.nextInt();
                    System.out.println("enter subject social marks");
                    int marksSocial = sc.nextInt();

                    List<Subject> subjects = List.of(
                            new Subject(Subject.SubjectType.TELUGU, marksTelugu),
                            new Subject(Subject.SubjectType.ENGLISH, marksEnglish),
                            new Subject(Subject.SubjectType.MATHS, marksMaths),
                            new Subject(Subject.SubjectType.SCIENCE, marksScience),
                            new Subject(Subject.SubjectType.SOCIAL, marksSocial)
                    );

                    int totalMarks = studentDetail.calculateTotalMarks(subjects);

                    Student newStudent = new Student();
                    newStudent.setId(id);
                    newStudent.setFatherName(fatherName);
                    newStudent.setName(name);
                    newStudent.setGrade(grade);
                    newStudent.setDateOfBirth(dateOfBirth);
                    newStudent.setGender(gender);
                    newStudent.setRoleNumber(rollNumber);
                    newStudent.setSection(section);
                    newStudent.setTotalMarks(totalMarks);
                    newStudent.setPhoneNumber(phoneNumber);
                    newStudent.setSubjects(subjects);
                    studentDetail.addStudent(newStudent);


                    break;
                case 2:
                    System.out.println(studentDetail.getStudent());
                    break;
                case 3:
                    System.out.println("3: Get student By ID");
                    System.out.println("Enter Your ID");
                    int studentId = sc.nextInt();
                    Student studentInfo = studentDetail.getById(studentId);
                    System.out.println(studentInfo);
                    break;
                case 4:
                    System.out.println("4: Remove student");
                    System.out.println("Enter Your ID");
                    int removeStudentId = sc.nextInt();
                    studentDetail.removeStudent(removeStudentId);
                    break;
                case 5:
                    System.out.println("5: Update the student Details");
                    System.out.println("Enter Your grade");
                    String updateGrade = sc.next();
                    int updateId = sc.nextInt();
                    studentDetail.update(updateGrade, updateId);
                    break;
            }
       }

    }
}