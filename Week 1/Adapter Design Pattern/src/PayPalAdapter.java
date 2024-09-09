public class PayPalAdapter implements PaymentProcessor{
    private PayPalGateway payPalGateway;

    PayPalAdapter(){
        this.payPalGateway = new PayPalGateway();
    }

    @Override
    public void processPayment(double amount){
        this.payPalGateway.makePayment(amount);
    }

}
