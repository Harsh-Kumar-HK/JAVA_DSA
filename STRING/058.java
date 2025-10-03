class remove_consecutive_duplicates {
    public static void main(String[] args) {
        String str = "qqwertyy";
        
        char last = str.charAt(0);
        String ans = "" +last;

        for(int i = 0 ; i<str.length() ; i++){


           if(str.charAt(i)==last)
           {
                    continue;
            }

            else{
                last = str.charAt(i);
                ans+=last;
            }



        }


        System.out.println(ans);
    }
    
}
