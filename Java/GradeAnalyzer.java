import java.util.*;

public class GradeAnalyzer {
	 
	 public GradeAnalyzer() {
		 
	 }
	 
	 public double getAverage(ArrayList<Integer> grades) {
		 if (grades.size() < 1) {
			 System.out.println("List is empty.");
			 return 0.0;
		 }
		 else {
			 int sumOfGrades = 0;
			 for (Integer grade : grades) {
				 sumOfGrades = sumOfGrades + grade;
			 }
			 return (sumOfGrades*1.0/grades.size());
		 }
	 }
	 
	 // Below methods (getHighest and getLowest) are optional for Codecademy submission
	 public int getHighest(ArrayList<Integer> grades) {
		 int max = grades.get(0);
		 for (Integer grade : grades) {
			 if (grade > max) {
				 max = grade;
			 }
		 }
		 return max;
	 }

	 public int getLowest(ArrayList<Integer> grades) {
		 int min = grades.get(0);
		 for (Integer grade : grades) {
			 if (grade < min) {
				 min = grade;
			 }
		 }
		 return min;
	 }
	 
	 public static void main(String[] args) {
		 ArrayList<Integer> myClassroom = new ArrayList<Integer>();
		 myClassroom.add(98);
		 myClassroom.add(92);
		 myClassroom.add(88);
		 myClassroom.add(75);
		 myClassroom.add(61);
		 myClassroom.add(89);
		 myClassroom.add(95);
		 
		 GradeAnalyzer myAnalyzer = new GradeAnalyzer();
		 System.out.println("Class average is: " + myAnalyzer.getAverage(myClassroom));
		 System.out.println("Highest grade is: " + myAnalyzer.getHighest(myClassroom));
		 System.out.println("Lowest grade is: " + myAnalyzer.getLowest(myClassroom));
	 }
}