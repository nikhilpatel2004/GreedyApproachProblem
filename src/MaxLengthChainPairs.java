import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainPairs {
    public static void main(String[] args) {
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));

        int ans = 1; //chianlength
        int chainEnd  = pairs[0][1]; // last Selected pair end // chain end //{24}

        for(int i = 1; i < pairs.length; i++) {
            if(pairs[i][0] > chainEnd) {
                ans++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("MAx Length Of Chain = "+ans);


    }
}
