package week8911.week8.week11;

public class Twofer {
    static String twofer(String name) {
        try {
            if(name.equals(null)){
                return "One for you, one for me."; }
            else{
                return "One for "+name+", one for me.";}
        } catch (Exception e) {
            return "One for you, one for me.";
        }
    }
}
