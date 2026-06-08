/*
Start
1.collect total number of students that sat for the exam]
2.collect the total number of subjects offered
3.create a two dimensional array that stores both the data of the students that enrolled and the number of subjects offered
4.collect the total scores of each student inside subjects offered array, score must be between 0 and 100
5.display class summary after input collection by attempting to do the following using a method;
  1.calculate for each student's average
  2.calculate each student's total
  3.calculate for highest scoring student on each subject down to the total subjects taken
  4.calculate for the lowest scoring student on each subject down to the total subjects taken
  5.determine the number of passes and fails for each student based on the subjects
  6.determine the best graduating student
  7.determine the worst graduating student
*/


const prompt() = require("prompt()-sync")();

const displayStudentsTestScores =(scores)=>{
    for ( student = 0; student < scores.length; student++) {
        console.log(`Scores for student ${student + 1}: `);
    for ( subject = 0; subject < scores[student].length; subject++) {
        console.log(scores[student][subject] + " ");
    }
        console.log();
    }
}
 
const getOneStudentTotalScore =(subjects)=>{
    eachStudentTotal = [subjects.length];
    for( student = 0; student < subjects.length; student++){
    total = 0;
    for( subject = 0; subject < subjects[student].length; subject ++){
        total += subjects[student][subject];
        eachStudentTotal[student] = total;
      }
        console.log(`${total}: total`);
        console.log();
    }
    return eachStudentTotal;
  }
  
const getAverageScoreOfEachStudent=(subjects)=>{
    average =  double[subjects.length];
    for( student = 0; student < subjects.length; student++){
    total = 0;
        console.log("Average score for ", ${student + 1}, ": ");
    for( subject = 0; subject < subjects[student].length; subject++){
        total += subjects[student][subject];
    }
        average[student] = (double) total / subjects[student].length;
        console.log(average[student]);
        console.log();
    }
      return average;
 }

const getStudentsScore=(subjects)=>{
    for ( student = 0; student < subjects.length; student++) {
        console.log("Entering score for student", ${student + 1}, ": ");
    for ( subject = 0; subject < subjects[student].length; subject++) {
        console.log("Enter score for subject ", ${student + 1},": ");
    score = prompt();
    if(score < 0) return;
        subjects[student][subject] = score;
    }
        console.log("saving>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	    console.log("saved");
        console.log();
    }
  }
  

	  
console.log("enter total number of students: ");
studentsTotal = prompt();
	  
console.log("enter total number subjects registered: ");
subjectsRegistered = prompt();
	  
console.log("saving>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
console.log("saved");
	  	
studentGrades = [[studentsTotal],[subjectsRegistered]];
	  	
getStudentsScore(studentGrades);
	  	
	  	/*
    for ( student = 0; student < studentGrades.length; student++) {
console.log("Entering score for student" + (student + 1) + ": ");
    for ( subject = 0; subject < studentGrades[student].length; subject++) {
console.log("Enter score for subject " + (subject + 1) + ": ");
       score = prompt();
      studentGrades[student][subject] = score;
    }
console.log("saving>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	  console.log("saved");
console.log();
    }
    */
  
getOneStudentTotalScore(studentGrades);
displayStudentsTestScores(studentGrades);
getAverageScoreOfEachStudent(studentGrades);



/*  
[][] studentGrades = {
  {1,2,3,4,5},
  {6,7,8,9,0}
};
    	
System.out.prf("""
===================================================
Student     Sub1    Sub2    Sub3    TOT   AVE   POS
===================================================
""");
*/

  
	}
}
