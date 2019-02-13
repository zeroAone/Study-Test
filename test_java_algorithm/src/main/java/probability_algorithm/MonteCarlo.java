package probability_algorithm;

/**
 * 蒙特卡罗 - 蒙特卡洛方法  计算π
 */
public class MonteCarlo {
   public static double MonteCarloPI(int n){
        double PI;
        double x,y;
        int  i,sum=0;
        for( i=0;i<n;i++){
            x=Math.random();
            y=Math.random();
            if((x*x+y*y)<=1){
                sum++;
            }
        }
        PI=4.0*sum/n;
        return PI;
    }
    public static void main(String[] args) {
        System.out.println("PI:"+MonteCarlo.MonteCarloPI(10000000));
    }
}
