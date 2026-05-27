public class assosiativity{
    public static void main(String[] args){
       // int a = 5*7-20/2;

        // presedence & Assositivity
        /*
        Highest presedence goes to * and /. They are  then evaluate of basis
        of left to right 
         = 35 - 20/2
         = 35-10
         =25
        */

       //int b = 50/5-20*2;
       /*
       =10 - 20*2
       = 10 - 40
       =-30
       */ 
       // System.out.println(a);
       // System.out.println(b);

        // quick quiz :-
        int x = 8;
        int y = 2;
        int k = x*y/2;
        System.out.println(k);

        int b = 2;
        int c = 5;
        int a = 10;
        int m = b*b -(4*a*c)/(2*a);
        System.out.println(m);

        float s = 7/4*9/2;  // 4.0
         System.out.println(s);

        float j = 7/4.0f*9/2.0f; // 7.875
         System.out.println(j);

    }
}