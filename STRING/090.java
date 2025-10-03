
import java.util.ArrayList;

class print_all_unique_substring {
    
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        String str = "abc";
        for(int i =0 ;  i<str.length() ; i++){
            for(int j=i;  j<str.length() ; j++){
                String word ="";
                for(int k =i ; k<=j ; k++){
                    word+=str.charAt(k);
                }
                boolean flag = false;
                flag = checkRepeatSubstring(word , list);
                if(flag==false){
                    System.out.println(word);
                    list.add(word);
                }else{
                    System.out.println("copy hai :               "+word);
                }
                
            }
    }
    }
    static boolean checkRepeatSubstring(String word , ArrayList<String> list){
        boolean flag = false;
        for(String value : list){
            flag = checkString(value , word );
            if(flag == true){
                return true;
            }
        }
        return false;
    }
    
    static boolean checkString(String value , String word){
        if(value.length() == word.length()){
            for(int i = 0 ; i<value.length() ; i++){
                if(value.charAt(i)!=word.charAt(i)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }    
}
