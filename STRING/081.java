class remove_duplicates_from_string {
    public static void main(String[] args) {
        String str = "my name aryan";
        String word = "";
        boolean flag = false;

        for(int i =0 ; i<str.length() ; i++){
            for(int j= 0; j<word.length() ; j++){
                if(str.charAt(i)==word.charAt(j)){
                    flag = true;
                    break;
                }
            }
            if(flag == true){
                flag = false;
                continue;
            }
            word+=str.charAt(i);
        }
        System.out.println(word);
        
        }
    
}