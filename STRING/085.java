import java.util.ArrayList;

class check_if_str_has_all_unique_character {

    public static void main(String[] args) {
        String str = "ytughjbnm";

        boolean flag = false;

        ArrayList <Character> list = new ArrayList<>();

        for(int i=0 ; i<str.length() ; i++){

            for(char c : list){
                if(c==str.charAt(i)){
                    flag = true;
                    break;
                }
            }
            if(flag == true){
                System.out.println("false");
                System.exit(0);
            }

            list.add(str.charAt(i));
        }

        System.out.println("true");
    }
    
}
