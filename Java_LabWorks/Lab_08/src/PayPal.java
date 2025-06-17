public class PayPal implements PaymentMethod{
    private String email;
    private String password;
    public PayPal(String x,String y){
        this.email=x;
        this.password=y;
    }
    @Override
    public boolean authorizePayment(double amount){
        return (email.contains("@")&&password.length()>=6);
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
