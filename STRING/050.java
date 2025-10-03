class check_palindrome_ignore_case {
    public static void main(String[] args) {
        String str = "mom dad nahd naad inam niin";
        boolean flag = false;
        String word = "";

        if(str.charAt(str.length()-1)!=' '){
            str+=' ';
        }

        for(int j=0 ; j<str.length() ; j++){
            if(str.charAt(j)==' '){
                flag = checkWord(word);
                if(flag==true){
                    System.out.println(word+" word is a palindrome");
                }
                word="";
                continue;
            }
            word+=str.charAt(j);
            
        }


        


    }

    static boolean checkWord(String str){

        boolean flag = false;

        for(int i =0 ; i<str.length() ; i++){
            if((str.charAt(i)>='A' && str.charAt(i)<='Z')||(str.charAt(str.length()-i-1)>='A' && str.charAt(str.length()-i-1)<='Z')){
                if((char)str.charAt(i)+32 == str.charAt(str.length()-i-1)){
                    continue;
                }else if(str.charAt(i) == (char)str.charAt(str.length()-i-1)+32){
                    continue;
                }else{
                    flag = true;
                }

            }
            
        }
        if(flag==false){
            // System.out.println("hehe"+str);
                return true;
            }else{
                // System.out.println("hehe2"+str);
                return false;
            }

    }
}
