import java.util.Locale;

public class EngDig5PrintClass {
    public static void main(String[] args) {
        System.out.println("Hello World"); //println any type of data type
        System.out.print("Hello World");
        System.out.print('x'); // print no new line

        // println ma ek hi argument and print ma bhi ek hi argument de sakte hai
        System.out.printf("\nHello %s", "World\n"); // printf ma multiple argument de sakte hai\

        int a =1 ;
        int b =2 ;
        String c  = "Sum";
        System.out.println(a + b + c);
        System.out.println(c + a + b);
        System.out.println(c + (a + b));
        System.out.println(c + ":" + (a + b));
        System.out.println(c + " of " + a + " & " + b + ":" +(a + b));
        System.out.print(c + " of " + a + " & " + b + ":" +(a + b));
        System.out.println();
        System.out.printf(c + " of " + a + " & " + b + ":" +(a + b));
        System.out.println();
        System.out.printf("%s of %d and %d is %d",c,a,b,a+b);
        // %e exponantional formate


        //locale in printf
        double number = 1234567.89;
        // default locale
        System.out.printf("Default locale: %,.2f%n", number);
        // us locale
        System.out.printf(Locale.US ,"US locale: %,.2f%n", number);

    }
}