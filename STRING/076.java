class find_frequecny_of_a_word {
    public static void main(String[] args) {
        String str = "my harsh is harisha name harsha";
        String target = "harsh";
        boolean flag = false;
        int count =0;

        for(int i =0 ; i<str.length() ; i++){
            if(str.charAt(i)==target.charAt(0)){
                flag = checkWord(i, str , target);
                if(flag==true){
                    count++;
                }
                flag = false;
                
            }


        }

        System.out.println("frequency of this word is : "+count);
    }

    static boolean checkWord(int index , String str , String target){
        boolean length = ((index+target.length())<=str.length());

        if(length == false){
            return false;
        }
        int start = 0;
            for(int i = index ; i<index+ target.length() ; i++){
                if(str.charAt(i)!=target.charAt(start)){
                    return false;
                }
                start++;
            }
            return true;
    }
}
