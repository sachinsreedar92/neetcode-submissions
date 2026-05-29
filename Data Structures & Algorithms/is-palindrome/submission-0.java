class Solution {
    public boolean isPalindrome(String s) {
        
        int left =0, right = s.length() -1;

        while(left < right){

            while(left < right && !isAlpha(s.charAt(left))){
                left++;
            }

            while(left < right && !isAlpha(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }

            left++; right--;

        }

        return true;

    }

    public boolean isAlpha(char c){

        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9' );

    }
}
