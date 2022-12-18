public class CreditPaymentService {

    /**
     * @param creditTerm   срок кредита в годах
     * @param creditAmount сумма кредита
     * @param rate         процентная ставка
     * @return long ежемесячный платеж
     */
    public long calculate(int creditTerm, int creditAmount, double rate) {
        double ratePerMonth = rate / (100 * 12); // Ставка в месяц
        return Math.round(creditAmount * (Math.pow((1 + ratePerMonth), creditTerm * 12) * ratePerMonth)
                / ((Math.pow((1 + ratePerMonth), creditTerm * 12)) - 1));
    }
}
