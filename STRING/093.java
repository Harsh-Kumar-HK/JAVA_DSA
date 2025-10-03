class count_word_starting_from_vowel {
    public static void main(String[] args) {
        String str = "my name is harsh orange";
        String word = "";
        boolean flag = false;
        int count = 0;
        
        if(str.charAt(str.length()-1)!=' '){
            str+=' ';
        }

        for(int i =0 ; i<str.length();i++){
            if(str.charAt(i)==' '){
                System.out.println(word);
                flag = checkWord(word);
                if(flag == true){
                    count++;
                    flag = false;
                    
                }
                word= "";
                continue;
            }
            word+=str.charAt(i);
        }

        System.out.println("The value of the values in this string where words starts with vowels is : "+count);
    }

    static boolean checkWord(String str){
        int i =0;
        if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
            return true;
        }

        return false;

    }
    
}
