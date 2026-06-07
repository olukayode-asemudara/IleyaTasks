/*
Start
1.collect total number of students that sat for the exam]
2.collect the total number of subjects offered
3.create a two dimensional array that stores both the data of the students that enrolled and the number of subjects offered
4.collect the total scores of each student inside subjects offered array, score must be between 0 and 100
5.display class summary after input collection by attempting to do the following using a method;
  1.calculate for each student's average
  2.calculate for highest scoring student on each subject down to the total subjects taken
  3.calculate for the lowest scoring student on each subject down to the total subjects taken
  4.determine the number of passes and fails for each student based on the subjects
  5.determine the best graduating student
  6.determine the worst graduating student
*/
import java.util.Scanner;
public class StudentGrader{

  public static void displayStudentsTestScores(int[][] scores){
      for(int row = 0; row < scores.length; row++){
      for(int column = 0; column < scores[row].length; column++){
        System.out.print(scores[row][column] + " ");
      }
      System.out.println();
    } 
  }
 
 
  public static int[] getOneStudentTotalScore(int[][] subjects) {
    int[] eachStudentTotal = new int[subjects.length];
    for(int student = 0; student < subjects.length; student++){
      int total = 0;
      for(int subject = 0; subject < subjects[student].length; subject ++){
        System.out.print(subjects[student][subject] + " ");
        total += subjects[student][subject];
        eachStudentTotal[student] = total;
      }
      System.out.println("total: " + total);
      System.out.println();
    }
    return eachStudentTotal;
  }

	public static void main(String[] args){
	  /* Scanner inputCollector = new Scanner(System.in);
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
  */
  //[2][4]
  int[][] subjectsOffered = {
  // total number of students registered is two
  {20,30,40,50}, //student one subjects
  {10,20,30,40} //student two subjects
  
  };
  
/*  for(int student = 0; student < subjects.length; student++){
      int total = 0;
      for(int subject = 0; subject < subjects[student].length; subject ++){
        System.out.print(subjects[student][subject] + " ");
        total += subjects[student][subject];
        eachStudentTotal[student] = total;
      }
      System.out.println("total: " + total);
      System.out.println();
  }*/
  
  
  getOneStudentTotalScore(subjectsOffered);
  displayStudentsTestScores(studentGrades);
  
	}
}
