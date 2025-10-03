class camel_case_to_Snake_case {

    public static void main(String[] args) {
        String str = "myNameIsHarshKumar";
        String word = "";

        for(int i = 0; i<str.length() ; i++){
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                word+='_';
                char newchar = (char)(str.charAt(i)+32);
                word+=newchar;
                continue;
            }
            word+=str.charAt(i);
        }

        System.out.println(word);
    }
    
}
