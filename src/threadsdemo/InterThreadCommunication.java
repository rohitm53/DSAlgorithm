package threadsdemo;

class Customer {
    int amount = 0;

    synchronized void withdraw(int amount){
        System.out.println("Going to withdraw amount : "+amount);

        if(this.amount<amount){
            System.out.println("Insufficent amount waiting for deposit");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.amount-= amount;
            System.out.println("Withdraw is completed for amount:"+amount);
        }
    }

    synchronized void deposit(int amount){
        System.out.println("Going to deposit");
        this.amount+=amount;
        System.out.println("Deposite completed");
        notifyAll();
    }


}

public class InterThreadCommunication {

    public static void main(String[] args) {

        Customer customer = new Customer();

        new Thread(() -> customer.withdraw(100)).start();
        new Thread(() -> customer.withdraw(200)).start();
        new Thread(() -> customer.withdraw(300)).start();
        new Thread(() -> customer.withdraw(400)).start();
        new Thread(() -> customer.withdraw(500)).start();
        new Thread(()-> customer.deposit(150000)).start();
        new Thread(()-> customer.deposit(150000)).start();



    }

}
