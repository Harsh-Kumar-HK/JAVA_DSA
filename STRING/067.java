class reverse_a_substring {
    public static void main(String[] args) {
        String str = "HarshKumar";
        String newWord = "";
        String word = "";

        int start = 2;

        int end = 4;
        
        for(int i = 0 ; i<start ;i++ ){
            word+=str.charAt(i);
        }

        for( int i = end  ; i>=start ; i--){
            newWord+=str.charAt(i);
        }

        word+=newWord;

        for(int i = end ; i<str.length() ;i++ ){
            word+=str.charAt(i);
        }

        System.out.println(word);
        
    }
}