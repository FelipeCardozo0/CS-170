public class Lec_5{
    public static void main(String[] args) {
    //accumulation: initialize variable, update inside loop, after loop you finalize and return it
        // sum all pos int bet 1 and n
    System.out.println("sumN");
    System.out.println(sumN(1));
    System.out.println(sumN(5));
    System.out.println(sumN(10));


    System.out.println("multN");
    System.out.println(multN(1));
        System.out.println(multN(10));
        System.out.println(multN(100));

        System.out.println("sumMultN");
        System.out.println(msumMult5(15));
        System.out.println(msumMult5(9));
        System.out.println(msumMult5(20));


        System.out.println("sumDigits");
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(231));

        System.out.println(countDivisors(20));
        System.out.println(countDivisors(200));

        System.out.println(repeatStrings("hi","hey", 3,2));
        System.out.println(repeatStrings("hi","hey", 2,4));
        System.out.println(repeatStrings("b","a", 8,9));

    }
    public static int sumN(int n){
        int sum = 0; //ad later
        for (int i=1; i<=n; i++){
            sum += i;
        }
        return sum;
    }
    public static int multN(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
    public static int msumMult5(int n) {
        int sum = 0;
        for (int i = 5; i <= n; i+=5) {
            sum += i;
        }
        return sum;
    }
    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n%10;
            sum += digit;

        }
        return sum;
    }

    public static int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                count++;
            }
        }

        return count;
    }
    public static String repeatStrings(String str1, String str2, int n1, int n2) {
        String result = "";
        for (int i = 0; i < n1 && i<n2; i++) {
            result += str1 + str2;
        }
        if (n1>n2){
            for(int i = 0; i<n1-n2; i++)
                result += str1+str2;
            }
        if (n2>n1){
            for (int i = 0; i<n1-n2; i++){
                result +=str1;
            }
    }
        return result;
}}
