public class ReverseArray implements Runnable {

    @Override
    public void run() {
        int [] array = {5,6,3,4,1,8};

        System.out.println("Before Reverse: ");

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " "+"");
        }

        System.out.println();
        System.out.println("After Reverse: ");

        for(int i = array.length-1; i >= 0; i--){
            System.out.print(array[i]+ " ");
        }
    }
}
