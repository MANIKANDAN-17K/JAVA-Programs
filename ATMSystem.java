public class ATMSystem{
  public static void main (String[] args) {
    BankAccount account = new BankAccount(40000);
    ATMUser user1 = new ATMUser(account,"alice",3000);
    ATMUser user2 = new ATMUser(account,"alice",3000);
    ATMUser user3 = new ATMUser(account,"alice",3000);
    user1.start();
    user3.start();
    user2.start();
  }
}
class BankAccount{
  private int balance;
  public BankAccount(int balance){
    this.balance = balance;
  }
  public synchronized void withdraw(String user,int amount){
    if(balance >= amount){
      System.out.println(user+ " is withdrawing $"+ amount);
      try{
        Thread.sleep(10000);
      }
      catch(InterruptedException e){
        System.out.println(e.getMessage());
      }
      balance -= amount;
      System.out.println(user+" sucessfully withdrew $"+amount+". remaining balance:$"+balance);
      
    }else{
      System.out.println(user+"tried to withdraw $"+amount+"but insufficient balance available: $"+balance);
    }
  }
}
class ATMUser extends Thread{
  private BankAccount account;
  private String user;
  private int amount;
  public ATMUser(BankAccount account,String user,int amount){
    this.account = account;
    this.user  = user;
    this.amount = amount;
  }
  public void run(){
    account.withdraw(user,amount);
  }
}
