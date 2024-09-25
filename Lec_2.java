public class Lec_2 {
        public static void main(String[] args) {



            //METHOD whatwv seen main / math / Integer.parseInt
            //void means nothing is returned from the method
            System.out.println(addOne(5));
            int result = addOne(7);
            System.out.println(result);
            System.out.println(addOne(result));

            System.out.println(getHypotenuse(6, 8));
            System.out.println(getHypotenuse(4.25, 7.78));

            System.out.println(distance(4, 5.7, 2.3, 3.6));
            System.out.println(area(5.67));
            System.out.println(area(4.6789));
            System.out.println(area2(4, 5.7, 2.3, 3.6));

        }

        //insert new method

        public static int addOne (int x){
//                Requires return statement
            return x + 1;

        }

        public static double sum(int x,double y){
            return x+y;
        }
        public static double getHypotenuse(double a, double b) {
            double c = Math.sqrt(a*a+b*b);
            return c;  //return Math.sqrt(a*a+b*b);
        }

        //    Distance formula X and Y
        public static double distance(double x1,double x2, double y1, double y2){
            double dx = Math.pow(x2-x1,2);
            double dy = Math.pow(y2-y1,2);
            return Math.sqrt(dx*dx+dy*dy);//dx+dy what she had taught


        }

        // Method of circle area
        public static double area(double r ){
            return Math.PI *r *r;
        }

        public static double area2(double x1,double y1,double x2,double y2 ){
            double radius = distance(x1,y1,x2,y2);
            return area(radius);
        }
    }
