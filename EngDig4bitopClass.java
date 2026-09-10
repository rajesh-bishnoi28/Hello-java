public class EngDig4bitopClass {
    public static void main(String[] args) {
        // computers --> 0 1 data store
        int a = 5;
        System.out.println(Integer.toBinaryString(a));
        // 00000000 00000000 00000000 000000101

        // operands --> byte short int long

        // and operator &
        // or operator |
        // xor ^
        // not ~
        //left shift<<
        // right shift >>
        // unsigned right shift >>>

        int c = 5 & 4;   // operation performed in binary
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(4));
        System.out.println(Integer.toBinaryString(c));
        System.out.println(c);

        // left shift
        int a1 = 5;
        int  c1 = a << 1;
        System.out.println(Integer.toBinaryString(a1));
        System.out.println(Integer.toBinaryString(c1));
        System.out.println(c1);

        int a2= 5;
        int  c2 = a2 >> 2;
        System.out.println(Integer.toBinaryString(a2));
        System.out.println(Integer.toBinaryString(c2));
        System.out.println(c2);

        int a3 = 5;
        int  c3 = a3 >>> 1;
        System.out.println(Integer.toBinaryString(a3));
        System.out.println(Integer.toBinaryString(c3));
        System.out.println(c3);
    }
}