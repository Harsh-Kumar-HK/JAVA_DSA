class Longest_prefix_matching_in_two_strings{

    public static void main(String[] args) {
        String str = "harsh kumar";
        String str2 = "harhs sharma";
        String word = "";

        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i)==str2.charAt(i)){
                System.out.print(str.charAt(i));
                word+=str.charAt(i);
            }
            else{
                break;
            }
        }
        System.err.println();

        System.err.println(word);
    }
    
}
