class ATM {
    public static void main(String[] args) {
        int balance = 5000;
        int withdraw = 7000;

        try {
            if (withdraw > balance)
                throw new Exception("Insufficient Balance");

            balance = balance - withdraw;
            System.out.println("Withdrawal Successful");
            System.out.println("Balance: " + balance);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
