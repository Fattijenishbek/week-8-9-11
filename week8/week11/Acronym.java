package week8911.week8.week11;

import java.util.Scanner;

public class Acronym {
    String phrase;
    public Acronym(String phrase){
        this.phrase=phrase;
    }
    public String get(){
        String answer="";
        String [] arr = phrase.split("\\W+");
        for(int i=0; i<arr.length; i++){
            answer+=arr[i].charAt(0);
        } return answer.toUpperCase();
    }

    public static void main(String [] args){
        Scanner input= new Scanner(System.in);
        String phrase=input.nextLine();
        Acronym acronym=new Acronym(phrase);
        System.out.println(acronym.get());
    }
}
