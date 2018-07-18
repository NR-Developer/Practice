package com.example.naser.practice;


public class Paper {

    private Student student;
    private Subject subject;
    private int marks;

    public Paper(Student student, Subject subject, int marks) {
        this.student = student;
        this.subject = subject;
        this.marks = marks;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
//        return super.toString();
        return "Paper information:\n" +
                student + subject + "\n" +
                "Marks: " + marks;
    }
}
