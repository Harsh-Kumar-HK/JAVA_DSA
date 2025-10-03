import java.util.ArrayList;

class count_char_of_each_type {
    public static void main(String[] args) {
        String str = "ame is har";
        int count = 1;
        boolean flag = false;
        ArrayList <Character> list = new ArrayList<>();
        for(int i =0 ; i<str.length() ; i++){
            for (Character c  : list) {
                if(c == str.charAt(i)){
                    flag = true;
                    break;
                }
            }
            if(flag == true){
                flag = false;
                continue;
            }
            list.add(str.charAt(i));
            for(int j=i ; j<str.length() ; j++){
                if(str.charAt(i)==str.charAt(j) && i!=j){
                    count++;
                }
            }
            System.out.println("The total freq of   "+str.charAt(i)+"     character is : "+count);
            count = 1;
        }
    }
    
}
