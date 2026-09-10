// for(init ; condition; update)
import java.util.*;
public class Loopsinjava {
    public static void main(String[] args){
         int i;
         Scanner sc = new Scanner(System.in);
         int n;
         n = sc.nextInt();
        // for(i=0;i<n;i++){
        //     System.out.println(5*i);
       //  }

        /*for(i=1;i<=3;i++){
            for(int j =1; j<=3; j ++){

                System.out.print("* ");
            }
            System.out.println();
        } */

        int j;
       /* for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.println("i = "+i +" j = "+j);
            }
        } */

        /*for(i=1;i<=n;i++){
            if(i==5)
                break;
            System.out.println(i);
        } */

       /* for(i=1;i<=n;i++){
            if(i==5)
                continue;
            System.out.println(i);
        } */

        // initialization
        // while(condition) {
        //    code
        //    update;
        //   }
     /* i=1;
      while(i<=n){
          System.out.println(i);
          i++;
      } */



        /* do {
            //code
            }
            while(condition);

         */


        i =1;
        do{
            System.out.println(i);
            i++;
        }
        while(i <= n);
         sc.close();



    }

}