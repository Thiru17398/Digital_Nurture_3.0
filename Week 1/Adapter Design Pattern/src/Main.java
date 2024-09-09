public class Main {
    public static void main(String[] args) {
        PaymentProcessor payPalAdapter = new PayPalAdapter();
        PaymentProcessor stripeAdapter = new StripeAdapter();
        PaymentProcessor squareAdapter = new SquareAdapter();

        payPalAdapter.processPayment(100);
        stripeAdapter.processPayment(200);
        squareAdapter.processPayment(500);
    }
}