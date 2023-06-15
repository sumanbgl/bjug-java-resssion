/*Question: Write. Java program to implement the FizzBuzz Logic wherein you need to print from 1 to 50 where 
if a number is divisible by 3, it should print Fizz, and if a number is divisible by 5, it should print Buzz, 
and if a number is divisible by 3 and 5, it should print FizzBuzz - instead of that number, and rest of them should be actual numbers in the output. */

public class FizzBuzz {
    public static void main(String... args) {
        for( int i = 1; i <= 50; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if( i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}