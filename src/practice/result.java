package practice;
import arraylist.Product;

import java.util.*;

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
        /*for(int i=1;i<=5;i++){
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

        for(int i=1;i<=5;i++) {
            System.out.println("*".repeat(i));
        }

        System.out.println();
        for(int i=1;i<=5;i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        //========================================================
        //arraylists
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(2);
        numbers.add(35);
        numbers.add(45);
        numbers.add(28);
        numbers.add(20);
        numbers.add(63);
        /*
        try{
            numbers.remove(2);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("out of index.Check array size again");
        }

        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        for(int i: numbers){
            System.out.println(i);
        }

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Avacado");
        fruits.add("apricot");
        fruits.add("Asparagus");
        fruits.remove("Apple");

        fruits.removeIf(fruit -> fruit.toUpperCase().startsWith("A"));
        System.out.println(fruits);

        fruits.addFirst("Apple"); //adding first element
        fruits.addLast("kiwi"); //adding last element
        fruits.set(4,"oranges"); //update list changing last element to oranges
        System.out.println(fruits);

        for(String i: fruits){
            if(i.toLowerCase().equals("banana")){
                System.out.println("FRUIT FOUND");
            }else{
                System.out.println("FRUIT NOT FOUND");
            }
        }

        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
        //finding maximum
        int max=0;
        for(int nums: numbers){
            if(nums>max) {
                max = nums;
            }
        }
        System.out.println(max);
        //finding minimum
        int min=numbers.get(0);
        for(int nums: numbers){
            if(nums<min) {
                min = nums;
            }
        }
        System.out.println(min);

        numbers.add(45);
        numbers.add(50);
        numbers.add(90);
        Collections.reverse(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

        //reversing an array
        ArrayList<Integer> reverse = new ArrayList<>();
        System.out.println(numbers.size());
        for(int i=numbers.size()-1;i>=0;i--){
            reverse.add(numbers.get(i));
        }
        System.out.println(reverse);*/

        //=================================================

        /*ArrayList<String> name = new ArrayList<>();
        ArrayList<String> name1 =  new ArrayList<>();

        name1.add("deepika");
        name1.add("sai");
        name1.add("Kishore");
        name1.add("pavan");
        name1.add("bhargav");
        name1.add("sreeja");
        name1.add("anirudh");

        name.add("Sreeja");
        name.add("teja");
        name.add("charani");
        name.add("anirudh");
        name.add("charani");
        name.add("sreeja");
        name.add("teja");
        name.add("teja");


        //Commmon elements in two lists
        for(String i: name){
            for(String j: name1) {
                if (i.equals(j)) {
                    System.out.println("Common element : " +i);
                }
            }
        }

        //adding two lists and removing common elements
        ArrayList<String> newList = new ArrayList<>();
        int count=1;
        //removing duplicates in a array
        for(String i: name){
            if(newList.contains(i)) {
                count++;
                System.out.println("Duplicate element : " +i+count);
            }else{
                newList.add(i);
            }
        }
        System.out.println(newList);
        System.out.println(count);

        for(String j: name1){
            if(!newList.contains(j)) {
                newList.add(j);
            }
        }
        System.out.println(newList);


        System.out.println(numbers);
        int temp =0;
        //sorting array
        for(int i=0;i<numbers.size()-1;i++){
           for(int j=0;j<numbers.size()-i-1;j++){
               //swap numbers
               if(numbers.get(j)>(numbers.get(j+1))){  //reverse the sign to get the array in descending order
                    temp=numbers.get(j);
                    numbers.set(j,numbers.get(j+1));
                    numbers.set(j+1,temp);
               }
           }
        }
        System.out.println(numbers);

        //shifting elements to left
        int temp1=numbers.get(0);
        for (int i = 0; i < numbers.size()-1; i++) {
            numbers.set(i,numbers.get(i+1));
        }
        numbers.set(numbers.size()-1,temp1);
        System.out.println("shifted elements"+numbers);

        //removing all even numbers from array
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)%2==0){
                numbers.remove(i);
            }
        }
        System.out.println("List without even numbers"+numbers);

        //second largest element in array
        Collections.sort(numbers);
        System.out.println("Second largest element "+numbers.get(1)); */

        /*
        //Linked lists


        LinkedList<String> friends =  new LinkedList<>();
        friends.add("sreeja");
        friends.add("teja");
        friends.add("prathu");
        friends.add("charani");
        friends.add("mithila");
        friends.add("prathu");
        friends.add("kishore");
        friends.add("teja");
        friends.add("vijay");
        friends.add("pavan");
        friends.add("sreeja");

        LinkedList<Integer> duplicate = new LinkedList<>();
        LinkedList<String> newList = new LinkedList<>();
        for (int i = 0; i < friends.size(); i++) {
          if(newList.contains(friends.get(i))){
              duplicate.add(i);
          }else{
              newList.add(friends.get(i));
          }
       }
        System.out.println(duplicate);

        friends.removeFirst();
        System.out.println(friends);
        System.out.println(newList);

        LinkedList<Integer> num = new LinkedList<>();
        num.add(32);
        num.add(62);
        num.add(45);
        num.add(84);
        num.add(95);
        num.add(76);
        Collections.sort(num);
        System.out.println(num);
        System.out.println(num.size());
        if( num.contains(32)){
            System.out.println(true);
        } */

        //sets

        //hashset

        HashSet<Integer> set = new HashSet<>();  //erases duplicates and order not guarenteed
        set.add(12);
        set.add(45);
        set.add(89);
        set.add(45);
        set.add(90);
        set.add(21);
        set.add(12);
        System.out.println(set);

        LinkedHashSet<Integer> nums = new LinkedHashSet<>(); //prints the numbers in order
        nums.add(12);
        nums.add(90);
        nums.add(23);
        nums.add(12);
        nums.add(25);
        nums.add(68);
        nums.add(25);
        System.out.println(nums);

        TreeSet<Integer> set1 = new TreeSet<>();  //Prints the numbers in sorting order
        set1.add(12);
        set1.add(56);
        set1.add(36);
        set1.add(98);
        set1.add(34);
        set1.add(1);
        System.out.println(set1);

        HashSet<String> split = new HashSet<>();
        String statement = "Hi how are you? hello world Hi how come you are here?";
        String[] words = statement.split(" ");
        System.out.println(words);
        for(String word : words){
           split.add(word);
       }

        System.out.println(split);
        if(split.contains("Hi")){
            System.out.println(true);
        }

        ArrayList<Integer> num1 = new ArrayList<>();
        HashSet<Integer> num2 = new HashSet<>();

        num1.add(12);
        num1.add(56);
        num1.add(36);
        num1.add(98);
        num2.add(12);
        num1.add(34);
        num2.add(36);
        num1.add(1);
        num2.add(56);

        for(int i : num1){
            num2.add(i);
        }
        System.out.println(num2);

        HashSet<String> set2 = new HashSet<>();
        HashSet<String> set3 = new HashSet<>();
        HashSet<String> common = new HashSet<>();
        set2.add("Hi");
        set2.add("how");
        set2.add("are");
        set2.add("you");

        set3.add("are");
        set3.add("you");

        for(String word : set2){
            for(String word2 : set3){
                if(word.equals(word2)){
                    common.add(word);
                }
            }
        }
        System.out.println(common);

        String str = "mississippi";
        HashSet<Character> dup = new HashSet<>();
        char[] str1 = str.toCharArray();

        for(char c : str1){
           dup.add(c);
        }
        System.out.println(dup.size());

        HashSet<Integer> dup2 = new HashSet<>();
        for(int i:num1){
            dup2.add(i);
        }
        for(int i:set1){
            dup2.add(i);
        }
        System.out.println(dup2);

        System.out.println(num1.containsAll(set1));

    }
}
