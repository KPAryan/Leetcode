class Solution {
    public int majorityElement(int[] arr) {
        int major=arr[0];
        int count=1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==major){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                major=arr[i];
                count=1;
            }
        }
        return major;
    }
}