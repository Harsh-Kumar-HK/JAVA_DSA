class print_last_repeating_character {

    public static void main(String[] args) {
        String str = "uiowpdo";
        boolean flag = false;


        for(int i=str.length()-1 ; i>0; i--){
            for(int j= i  ; j>0; j--){
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