package Sets;

import java.util.HashSet;

public class Mutual {
    private String[] friends1;
    private String[] friends2;

    HashSet<String> dup=new HashSet<>();
    HashSet<String> mutuals=new HashSet<>();

    public Mutual(String[] friends1, String[] friends2) {
        this.friends1 = friends1;
        this.friends2 = friends2;
    }

    public void mutuals(String[] friends1, String[] friends2){
        for(String s: friends1){
            dup.add(s);
        }
        for(String s: friends2){
            if(dup.contains(s)){
                mutuals.add(s);
            }
        }
        System.out.println(mutuals);
    }


    public static void main(String[] args) {
        String[] friends1={"Sreeja","Sai","Deepika"};
        String[] friends2={"Sreeja","Teja","Deepika"};
        Mutual common = new Mutual(friends1, friends2);
        common.mutuals(friends1, friends2);
    }

}
