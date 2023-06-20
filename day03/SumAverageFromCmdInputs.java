public class SumAverageFromCmdInputs {
    public static void main(String... args) {
        int numSubjects = args.length;
        int[] marks = new int[numSubjects];
        System.out.println(numSubjects);
        for(int i = 0 ; i < numSubjects; i++) {
            marks[i] = Integer.parseInt(args[i]);
            System.out.println("Subject " + i+1 + " score : " + marks[i]);
        }
        int total = 0;
        for(int i = 0 ; i < marks.length; i++){
            total += marks[i];
        }
        int average = total / marks.length;
        System.out.println("Total : " + total);
        System.out.println("Average : " + average);        
    }
}