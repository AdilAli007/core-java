/*
Create a base class with two methods. In the first method, call the second method. Inherit a class and
override the second method. Explain what happens.
 */

public class Methods {
        public void firstMethod(){
        System.out.println("This is first method in base class");
        this.secondMethod();
    }
        public void secondMethod(){
            System.out.println("This is second method in base class");
        }
}
 class InheritClass extends Methods{
     @Override
     public void secondMethod() {
         System.out.println("This is second method in extended class");
     }

     public static void main(String[] args) {
         InheritClass inheritClass = new InheritClass();
         inheritClass.firstMethod();
         inheritClass.secondMethod();
     }
 }
 /*
 When we create the extended class object and calls first method through extended class it gives us first
 method argument exactly same but the second method argument is changed because it is overriden in extended
 class , that's why it shows the extended class argument of second method .
  */