class Solution {
    public String mergeAlternately(String word1, String word2) {

        char c1 = 'a';
        char c2 ='a';
        String finalS = "";
        int p1 = 0;
        int p2 = 0;
        int combword = word1.length() + word2.length();

        for(int a = 0; a < combword;a++ ){
        for(int i =p1; i<word1.length(); i++){
            c1 = word1.charAt(i);
            finalS += c1;
            p1 += 1;
            break;
        }
        for(int j =p2; j<word2.length(); j++){
            c2 = word2.charAt(j);
            finalS += c2;
            p2 += 1;
            break;
        }
    }
    return finalS;

    }
}