package week8911.week8.week11;

import java.util.Scanner;

public class PangramChecker {
    public boolean isPangram(String input){
        int [] arr=new int[26];
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)>96 && input.charAt(i)<123)
                arr[input.charAt(i)-97]++;
        }
        int c=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>0) c++;
        }
        if(c==26) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        PangramChecker pangramChecker = new PangramChecker();
        System.out.println(pangramChecker.isPangram(sentence.toLowerCase()));
    }
}
