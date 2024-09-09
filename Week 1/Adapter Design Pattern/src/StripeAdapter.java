public class StripeAdapter implements PaymentProcessor{
    private StripeGateway stripeGateway;

    StripeAdapter(){
        this.stripeGateway = new StripeGateway();
    }

    public void processPayment(double amount){
        this.stripeGateway.makePayment(amount);
    }
}
