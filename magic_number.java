//Takes in any number as a variable and outputs the same result

public class Magic {
	public static void main(String[] args) {
  //myNumber = "the original number"
  int myNumber = 19;
  int stepOne = myNumber * myNumber;
  int stepTwo = stepOne + myNumber;
  int stepThree = stepTwo / myNumber;
  int stepFour = stepThree + 17;
  int stepFive = stepFour - myNumber;
  int stepSix = stepFive / 6;
  System.out.println(stepSix);
		

	}
}
