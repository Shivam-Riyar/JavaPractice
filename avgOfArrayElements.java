// Write a program in Java to calculate the average of marks of a student in 5 different subjects. Create a class called Student and define an object with your own name
 
import java.util.*;
class studentMarks{
 float[] stuMarks = new float[5];
 float sum = 0,avg = 0;

 void getMarks()
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("ENTER THE MARKS OBTAINED BY STUDENT IN 5 SUBJECTS : ");
   for(int i=0; i<5; i++)
   {
     stuMarks[i] = sc.nextFloat();
   }
 }
 void calcAvg()
 {
   for(int i=0; i<5; i++)
   {
     sum = sum + stuMarks[i];
   }
   avg = sum / stuMarks.length;
  }
}

class studentas1{
  public static void main(String[] args){
    studentMarks Shivam = new studentMarks();

    Shivam.getMarks();
    Shivam.calcAvg();

    System.out.println("MARKS OBTAINED : ");
    for(int i = 0; i < 5 ; i++)
    {
      System.out.print(Shivam.stuMarks[i] + "  ");
    }
    System.out.println("\nAVERAGE : " + Shivam.avg);

}
}
