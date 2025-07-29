import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //encapsulation and abstraction
        SavingsAccount bank1 = new SavingsAccount(10000,1);
        FixedDeposit bank2 = new FixedDeposit(1000000,8);
        bank1.deposit(10000);
        bank2.deposit(1000);
        bank1.withdraw(5000);
        System.out.println("Savings Account Balance "+ bank1.checkBalance());
        System.out.println("Savings Account Interest "+ bank1.checkInterest());
        System.out.println("Fixed Deposit Account Balance "+ bank2.checkBalance());

        Hotel.Book_room room = new  Hotel.Book_room();
        room.book("Sreeja");


        //static classes
        Calculator cal = new Calculator();
        System.out.println(cal.addition(2,3));
        System.out.println(Calculator.multiplication(2,3));

        //interface
        Bills bill = new Bills();
        Payment.pay(200);
        bill.Return(100);



      /* Laptop MyLaptop = new Laptop();
        MyLaptop.setModel("MacBook");
        MyLaptop.setBrand("Apple");
        MyLaptop.setYear(2018);
        System.out.println("MyLaptop Model = " + MyLaptop.getModel());
        System.out.println("MyLaptop Brand = " + MyLaptop.getBrand());
        System.out.println("MyLaptop Year = " + MyLaptop.getYear());

        Operations MyOperations = new Operations();
        System.out.println(MyOperations.getAddition(2.0,3));
        System.out.println(MyOperations.getSubtraction(2,3.0f));
        System.out.println(MyOperations.getMultiplication(3,4));
        System.out.println(MyOperations.getDivision(12.0,4));
        System.out.println(MyOperations.getRemainder(13,4));
        String rem = MyOperations.getRemainder(12,4);
        System.out.println(rem.getClass().getSimpleName());

        //even number using for loop
        for(int i=0;i<=100;i=i+2){
            System.out.println(i);
        }

       //even numbers using while loop
       int j=0;
        while(j<=100){
            System.out.println(j);
            j=j+2;
        }

       //even numbers using do while loop
        int k=100;
        do{
            System.out.println(k);
            k=k-2;
        }
        while (k>0);

        //palindrome
        int i=111;
        String reverse = "";
        String str= String.valueOf(i);
        System.out.println(str);
        for(int a=0;a<str.length();a++){
            reverse = str.charAt(a)+reverse;
        }
        System.out.println(reverse);
        if(reverse.equals(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

        // armstrong number
        int s = 153;
        int original=s;
        int sum=0;
        while(s>0){
            int a=s%10;
            sum=sum+(a*a*a);
            s = s/10;
        }
        System.out.println(sum);
        if(sum == original){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }

        Operations2 opp = new Operations2();
        System.out.println(opp.getAnd(2,3));
        System.out.println(opp.getOr(1,-5)); */

    }
}
