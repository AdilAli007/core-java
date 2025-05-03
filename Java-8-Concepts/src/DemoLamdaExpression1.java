
public class DemoLamdaExpression1 {

    public static void main(String[] args) {
       // System.out.println("Linear Search Algorithm");

        LinearSearch linearSearch = ()->{
        int [] array = {5,3,6,1,4,2};
        int item = 4;
        int temp = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] == item){
                System.out.println("Element found: "+i);
                temp += 1 ;
            }
        }
        if(temp == 0){
            System.out.println("Element not found: ");
        }
    };
    linearSearch.linearSearching();
    linearSearch.stringSearch();

        //System.out.println("Binary Search Algorithm");

    BinarySearch binarySearch = () -> {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int search = 9;
            int lowerIndex = 0;
            int higherIndex = array.length - 1;
            boolean found = false;

            while (lowerIndex <= higherIndex) {
                int middleIndex = (lowerIndex + higherIndex) / 2;

                if (array[middleIndex] == search) {
                    System.out.println("Element found : " + array[middleIndex]);
                    found = true;
                    break;
                } else if (array[middleIndex] < search) {
                    lowerIndex = middleIndex + 1;
                } else {
                    higherIndex = middleIndex - 1;
                }
            }

            if (!found) {
                System.out.println("Element not found.");
            }
        };
        binarySearch.binarySearching();

        //System.out.println("Armstrong Number 153 ");

        ArmstrongNumber armstrongNumber = ()->{
          int num = 153;
          int t1 = num ;
          int length = 0 ;
          while(t1 != 0){
              t1 = t1 / 10 ;
              length += 1;
          }
          int t2 = num ;
          int remainder ;
          int arms = 0 ;
          while(t2 != 0){
              remainder = t2 % 10;
              int multiply = 1;
              for(int i = 1; i <= length ; i++){
                  multiply = multiply * remainder ;
              }
              arms += multiply;
              t2 = t2 /10 ;
          }
          if(num == arms){
              System.out.println("It is an armstrong number");
          }else {
              System.out.println("It is not an armstrong number");
          }
        };
        armstrongNumber.armsNum();

        //System.out.println("Prime Number 153 ");

        PrimeNumber primeNumber = ()->{
            int num = 7 ;
            int count = 0 , i = 1 ;

            while(i <= num){
                if(num % i == 0){
                    count ++;
                }
                i++;
            }

            if(count == 2){
                System.out.println("It is a prime number");
            }else {
                System.out.println("It is not a prime number");
            }
        };
        primeNumber.primeNo();

        //System.out.println("Fibonacci Series ");

         FibonacciSeries fibonacciSeries = ()->{
            int num = 5 ;
            int i = 1, a = 0 , b = 1 ;
            System.out.print("Fibonacii Series: "+a+" "+b+" "+" ");
            while(i <= num){
                int c = a+b ;
                System.out.print(c+" ");
                a = b;
                b = c;
                i++;
            }
        };
         fibonacciSeries.fiboSeries();

    }
}

