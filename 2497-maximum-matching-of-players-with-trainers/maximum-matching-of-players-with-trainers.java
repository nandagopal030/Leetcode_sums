class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players); Arrays.sort(trainers);   
       int count = 0;
        // if(trainers.length == 1 && trainers[0] <= players[0]){
        //     return 1;
        // }

        int  i =0;
        for(int j = 0; i<players.length && j <trainers.length; j++){
            if(players[i] <= trainers[j]){
                count++;
                i++;
            }
        }
        return count;

    }
}