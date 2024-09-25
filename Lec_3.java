public class Lec_3 { //boolean true / false
    public static void main(String [] args){

        lessthanten(5);
        lessthanten(15);
        lessthanten(10);

        negatives(-50);
        negatives(-26);
        negatives(0);
        System.out.println("" + 5);
        //isEven
        System.out.println(isEven(2));
        System.out.println(isEven(3));
        System.out.println(isEven(148768));

        if (isEven(134758)){
            System.out.println("it's even");
        }
        else {
            System.out.println("it's odd");
        }

        if (!isEven(134758)){
            System.out.println("it's even");
        }
        else {
            System.out.println("it's odd");
        }




        // logical AND ( && )- operator return true if ALL values are true
        System.out.println(true);
        System.out.println(false);

        System.out.println(true && true);
        System.out.println(false && false); //false , any false = false whatsoever
        System.out.println(false && true);

        //logical OR (||) - operaror returns true if any of the values is true
        System.out.println(false || false);// false
        System.out.println(true || false || false);// true

        // logical not (!) - operator returns the opposite (>, >=,

        System.out.println(!true); //false
        System.out.println(!false); //true
        // comparison operators (relational)
        System.out.println(10 > 5 );// true
        System.out.println(10 < 5 ); //false
        System.out.println("hello \"stranger\"");
        //== - equality
        //= - assing

        System.out.println(10 == 5 );// False
        System.out.println(10 == 10 ); //True

        //!= not equal
        System.out.println(10 != 5 );// True

        // if-else conditional (have code that only executed only if a condition is matched, and have other code exe only if the condition is not mactcj
        int x= 5;
        if (x<10){
            System.out.println("x is less than 10");
        }
        else { //is not printed because if is true
            System.out.println("x is greater than 10");
        }









    }
    public static void lessthanten (int x){
        if (x<10){
            System.out.println("x is less than 10");
        }
        else if (x==10) {
            System.out.println("x is equals exacrly 10");
        }
        else { //is not printed because if is true
            System.out.println("x is greater than 10");
        }
    }

    public static boolean isEven(int x){ //purpose of method is return true if x is an even number or odd ifs not

        boolean even = (x%2 == 0); //    return x%2 ==0;
        return even;


    }
    public static void negatives(int x){
        if (x<0){
            System.out.println("x is negative");
        }
        else if (x>0){
            System.out.println("x is greater than 0");
        }
        else {
            System.out.println("x is 0");
        }
    }
}

//coding bat
