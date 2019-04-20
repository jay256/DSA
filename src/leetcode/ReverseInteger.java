package leetcode;

import java.util.Stack;

//Given a 32-bit signed integer, reverse digits of an integer.

public class ReverseInteger {

    public int reverse(int x) {
        int res = 0;
        while(x!=0){
            int pop = x%10;
            x=x/10;
            if(res > Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE && pop > 7)) return 0;
            if(res < Integer.MIN_VALUE/10 || (res==Integer.MIN_VALUE && pop < -8)) return 0;
            res = res * 10 + pop;
        }
        return res;
    }

    public static void main(String[] args) {
//        System.out.println(new ReverseInteger().reverse(123));
//        System.out.println(new ReverseInteger().reverse(-123));
//        System.out.println(new ReverseInteger().reverse(120));
        System.out.println(new ReverseInteger().reverse(Integer.MAX_VALUE));
    }

}
