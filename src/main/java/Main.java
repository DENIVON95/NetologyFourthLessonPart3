public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        long firstMonthlyPay = service.calculate(1, 1000000, 9.99);
        long secondMonthlyPay = service.calculate(2, 1000000, 9.99);
        long thirdMonthlyPay = service.calculate(3, 1000000, 9.99);

        System.out.println("Ежемесячный платеж по первому кредиту: " + firstMonthlyPay);
        System.out.println("Ежемесячный платеж по второму кредиту: " + secondMonthlyPay);
        System.out.println("Ежемесячный платеж по третьему кредиту: " + thirdMonthlyPay);
    }
}
