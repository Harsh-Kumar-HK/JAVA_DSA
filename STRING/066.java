class swap_two_characters {
    public static void main(String[] args) {
        String str = "My name is harsh kumar";
        String word = "";

        char n = 'b';

        for(int i = 0 ; i<str.length() ; i++){
            if(str.charAt(i)=='a'){
                word+='b';
                continue;
            }
            word+=str.charAt(i);
        }

        System.out.println(word);
    }
    
}
