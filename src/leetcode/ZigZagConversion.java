package leetcode;

public class ZigZagConversion {

    public String convert(String s, int numRows) {
        String [] rows = new String[numRows];
        for(int i=0;i<numRows;i++){
            rows[i] = "";
        }
        int flag = 0, count = 0;
        while(count < s.length()){
            if(flag==0){
                for(int i=0;i<numRows && count<s.length();i++){
                    rows[i] = rows[i]+s.charAt(count);
                    count++;
                }
                flag=1;
            }
            if(flag==1){
                for(int i=numRows-1;i>1 && count<s.length();i--){
                    rows[i-1] = rows[i-1]+s.charAt(count);
                    count++;
                }
                flag=0;
            }
        }
        String result="";
        for(int i=0;i<numRows;i++){
            result = result+rows[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new ZigZagConversion().convert("PAYPALISHIRING",3));
        System.out.println(new ZigZagConversion().convert("PAYPALISHIRING",4));

    }

}
