class count_vowels_and_consonents {
    public static void main(String[] args) {
        String str = "mysql aeIoU 12345 !@#$%";
        int vowelCount = 0;
        int consonentCount = 0;
        boolean flag = false;
        int numCount =0;
        int splCharacterCount = 0;

        char arr[] = {'a', 'e' , 'i' , 'o' , 'u' , 'A' , 'E' , 'I' , 'O' , 'U'};

        for(int i=0 ; i<str.length() ; i++){
            flag = false;

            for(char c:arr)
            {

                if(c==str.charAt(i)){
                    vowelCount++;
                    flag = true;
                    break;
                }
                
            }
            

            if((((str.charAt(i)>='A')&&(str.charAt(i)<='Z'))||((str.charAt(i)>='a')&&(str.charAt(i)<='z')))&&(flag!=true)){
                consonentCount+=1;
                continue;
            }

            if((str.charAt(i)>='0')&&(str.charAt(i)<='9')){
                numCount++;
                continue;
            }

            if(flag==false){
                splCharacterCount++;
            }

        }
        System.out.println("The number of vowels in given string is : "+vowelCount);
        System.out.println("The number of consonent in given string is : "+consonentCount);
        System.out.println("The number of numbers in given string is : "+numCount);
        System.out.println("The number of special character in given string is : "+splCharacterCount);

    }
    
}
