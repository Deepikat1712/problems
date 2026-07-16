class Solution {
    public int countDigits(int num) {
        int count=0;
        int n=num;
        int a=num;
        int r,l=0,ll;
        while(a>0)
        {
           a= a/10;
           l++;
         
        }
        for(int i=0;i<l;i++)
        {
            r=n%10;
            if(num%r==0){
                count++;
            }
            n=n/10;
        }
        return count;
    }
    
}
