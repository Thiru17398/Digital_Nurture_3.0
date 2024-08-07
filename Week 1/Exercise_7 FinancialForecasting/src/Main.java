public class Main {

    public static double calculateFutureValue(double currentAmount,double growthRate,int years){
        if(years == 0)
            return currentAmount;
        System.out.println(currentAmount);
        return calculateFutureValue(currentAmount * (1 + growthRate),growthRate,years - 1);
    }

    public static void main(String[] args) {
        double amount = 1000D;
        double growthRate = 0.5;
        int years = 10;

        System.out.println(calculateFutureValue(amount,growthRate,years));
    }
}