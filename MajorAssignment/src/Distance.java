/*
Task # 6
Create a distance class. The member data should comprise an int for storing the distance provided, a
string for choice of the measurement unit and another int for conversion. Member functions should
allow the user to enter the distance in either of the three units (inches, millimeters, kilometers) and
convert to the choice of the user and display it
 */

import java.util.Scanner;

public class Distance {
    private int distance ;
    private String units ;
    private int conversion ;

    public Distance(){
        distance = 0;
        units = "";
        conversion = 0;
    }

    public void getDistance(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Distance: ");
        distance = scanner.nextInt();
    }
    public void getUnits(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance according to your choice of units i.e (inches , millimeters, kilometers");
        units = scanner.next().toLowerCase();
    }
    public void chooseConversion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Conversion Units: ");
        System.out.println("Enter 1: Inches ");
        System.out.println("Enter 2: Millimeters ");
        System.out.println("Enter 3: Kilometers ");
        conversion = scanner.nextInt();
    }

    public void convertDistance(){
        double convertedDistance = 0;
        if(units.equals("inches")){
            if(conversion == 1){
                convertedDistance = distance;
            } else if (conversion == 2) {
                convertedDistance = distance * 2.4;
            } else if (conversion == 3) {
                convertedDistance = distance * 0.025;
            }
        } else if (units.equals("millimeters")) {
            if(conversion == 1){
                convertedDistance = distance * 0.039;
            } else if (conversion == 2) {
                convertedDistance = distance;
            } else if (conversion == 3) {
                convertedDistance = distance * 0.00001;
            }
        } else if (units.equals("kilometers")){
            if (conversion == 1){
                convertedDistance = distance * 39370.1;
            } else if (conversion == 2) {
                convertedDistance = distance * 1000000;
            } else if (conversion == 3) {
                convertedDistance = distance;
            }
        }
        System.out.println("Converted Distance: "+convertedDistance);
    }

        public static void main(String[] args) {
            Distance distance = new Distance();
            distance.getDistance();
            distance.getUnits();
            distance.chooseConversion();
            distance.convertDistance();

    }
}
