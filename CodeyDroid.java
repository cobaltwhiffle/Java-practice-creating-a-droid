public class Droid {
  int batteryLevel = 100;
  int battery;
  String name;
  String task;
  String dirty;
  int recharge;
  int extra;

  public String toString(){
    return "Hello, I´m the droid: " + name;
  }
    public void performTask(String task){
      System.out.println(name + " is performing task: " + task);
    }

//Regular tasks drains the battery with 10% with each task
    public int batteryDecrease(int bFull, int bLow){
      batteryLevel = battery;
      battery = bFull - bLow;
      return battery;
    }

//Some task, like clean-up, setting up fence, planting a tree strains extra, draing it 20% per task
    public int batteryStrain(int bigTask, int doubleDecrease){
      extra = bigTask - doubleDecrease;
      return extra;
    }

    public String dirty(){
      return "Codey needs a clean-up because of his last task";
    }

//When battery level is 20%, Codey reminds you to reacharge his battery
    public void plsRecharge(int toLow){
      recharge = toLow;
      toLow = 20;
      System.out.println("Please recharge, battery level is at " + toLow + "%");

    }

  public Droid(String droidName){
    name = droidName;
  }

  public static void main(String[] main){

    Droid codeyDroid = new Droid ("Codey");
    System.out.println(codeyDroid);
    codeyDroid.performTask("cleaning");
    System.out.println("The battery level of Codey is now at " + codeyDroid.batteryDecrease(100, 10) + "%");

    codeyDroid.performTask("planting a tree");

    System.out.println("Codey's battery level is now at " + codeyDroid.batteryStrain(90, 20) + "%");

    System.out.println(codeyDroid.dirty());
    System.out.println("All clean and ready for next task");

    codeyDroid.performTask("setting up the new fence");

    System.out.println("Now Codey only has " + codeyDroid.batteryStrain(50, 20) + "% battery left");

    codeyDroid.performTask("putting up a painting");

    codeyDroid.plsRecharge(20);
    }
}
