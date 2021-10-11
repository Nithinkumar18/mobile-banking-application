import java.util.*;
public class MyClass 
{
    String name;
    static int custid;
    static int balance = 1100;
     int withdraw;
     int deposit;
    static int option;
    int lastdeposit;
    int lastwithdraw;
    
    public void display()
    {
        System.out.println(".....................................................");
        System.out.println("-------------- WELCOME TO CITIZEN BANK--------------");
        System.out.println(" Internet Banking,Mini-statements,Access to Loans");
        System.out.println("......................................................");
        login();
    }
    public void login()
    {
        System.out.println("Dear Customer, Please Login To Your Account...........");
        System.out.println("========================================================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your USER NAME:>");
        String name = sc.nextLine();
        Scanner op = new Scanner(System.in);
        System.out.println("Enter your 5 digit CUSTOMER ID:>(enter only digits)");
        int custid = op.nextInt();
        System.out.println("WELCOME, Mr/Ms"+"....."+name);
        System.out.println("===========================================================");
    }
    public void welcome()
    {
      System.out.println("............................................................");
      System.out.println("1.Balance");
      System.out.println("2.Withdraw");
      System.out.println("3.Deposit");
      System.out.println("4.Mini-Statement");
      System.out.println("5.Apply Loan");
      System.out.println("6.Customer Care");
      System.out.println("7.Log out");
    }
    public void balance()
    {
        System.out.println("your A/C balance is rs:"+"...."+balance);
    }
    public void withdraw()
    {
        if(balance<=1100)
        {
            System.out.println("you cannot perform this operation,because  A/C  min-balance 1100 is mandatory");
        }
        else
        {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter the amount in RS :");
        int withdraw = as.nextInt();
        System.out.println(withdraw+"......."+"debited from your A/C --");
        lastwithdraw = withdraw;
        balance = balance - withdraw;
        }
    }
    public void deposit()
    {
        Scanner pp = new Scanner(System.in);
        System.out.println("Enter the amount in RS:");
        int deposit = pp.nextInt();
        System.out.println(deposit+"......"+"criedted in your A/C--");
        lastdeposit = deposit;
        balance = balance + deposit;
    }
    public void ministatement()
    {
     
        System.out.println("your recent transactions are......");
        System.out.println("your current balance  is RS :"+"..."+balance);
    System.out.println("your last deposit amount is RS:"+"...."+lastdeposit+"..."+"at 20:04 PM,01-07-2021");
    System.out.println(" Recent debited amount is  RS:"+"....."+lastwithdraw+"..."+"at 20:05 PM,01-07-2021");
    }
    public void loan()
    {
        System.out.println("CITIZEN BANK offers the below mentioned loans");
        System.out.println("1.House loan");
        System.out.println("2.Education loan");
        System.out.println("3.Vehicle loan");
        System.out.println("4.Personal loan");
        System.out.println("........................................... ");
        Scanner mn = new Scanner(System.in);
        System.out.println("select a loan scheme(option) you want to apply :");
        int scheme = mn.nextInt();
        System.out.println("Your loan request is processed SUCESSFULLY...");
        System.out.println("please stay connected ,you will be recieving a call from us for futher process...");
    }
    public void customercare()
    {
        System.out.println("Dear Customer,....");
        System.out.println("for any queries, please reach us through toll-free no:040-123456789");
        System.out.println("write us at::citizenbankhelpdesk@gmail.com");
        System.out.println("please share your feedback...");
    }
    public void logout()
    {
        System.out.println("THANK YOU , logout successfull");
        System.exit(0);
    }
    
    public static void main(String[] args) 
    {
        MyClass m = new MyClass();
        m.display();
        do
        { 
            m.welcome();
            Scanner es = new Scanner(System.in);
            System.out.println("SELECT AN OPTION::");
            int option = es.nextInt();
        switch(option)
        {
            case 1 : System.out.println("..............................................");
                      m.balance();
                     System.out.println("..............................................");
                     break;
                    
            case 2 : System.out.println("................................................");
                     m.withdraw();
                     System.out.println("................................................");
                     break;
                     
            case 3 : System.out.println("................................................");
                     m.deposit();
                     System.out.println("................................................");
                     break;
                     
            case 4 :  System.out.println("..............................................");
                     m.ministatement();
                     System.out.println("................................................");
                     break;
                     
            case 5 : System.out.println("................................................");
                     m.loan();
                     System.out.println("................................................");
                     break;
                     
            case 6 : System.out.println("....................................................");
                      m.customercare();
                      System.out.println("....................................................");
                      break;
                      
            case 7 : System.out.println("...................................................");
                     m.logout();
                     System.out.println("...................................................");
                     break;
                     
            default : System.out.println("enter a valid option");
                      break;
    
            }
        }while(option<=8);
            
    }   
 
}