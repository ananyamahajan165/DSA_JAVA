class CheckIfItIsAGoodArray {
    int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public boolean isGoodArray(int[] nums) {
        int c = nums[0];
        for(int i=1;i<nums.length;i++){
            c = gcd(c,nums[i]);
        }
        if(c==1) return true;
        return false;
    }
}