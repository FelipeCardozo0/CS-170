public class Lec_5 {
    public static void main(String[] args) {
// if statement: statement(s) to be executed once if the condition is met
// while loop: statement(s) to be executed for as long the condition remains true
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++; // equivalent to i = i + 1
// i--; // equivalent to i = i - 1
// if you don't update the variable controlling the loop so that the condition is at some point false, you have an infinite loop
        }
        System.out.println("after the while loop");
        System.out.println(i);
// for loop
// repeating statement(s) for a specified # of iterations
// for(initialization; condition; update)
        int j;
        for (j = 0; j < 10; j++) {
            System.out.println(j);
        }
        System.out.println("after the for loop");
        System.out.println(j); // can only access j here if it is declared outside of the for loop
// variables declared inside the for loop have scope (only exist) inside the for loop
// for loops can always be written as while loops
// but while loops cannot always be written as for loops
// nested for loops
        for (int k = 0; k < 10; k++) {
            for (int l = 3; l > 0; l--) {
                System.out.println(k + " " + l);
            }
        }
        System.out.println("stringTimes");
        System.out.println(stringTimes("CS170", 3));
        System.out.println(stringTimes("Emory", 5));
        System.out.println(stringTimes("THE BEST STRING", 0));
        System.out.println(stringTimes("THE BEST STRING", 1));
        System.out.println("allEvens");
        allEvens(16);
        allEvens(11);
        allEvens(1);
        System.out.println("asterisk");
        asterisk(5);
        asterisk(15);
    }

    // given a String str and (non-negative) int n,
// return a larger String that is n copies of str
    public static String stringTimes(String str, int n) {
        String resultString = "";
        for (int i = 0; i < n; i++) {
            resultString += str; // equivalent resultString = resultString + str
        }
        return resultString;
    }

    // given an int n (non-negative), print all even #s between 1 and n (inclusive)
    public static void allEvens(int n) {
// how many times does the loop run? n times
// for(int i = 1; i <= n; i++){
// if(i%2 == 0){
// System.out.println(i);
// }
// }
// how many times does this loop run? n/2 (ish)
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
    }

    // given a number of rows (non-negative), print the following pattern:
// e.g. rows = 5
// *****
// ****
// ***
// **
// *
    public static void asterisk(int rows) {
        for (int j = 0; j < rows; j++){
            for (int i = 0; i < rows - j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
