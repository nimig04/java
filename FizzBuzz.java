// Returns all numbers between 1-100, replacing every number divisible by 3 with "Fizz", by 5 with "Buzz", and by both with "FizzBuzz"
class FizzBuzz {

  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      if(i % 5 == 0 && i % 3 == 0) {
        System.out.println("FizzBuzz"); 
      } else if(i % 5 == 0) {
        System.out.println("Buzz");
      } else if(i % 3 == 0) {
        System.out.println("Fizz");
      }
      System.out.println(i);
    }

  }

}
