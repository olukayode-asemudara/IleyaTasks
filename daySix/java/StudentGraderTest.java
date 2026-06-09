import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentGraderTest{
  @Test
  public void testThatArrayLengthIsNotEmpty(){}
  
  @Test
  public void testThatNoInvalidScoreIsSubmittedAsScore(){}
  
  @Test
  public void testThatEachStudentTotalScoreIsDetermined() {
      // arrange
      int[][] studentOneSubjects = {
          {10, 20, 30, 40},
          {10, 10, 20, 20}
      };
      int[] expectedResult = {100, 60};
      // act
      int[] actualResult = StudentGrader.getOneStudentTotalScore(studentOneSubjects);
      // assert
      assertArrayEquals(expectedResult, actualResult);
  }
  
  @Test
  void testThatEachStudentAverageScoreIsDetermined(){
      // arrange
      int[][] studentOneSubjects = {
          {10, 20, 30, 40},
          {10, 10, 20, 20}
      };
      double[] expectedResult = {25, 15};
      // act
      double[] actualResult = StudentGrader.getAverageScoreOfEachStudent(studentOneSubjects);
      // assert
      assertArrayEquals(expectedResult, actualResult);
  }
  
  @Test
  void testThatNoStudentHasABlankScore(){}
  
  @Test
  void testThatHighestScoringStudentIsDeterminedForEachSubject(){}
  
  @Test
  void testThatLowestScoringStudentIsDeterminedForEachSubject(){}
  
  @Test
  void testThatWeCanDetermineWhoIsBestGraduatingStudent(){}
  
  @Test
  void testThatWeCanDetermineWhoIsWorstGraduatingStudent(){}
  
  @Test
  void testThatWeCanCalculateClassTotalScore(){}
  
  @Test
  void testThatWeCanCalculateClassTotalAverage(){}
}
