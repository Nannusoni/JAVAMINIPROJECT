import java.util.Scanner;

//Car Loan calculator
public class CarLoan {
  public static void main(String[] args) {
    Scanner Loan = new Scanner(System.in);
    int carLoan;
    int loanLength; // in year
    int interestRate;
    int downPayment;

    System.out.println("Enter the Loan Amount :");
    carLoan = Loan.nextInt();

    System.out.println("Enter the tenure of Loan in year :");
    loanLength = Loan.nextInt();

    System.out.println("Enter the Rate of interest :");
    interestRate = Loan.nextInt();

    System.out.println("Enter the Downpayment Amount :");
    downPayment = Loan.nextInt();

    if (loanLength < 0 || interestRate <= 0) {
      System.out.println("Error! You must take out a valid loan.");
      System.out.println("Unable to Sanction the Loan Amount");
    } else if (downPayment >= carLoan) {
      System.out.println("The car can be paid in full.");
    } else {
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = monthlyBalance * interestRate / 100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.println("You have to pay monthly Loan Amount : " + monthlyPayment);
    }

  }
}