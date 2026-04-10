class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        
        for (int p : piles) {
            high = Math.max(high, p);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (canFinish(piles, h, mid)) {
                high = mid; // try smaller speed
            } else {
                low = mid + 1; // increase speed
            }
        }
        return low;
    }

    private boolean canFinish(int[] piles, int h, int k) {
        int hours = 0;
        
        for (int p : piles) {
            hours += (p + k - 1) / k; // ceil(p/k)
        }
        
        return hours <= h;
    }
}