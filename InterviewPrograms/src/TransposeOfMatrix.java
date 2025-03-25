import java.sql.SQLOutput;
import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String args[]){
       int [][] array = new int [3][3];
       int [][] array1 = new int [3][3];
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter values to the array: ");
       for(int i= 0; i<3; i++){
           for(int j=0; j<3; j++){
               array[i][j] = scanner.nextInt();
           }
       }

        for(int i= 0; i<3; i++){
            for(int j=0; j<3; j++){
                array1[i][j] = array[j][i];
            }
        }

        System.out.println("INPUT MATRIX: ");
        for(int i= 0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("TRANSPOSE MATRIX: ");
        for(int i= 0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(array1[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
