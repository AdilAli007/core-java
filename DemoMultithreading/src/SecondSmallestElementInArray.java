public class SecondSmallestElementInArray implements Runnable{
    @Override
    public void run() {
        int [] array = {6,8,2,4,3,2,1,5,7};
        int temp ;
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Second smallest element in array is: "+array[1]);
    }
}
