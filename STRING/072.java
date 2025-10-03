class merge_two_string_altermnatively {
    public static void main(String[] args) {
        String str1 = "bbxx";
        String str2 = "aa";
        boolean flag = true;
        String word = "";
        String finalString = "";
        String main = "";
        int ind1 = 0;
        int ind2 = 0;
        int length = (str1.length()>str2.length()) ? str2.length()*2 : str1.length()*2;
        boolean flags= (str1.length()<str2.length()) ? false : true;
        for(int i = 0; i< length ; i++){
            if(flag==true){
                word+=str1.charAt(ind1);
                ind1+=1;
                flag = false;
                continue;
            }
            if(flag==false){
                word+=str2.charAt(ind2);
                ind2+=1;
                flag = true;
            }
        }
        if(flags == true){
            main = str2+str1;
        }else{
            main=str1+str2;
        }
         for(int i = 0 ; i<str1.length()+str2.length() ; i++){
            if(i<word.length()){
                finalString+=word.charAt(i);
                continue;
            }
            finalString+=main.charAt(i);
         }
        System.out.println("Final string is : "+finalString);
    } 
}