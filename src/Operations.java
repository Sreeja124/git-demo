public class Operations {
    public int addition;
    public double subtraction;
    public float multiplication;
    public int division;
    public String remainder;

    public int getAddition( int a, int b) {
        addition = a + b;
        return addition;
    }

    public void setAddition(int addition) {
        this.addition = addition;
    }

    public double getSubtraction(int a, float b) {
        subtraction = a - (double) b;
        if(subtraction > 0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
            subtraction = Math.abs(subtraction);
        }
        return subtraction;
    }

    public void setSubtraction(double subtraction) {
        this.subtraction = subtraction;
    }

    public float getMultiplication(int a, int b) {
        multiplication =(float) a * b;
        return multiplication;
    }

    public void setMultiplication(float multiplication) {
        this.multiplication = multiplication;
    }

    public int getDivision(double a, int b) {
        division = (int)a/b;
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public String getRemainder(int a, int b) {
        remainder = String.valueOf(a % b);
        return remainder;
    }

    public void setRemainder(String remainder) {
        this.remainder = remainder;
    }

}
