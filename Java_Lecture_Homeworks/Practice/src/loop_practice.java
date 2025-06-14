public class loop_practice {
    public static void main(String[] args) {
        int product = 1;
        int count = 2;
        while (count <= 5) {
            product *= count;
            count++;
            System.out.println(product);
        }
    }
}
