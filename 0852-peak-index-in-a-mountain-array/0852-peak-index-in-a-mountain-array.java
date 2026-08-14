class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if(arr.length==3){
            return arr.length/2;
        }
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int mid = left+(right-left)/2;
           
            if(arr[mid]<arr[mid +1]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
    }
}