public class EmiCalculator {
    public static void main(String[] args) {
        int onRoadPrice = 2190887;
        int downPayment = 380000;
        double annualInterestRate = 9.5;
        int loanYears = 4;

        int loanAmount = onRoadPrice - downPayment; // P = Loan amount (On-road price - down payment)
        double monthlyInterestRate = annualInterestRate / 12 / 100; // R = Monthly interest rate (annual rate / 12 /
                                                                    // 100)
        int loanMonths = loanYears * 12; // N = Loan term in months (years × 12)
        // EMI formula [P x R x (1+R)^N] / [(1+R)^N-1]
        int emi = (int) ((loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanMonths)) /
                (Math.pow(1 + monthlyInterestRate, loanMonths) - 1));

        int totalLoanAmt = (int) (emi * loanMonths);

        // Output
        System.out.println("------ EMI Calculation ------");
        System.out.println("On-Road Price: Rs. " + onRoadPrice);
        System.out.println("Down Payment: Rs. " + downPayment);
        System.out.println("Loan Amount: Rs. " + loanAmount);
        System.out.println("Interest Rate (Annual): " + annualInterestRate + " %");
        System.out.println("Loan Period: " + loanYears + " years");
        System.out.println("Total Loan Amount: Rs. " + totalLoanAmt);
        System.out.println("Monthly EMI: Rs. " + emi);
    }

}
