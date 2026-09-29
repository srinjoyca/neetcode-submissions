class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int right = Integer.MIN_VALUE; 
        for (int i = 0; i < piles.length; i++) {
            if (right < piles[i]) { 
                right = piles[i];
            }
        }
        
        int left = 1; 
        int minHourAvailable = -1;
        int minRateAvailable = 1;
        while (left <= right) {
            int rate = (left+right)/2;
            System.out.println("rate"+rate);    
            int hours = 0;
            for (int i = 0; i < piles.length; i++) {
                
                if (piles[i]%rate != 0) {
                    hours+=piles[i]/rate+1;
                } else {
                    hours+=piles[i]/rate;
                }
                
                
                
            } 
            System.out.println();
            if ((hours < h) && (hours > minHourAvailable)) {
                minHourAvailable = hours;
                minRateAvailable = rate;
            }
            System.out.println("hours"+hours);
            if (hours == h) {
                return rate;
            } else if (hours < h) {
                right = rate-1;
            } else {
                left = rate+1;
            }
        }
        return minRateAvailable;

    }
}
