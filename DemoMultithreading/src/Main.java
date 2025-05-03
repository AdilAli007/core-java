//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main  {

    public static void main(String[] args) {
        LargestElementInArray largestElementInArray = new LargestElementInArray();
        Thread thread1 = new Thread(largestElementInArray);
        thread1.start();
        System.out.println("Thread One Name: "+thread1.getName());

        SmallestElementInArray smallestElementInArray = new SmallestElementInArray();
        Thread thread2 = new Thread(smallestElementInArray);
        thread2.start();
        System.out.println("Thread Two Name: "+thread2.getName());

        SecondLargestElementInArray secondLargestElementInArray = new SecondLargestElementInArray();
        Thread thread3 = new Thread(secondLargestElementInArray);
        thread3.start();
        System.out.println("Thread Three Name: "+thread3.getName());

        SecondSmallestElementInArray secondSmallestElementInArray = new SecondSmallestElementInArray();
        Thread thread4 = new Thread(secondSmallestElementInArray);
        thread4.start();
        System.out.println("Thread Four Name: "+thread4.getName());

        ReverseArray reverseArray = new ReverseArray();
        Thread thread5 = new Thread(reverseArray);
        thread5.start();
        System.out.println("Thread Five Name: "+thread5.getName());

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int [] array = {1,2,3,4,5,6,7,8,9,10};
                int sum = 0;
                for(int i = 0; i < array.length; i++){
                    sum += array[i];
                }
                System.out.println("Total sum of array: "+sum);
            }
        };
        Thread thread6 = new Thread(runnable);
        thread6.start();
        System.out.println("Thread Six Name: "+thread6.getName());

    }
}