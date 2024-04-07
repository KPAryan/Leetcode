class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
        Arrays.sort(s1);
        char [] s2=t.toCharArray();
        Arrays.sort(s2);
        int c=0;
        if(s1.length!=s2.length){
            return false;
        }
        for(int i=0;i<s1.length;i++){
              if(s1[i]==s2[i]){
                c+=1;
              }
              else if(s1[i]!=s2[i]){
                c-=1;
              }
        }
        if(c!=s1.length){
        return false;}
        return true;
    }
}