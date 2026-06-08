/*
Start
1.collect total number of students that sat for the exam]
2.collect the total number of subjects offered
3.create a two dimensional array that stores both the data of the students that enrolled and the number of subjects offered
4.collect the total scores of each student inside subjects offered array, score must be between 0 and 100
5.display class summary after input collection by attempting to do the following using a method;
  1.calculate for each student's average
  2.calculate each student's total
  2.calculate for highest scoring student on each subject down to the total subjects taken
  3.calculate for the lowest scoring student on each subject down to the total subjects taken
  4.determine the number of passes and fails for each student based on the subjects
  5.determine the best graduating student
  6.determine the worst graduating student
*/
import java.util.Scanner;
public class StudentGrader{

  public static void displayStudentsTestScores(int[][] scores) {
        for (int student = 0; student < scores.length; student++) {
          System.out.print("Scores for student " + (student + 1) + ": ");
        for (int subject = 0; subject < scores[student].length; subject++) {
          System.out.print(scores[student][subject] + " ");
        }
          System.out.println();
        }
  }
 
 
  public static int[] getOneStudentTotalScore(int[][] subjects) {
    int[] eachStudentTotal = new int[subjects.length];
    for(int student = 0; student < subjects.length; student++){
      int total = 0;
      for(int subject = 0; subject < subjects[student].length; subject ++){
        total += subjects[student][subject];
        eachStudentTotal[student] = total;
      }
      System.out.print("total: " + total);
      System.out.println();
    }
    return eachStudentTotal;
  }
  
public static double[] getAverageScoreOfEachStudent(int[][] subjects){
    double[] average = new double[subjects.length];
    for(int student = 0; student < subjects.length; student++){
        int total = 0;
        System.out.print("Average score for " + (student + 1) + ": ");
        for(int subject = 0; subject < subjects[student].length; subject++){
            total += subjects[student][subject];
        }
        average[student] = (double) total / subjects[student].length;
        System.out.print(average[student]);
        System.out.println();
    }
    return average;
}
  

	public static void main(String[] args){
	  Scanner inputCollector = new Scanner(System.in);
	  
	  System.out.print("enter total number of students: ");
	  int studentsTotal = inputCollector.nextInt();
	  
	  	System.out.print("enter total number subjects registered: ");
	  int subjectsRegistered = inputCollector.nextInt();
	  
	  System.out.println("saving>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	  	System.out.println("saved");
	  	
	  	int[][] studentGrades = new int[studentsTotal][subjectsRegistered];
	  	
    for (int student = 0; student < studentGrades.length; student++) {
      System.out.println("Entering score for student" + (student + 1) + ": ");
    for (int subject = 0; subject < studentGrades[student].length; subject++) {
      System.out.print("Enter score for subject " + (subject + 1) + ": ");
      int score = inputCollector.nextInt();
      studentGrades[student][subject] = score;
    }
      System.out.println("saving>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	  	  System.out.println("saved");
      System.out.println();
    }
  
  getOneStudentTotalScore(studentGrades);
  displayStudentsTestScores(studentGrades);
  getAverageScoreOfEachStudent(studentGrades);



/*  
int[][] studentGrades = {
  {1,2,3,4,5},
  {6,7,8,9,0}
};
    	
System.out.printf("""
===================================================
Student     Sub1    Sub2    Sub3    TOT   AVE   POS
===================================================
""");
*/

  
	}
}
