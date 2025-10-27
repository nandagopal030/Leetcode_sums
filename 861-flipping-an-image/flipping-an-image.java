class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        //flippoint the image
        for(int row = 0; row < image.length; row++){
            int i = 0;
            int j = image[row].length - 1;
            for(int col = 0; col < image[row].length; col++){
                while(i < j){
                    int temp = image[row][i];
                    image[row][i] = image[row][j];
                    image[row][j] = temp;
                    i++;
                    j--;
                }
            }
        }
        //changing 0 - 1 and 1  to 0;
        for(int i = 0; i < image.length; i++){
            for(int  j = 0; j< image.length; j++){
                if(image[i][j] == 0){
                    image[i][j] = 1;
                }else{
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}