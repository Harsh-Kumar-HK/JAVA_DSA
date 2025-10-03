class snake_case_to_camel_case {

    public static void main(String[] args) {
        String str = "my_name_is_harsh_kumar";
        String word = "";

        for(int i = 0; i<str.length() ; i++){
            if(str.charAt(i)=='_'){
                i++;
                
                if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                    char newchar = (char)(str.charAt(i)-32);
                    word+=newchar;
                    continue;
                }
            }
            word+=str.charAt(i);
        }

        System.out.println(word);
    }
    
}
