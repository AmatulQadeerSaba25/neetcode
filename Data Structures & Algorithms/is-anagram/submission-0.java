class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.boolean() != t.length()) {
            return false;
        }
        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Array.sort(sSort);
        Array.sort(tSort);
        return Arrays.equals(sSort, tSort);
     }
}
