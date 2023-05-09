// This program builds out DNA Sequences
public class DNA {
  
  public static void main(String[] args) {
 
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
 
    // vars
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = dna3;
    int length = dna.length();
    int start = dna.indexOf("ATG");
    int stop = dna.indexOf("TGA");
    int between = stop - start;

    // Start and Stop Location
    System.out.println("Start: " + start);
    System.out.println("Stop: " + stop);

    // Condition checks
    if (start != -1 && 
        stop != -1 &&
        (stop - start) % 3 == 0) {
      
      String protein = dna.substring(start, stop+3);
      System.out.println("Protein: " + protein);
      System.out.println("All conditions are satisfied");
    }else {
      System.out.println("No protein");
    }
  }
}
