public class SmallestElementInArray implements Runnable{

    @Override
    public void run() {
        int [] array = {8,7,6,5,9,2,4,1};
        int min = array[0];
        for(int i = 1; i< array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        System.out.println("Smallest element in array is: "+min);
    }
}
