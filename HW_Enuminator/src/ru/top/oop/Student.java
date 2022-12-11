package ru.top.oop;

public enum Student {
    Oleg(8),Victor(12),Nikolai(11),Olga(12);
    private int assessment;

    public int getAssessment() { return assessment; }

     Student(int assessment) { this.assessment = assessment; }
}

class StudentClass{
  public static void main(String args[]){
      Student student = null;
      System.out.println("Assessment Oleg is " + student.Oleg.getAssessment() + " balls");
      System.out.println("Assessment Victor is " + student.Victor.getAssessment() + " balls");
      System.out.println("Assessment Nikolay is " + student.Nikolai.getAssessment() + " balls");
      System.out.println("Assessment Olga is " + student.Olga.getAssessment() + " balls");
  }
}
