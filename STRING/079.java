class print_first_repeating_character {

    public static void main(String[] args) {
        String str = "uiowpdo";
        boolean flag = false;


        for(int i=0 ; i<str.length(); i++){
            for(int j= i ; j<str.length() ; j++){
                if(str.charAt(i)==str.charAt(j) && i!=j){
                    System.out.println("the character is : "+str.charAt(i));
                    flag = true;
                    break;
                }
            }
            if(flag == true){
                break;
            }
        }
    }
}
