/*
Write a program that takes two string S1 and S2 as input and perform the following operations:
1-Print the length of each string.
2-Replace all spaces of S1 to underscore(_).
3-Print the first character of S1.
4-Compare the string S1 and S2 and print “equal” or “not equal” accordingly
5-Find the first occurrence of character ‘a’ in S1 and print it’s position.
6-If S1 is a substring of S2 or S2 is a substring of S1 then print a message.
7-Convert the S1 string to lower case and S2 string to upper case letter.
8-Save the S1 string to a character array.
9-What is the task of “trim” function?
10-What’s the difference between “equals()” and “==“ to compare string?
 */
public class ProblemSolution {
    public static void main(String[] args) {
        String s1 = new String("Anik Student");
        String s2 = new String("Khondokar also Student");
        //1
        System.out.println(s1.length() + " " + s2.length());
        //2
        System.out.println(s1.replace(' ', '_'));
        //3
        System.out.println(s1.charAt(0));
        //4
        if (s1.equals(s2)) {
            System.out.println("Equal!");
        } else {
            System.out.println("Not Equal!");
        }
        //5
        if(s1.indexOf('A')!=-1){
            System.out.println("Position of 'A' in s1 : "+s1.indexOf('A'));
        }
        else{
            System.out.println("Not found!");
        }
        //If the character (or substring) is not found, the indexOf() method in Java returns:👉 -1

        //6
        if (s1.contains(s2)) {
            System.out.println("s2 is a substring of s1");
        } else if (s2.contains(s1)) {
            System.out.println("s1 is a substring of s2");
        } else {
            System.out.println("Neither s1 is a substring of s2 nor s2 is a substring of s1");
        }
        /*A substring means a sequence of characters that
        appears contiguously inside another string.Here my string is not contiguous!
         */

        //7
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        //8
        char[] characterArray=s1.toCharArray();
        for(char u:characterArray){
            System.out.print( u +" ");
        }
        System.out.println();
        //9
        String x=new String("      Anik      ");
        System.out.println(x.trim());
        //Remove leading and trailing whitespace (spaces, tabs, newlines) from a string.
        System.out.println();
        //10
        String a = new String("Java");
        String b = new String("Java");
        String s3 = "Java";
        String s4 = "Java";

        System.out.println(a == b);      // false
        System.out.println(a.equals(b)); // true

        System.out.println();

        System.out.println(s3 == s4);      // true (same string pool object)
        System.out.println(s3.equals(s4)); // true

        /*In Java, == does not compare the content of two objects — it compares whether
        both variables refer to the exact same object in memory
        (i.e., they have the same memory address).
         */
    }
}
