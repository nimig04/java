// This is a Calculator that takes in two variables and outputs based on the method used.
public class Calculator{
  
public Calculator(){

  }

  public double add(int a, int b){
    double add = a + b;
    return add;
  }

  public double subtract(int a, int b){
    double subtract = a - b;
    return subtract;
  }

  public double multiply(int a, int b){
    double multiply = a * b;
    return multiply;
  }

  public double divide(int a, int b){
    double divide = a / b;
    return divide;
  }

  public double modulo(int a, int b){
    double modulo = a % b;
    return modulo;
  }
  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(45, 11));
  }
}
