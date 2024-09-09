public class SquareAdapter implements PaymentProcessor{
    private SqaureGateway sqaureGateway;

    SquareAdapter(){
        this.sqaureGateway = new SqaureGateway();
    }

    @Override
    public void processPayment(double amount) {
        this.sqaureGateway.makePayment(amount);
    }
}
