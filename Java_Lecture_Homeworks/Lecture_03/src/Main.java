public class Main {
    public static void main(String[] args) {
       // Declaration of and array
        char[] array_1= new char[5];
//        int[] array_2= new int[]{1,2,3,4,5};
//        int[] array_3={1,3,4,5,6,6};
        array_1[0]='1';
        array_1[1]='4';
        array_1[2]='\0';
        System.out.println(array_1);
        //so, java does print all the value though it is not
        // initialize!

        String s= new String(array_1);// convert the char into string!
        System.out.println(s);
        //Different way of declaring a string.
        String s2=new String("Hello World!");
        String s3="Hello World";
        System.out.println(s2+" ,"+s3);

    }
}