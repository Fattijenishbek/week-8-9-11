package week8911.week8.week11;

class Hamming {
    String first;
    String second;

    public Hamming(String first, String second) {
        this.first = first;
        this.second = second;
    }

    int getHammingDistance() {
        int answer=0;

        for (int i = 0; i < first.length() ; i++) {
            if (first.charAt(i)!= second.charAt(i)){
                answer++;
            }
        }
        return answer;
    }

}
