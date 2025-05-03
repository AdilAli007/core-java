public class LargestElementInArray implements Runnable {

    @Override
    public void run() {
        int [] array = {5,6,4,9,10,7};
        int max = array[0];
        for(int i = 1; i<array.length; i++ ){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Largest element in array is: "+max);
    }
}
