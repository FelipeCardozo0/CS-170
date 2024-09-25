public class Lec_1 {
    public static void main(String[] args){
// Values & Types
// Primitive Data Types (predefined with a keyword)
// boolean - true/false
// char - single characters, e.g. 'a', '$'
// float - 32 bit rational (e.g. 3.14)
// * double - 64 bit rational (e.g. 3.14)
// byte - 8 bit whole numbers (e.g. 1, or 7)
// short - 16 bit whole numbers
// * int - 32 bit whole numbers
// long - 64 bit whole numbers
// Non-Primitive Data Types (often user-defined)
// * String - words "hey"
// Array - ordered set of data of the same type
// ... - all other classes
// int
        System.out.println(90);
        System.out.println(0);
        System.out.println(-5);
// double
        System.out.println(5.2);
        System.out.println(1.0);
        System.out.println(-2.5);
        System.out.println(Math.PI);
// String - capital S
        System.out.println("hey");
        System.out.println("hello there");
        System.out.println("asdfk24789#$*(");
        System.out.println(""); // empty String
        System.out.println("5");
        System.out.println("hello \"stranger\""); // escape the quotes
// Arithmetic Operators
// Addition +
        System.out.println(1+2); // 3
        System.out.println(1.2 + 2.3); // 3.5
        System.out.println(1 + 2.3); // 3.3
        System.out.println(1.0 + 2); // 3.0
// int + double (or double + int) = double
// Subtraction -
        System.out.println(1 - 2); // -1
        System.out.println(2.5 - 1); // 1.5
// Multiplication *
        System.out.println(2 * 3); // 6
        System.out.println(2 * 3.5); // 7.0
// Division /
        System.out.println(6 / 2 ); // 3
        System.out.println(5 / 2 ); // 2 integer division
        System.out.println(5 / 3 ); // 1
        System.out.println(5.0 / 2.0); // 2.5
        System.out.println(5.0 / 2); // 2.5
        System.out.println(5 / 2.0); // 2.5
// Modulo / Modulus %
// remainder
        System.out.println(8 % 2); // what is the remainder of 8/2? 0
        System.out.println(8 % 3); // what is the remainder of 8/3? 2
        System.out.println(0 % 4); // 0
        System.out.println(1 % 4); // find n,m such that 4*n+m = 1 (1)
        System.out.println(2 % 4); // 2
        System.out.println(3 % 4); // 3
        System.out.println(4 % 4); // 0
        System.out.println(5 % 4); // 1
        System.out.println(6 % 4); // 2
        System.out.println(7 % 4); // 3
        System.out.println(8 % 4); // 0
        System.out.println(9 % 4); // 1
        System.out.println(10 % 4); // 2
// String concatenation +
        System.out.println("hello" + "everyone"); // helloeveryone
        System.out.println("hey " + "there"); // hey there
        System.out.println("hello" + " " + "all"); // hello all
        System.out.println("hello" + "5"); // hello5
        System.out.println("hello" + 5); // hello5
        System.out.println(1 + "2"); // "12"
        System.out.println(1 + 2 + "3"); // 33
        System.out.println("1" + 2 + 3); // 123
        System.out.println("1" + (2 + 3)); // 15
// Operator Precedence
// * / % then + -
// can modify with parenthesis
        System.out.println(1 + 2 * 3); // 7
        System.out.println((1 + 2) * 3); // 9
        System.out.println(1 + 2 + "3"); // 33
        System.out.println(1 + (2 + "3")); // 123
// Type Conversions
// ------> narrowing conversion (loss of precision)
// double - float - long - int - short - byte
// <------ widening conversion (no loss precision)
// int -> double
// implicit conversions
        System.out.println(1.0 * 5); // 5.0
        System.out.println(0.0 + 5); // 5.0
// explicit conversion through casting
        System.out.println((double)5); // 5.0
// double -> int
// can't be implicit
        System.out.println((int)5.0); // 5
        System.out.println((int)5.7); // 5
        System.out.println((int)Math.PI); // 3
// int or double -> String
        System.out.println("" + 5); // String "5"
// System.out.println((String)5); // ERROR
// String -> int
// Java built a method for that
        System.out.println(Integer.parseInt("5")); // 5
        System.out.println(Integer.parseInt("5") + 2); // 7
        System.out.println(Integer.parseInt("5"+2)); // 52
// System.out.println(Integer.parseInt("5+2")); // ERROR
// String -> double
        System.out.println(Double.parseDouble("5.7")); // 5.7
        System.out.println(Double.parseDouble("5")); // 5.0
    }
}
