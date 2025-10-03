class count_number_of_lowercase_in_a_string{

    public static void main(String[] args) {
        String str = "MY name is HArsh Kumar";
        int count = 0;

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                count++;
        }

        


    }
    System.out.println(count);
    
}

}
