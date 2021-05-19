//RodCutting
package leetcode;

public class DPRodCutting{

    private static int rodCutting(int [] price, int n){
        if(n<=0){
            return 0;
        }
        int max  = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            max= Math.max(max, price[i]+rodCutting(price,n-(i+1)));
        }
        return max;
    }

    private static int dpRodCutting(int [] price, int n){
        int [] val = new int[n+1];
        val[0] = 0;
        for(int i=1;i<=n;i++){
            int max = Integer.MIN_VALUE;
            for(int j=0;j<i;j++){
                max = Math.max(max, price[j] + val[i-(j+1)]);
            }
            val[i]=max;
        }
        return val[n];
    }


    public static void main(String [] args){
        int [] price = {1,5,8,9,10,17,17,20};

        System.out.println(rodCutting(price, price.length));
        System.out.println(dpRodCutting(price, price.length));
    }

}