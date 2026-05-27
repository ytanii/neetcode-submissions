class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int strsLength = strs.length;
        boolean[] isInGroup = new boolean[strsLength];
        ArrayList<List<String>> allAnagramGroups = new ArrayList<>();
        for (int i = 0; i < strsLength; i++) {
            if (isInGroup[i]) {
                continue;
            }
            ArrayList<String> anagramGroup = new ArrayList<>();
            anagramGroup.add(strs[i]);

            for (int j = i + 1; j < strsLength; j++) {
                if (isAnagram(strs[i], strs[j])) {
                    isInGroup[j] = true;
                    anagramGroup.add(strs[j]);
                }
            }
            allAnagramGroups.add(anagramGroup);
        }
        return allAnagramGroups;
    }
    public boolean isAnagram(String s1, String s2) {
        int[] occurences1 = new int[26];
        int[] occurences2 = new int[26];
        int length1 = s1.length();
        int length2 = s2.length();

        if (!(length1 > 0 && length2 > 0)) {
            return false;
        }

        if (length1 == length2) {
            for (int i = 0; i < length1; i++) {
                occurences1[s1.charAt(i) - 'a']++;
                occurences2[s2.charAt(i) - 'a']++;
            }
        } else {
            return false;
        }

        for (int i = 0; i < 26; i++) {
            if (occurences1[i] != occurences2[i]) {
                return false;
            }
        }

        return true;
    }
}
