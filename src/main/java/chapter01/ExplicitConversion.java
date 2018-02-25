package chapter01;

import java.util.ArrayList;
import java.util.List;

public class ExplicitConversion {

    public static void main(String[] args) {

        java.util.List<Integer> list = new java.util.ArrayList<Integer>();
        list.add(10);
       list.add(14);
        for(int x : list) {
            System.out.println(x + ", ");
            break;
             }


        int m = 9, n = 1, x = 0;
        while(m > n) {
               m--;
          n += 2;
              x += m + n;
              }
         System.out.println(x);

    }



}
