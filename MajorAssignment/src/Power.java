/*
Raising a number n to a power p is the same as multiplying n by itself p times. Write as overloaded
function power() having two versions for it. The first version takes double n and int p and returns a
double value. Another version takes int n and int p returning int value. Use a default value of 2 for p in
case p is omitted in the function call.
 */

import static java.lang.Math.pow;

public class Power {

    double power(double n ,int p  ) {
        return pow(n,p);
    }
    int power(int n, int p ){
        return (int) pow(n,p);
    }
    double power(double n){
        return pow(n,2);
    }
    int power(int n){
        return (int) pow(n,2);
    }


    public static void main(String[] args) {
        Power pow = new Power();
        System.out.println(pow.power(2.0,1));
        System.out.println(pow.power(2,3));
        System.out.println(pow.power(2.1));
        System.out.println(pow.power(2));

    }

}
