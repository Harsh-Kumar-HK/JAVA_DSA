class CheckRotatedString{
    public static void main(String[] args) {
        String str = "ABCD iufhie wiueiu";
        String str2 = "ueiuABCD iufhie wi";
        int start = 0;
        boolean flag = false;
        System.out.println("The second string is rotated in nature");
        for(int i = 0; i<str.length() ; i++){
            if(str.charAt(start)==str2.charAt(i)){
                flag = checkRotation(str , str2 , i);
            }else{
                System.out.println("     "+str2.charAt(i));
            }
            if(flag == true){
            System.out.println("The second string is rotated in nature");
            break;
        }
        }
    }

    static boolean checkRotation(String str , String str2 , int i){
        int x = 0;
        for(int j =i ; j<str2.length() ; j++){
            if(str.charAt(x)==str2.charAt(j)){
                x++;
                continue;
            }else{
                return false;
            }
        }

        for(int j= 0; j<i ; j++){
            if(str.charAt(x)==str2.charAt(j)){
                x++;
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}

