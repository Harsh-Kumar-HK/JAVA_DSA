class move_all_uppercase_letter_to_front {

    public static void main(String[] args) {
        String str = "My NaMe is HArsh KUMar";
        String Upper = "";
        String lower = "";

        for(int i = 0; i< str.length() ; i++){
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                Upper+=str.charAt(i);
            }
            else{
                lower+=str.charAt(i);
            }
        }

        Upper = Upper + lower;

        System.out.println(Upper);
    }
    
}
