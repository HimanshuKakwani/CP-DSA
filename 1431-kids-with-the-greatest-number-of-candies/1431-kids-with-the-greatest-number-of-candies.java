class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> finList = new ArrayList<>();
        int max = -1;

        for(int i =0; i< candies.length; i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }

        for(int i =0; i<candies.length; i++){
            if(extraCandies + candies[i] >= max){
                finList.add(true);
            }else{
                finList.add(false);
            }
        }

        return finList;
    }
}