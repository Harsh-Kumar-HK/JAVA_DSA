// if just spaces then not working 

class replace_multiple_spaces_with_single_space {
    public static void main(String[] args) {
        String str = "       ";
        String word = "";
        if(str.length()>0){
            int nextChar = str.charAt(1);
        }else{
            System.exit(0);
        }

        for(int i=0 ; i<str.length();i++){
            if(i<str.charAt(i)-1){
                if(str.charAt(i)==' ' && str.charAt(i+1)==' '){
                    continue;
                }else{
                    word+=str.charAt(i);
                }
            }else{
                if(str.charAt(i-1)==' ' && str.charAt(i-1)==' '){
                    break;
                }else{
                    word+=str.charAt(i);
                }
            }
        }

        System.out.println(word);
    }
    
}
