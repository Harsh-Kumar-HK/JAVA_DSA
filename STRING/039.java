class Convert_character_array_to_string {
    public static void main(String[] args) {
        String str = "My name is harsh kumar";

        char arr [] = new  char [str.length()];

        for(int i = 0; i<str.length() ; i++){
            arr[i] = str.charAt(i);
        }

        for(int j = 0;j<arr.length ; j++){
            System.out.println(arr[j]);
        }

        String word = "";
        for(int k=0 ; k<arr.length ; k++){
            word+=arr[k];
        }

        System.out.println(word);
    }
}