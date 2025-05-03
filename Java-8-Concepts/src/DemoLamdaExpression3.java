
public class DemoLamdaExpression3 {
    public static void main(String[] args) {

        NumberSquare square = (int x)->{
            System.out.println("Square of Number : "+(x*x));
            return x ;
        };
        square.square(5);



        TemperatureConverter converter = (double temp) ->{
            double result = (temp * 9 / 5) + 32 ;
            System.out.println("Celcius to Farhenit : "+result);
            return result;
        };
       converter.convert(37.37);

        NumberPattern numberPattern = (int number)->{
          for(int i=0; i<=5; i++){
              for(int j=1; j<=i; j++){
                  System.out.print(i+" ");
              }
              System.out.println(" ");
          }
          return number;
        };
        numberPattern.numberPattern(5);



        NumberPattern2 numberPattern2 = (int number)->{
            for(int i=1; i<=5; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(j+" ");
                }
                System.out.println(" ");
            }
            return number;
        };
        numberPattern2.numberPattern2(5);

        StarPattern starPattern = (int number)->{
            for(int i=8; i>=1; i--){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            return number;
        };
        starPattern.starPattern(10);
    }
}
