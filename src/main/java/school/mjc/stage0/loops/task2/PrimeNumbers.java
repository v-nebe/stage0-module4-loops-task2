package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i=0;
        while (i<=printToInclusive){
            if(!(i % 2 ==0 || i% 3==0 || i% 5 ==0 || i%7 ==0 || i%11 ==0)){
                System.out.println(i);
            }
            i++;
        }
    }
}
