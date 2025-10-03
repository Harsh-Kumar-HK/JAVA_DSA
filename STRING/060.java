class k_length_substring_with_non_repeating_character {
    public static void main(String[] args) {
        String str = "harshNameHaimera";
        int k = 7;
        boolean flag = false;
        String word = "";
        int count=0;

        for(int i =0 ; i<str.length(); i++){
            if(i+k<str.length()){
                for(int j=i ; j<i+k ; j++){
                    word+=str.charAt(j);
                }
                flag = checkSubstring(word);
                if(flag == true){
                    flag = false;
                    count++;
                }
                word="";
            }
        }
        System.err.println("The count is :           "+count);
    }

    static boolean checkSubstring(String str){
        int start = 0;
        for(int i= 0; i<str.length() ; i++){
            for(int j=i ; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)&& i!=j){
                    return false;
                }           
            }
        }
        System.out.println(str);
        return true;
    }
}
