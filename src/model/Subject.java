package model;


import java.util.ArrayList;
import java.util.List;

public class Subject {


        public enum SubjectType {
            TELUGU,
            ENGLISH,
            MATHS,
            SCIENCE,
            SOCIAL
        }

        private SubjectType subjectType;
        private int marks;

        public Subject(SubjectType subjectType,int marks) {
            this.subjectType = subjectType;
            this.marks = marks;
}

        public int getMarks() {
            return marks;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }

        public SubjectType getSubjectType() {
            return subjectType;
        }


        public void setSubjectType(SubjectType subjectType) {
            this.subjectType = subjectType;
        }

    }


