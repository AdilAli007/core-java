// Write a program to remove characters from string
// which are consecutively appear equals to occurrence

public class RemoveCharacter {
    public static void main(String [] args ){
        StringBuilder output = new StringBuilder();
        String input = "abbbcccac";
        int occurrence = 3;

        for(int i=0 ; i<input.length(); i++){
            int count = 1;

            while(i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                i++;
                count++;
            }

            if(count != occurrence){
                output.append(input.charAt(i));
            }
        }
        System.out.println("After removing repeated occurrence characters: "+output);
    }
}
