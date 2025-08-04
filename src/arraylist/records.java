package arraylist;
import java.util.ArrayList;

public class records {

    static ArrayList<Student> students = new ArrayList<>();
    static{
        students.add(new Student("sreeja", 23, new int[]{91, 95, 94, 89, 85}));
        students.add(new Student("teja", 23, new int[]{90, 82, 95, 98, 80}));
        students.add(new Student("charani", 20, new int[]{10, 35, 60, 23, 30}));
    }

    static ArrayList<Integer> totalMarks = new ArrayList<>();   //declaring arraylist as we dont know the exact size of the array

    public static void display(){
        for(Student s : students) {
           if(s.passmark()==true) {
               totalMarks.add(s.totalMarks());
                System.out.println("Name: " + s.name);
                System.out.println("Age: " + s.age);
                System.out.println("Total Marks: " + s.totalMarks());
                System.out.println("Average Marks: " + s.averageMarks());
                System.out.println("----------------------");
            }
        }
    }

    public static void display(Student S){
        System.out.println("Name: " + S.name);
        System.out.println("Age: " + S.age);
        System.out.println("Total Marks: " + S.totalMarks());
        System.out.println("=======================================");
    }

    public static void topper(){
        int maxMarks=0;
        String topername="";
        for(Student s : students) {
           if(s.totalMarks()>maxMarks){
               maxMarks=s.totalMarks();
               topername=s.name;
           }
        }
        System.out.println("Topper of the class is : " + " " + topername + " with marks" +" "+ maxMarks);
    }
}

