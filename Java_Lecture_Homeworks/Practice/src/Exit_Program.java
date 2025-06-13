public class Exit_Program {
    public static void main(String[] args) {
        int a;
        int b;
        a=50; b=0;
        if(b==0){
            System.err.println("There is an error!");
            System.exit(1);
        }
        int result=a/b;
        System.out.println(result);
    }
}
