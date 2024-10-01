public class Lect_8 {
    public static void main(String[] args) {
        char c = 'A';
        String s1 = "A";
        String s2 = "ABCD";
        String s3 = "";

        System.out.println(c + 1); //int
        System.out.println((char) (c+ 1)); //cast
        System.out.println((char)65); //A

        System.out.println("A"+1);// String concatenation

        int n = s2.length();
        System.out.println(n);
        // c.length = error

        // String indexing
        // Starts at 0, goes to length() -1
        // "ABCD" - index 0 = A, 1=B, 2=C , 3 =D
        char  k = s2.charAt(2); // C
        System.out.println(k);

        int idx = s2.indexOf("A");
        System.out.println(idx);
        System.out.println(s2.indexOf("AB")); //1
        System.out.println(s2.indexOf("E")); //-1 (not there)

        // Substring
        //Substrin(int a, intb)
        //Substrin(int a)
        String s4 = "Hello Everyone";
        System.out.println(s4.substring(3,8)); // "lo Ev"
        System.out.println(s4.substring(8)); //

        // uppercase / lowercase
        System.out.println(s4.toUpperCase());
        System.out.println(s4.toLowerCase());
        System.out.println(s4.toUpperCase().substring(1,4));

        String x = "hey";
        String y = "You";
        String z = "hey";
        System.out.println(x.equals(y)); // False
        System.out.println(x.equals(z));// true

        System.out.println("Apple".compareTo("banana"));// negative
        System.out.println("banana".compareTo("apple"));// positive
        System.out.println("apple".compareTo("apple")); // 0
        System.out.println("apple".compareTo("BANANA")); //positive "apple" > BANANA
        System.out.println("aab".compareTo("aad")); // negative
        System.out.println("aa".compareTo("aaa")); // negative
        System.out.println("apple".compareTo("apply")); // negative

        // reversesrring - given a String, return the reversed String
        //eg. "ABCDE" -> "EDCBA"

        System.out.println(reverseString("ABCDE"));
        System.out.println(mergeString("ABCD", "1234"));


    }

    public static String reverseString(String s){
        String result = "";
        for (int j  = s.length()-1; j>=0; j-- ){
            result += s.charAt(j);
        }
        return result;
    }
    //mergeStrings
    //e.g. "ABCD", "1234" - > "A1B2C3D4"
    //e.g. "AB", "1234" - > "A1B234"
    //e.g. "ABCD", "12" - > "A1B2CD"

    public static String mergeString(String s1, String s2){
        String result = "";
        for (int i =0; i<s1.length() && i<s2.length(); i++){
            result += s1.charAt(i) + s2.charAt(i);
        }
        if (s1.length() > s2.length()){
            for (int i= s1.length(); i <s2.length();i++){
                //result += s2.charAt(i);

                result += s1.charAt(i);
                result += s2.charAt(i);

                //option 2: substrings
                //resilt +=s1.susbtring(i, i+1) + s2.susbtring(i,i+1);
            }
            else if (s1.length() > s2.length()){
                for (int i= s1.length(); i <s2.length();i++){
                    result += s2.charAt(i); // other way aroufn
                }
                return result;
        }
    }

}
