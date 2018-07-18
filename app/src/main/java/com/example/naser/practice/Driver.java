package com.example.naser.practice;

public class Driver {

    public static void main(String[] args) {

        Student student = new Student("Naser" , 93311145);
        Subject subject = new Subject("NRDev1375" , "Technical Programing");
        Paper paper = new Paper(student , subject ,100);

//        paper.getStudent().setStudentName("Haji");
//        paper.getStudent().setStudentNumber(93311136);
//
//        paper.getSubject().setSubjectCode("ARDev1375");
//        paper.getSubject().setSubjectName("Technical Programing 2");

//        System.out.println(paper);

        System.out.println("Student Name: " + paper.getStudent().getStudentName());
        System.out.println("Student Code: " + paper.getStudent().getStudentNumber() + "\n");

        System.out.println("Subject Code: " + paper.getSubject().getSubjectCode());
        System.out.println("Subject Name: " + paper.getSubject().getSubjectName());
    }
}
