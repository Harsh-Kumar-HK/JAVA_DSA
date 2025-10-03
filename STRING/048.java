class  count_number_of_lowerCase{

    public static void main(String[] args) {
        String str = "MY name Is Harsh KUMAR";
        int count = 0;
        for (int i=0 ; i<str.length() ; i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                count++;
            }
        }

        System.out.println(count);
    }
    
}
