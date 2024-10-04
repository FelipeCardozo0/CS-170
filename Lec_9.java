public class Lec_9 {
    public static void main(String[] args) {
    System.out.println(countHi("abc hi ho")==1);
    System.out.println(countHi("ABChi hi")==2);
    System.out.println(countHi("hihi")==2);
    System.out.println(countHi("hih")==2);

        System.out.println(countCode("hih")==2);
        System.out.println(countCode("hih")==2);
        System.out.println(countCode("hih")==2);
        System.out.println(countCode("hih")==2);

        System.out.println(getSandwich("breadjambread").equals("jam"));
        System.out.println(getSandwich("xxbreadjambreadyy").equals("jam"));
        System.out.println(getSandwich("xxbreadyy").equals(""));

        System.out.println(plusout("12xy34","xy"));
        System.out.println(plusout("12xy34","xy").equals("++xy++"));
        System.out.println(plusout("12xy34","1").equals("1++++"));
        System.out.println(plusout("12xy34xyabcxy","xy").equals("++xy++xy+++xy++"));


    }
    public static int countHi(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i'){
                count++;
            }
        }

        return count;

    }
    public static int countCode (String str){
        int count = 0;

        for(int i = 0; i < str.length()-3; i++){
            if(str.charAt(i) == 'c' && str.charAt(i+1) == 'o' && str.charAt(i+3) == 'e'){

                // Alternative: str.substrinf (i,i+2).equals("co") && str.charAt(i+3) == 'e'
                count++;
            }
        }
        return count;
    }

    public static String getSandwich(String str){
        int firstbread = -1;
        int lastbread = -1;

        for(int i = 0; i < str.length(); i++){
            if(str.substring(i,i+5).equals("bread")){
                firstbread = i;

            }
        }
        for (int i = str.length()-1; i>=5; i++){
            if(str.substring(i-5,i).equals("bread")){
                firstbread =i-5;
            }
        }
        if (firstbread < 0 || lastbread < 0 || firstbread==lastbread){
            return "";
        }
        return str.substring(firstbread,lastbread);
    }

    public static String plusout   (String str, String word){
        String result = "";
        for(int i = 0; i < str.length(); i++){ //world
            if (str.length()>=i+word.length() && str.substring(i, i+word.length()).equals(word) ){
                result += word;
                i+= word.length()-1;
            }
            else {
                result +="+" ;
            }
            result += "+";
        }

        return result ;
    }
}
