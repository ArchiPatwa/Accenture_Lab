public class Bank {
    private double amount;
    Bank(double amount){
        this.amount = amount;
    }
    public void withdraw(double withdrawalAmount){
     String msg = (withdrawalAmount <= amount) ? "withdraw successful" : "Insufficient amount can't withdraw";

     if(withdrawalAmount <= amount){
         amount = amount-withdrawalAmount;
     }

     System.out.println(msg);
    }
    public void deposit(double depositAmount){
        amount = amount + depositAmount;
        System.out.println("Total Balance :" + amount);
    }

    public  static void main(String[] args){
        Bank bankobj = new Bank(10000);
        bankobj.withdraw(4000);
        bankobj.deposit(5000);
    }
}
