class Solution {
    public int[] twoSum(int[] a, int t) {
        int b[]={-1,-1};
        int l=a.length;
        for(int i=0;i<l;i++)
        for(int j=i+1;j<l;j++)
        if(a[i]+a[j]==t)
        {
            b[0]=i;
            b[1]=j;
            return b;
        }
    return b;}
}