package week8911.week8.week11;

public class RnaTranscription {
    String transcribe(String dnaStrand) {
        String answer="";
        for(int i=0; i<dnaStrand.length(); i++){
            if (dnaStrand.charAt(i)=='T')
                answer+="A";
            else if(dnaStrand.charAt(i)=='C')
                answer+="G";
            else if(dnaStrand.charAt(i)=='A')
                answer+="U";
            else if(dnaStrand.charAt(i)=='G')
                answer+="C";
            else answer+=Character.toString(dnaStrand.charAt(i));/*
            switch(dnaStrand.charAt(i)){
                case 'T': answer+= "A";
                    break;
                case 'C': answer+= "G";
                    break;
                case 'A': answer+= "U";
                    break;
                case 'G': answer+= "C";
                    break;
            }*/

        }
        return answer;
    }

}
