
import java.util.ArrayList;

class find_min_occuring_character {

    public static void main(String[] args) {
        String str = "my name is harsh kumar";

        char minChar = ' ';
        int count = 0;
        int minCount = Integer.MAX_VALUE;
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
                flag = false;
                continue;
            }

            list.add(str.charAt(i));


            for(int j=i; j<str.length(); j++){

                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }

            System.out.println("The freq is :  "+count+"       for the word is :     "+str.charAt(i));

            if(count<minCount){
                minChar = str.charAt(i);
                minCount = count;
            }
            count = 0;

        }

        System.out.println("Min character is : "+minChar);


    }
    
}
