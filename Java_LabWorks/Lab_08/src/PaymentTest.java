
import java.util.Scanner;
public class PaymentTest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount :");
        double amount = sc.nextDouble();
        PaymentMethod payment;

        System.out.println("Choose Your Payment Method : ");
        System.out.println("Press 1 for CreditCard");
        System.out.println("Press 2 for PayPal");
        int choice= sc.nextInt();
        sc.nextLine();
        if(choice==1){
            System.out.println("Provide your card number and holder name :");
            String cardNumber=sc.nextLine();
            String cardHolderName=sc.nextLine();
            payment= new CreditCard(cardNumber,cardHolderName);
        } else if (choice==2) {
            System.out.println("Provide your E-mail and Password :");
            String email=sc.nextLine();
            String password = sc.nextLine();
             payment = new PayPal(email,password);
        }else{
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }


        if(payment.authorizePayment(amount)){
            payment.processPayment(amount);
            payment.refundPayment(amount);
        }
        else
        {
            System.out.println("Payment authorization failed. Please try again.");
        }

    }
}