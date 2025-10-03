class swap_first_last_char{
    public static void main(String[] args) {
        String str = "           my name is harsh kumar              ";
        String firstWord ="";
        String lastword ="";
        String word = "";
        int count = 0;
        word = word +lastword;
        for(int i =0 ; i<str.length() ; i++){
            if(count ==0 && str.charAt(i)!=' '){
                firstWord+=str.charAt(i);
            }else{
                if(str.charAt(i)==' '){
                    count = 1;
                    word = word+lastword;
                    lastword="";
                }
                lastword +=str.charAt(i);
            }
        }
        count = 0;
        word = lastword+word+" "+firstWord;
        System.out.print("<"+word+">");
    }
}
