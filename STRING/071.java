class char_differ_by_2_in_two_strings {


    public static void main(String[] args) {
        String str = "my name is harsh kumar";
        String str2 = "my name is harsh kuma";
        int count =0 ;
        if((str.length()!=str2.length())&& str.length()-str2.length()>1&&(str.length()-str2.length()< -1)){
            System.out.println(false);
            System.exit(0);
        }
        int length = str.length();

        if(str.length()>str2.length()){
                length = str.length()-1;
                count++;
            }
            else if(str.length()<str2.length()){
                length = str2.length()-1;
                 count++;
            }
        for(int i = 0 ; i<length ; i++){
            if(str.charAt(i)!=str2.charAt(i)){
                count++;
            }         
        }
        if(count == 2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    
}
