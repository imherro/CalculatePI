import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("gogogo !");

        for(int i=10000;i<10000000;i++) {
            cal(i);
        }
    }

    private static void cal(int c) {
        int m=0;
        for(int i=0;i<c+1;i++){
            double x = new Random().nextDouble();
            double y = new Random().nextDouble();
            double z = new Random().nextDouble();
            if(x*x+y*y+z*z<1){
                m++;
            }
        }
        System.out.println("done m="+m + " PI="+(double)m*6/(double)c);
    }
}
