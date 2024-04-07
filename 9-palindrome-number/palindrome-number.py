class Solution:
    def isPalindrome(self, x: int) -> bool:
        r=False
        y=x
        if(x<0):
            r=False
        ans=0
        while(x>0):
            rem=x%10
            ans=ans*10+rem
            x=x//10
        if(y!=ans):
            r=False
        else:
            r=True
        return r

