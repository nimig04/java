// This program prints out a continent and its largest city based on the value we input
public class Continents {

  public static void main(String[] args) {
    int continent = 4;
    String answer;

    switch (continent) {
      case 1: answer = "North America: Mexico City, Mexico";
        break;
      case 2: answer = "South America: Sao Paulo, Brazil";
        break;
      case 3: answer = "Europe: Moscow, Russia";
        break;
      case 4: answer = "Africa: Lagos, Nigeria";
        break;
      case 5: answer = "Asia: Shanghai, China";
        break;
      case 6: answer = "Australia: Sydney, Australia";
        break;
      case 7: answer = "Antarctica: McMurdo Station, US";
        break;
      default: answer = "Undefined continent!";
        break;
    }
    System.out.println(answer);
  }
}
