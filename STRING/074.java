class check_if_a_string_is_binary {
    public static void main(String[] args) {
        String str = "0101001101001";
        boolean flag = true;

        for(int i = 0 ; i<str.length(); i++){
            if(str.charAt(i)=='0' || str.charAt(i)=='1'){
              continue;
            }
            System.out.println("String is not pure binary");
            flag = false;
            break;
        }

        if(flag == true){
            System.out.println("String is pure binary");
        }
    }
    
}
