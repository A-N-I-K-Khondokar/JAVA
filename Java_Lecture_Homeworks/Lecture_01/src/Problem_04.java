/*
4. Try to print an double variable in various format using printf and println function:
 (to declare double variable you can use: double abc=10.57645; )
 Various format means:
 exponent format,
 2 digits after decimal point,
 0-padded format,
 left justified format,
 right justified fomat
 */
public class Problem_04 {
    public static void main(String[] args) {
        double x=10.57645;

        System.out.printf("Exponent format :%e\n",x);

        System.out.printf("To digits after decimal point :.2f\n",x);
        // %0 then 10 means 10 character wide! the whole double number.
        System.out.printf("0 padded format :%010.3f\n",x);
        // The "|" showes the end!
        System.out.printf("Left Justified :%-10.3f|\n",x);

        System.out.printf("Right Justified :%10.3f|\n",x);


    }
}
