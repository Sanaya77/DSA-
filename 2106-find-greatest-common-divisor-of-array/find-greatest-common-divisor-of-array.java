class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
    }
            return a;
    }
    public int findGCD(int[] arr) {
    
        int min=arr[0];
        int max=arr[0];
    

        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return gcd(min,max);

    }
}