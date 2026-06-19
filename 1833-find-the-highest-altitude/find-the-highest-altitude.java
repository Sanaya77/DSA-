class Solution {
    public int largestAltitude(int[] gain) {
        int altitude=0;
        int highestaltitude=0;
    for(int g:gain){
        altitude +=g;

        highestaltitude=Math.max(highestaltitude,altitude);
    }
        return highestaltitude;
    }
}