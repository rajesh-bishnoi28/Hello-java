public class EngDig3Class {
    public static void main2(String[] args) {
        int yourSalary = 1000;
        int deduction = 500;
        int monthlyTotal = yourSalary - deduction;
        int yearlySalary = monthlyTotal * 12;
        int perChild = yearlySalary / 3;
        System.out.println(yearlySalary);
        System.out.println(perChild);


        //Modulus --> gives the remainder
        int a = 5;
        int b =2;
        int remainder = a % b;
        System.out.println(remainder);


        // Addition
        int a1 = 5;
        double b1 = 10.1;
        double c1 = a1 + b1;
        System.out.println(c1);

        int a2  = 5;
        double b2 = a2 + 11.4;
        System.out.println(b2);

        float a3 = 12.24F;
        long b3 = 10L;
        float c3 = a3 + b3;
        System.out.println(c3);


        // Division
        double a4 = 5;
        int b4 = 3;
        double quotient = a4/b4;
        System.out.println(quotient);

        int a5 = 2;
        int b5 = a-2;
        //we cant devide by zero ;
        // we cant modulo by zero ;
    }



    public static  void main1(String[] args) {
        int result = (5+3)*4;
        System.out.println(result);
        double r1 =(double)5 / 4 + 3; // left wali pehle solve hogi
        System.out.println(r1);
        double r2 = (double)5/4 + 3*2-1;
        System.out.println(r2);

        int a = 10;
        //a = a+1; // manually
        a += 1; // compuond assignment opretor --> implicit casting
        a -= 1;
        a *= 2;
        a /= 2;
        a %= 3;
        System.out.println(a);

         int x = 5;
         int y = 10;
         x += y; // x = x + y
         System.out.println(x);


    }

    public static void main(String[] args) {
        // increment and decrement operator
        int a = 5;
        a++; // POST INCREMENT OPERATOR
        System.out.println(a);
        a--;
        System.out.println(a);
        ++a; //PRE
        System.out.println(a);
        --a;
        System.out.println(a);

        int a1  = 1;
        //int b1 = a1++ + a1;
        int c1 = ++a1 + a1;
       // System.out.println(b1);
        System.out.println(c1);

        double x = 1.5 ,y = 2.5, z = 3.5;
        double complexCalculation = (x+y) * (z-y) /(x+z);
        System.out.println(complexCalculation);
    }
}
