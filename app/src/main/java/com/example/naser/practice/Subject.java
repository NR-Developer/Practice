package com.example.naser.practice;

public class Subject {

    private String subjectCode;
    private String subjectName;

    public Subject (String subjectCode, String subjectName) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    public Subject (Subject subject)
    {
        this.subjectCode = subject.subjectCode;
        this.subjectName = subject.subjectName;
    }

    public boolean equals (Subject subject)
    {
        return (this.subjectCode.equals(subject.subjectCode) && this.subjectName.equals(subject.subjectName));
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
//        return super.toString();
        return "Subject information:\n" +
                "Subject Code: " + subjectCode + "\n" +
                "Subject Name: " + subjectName;
    }
}
