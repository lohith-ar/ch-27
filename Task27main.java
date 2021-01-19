import java.util.Scanner;

public class Task27main {
    public static void main(String[] args) {int i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of customers accounts to be created:");
        int n1 = s.nextInt();
        Customer_details cd[] = new Customer_details[n1];
        SavingsBankAccount sb[] = new SavingsBankAccount[n1];
        // SavingsBankAccount sab = new SavingsBankAccount();

        for(i=0; i<n1; i++){
            cd[i] = new Customer_details();
            sb[i] = new SavingsBankAccount();

            cd[i].new_account_creation();    
            
        }

        System.out.println("\nEnter account number to perform transactions");
            String y2 = s.next();

            for(int j=0; j<n1;j++){
                if(cd[j].account_number.equals(y2)){
                    sb[j].savings_account_operations();                   
                }          

            }

        System.out.println("\nEnter account number to check interest rates for your account balance");
            String y3 = s.next();

            for(int j=0; j<n1;j++){
                if(cd[j].account_number.equals(y3)){
                    sb[j].add_interestRates(cd[i].age, sb[i].total_balance);
                }          

            }     
        
    }


    
}
