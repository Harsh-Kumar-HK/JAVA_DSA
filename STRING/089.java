class num_of_palindromic_substring {
    public static void main(String[] args) {
        String str = "abc";
        int count = 0;
        for(int i =0 ;  i<str.length() ; i++){
            for(int j=i;  j<str.length() ; j++){
                boolean flag = false;
                flag = checkPalindrome(i , j , str);
                if(flag==true){
                    count++;
                }
            }
    }
    System.out.println("The number of palindrome string is :    "+count);
    }
    static boolean checkPalindrome(int i, int j , String str){
        int b = j;
        for(int a=i ; a<=j ; a++){
            if(str.charAt(i)==str.charAt(b)){
                b--;
                continue;
            }
            return true;
        }
        return false;
    }
}
