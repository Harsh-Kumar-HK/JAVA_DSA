class num_of_digit_in_a_string {
    public static void main(String[] args) {
        String str = "mueh 8 hbehbeu32 ueydh8 4 3";
        int count = 0;

        for(int i = 0; i<str.length() ; i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                count++;
            }
        }
        System.out.println("Number of digits in a strign is : "+count);
    }
    
}
