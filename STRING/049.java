class remove_duplicate_string {
    public static void main(String[] args) {
        String str = "My name is name do you know? It's name harsh";
        String str2 = "";
        String word = "";
        boolean flag = false;

        if(str.charAt(str.length()-1)!=' '){
            str+=' ';
        }

        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i)==' '){


                flag = checkExist(word , str2);
                if(flag==true){
                    word = "";
                    continue;
                }


                str2+=word;
                str2+=" ";
                word = "";
                continue;
            }
            word+=str.charAt(i);
        }
        System.out.println(str2);
    }

    //this function will look for the first letter of target word which will match any word in the given string
    static boolean checkExist(String word , String str2){
        boolean flags = false;
        int start = 0;
        for(int j=0 ; j<str2.length();j++){
            if(str2.charAt(j)==word.charAt(start)){
                flags = checkWord(j , str2 , word);
                if(flags == true){
                    return true;
                }
            }
        }
        return false;
    }

    //this function is checking weather complete word is same or not
    static boolean checkWord(int index , String str2 , String word){
        int start = 0;
        for(int k = index ; k<index+word.length(); k++){
            if(str2.charAt(k)==word.charAt(start)){
                start++;
                continue;
            }
            return false;
        }
        System.out.println("name value true for : " +word);
        return true;
    }
    
}
