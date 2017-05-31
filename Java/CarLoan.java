public class CarLoan {
	public static void main(String[] args) {
    int carLoan = 10000;  // dollars
    int loanLength = 3; // years
    int interestRate = 5; // 5% annual
    int downPayment = 2000;
    
    if ((loanLength <= 0) || (interestRate <= 0)) {
      System.out.println("Error! You must take out a valid car loan!");
    }
    else if (downPayment >= carLoan) {
      System.out.println("The car can be paid in full.");
    }
    else {
      int remainingBalance = carLoan - downPayment;
      int monthlyBalance = remainingBalance / (loanLength * 12);
      int interest = monthlyBalance * interestRate / 100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.println(monthlyPayment);
    }
	}
}