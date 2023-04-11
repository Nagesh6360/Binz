class Exam
{
 static void subject(int no1)
 {
  System.out.println("Subject number is "+no1);
 }static void subject(String no2)
 {
  System.out.println("Subject number 2 is "+no2);
 }
 static void subject(int no3,String no4)
 {
  System.out.println("Subject number is "+no3+" and subject name is "+no4);
 }
}

class School
{
 public static void main(String []args)
 {
  Exam.subject(01);
  Exam.subject("Maths");
  Exam.subject(3,"Kannada");
 }
}