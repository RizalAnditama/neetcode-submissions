class Solution {
    public boolean isPalindrome(String s) {
        String[] tmepStrings = s.toLowerCase().split(" ");
        List<Character> charTemp = new ArrayList<>();
        for (String string : tmepStrings) {
            for (Character character : string.toCharArray()) {
                if ((character >= 'a' && character <= 'z') || (character >= '0' && character <= '9')) {
                    charTemp.add(character);
                }
            }
        }
        System.out.println(charTemp.toString());

        int last = charTemp.size();
        for (Character character : charTemp) {
            if (character != charTemp.get(--last)) {
                System.out.println(character + " " + charTemp.get(last));
                return false;
            }
        }

        return true;
    }
}
