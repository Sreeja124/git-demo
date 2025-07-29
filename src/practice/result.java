package practice;
import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* //fibinocci series
        System.out.println("Enter the first two digits of fibinocci series");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c = 0;
        System.out.print(a+""+b );
        while(c<90) {
            c = a + b;
            a=b;
            b=c;
            System.out.print(c+"");
        }

        //swap numbers using 3rd variable
        int p=2;
        int q=3;
        int r=0;
        r=p;
        p=q;
        q=r;
        System.out.print(p+""+q);

        //multiplying two floating digits
        System.out.println("Enter two floating digits");
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        System.out.println(c*d);

        //converting a integer to binary
        System.out.println("Enter a number");
        int e = sc.nextInt();
        int f = sc.nextInt();
        String s = "";
        String p="";
        while (e != 0) {
            s = s+(String.valueOf(e%2));
            e=e/2;
        }
        while (f != 0) {
            p = p+(String.valueOf(f%2));
            f=f/2;
        }
        System.out.println(Integer.valueOf(s)+Integer.valueOf(p));

        //find largest among 3 numbers
        System.out.println("Enter numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max=0;
        if(a>b && a>c){
            max=a;
        }else if(b>a && b>c){
            max=b;
        }else{
            max=c;
        }
        System.out.println("Maximum value "+max);

        //prime number
        int n = sc.nextInt();
        boolean isPrime = false;
        for(int i = 2; i <= n*n; i++) {
            if(n%i==0){

            } else {
                isPrime=true;
            }
        }
       if(isPrime){
           System.out.println("Prime number");
       }

        //neon number
        System.out.println("Enter number:");
        int m = sc.nextInt();
        int n = m*m;
        int sum=0;
        while(n>0){
            sum= sum+(n%10);
            n=n/10;
        }
        System.out.println("The sum is "+sum);
        if(sum==m){
            System.out.println(m+" is neon number");
        }else{
            System.out.println(m+" is not neon number");
        }

        //check if input charcater is vowel or consonant
        char c=sc.next().charAt(3);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }

        //factorial
        int x=sc.nextInt();
        int fact=1;
        for(int i=1;i<=x;i++) {
            fact=fact*i;
        }
        System.out.println("Factorial of "+x+" is "+fact);  */

        //Patterns
        for(int i=1;i<=5;i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=5;i++){
            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=5;i<=5;i++) {
            System.out.println("*".repeat(i));
        }
    }
}
