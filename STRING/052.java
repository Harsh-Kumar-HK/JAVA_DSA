class count_words_with_same_start_and_ending_character {
    public static void main(String[] args) {
        String str = "My Name is harsH kumark";
        String word = "";
        int count = 0;
        boolean flag = false;

        if(str.charAt(str.length()-1)!=' '){
            str+=' ';
        }
        for(int i= 0; i<str.length() ; i++){
            if(str.charAt(i)==' '){
                flag = checkSame(word);
                if(flag == true){
                    count++;
                    System.out.println(word);
                    
                }
                word = "";
                continue;
            }
            word+=str.charAt(i);
        }
        System.out.println("Total count is : "+count);
    }

    static boolean checkSame(String word){
        for(int j=0 ; j<word.length() ; j++){
            if(word.charAt(j)==word.charAt(word.length()-1)){
                
                return true;
            }else{
                if((char)word.charAt(j)+32 ==word.charAt(word.length()-1)){
                    return true;
                }else if(word.charAt(j)==(char)word.charAt(word.length()-1)+32){
                    return true;
                }
                return false;
            }
        }
        return false;
    }
    
}
