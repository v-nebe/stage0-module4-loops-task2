package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i=0;
        if(power>=0){
            while (i<=power){
                System.out.println(Math.pow(2, power));
                i++;
            }
        }
    }
}
