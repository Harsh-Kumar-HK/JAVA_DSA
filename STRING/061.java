class find_first_non_repeating_character {
    public static void main(String[] args) {
        String str = "ccheuhuurhfzewugyec";
        boolean flag = false;

        for(int i= 0 ; i<str.length() ; i++){
            for(int j=0 ; j<str.length() ; j++){
                if(str.charAt(i)==str.charAt(j) && i!=j){
                    
                    flag = true;
                    break;
                }
            }
            if(flag!=true){
                System.out.println("the character is : "+str.charAt(i));
                break;
            }
            flag = false;
        }
    }
}
