class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int flowers = 0;
        Boolean ans = false;
        int lens = flowerbed.length;

        if(n==0){return true;}
        if(lens == 1 && flowerbed[0] == 0){
            ans = true;
            return ans;
        }
        if(flowerbed[0] == 0 && flowerbed[1] != 1){
            flowers += 1;
            flowerbed[0] =1;
            if(flowers == n){return true;}
        }
        if(flowerbed[lens-1] == 0 && flowerbed[lens-2] != 1){
            flowers += 1;
            flowerbed[lens-1] = 1;
        }


        for(int i =1; i< lens -1; i++){
            
            if(flowerbed[i] == 0 && flowerbed[i-1] != 1 && flowerbed[i+1] != 1){
                flowers +=1;
                flowerbed[i] = 1;
            }

            if(flowers == n){
            ans = true;}

        }
        if(flowers == n){
            ans = true;
        }
        return ans;
    }
}