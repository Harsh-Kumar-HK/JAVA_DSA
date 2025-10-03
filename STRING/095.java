class check_if_a_string_only_contains_special_character {
    public static void main(String[] args) {
        String str = " my name iwehu ^$^&*@^$";

        int count =0;
        boolean flag = false;
        String word = "";

        if(str.charAt(str.length()-1)!=' '){
            str+=' ';
        }

        for(int i =0 ; i<str.length();i++){
            if(str.charAt(i)==' '){
                System.out.println(word);
                flag = checkChar(word);
                if(flag == false){
                    count++;
                    flag = false;
                    
                }
                word= "";
                continue;
            }
            word+=str.charAt(i);
        }

        System.out.println("The total number of strings with only special char : "+count);


    }

    static boolean checkChar(String str){
        for(int i = 0 ; i<str.length() ; i++){
            if((str.charAt(i)>='a' && str.charAt(i)<='z')||(str.charAt(i)>='A' && str.charAt(i)<='Z')||str.charAt(i)>='o'&& str.charAt(i)<='9'){
                continue;
            }
            return false;
        }
        return true;
    }
    
}
