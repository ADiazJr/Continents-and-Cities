//This application will print a continent and the largest city in that continent

import java.util.Scanner;

public class Continents {

    public static void main(String[] args) {
      Scanner coninentInt = new Scanner(System.in);
      System.out.println("Enter Number from 1-7");
      int continent = coninentInt.nextInt();
      coninentInt.close();

      switch(continent) {
        case 1:
        System.out.println("North America: Mexico City, Mexico");
        break;
        case 2:
        System.out.println("South America: Sao Paulo, Brazil");
        break;
        case 3:
        System.out.println("Europe: Moscow, Russia");
        break;
        case 4:
        System.out.println("Africa: Lagos, Nigeria");
        break;
        case 5:
        System.out.println("Asia: Shanghai, China");
        break;
        case 6:
        System.out.println("Australia: Sydney, Australia");
        break;
        case 7:
        System.out.println("Antartica: McMurdo Station, US");
        default:
        System.out.println("Undefined continent!");
        break;
      }
    }
  }