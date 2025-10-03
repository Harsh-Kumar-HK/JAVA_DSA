class AllOcuuranceOfSubstring{
    public static void main(String[] args) {
        String str = "harshhar sh";

        String target = "har sh";
        boolean flag = false;
        int count =0;

        if(str.length() < target.length()){
            System.out.println("length of both string is not same");
            System.exit(0);

        }

        for(int i = 0; i<str.length() ; i++){
            if(str.charAt(i)== target.charAt(0)){
                flag = checkSub(i, str , target );
                if(flag == true){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    static boolean checkSub(int i , String str , String target){
        int start = 0;


        if(target.length()>str.length()-i){
            return false;
        }



        for(int j= i ; j<i+target.length(); i++){


            if(start >= target.length()){
                return true;
            }

            if(str.charAt(i)==target.charAt(start)){
                start++;
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
