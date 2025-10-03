class check_if_a_string_is_numeric{
    public static void main(String[] args) {
        String str= "23a2";
        boolean flag = true;
        for(int i =0 ; i<str.length() ; i++){
            if(str.charAt(i)<'0' || str.charAt(i)>'9'){
                System.out.println("not numeric bitch");
                flag = false;
            }
        }

        if(flag == true){
            System.out.println("String is numeric");
        }
}
}
