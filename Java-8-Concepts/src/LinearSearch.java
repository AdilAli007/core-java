
@FunctionalInterface

public interface LinearSearch {

    void linearSearching();
    default void stringSearch(){
        String [] array = {"ADIL","ALI","JAMALI"};
        String item = "ALI";
        int temp = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i].equalsIgnoreCase(item)){
                System.out.println("Item found: "+array[i]+"\tat index position: "+i);
                temp = temp + 1;
            }
        }
        if(temp == 0){
            System.out.println("Item not found");
        }
    }
}
