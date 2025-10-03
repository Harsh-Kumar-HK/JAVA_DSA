import java.util.ArrayList;


class character_in_ascending_frequency {
    public static void main(String[] args) {
        String str = "aaabbccccd";

        int maximum = Integer.MAX_VALUE;
        int maxIndex = 0;

        int count = 1;
        
        boolean flag = false;
        ArrayList <Character> element = new ArrayList<>();
        ArrayList <Integer> frequency = new ArrayList<>();



        for(int i =0 ; i<str.length() ; i++){
            for (Character c  : element) {
                if(c == str.charAt(i)){
                    flag = true;
                    break;
                }
            }
            if(flag == true){
                flag = false;
                continue;
            }
            element.add(str.charAt(i));
            
            for(int j=i ; j<str.length() ; j++){
                if(str.charAt(i)==str.charAt(j) && i!=j){
                    count++;
                }
            }
            frequency.add(count);

            
            // System.out.println("The total freq of   "+str.charAt(i)+"     character is : "+count);
            count = 1;
        }

        maxIndex = Return_lower_than_max(maximum , frequency);
        System.err.println("the first value is : "+element.get(maxIndex));

        for(int i = 0 ; i<frequency.size() ; i++){
            maxIndex = Return_lower_than_max(frequency.get(maxIndex) , frequency);
            System.err.println("the               value is : "+element.get(maxIndex));

        }

        
    }

    static int Return_lower_than_max(int maximum , ArrayList<Integer> frequency){
        int max_i = -1;
        int count = Integer.MIN_VALUE;
        for(int i=0 ; i<frequency.size() ; i++){
            if(frequency.get(i)>count && frequency.get(i)< maximum){
                count = frequency.get(i);
                max_i = i;
            }
        }
        if(max_i==-1){
            // System.out.println("Something went wrong at "+maximum+"                "+frequency.toString());
            System.exit(0);
        }
        return max_i;
    }
    
}
