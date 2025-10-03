class Check_penegram_string{
    public static void main(String[] args) {
        String str = "abcdefghijklmnovpqrstuwxyz";
        boolean flag = false;
        boolean flags = false;
        
        char arr []= {'p' , 'o' ,'i' ,'u' ,'y' ,'t' ,'r' ,'e' ,'w' ,'q' ,'l' ,'k' ,'j' ,'h' ,'g' ,'f' ,'d' ,'s' ,'a' ,'m' ,'n' ,'b' ,'v' ,'c' ,'x' ,'z' };


        for(char c:arr){
            for(int i=0 ; i<str.length() ; i++){
                if(c==str.charAt(i)){
                    flag = true;
                    break;
                }
                if(c==(char)str.charAt(i)+32){
                    flag = true;
                    break;
                }
                
            }
            if(flag!=true){
                System.out.println("word not found here :        "+c);
                flags = true;
                break;
            }

            flag = false;

        
    }
    if(flags == true){
        System.out.println("string is not pannagrame");
    }else{
        System.out.println("string is pannagrame");
    }
    
}

}
