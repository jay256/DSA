package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//Given a string, find the length of the longest substring without repeating characters.

class LongestSubstringSolution {
    public int lengthOfLongestSubstring(String s) {
        int n  = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int j=0,i=0;j<n;j++){
            if(map.containsKey(s.charAt(j))){
                i=Math.max(map.get(s.charAt(j)), i);
            }
            ans=Math.max(ans, j-i+1);
            map.put(s.charAt(j), j+1);
        }
        return ans;

    }
}

public class LongestSubstring {

    public static void main(String[] args) throws IOException {
        System.out.println(new LongestSubstringSolution().lengthOfLongestSubstring("asdassfsdgasd"));
    }
}
