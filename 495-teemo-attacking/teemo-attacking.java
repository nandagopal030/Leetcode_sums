class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
         
      if(timeSeries.length == 0) return 0;

      int totalDuration = 0;

      for(int i =1; i< timeSeries.length; i++){
        int gap = timeSeries[i] - timeSeries[ i - 1];
        totalDuration += Math.min(gap, duration);
      }
      return totalDuration + duration;

    }
}