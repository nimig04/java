// Pulls prime numbers out of ArrayList
import java.util.ArrayList;

class PrimeDirective {

  public boolean isPrime(int number) {
    if (number < 2) {
      return false;
    } 
    for (int i = 2; i <= number / 2; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

  public ArrayList<Integer> onlyPrimes(int[] numbers) {
    ArrayList<Integer> primes = new ArrayList<Integer>();
    for (int number : numbers) {
      if (isPrime(number)) {
        primes.add(number);
      }
    }
    return primes;
  }

  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = { 7, 9, 101, 15, 45 };
    System.out.println(pd.onlyPrimes(numbers));
  }

}
