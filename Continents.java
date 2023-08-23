import java.util.*;
public class Continents {
  public static void main (String [] args){
    //basic project of Continents and Cities using switch case stmt.
      int continent; 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the Continets number from  0 to 7 :");
    continent=input.nextInt();
    switch (continent){
      case 1 : System.out.println("North America: Mexico City, Mexico");
      break;
      case 2 : System.out.println("South America: Sao Paulo, Brazil.");
      break;
      case 3 : System.out.println("Europe: Moscow, Russia");
      break;
      case 4 : System.out.println("Africa: Lagos, Nigeria.");
      break;
      case 5 : System.out.println("Asia: Shanghai, China");
      break;
      case 6 : System.out.println("Australia: Sydney, Australia");
      break;
      case 7 : System.out.println("Antarctica: McMurdo Station, US");
	break;
      default : System.out.println("Undefined continent!");
}
  }
}