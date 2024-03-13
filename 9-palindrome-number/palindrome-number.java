class Solution {
    public boolean isPalindrome(int n) {
        int t=n;
        if(n<0){
            return false;
        }
        int ans=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            ans=ans*10+rem;
        }
        if(ans!=t){
            return false;
        }
        return true;
    }
}