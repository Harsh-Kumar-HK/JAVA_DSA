class solution{
    public static void main(String[] args) {
        String str = "this is the new string";
        String str2="";
        int start = 5;
        int end = 9;

        if((start>str.length())||(end>str.length())){
            System.out.println("index is going out of bound bitch");
        }else{
            for(int i= start ; i<end ; i++){
                str2+=str.charAt(i);
            }  

        }

        System.out.println(str2);

        
    }
}
