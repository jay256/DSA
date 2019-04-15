package leetcode;

//There are two sorted arrays nums1 and nums2 of size m and n respectively.
//
//Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
//
//You may assume nums1 and nums2 cannot be both empty.

public class TwoSortedArrayMedian {

    public double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length, n = B.length;
        if(m>n){
            int [] temp = A; A = B; B = temp;
            int tmp = m; m = n; n = tmp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1)/2;
        while(iMin <= iMax) {
            int i = (iMax + iMin)/2;
            int j = halfLen - i;
            if(i < iMax && B[j-1] > A[i]){
                iMin = i + 1;
            }
            else if(i > iMin && A[i-1] > B[j]){
                iMax = i - 1;
            }
            else{
                int maxLeft = 0;
                if(i==0){
                    maxLeft = B[j-1];
                }
                else if(j == 0) {
                    maxLeft = A[i-1];
                }
                else{
                    maxLeft = Math.max(B[j-1], A[i-1]);
                }
                if((m+n)%2==1){
                    return maxLeft;
                }

                int minRight = 0;
                if(i==m){
                    minRight = B[j];
                }
                else if(j==n){
                    minRight = A[i];
                }
                else{
                    minRight = Math.min(B[j],A[i]);
                }
                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {
        System.out.println(new TwoSortedArrayMedian().findMedianSortedArrays(new int[]{1,2,3,4}, new int[]{5,6,7,8}));
    }
}
