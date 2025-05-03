import java.util.Arrays;

public class DemoLamdaExpression2 {
    public static void main(String[] args) {

        //System.out.println("Generate Table");

        GenerateTable generateTable = (number) -> {
            System.out.println("\n" + "Table of : " + number);
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + "*" + i + "=" + (number * i));
            }
        };
        generateTable.generateTable(8);

        //System.out.println("Sorted Array");

        SortingArray sortingArray = (int [] array)->{
            int temp ;
            for(int i=0 ; i< array.length; i++){
                for(int j=i+1; j< array.length; j++){
                    if(array[i] > array[j]){
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp ;
                    }
                }
            }
            System.out.println("Sorted Array in Ascending Order: "+ Arrays.toString(array));
        };
        int [] array = {10,20,4,5,6,3,2,};
        sortingArray.sortedArray(array);

        //System.out.println("Palindrome Number");

        PalindromeNumber palindromeNumber = (int number)->{
            int temp = number ;
            int sum = 0 ;
            while(number > 0){
                int reverse = number % 10 ;
                sum = sum * 10 + reverse ;
                number = number / 10 ;
            }
            if(temp == sum){
                System.out.println("Its Palindrome Number: "+sum);
            }else{
                System.out.println("Its Not Palindrome Number");
            }
        };
        palindromeNumber.palindromeNumber(121);

        //System.out.println("Reverse String");

        ReverseString reverseString = (String string)->{
          String temp = "";
          for(int i=string.length()-1; i>=0; i--){
              temp = temp+string.charAt(i);
          }
            System.out.println("Reverse String : "+temp);
        };
        reverseString.reverseString("MADAM");

        //System.out.println("Palindrome String");

        PalindromeString palindromeString = (String string)->{
            String temp = "";
            for(int i=string.length()-1; i>=0; i--){
                temp = temp+string.charAt(i);
            }
            if(string.equals(temp)){
                System.out.println(string+" :"+" Palindrome String");
            }else{
                System.out.println(string+" :"+" Not Palindrome String");
            }
        };
        palindromeString.palindromeString("MADAM");
    }
}
