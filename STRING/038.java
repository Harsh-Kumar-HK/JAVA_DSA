class Convert_string_to_character_array {
    public static void main(String[] args) {
        String str = "My name is harsh kumar";

        char arr [] = new  char [str.length()];

        for(int i = 0; i<str.length() ; i++){
            arr[i] = str.charAt(i);
        }

        for(int j = 0;j<arr.length ; j++){
            System.out.println(arr[j]);
        }
    }
}