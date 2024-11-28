import java.util.Arrays;
import java.util.Collections;

public class ChoclaProblem {
    public static void main(String[] args) {
        int n = 4; int m= 6;
        Integer VerCuts [] = {2,1,3,1,4};
        Integer HorCuts [] =  {4,1,2};

        Arrays.sort(VerCuts, Collections.reverseOrder());
        Arrays.sort(HorCuts, Collections.reverseOrder());

        int h = 0 , v =0;
        int hp =1, vp = 1; // horizonatalpices
        int cost= 0;

        while(h<HorCuts.length && v<VerCuts.length){
            if(VerCuts[v]<VerCuts[h]){ //horizontal cuts
                cost+=(HorCuts[h]*vp);
                hp++;
                h++;

            }else{

                cost+=(VerCuts[v]*hp);
                vp++;
                v++;
            }

        }
        while(h<HorCuts.length){
            cost+=(HorCuts[h]*vp);
            hp++;
            h++;
        }
        while(v<VerCuts.length){
            cost+=(VerCuts[v]*hp);
            vp++;
            v++;
        }
        System.out.println("Minimum cost of cuts = " +cost);

    }
}
