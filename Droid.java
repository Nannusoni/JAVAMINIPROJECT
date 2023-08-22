package JAVA_PROJECT;

public class Droid{
	  int batteryLevel = 100 - 10;
	  String name;
	  public String toString() {
	    return "Hello, I m the droid : " + name;
	  }
	   public void performTask(String task){
	System.out.println(name + " is performing: " + task);
	   }
	  public Droid (String droidName){
	    name = droidName;
	  }
	  public static void main(String[] args) {
	    Droid Codey = new Droid ("Codey");
	    Droid Joe = new Droid("Joe");
	    System.out.println(Codey);
	    Codey.performTask("Dancing");
	    System.out.println();
	    System.out.println(Joe);
	    Codey.performTask("Singing");

	  }
	}