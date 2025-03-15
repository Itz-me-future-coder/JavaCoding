import java.util.Scanner;
class Details{
    Scanner sc=new Scanner(System.in);
    int initialBalance;
    int Total;
    Details(){
        initialBalance=1000;
        Total=initialBalance;
    }
    void deposit(){
        System.out.println("Enter Your Amount To Deposit:");
        int d1=sc.nextInt();
        Total=initialBalance+d1;
        System.out.println("your amount has successfully credited !:"+d1);
    }
    void withdraw(){
        System.out.println("Enter Your Amount you want:");
        int w1=sc.nextInt();
        if(w1>Total){
            System.out.println("Insufficient balance! please try again");
        }else{
            Total=Total-w1;
            System.out.println("Your Withdrawal is successfull:"+w1);
        }
        
        
    }
    void CheckBalance(){
        System.out.println("Your current balance is :"+Total);
    }
    }
    public class Bank{
        public static void main(String[]args){
            Details obj=new Details();
            obj.deposit();
            obj.withdraw();
            obj.CheckBalance();
        }
    }
