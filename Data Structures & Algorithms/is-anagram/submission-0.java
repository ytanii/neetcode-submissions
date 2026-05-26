class Solution {
    public boolean isAnagram(String s, String t) {
        int[] occurences1 = new int[26];
        int[] occurences2 = new int[26];

        if(s.length() == t.length()){
        for(int i = 0; i < s.length(); i++){
            occurences1[s.toUpperCase().charAt(i)-'A']++;
            occurences2[t.toUpperCase().charAt(i)-'A']++;
             
        }
        }else{
            return false;
        }

        for(int i = 0; i < 26; i++){
            if(occurences1[i] != occurences2[i]){
                return false;
            }
        }

        return true;
        

    }
}
