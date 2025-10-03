class move_all_lower_case_to_front {
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

        lower = lower+ Upper ;

        System.out.println(lower);
    }
    
}
