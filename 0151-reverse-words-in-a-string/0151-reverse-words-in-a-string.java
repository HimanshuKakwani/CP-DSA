class Solution {
    public String reverseWords(String s) {

        String [] words = s.trim().split("\\s+");

        int left = 0;
        int right = words.length-1;
        String temp = "";
        String ans = "";

        while(left<right){
            temp = words[left] ;
            words[left] = words[right];
            words[right] = temp;

            left ++;
            right --;
        }
        ans = String.join(" ", words);
        return ans;
    }
}