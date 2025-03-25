public class MissingElementOfArray {
    public static void main(String[] args) {
        int [] array = new int[100];
        int totalSum = 5050 ;
        int arraySum = 0 ;
        for(int i = 0; i < array.length; i++){
            array[i] = i  ;
            arraySum = arraySum + i;

            if(array[i] % 2 == 0){
                System.out.println("Even Number: "+array[i]);
            }else{
                System.out.println("Odd Number: "+array[i]);
            }

        }
        System.out.println("Sum: "+arraySum);
        System.out.println("Missing Element: "+(totalSum-arraySum));
    }
}
