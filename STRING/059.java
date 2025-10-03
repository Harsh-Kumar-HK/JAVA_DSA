class find_substring_palindrome_for_not_spacing_string {
    public static void main(String[] args) {

        String str = "momom";
        String word = "";

        for(int i=0 ; i<str.length() ; i++){
            word = "";
                for(int j=i ; j<str.length() ; j++){
                    word+=str.charAt(j);
                    // System.out.println(word);
                    checkPalindrome(word);
                
            }
        }

        System.out.println("Execution complete");
        
    }


    static void checkPalindrome(String str){
     
        boolean flag = true;
        for(int i=0 ; i<(str.length()/2) ; i++)
        {
            if(str.charAt(i) != str.charAt(str.length()-i-1))
            {
                flag = false;
                break;
            }
            
        }
        if(flag && str.length()>1){
            System.out.println(str);
        }
    }
    
}
