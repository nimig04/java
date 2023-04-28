# Create a class with methods
public class Droid {
  //instance field
  int batteryLevel;
  String name;

  //contstructor
  public Droid(String droidName){
    name = droidName;
    int batteryLevel = 100;
  }

  public void performTask(String task) {
    System.out.println(name + " is performing task: " + task + ".");
  }

  public String toString() {
    batteryLevel = batteryLevel - 10;
    return "Hello, I am the droid: " + name;
  }

  public static void main(String[] args) {
    Droid codey = new Droid("Codey");
    System.out.println(codey);
    codey.performTask("fighting crime");
    codey.performTask("stealin' yo gril");
  }
}
