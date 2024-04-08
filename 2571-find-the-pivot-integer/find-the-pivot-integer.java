class Solution {
    public int pivotInteger(int n) {
      int x=(n*n+n)/2;
      int y=(int)Math.sqrt(x);
      int result=-1;
      if(x==(y*y)){
        result=y;
      }  
      return result;
    }
}