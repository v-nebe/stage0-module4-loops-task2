package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i=0;
        int j=1;
        while (i<=multiplyByAndToInclusive){
            j *=i;
            System.out.println(j);
            i++;
        }
    }
}
