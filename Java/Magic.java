import java.util.*;
public class Magic {
    public static void main(String[] args) {
    /* Small program that performs a series of operations on a 
    number that result in the final step returning a number. This 
    number will be the same regardless of the original number. */
    Scanner in = new Scanner(System.in);
    System.out.println("Enter any integer:");
    int myNumber = in.nextInt();
    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;
    System.out.println(stepSix);
  }
}