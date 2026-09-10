import java.util.*;
public class Conditionalstate {
    public static void main(String[] args) {
     /*   // greatest of three numbers
        int num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num1 = sc.nextInt();
        int num2 , num3;
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        num3 = sc.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1);
        }
        else if(num2 >= num1 && num2 >= num3){
            System.out.println(num2);
        }
        else
            System.out.println(num3);



    */
        // ternary operator
     //   int streakDays = 35;

    //    String status = (streakDays >= 30) ? "Consistent" : "Irregular";
     //   System.out.println(status);


      /*  switch (expression) {
            case value1:
                // code
                break;
            case value2:
                // code
                break;
            default:
                // code
        } */


        int dayNumber = 3;

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                    case 3:
                        System.out.println("Wednesday");
                        break;

                    default:
                        System.out.println("Invalid day");
                }



    }

}
