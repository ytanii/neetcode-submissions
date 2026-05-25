class Solution {
    public boolean isAnagram(String s, String t) {
        int[] occurences1 = new int[26];
        int[] occurences2 = new int[26];

        s = s.toUpperCase();
        t = t.toUpperCase();


        if(s.length() == t.length()){
        for(int i = 0; i < s.length(); i++){
            occurences1[s.charAt(i)-'A']++;
            occurences2[t.charAt(i)-'A']++;
             
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
