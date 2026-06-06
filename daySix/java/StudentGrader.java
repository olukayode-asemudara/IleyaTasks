/*
Start
1.collect total number of students that sat for the exam]
2.collect the total number of quiz attempted
3.create a two dimensional array that stores both the data of the students that enrolled and the number of quiz questions attempted
4.collect the total scores of each student inside the quiz's array
*/
import java.util.Scanner;
public class StudentGrader{
	public static void main(String[] args){
	  Scanner inputCollector = new Scanner(System.in);
	  System.out.print("enter number of students: ");
    int studentsTotal = inputCollector.nextInt();
    System.out.print("enter number of quiz done: ");
    int quizTotal = inputCollector.nextInt();
    
    int[][] studentGrades = new int[studentsTotal][quizTotal];
    
    for(int student = 0; student < studentGrades.length; student++){
      System.out.println("student number " + student);
      for(int quiz = 0; quiz < studentGrades[student].length; quiz++){
        System.out.println("quiz number " + quiz);
        //System.out.print("Subject " + (subject + 1) + ": ");
        System.out.print("enter student " + student + " exam's score: ");
        studentGrades[student][quiz] = inputCollector.nextInt();
        
      }
    }
    
    // lets see whether array data is filled with results that I have collected
    for(int row = 0; row < studentGrades.length; row++){
      for(int column = 0; column < studentGrades[row].length; column++){
        System.out.print(studentGrades[row][column] + " ");
      }
      System.out.println();
    }
	}
}
