package arraylist;

public class Student {
    String name;
    int age;
    int[] marks;

    public Student(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

     public int totalMarks() {
        int sum=0;
        for(int i:marks) {
            sum+=i;
        }
        return sum;
     }

     public float averageMarks() {
        float average=0;
        average = totalMarks()/(float)marks.length;
        return average;
     }

     public boolean passmark(){
        if(totalMarks()>=400){
            return true;
        }
        return false;
     }
}
