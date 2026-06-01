class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> uniques = new HashMap<>();
        
        for(String s : strs){
            int[] countChar = new int['z' - 'a' + 1];
            
            for(char c : s.toCharArray()){
                countChar[c - 'a']++;
            }

            String key = java.util.Arrays.toString(countChar);
            if(!uniques.containsKey(key)){
                uniques.put(key, new ArrayList<>());
            }

            uniques.get(key).add(s);
        }
        return new ArrayList<>(uniques.values());
    }
}