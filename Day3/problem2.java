class Solution {
    public int smallestEvenMultiple(int n) {
        int v=0;
        int i=1;
        while(i>0)
        {
            if(i%n==0 && i%2==0)
            {
                v=i;
                break;
            }
           i++;
        }
        return v;
    }
}
