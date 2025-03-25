import java.util.ArrayList;
import java.util.List;

public class DemoCollectionInterface {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();


        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();

        /*Finding sum of 100 natural numbers and aslo even odd numbers from 1 to 100
        int sum = 0 ;
        for(int i = 1; i <= 100 ; i++) {
            numbers.add(i);
            sum = sum + i;
            if (i % 2 == 0) {
                evenNumbers.add(i);
            } else
                oddNumbers.add(i);
        }
        System.out.println("Total sum: "+sum);
        */

        //adding number in list
       for(int i = 0; i <= 100 ; i++){
           numbers.add(i);

        }

        System.out.println("Total number list: "+numbers);

        System.out.println("List size: "+numbers.size());

        //

        for(int i=0;i<numbers.size();i++){
            if(i%2==0){
                evenNumbers.add(i);
            }
            else{
                oddNumbers.add(i);
            }
        }

        // For Each Loop
        //Syntax:  for(DataType(Integer,String,Students) variableName(a,students):listToBeTraversed)

        for(Integer a:numbers){
            if(a%2==0){
                evenNumbers.add(a);
            }
            else{
                oddNumbers.add(a);
            }
        }

        System.out.println("Even Number: "+evenNumbers);
        System.out.println("Odd Number: "+oddNumbers);
    }
}
