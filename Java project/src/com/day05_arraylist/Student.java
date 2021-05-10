package com.day05_arraylist;

import java.util.ArrayList;

public class Student {
   private int studentID;
   private String studentName;
   private ArrayList<Subject> subjectList; //***�� �κ� Ȯ��

   public Student(int studentID, String studentName) {
      this.studentID=studentID;
      this.studentName=studentName;
      subjectList=new ArrayList<>();
   }
   public void addSubject(String name, int score) {
      Subject subject=new Subject();//üũ
      subject.setName(name);
      subject.setScorePoint(score);
      subjectList.add(subject);
   }
   public void showStudentInfo() {
      int total=0;
      for(Subject s:subjectList) {
         total+=s.getScorePoint();
         System.out.println("�л�:"+studentName);
         System.out.println("����:"+s.getName());
         System.out.println("����:"+s.getScorePoint());
      }
      System.out.println("�л�:"+studentName);
      System.out.println("����:"+total);
   }
}