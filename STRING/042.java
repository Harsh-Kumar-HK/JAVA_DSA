class Reverse_words_in_string {
    public static void main(String[] args) {
        String str = "my name is harsh";
        String newStr = "";
        String word = "";

        if(str.charAt(str.length()-1)!=0){
            str+=' ';
        }

        for(int i= 0; i<str.length() ; i++){
            if(str.charAt(i)==' '){
                word+=str.charAt(i);
                newStr = word+newStr;
                word = "";
                continue;
            }
            word+=str.charAt(i);
        }

        System.out.println(">" + newStr + "<");
    }
    
}
