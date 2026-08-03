class Solution {
    public boolean isPalindrome(String s) {
        char[] charArray = s.toCharArray();
        if(s.length() == 0) {return true;}
        int startIndex = 0;
        int lastIndex = charArray.length - 1;
        while(startIndex < lastIndex) {
            if(!Character.isLetterOrDigit(charArray[startIndex])) {
                startIndex++;
                continue;
            }
            if(!Character.isLetterOrDigit(charArray[lastIndex])) {
                lastIndex--;
                continue;
            }
            if(Character.toLowerCase(charArray[startIndex]) != Character.toLowerCase(charArray[lastIndex])) {
                return false;
            }
             startIndex ++;
             lastIndex--;
        }
        return true;

    }
}
