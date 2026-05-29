class Solution {
    public int findMin(int[] input) {
        int low = 0;
        int high = input.length - 1;

        while(low<high){
            int mid = low + (high - low) / 2;

            if(input[mid] > input[high]){
                low = mid + 1;
            }else{
                high = mid;
            }
        }

        return input[low];
        
    }
}
