public class CreditCard implements PaymentMethod {

    private String cardNumber;
    private String cardHolderName;
    public CreditCard (String x,String y){
        this.cardNumber=x;
        this.cardHolderName=y;
    }

    public boolean authorizePayment(double amount){
        return (cardNumber.length()==12 && cardNumber!=null );
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment is processed amount : "+amount);
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Refunding Payment amount : "+amount);
    }
}
