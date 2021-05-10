package com.day05_arraylist;

import java.util.ArrayList;

public class Student {
   private int studentID;
   private String studentName;
   private ArrayList<Subject> subjectList; //***이 부분 확인

   public Student(int studentID, String studentName) {
      this.studentID=studentID;
      this.studentName=studentName;
      subjectList=new ArrayList<>();
   }
   public void addSubject(String name, int score) {
      Subject subject=new Subject();//체크
      subject.setName(name);
      subject.setScorePoint(score);
      subjectList.add(subject);
   }
   public void showStudentInfo() {
      int total=0;
      for(Subject s:subjectList) {
         total+=s.getScorePoint();
         System.out.println("학생:"+studentName);
         System.out.println("과목:"+s.getName());
         System.out.println("성적:"+s.getScorePoint());
      }
      System.out.println("학생:"+studentName);
      System.out.println("총점:"+total);
   }
}