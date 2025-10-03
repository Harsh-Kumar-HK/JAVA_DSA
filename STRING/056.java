class count_substring_starting_and_ending_with_same_character {

    public static void main(String[] args) {
        String str = "nhrgnrh";

        int count = 0;

        for(int i=0 ; i<str.length() ; i++){
            for(int j=i+1 ; j<str.length() ; j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                    break;
                    
                }
                continue;
            }
        }

        System.out.println("The count is :      "+count);
    }
    
}
