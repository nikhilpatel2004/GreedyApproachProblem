import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[]  = {60,100,120};
        int weight[] = {10,20,30};
        int w =  50;

        double ratio[][]  = new double [val.length][2];
        //0th col=> idx; 1th col=>ratio;

        for(int i=0;i<val.length;i++){
            ratio[i][0] = i; // inedex  0, 1, 2,
            ratio[i][1] = val[i]/(double)weight[i]; // 60/10; 100/20;120/30
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o-> o[1]));

        int capacity =  w; // 50
        int finalVal = 0;
        for(int   i = ratio.length-1;i>=0;i--){
            int idx = (int)ratio[i][0];
            if(capacity>= weight[idx]){
                finalVal +=  val[idx];
                capacity -= weight[idx];

            }else{
                finalVal += (ratio[i][1]*capacity);
                capacity = 0;
                break;

            }

        }
        System.out.println("Final Value = "+finalVal);
    }
}
