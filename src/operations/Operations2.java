package operations;

public class Operations2 extends Operations{
    public int And;
    public int Or;
    public String Not;

    Operations opp = new Operations();
    int c = 0;
    public int getAnd(int a,int b) {
        if(a>0 && b>0){
            c=opp.getAddition(a,b);
        }
        return c;
    }

    public void setAnd(int and) {
        And = and;
    }

    public int getOr(int a,float b) {
        if(a<0 || b<0){
            System.out.println("One number is negative");
            if(a<0){
                a=Math.abs(a);
            }
            else{
                System.out.println(b+" is negative");
                b=Math.abs(b);
            }
            c= (int) opp.getSubtraction(a,b);
        }
        return c;
    }

    public void setOr(int or) {
        Or = or;
    }

    public String getNot() {
        return Not;
    }

    public void setNot(String not) {
        Not = not;
    }
}
