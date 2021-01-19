import java.util.Scanner;

public class SavingsBankAccount {
    Scanner s = new Scanner(System.in);
    int withdraw;
    int deposit;
    int online_transfer;
    // int check_balance;
    double total_balance;
    float interestrate;
    
    
    void savings_account_operations(){
        System.out.println("\nSelect the operation which you want to perform from below:\n1. Withdraw\n2. deposit\n3. online fund transfer\n4. check balance\n5. Exit");
    int a=s.nextInt();
    switch (a) {
        case 1: 
        System.out.println("Enter amount to withdraw");
        withdraw = s.nextInt();
        total_balance = total_balance-withdraw;
        System.out.println("Remaining balance in your account is "+total_balance);
        System.out.println("Enter Y or N for performing other oprations");
        char y = s.next().charAt(0);
        if(y== 'N'){ System.exit(0);}
        else { savings_account_operations();}

            break;
    
        case 2: 
        System.out.println("Enter amount to deposit");
        deposit = s.nextInt();
        total_balance = total_balance+deposit;
        System.out.println("Remaining balance after deposit is "+total_balance);
        System.out.println("Enter Y or N for performing other oprations");
        char y1 = s.next().charAt(0);
        if(y1== 'N'){ System.exit(0);}
        else { savings_account_operations();}

        break;

        case 3: 
        System.out.println("Enter amount for online fund transfer");
        online_transfer = s.nextInt();
        System.out.println("Enter beneficiary bank account number to transfer");

        String acno;
        acno = s.next();
        if(acno.length()>13 || acno.length()<13){
            System.out.println("Incorrect bank account number");
            // System.exit(0);
            System.exit(0);
        }

    
        total_balance = total_balance-online_transfer;
        System.out.println("Remaining balance after online traanfer is "+total_balance);
        System.out.println("Enter Y or N for performing other oprations");
        char y2 = s.next().charAt(0);
        if(y2== 'N'){ System.exit(0);}
        else { savings_account_operations();}

        break;

        case 4: System.out.println("Your savings account balance is "+total_balance);
        System.out.println("Enter Y or N for performing other oprations");
        char y3 = s.next().charAt(0);
        if(y3== 'N'){ System.exit(0);}
        else { savings_account_operations();}

        break;

        case 5: System.exit(0);
        break;

        default: System.out.println("Invalid response..");
            break;
    }



    }


    void add_interestRates(int age, double total_balance){

        if(age>=65){
            interestrate = 7;
            total_balance = (double) total_balance*interestrate;
            System.out.println("Total balance after adding interest rates for senior citizens is "+total_balance);
        }
        if(age<65 && age>18){
            interestrate =3.5f;
            total_balance = total_balance*interestrate;
            System.out.println("Total balance after adding interest rate for adults is: "+total_balance);
        }
        if(age<18){
            System.out.println("No Interest rates can be applied for minors");
        }

    }
    

    


    
}
