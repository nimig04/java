// This program takes in values associated with a car loan and then prints out your monthly payments.
public class CarLoan {

	public static void main(String[] args) {
  
  int carLoan = 10000;
  int loanLength = 3;
  int interestRate = 5;
  int downPayment = 2000;

  if(loanLength <= 0 || interestRate <= 0) {
    System.out.println("Error! You must take out a valid car loan");
  } else if(downPayment >= carLoan) {
      System.out.println("This car can be paid for in full, you do not need a loan.");
  } else {
    int remainingBalance = carLoan - downPayment;
    int months = loanLength * 12;
    int monthlyBalance = remainingBalance / months;
    int interest = (monthlyBalance * interestRate) / 100;
    int monthlyPayment = monthlyBalance + interest;
    System.out.println(monthlyPayment);
  }
	}
}
