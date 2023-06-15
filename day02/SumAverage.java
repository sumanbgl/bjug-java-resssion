/**Question 2: Write a Java program that will have a predefined values for 3 marks of a student and calculate the Total and Average marks of a student and 
 * print both of them (Total Marks, Average).*/
public class SumAverage {
    public static void main(String... args) {
        int sub1 = 67;
        int sub2 = 45;
        int sub3 = 78;
        int total = sub1 + sub2 + sub3;
        int average = total / 3;
        System.out.println("Total marks : " + total);
        System.out.println("Average : " + average);
    }
}