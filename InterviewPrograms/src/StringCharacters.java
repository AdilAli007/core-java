// Write a program to remove characters from string
// which are consecutively appear equals to occurrence

public class StringCharacters {
   public static void main(String[] args) {
       String string = "abbbcccac";
       int [] arr = new int[256];
       for(int i=0; i<string.length();i++){
           arr[string.charAt(i)] = arr[string.charAt(i)]+1;
       }
       int maximum = -1;
       char ch = ' ';
       for (int i =0; i<string.length(); i++){
           if(maximum < arr[string.charAt(i)]){
               maximum = arr[string.charAt(i)];
               ch = string.charAt(i);
           }
       }
       System.out.println("Maximun repeated character is: "+ch);
   }
}

