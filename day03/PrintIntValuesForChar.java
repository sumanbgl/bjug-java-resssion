public class PrintIntValuesForChar {
    public static void main(String... args) {
        for(char ch='a'; ch <= 'z'; ch++) {
            int i = ch;
            System.out.println("Integer value for char '" + ch + "' is " + i);
        }
         for(char ch='A'; ch <= 'Z'; ch++) {
            int i = ch;
            System.out.println("Integer value for char '" + ch + "' is " + i);
        }
    }
}