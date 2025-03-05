/*
Write definitions for two versions of an overloaded function. This function’s 1st version sum() takes an
argument, int array, and returns the sum of all the elements of the passed array. The 2nd version of
sum() takes two arguments, an int array and a character (‘E’ or ‘O’). If the passed character is ‘E’, it
returns the sum of even elements of the passed array and is the passed character is ‘O’, it returns the
sum of odd elements. In case of any other character, it returns 0 (zero).
 */

import java.util.Scanner;

public class Array {

    public int sum(int[] array){
        int sum = 0;
        for(int i = 0; i< array.length; i++){
            sum += array[i];
        }
        return sum ;
    }

    public int sum(int[] array, char ch ){
        int sum = 0;
        if (ch == 'E') {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    sum += array[i];
                }
            }
        }
        else if (ch == 'O') {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    sum += array[i];
                }
            }
        } else {
            return 0;
        }
        return sum ;
    }

    public static void main(String[] args) {
        Array arrayObject = new Array();
        int array [] = {1,2,3,4,5,6,7,8,9};
            System.out.println("Sum of array elements: " + arrayObject.sum(array));
            System.out.println("Sum of even numbers in array: " + arrayObject.sum(array, 'E'));
            System.out.println("Sum of odd numbers in array: " + arrayObject.sum(array, 'O'));
            System.out.println("Invalid choice: " + arrayObject.sum(array, 'A'));

    }
}
