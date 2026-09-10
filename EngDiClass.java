public class EngDiClass {
    public static void main2(String[] args) {
        //integral numbers --> byte,short,int,long
        int age = 20;
        byte age1 = 20;
        short age2 = -20;
        long age3 = 20000000000L;
        //last ma "l" for long
        // decimal numbers --> float, double
        float age4 = 20.0000001000010F; // 7 digit after decimal
        double age5 = 20.00001010000010; // 15 digit after decimal
        //characters -- > char
        // for single character or any ext mark
        char initial = 'a';
        // string name = "Rajesh";
        System.out.println(initial);
        System.out.println((int)initial);
         //booleans --> boolean
        boolean isEligible = true;
        System.out.println(isEligible);

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(age4);
        System.out.println(age5);

        float floatMin = Float.MIN_VALUE;
        double doubleMin = Double.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;
        double doubleMax = Double.MAX_VALUE;
        System.out.println("min: " + floatMin);
        System.out.println("max: " + doubleMin);
        System.out.println("min: " + floatMax);
        System.out.println("max: " + doubleMax);

        System.out.println((int)Character.MIN_VALUE);
        System.out.println((int)Character.MAX_VALUE);
        System.out.println((char) 10084);
        System.out.println((char) 1008);
        System.out.println((char) 2309);
        char heart = 10084;
        char heart2 ='\u2764'; // unicode representation
       System.out.println(heart);
        System.out.println(heart2);


        for(int i =0; i <128;i++){
           System.out.println((char) i);
        }

    }



    // widening and narrowing conversion

    public static void main(String[] args){
        int a = 10;
        long b = a; //long ka size jyada hota hai isiliye int ko long ma de sakte hai or  float ma int ko
        float c = a; //int and floAT 4 bytes

        float f = 1.7F;
        int g = (int)f;// if sidha bhi kar diya toh error aayega int me float ko dene ma is case java automatically convert nhin krega

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(g);

       /* float 4 byte;
        int 4 byte ;
        long 8 byte;
        double 8 byte;
        */

        byte byteValue = 10;
        short shortValue = byteValue;
        int intValue = shortValue; // 4 byte
        long longValue = intValue; // 8 byte
        float floatValue = longValue;  // 4 byte
        double doubleValue = floatValue; // 8 byte

 //widning conversion or implicit conversion or automatic conversion
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);

        char charValue = 'a';
        int intVAlue = charValue;
        float floatVAlue = charValue;
        System.out.println(floatVAlue);
        System.out.println(intVAlue);


        int h = (int)f ;// this is narrowing conversion
  // narrowing conversion ma data loss hota hai
    }
}

