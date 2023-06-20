import java.util.Scanner;

public class SumAverageUsingScanner {
    public static void main(String... args) {
        Scanner sc = null;
        try {
            sc =  new Scanner(System.in);
            System.out.print("Enter the number of subjects : ");           
            int numSubjects = sc.nextInt();
            int[] marks = new int[numSubjects];
            for(int i = 1 ; i <= numSubjects; i++){
                System.out.print("Enter the marks for subject " + i + " : ");
                marks[i-1] = sc.nextInt();                    
            }

            int total = 0;
            for(int i = 0; i < marks.length; i++){
                total += marks[i];
                System.out.println("Marks in Subject " + (i+1) + " is : " + marks[i]);
            }   
            int average = total / marks.length;
            System.out.println("Total : " + total);
            System.out.println("Average : " + average);         
        } finally {
            sc.close();
        }
    }
}