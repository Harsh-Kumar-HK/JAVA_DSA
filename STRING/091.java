class count_total_vowels_or_consonents_in_string {

    public static void main(String[] args) {
        String str = "aeIou wrthKLP";

        int  vowelCount = 0;
        int consonentCount = 0;

        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
                vowelCount++;
                continue;
            }
            if((str.charAt(i)>='a' && str.charAt(i)<='z')||(str.charAt(i)>='A' && str.charAt(i)<='Z')){
                consonentCount++;
            }
        }

        System.out.println("Vowels :  "+vowelCount);
        System.out.println("consonent Count :  "+consonentCount);
        

    }
    
}
