public class BankAccount {
    public static void main(String[] args) {
        String accName = "Sonakshi Jaiswal";
        long accNo = 5555654654654564654L;

        double accBalance = 5000;
        double depositAmount = 200;
        double withdrawalAmount = 1500;
        double minimumBalance = 1000;
        boolean isActive = true;
        int numberOfTransactions = 0;
        int last4Digits = (int) (accNo % 10000);

        System.out.println("------- Account Transaction of XXXX" + last4Digits + " -------");

        if (isActive) {
            if (depositAmount > 0) { // Comparision & relational ==, !=, >,<, <=, >=
                accBalance += depositAmount; // assignment operator with an arithmetic operator. Arithmetic +,-, *, /, %
                numberOfTransactions++; // Increment ++ decrement --
                System.out.println("Deposited Rs. " + depositAmount);
            } else {
                System.out.println("Deposit failed: Invalid amount.");
            }
        } else {
            System.out.println("Deposit failed: Account is inactive.");
        }

        if (withdrawalAmount > 0 && withdrawalAmount <= accBalance && isActive) { // Logical Operators &&, ||, !
            accBalance -= withdrawalAmount;
            numberOfTransactions++;
            System.out.println("Withdrawn Rs. " + withdrawalAmount);
        } else {
            System.out.println("Withdrawal failed: Insufficient funds or inactive account.");
        }

        System.out.println();
        System.out.println("------- Account Summary -------");
        System.out.println("Account Holder Name: " + accName);
        System.out.println("Final Balance: Rs. " + accBalance);
        System.out.println("Number of Transactions: " + numberOfTransactions);

        if (accBalance < minimumBalance) {
            System.out.println("Balance is below minimum threshold. Please Maintain minimum balance of Rs. 1000");
        }
    }

}
