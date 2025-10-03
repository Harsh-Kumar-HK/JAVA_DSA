class Compare_string_ignore_casing{
    public static void main(String[] args) {
        String str = "hArSh";
        String str2 = "HaRsH";
        String str4 = "";
        String str3 = "";

        if(str.length()!=str2.length()){
            System.out.println("Length is not same bruh");
            System.exit(0);
        }

        int i=0;

        for(i = 0 ; i< str.length() ; i++){
            if((str.charAt(i)>='A')&&(str.charAt(i)<='Z')){
                char c = str.charAt(i);

                c = (char)(c+32);

                str3+=c;
                continue;
                System.out.println(c);
            }
            str3+=str.charAt(i);
            
        }

        for(i = 0 ; i< str2.length() ; i++){
            if((str2.charAt(i)>='A')&&(str2.charAt(i)<='Z')){
                char c = str.charAt(i);

                c = (char)(c+32);

                str4+=c;
                continue;
            }
            str4+=str2.charAt(i);
        }

        for(int j = 0; j<str.length(); j++){
            if(str3.charAt(j)==str4.charAt(j)){
                continue;
            }else{
                System.out.print("not a match at : "+j);
                System.exit(0);
            }
        }

        System.out.print("This string is a match");



        // char num = 'a';
        // System.out.println(num+0);
    }
    
}