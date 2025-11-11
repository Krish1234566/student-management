package model;

import java.util.List;

public class Student {
    private String name;
    private String fatherName;
    private int id;
    private String grade;
    private String gender;
    private int roleNumber;
    private String dateOfBirth;
    private char section;
    private int totalMarks;
    private long phoneNumber;
private List<Subject>subjects;



   /* public  Student (String name,String fatherName, int id, String grade){

        this.name=name;
        this.fatherName=fatherName;
        this.id=id;
        this.grade=grade;
    }*/

    @Override
    public String toString() {
        return "{Id :" + id + ",Name:" + name + ",Father name:" + fatherName + ",Grade :" + grade + ",Gender :"+ gender +",Rolenumber :"+roleNumber+",DOB :"+dateOfBirth+",Section :"+section+",Totalmarks :"+totalMarks+",Phonenumber :"+phoneNumber+"}";
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getRoleNumber() {
        return roleNumber;
    }

    public void setRoleNumber(int roleNumber) {
        this.roleNumber = roleNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
