import java.util.Scanner;


public class ATM_Machine{

    public static void main(String args[] ) {

        int balanceAvailable = 00, withdrawAmt, depositAmt;


        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("ATM Machine\n");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT\n");
            System.out.print("Choose the operation:");


            int choice = scan.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter money you want to withdraw:");

                    withdrawAmt = scan.nextInt();

                    if(balanceAvailable >= withdrawAmt){
                    	balanceAvailable -= withdrawAmt;
                        System.out.println("Please collect money");
                    }
                    else{
                        System.out.println("Insufficient Fund");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Enter money you want to deposit:");

                    depositAmt = scan.nextInt();

                    balanceAvailable  += depositAmt;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance : "+balanceAvailable);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}