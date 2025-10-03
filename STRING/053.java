class longest_substring_without_repeating_character {

    public static void main(String[] args) {
        String str = "JaisJqw";
        String word = "";
        boolean internalFlag = false;
        boolean flag = false;
        int k=0;
        int count = 0;
        int newCount = 0;
        int i=0;
        int j=0;
        int max_i = 0;
        int max_j = 0;
        // String ne

        
        // for(i=0 ; i<str.length() ; i++){



            for(j=i; j<str.length(); j++){
                if(newCount>count){
                    count = newCount;
                    max_j = j;
                }

                for(k=0 ; k<word.length();k++){

                    if(str.charAt(j)==str.charAt(k)){
                        internalFlag = true;
                        System.out.println(word+"      "+str.charAt(j)+"        "+str.charAt(k));
                        break;
                    }
                    
                }

                if(internalFlag==true){
                    i=k+1;
                    flag = true;
                    max_i = i;
                    newCount = j-i;
                    continue;
                    
                }

                word+=str.charAt(j);

                System.out.println(word);


                

                newCount = j-i;

                

                









            }


            for(int l=max_i ; l<max_j+1;l++){
                    System.out.print(str.charAt(l));
                }
            System.out.println("");





        // }
    }



















    // public static void main(String[] args) {
    //     String str = "jaishsreehrajm";
    //     int count = 0;
    //     int  newcount = 0;
    //     String word = "";
    //     boolean flag = false;
    //     int j = 0;
    //     int  i =0;
    //     int max_i = 0;
    //     int max_j = 0;
    //     for(i = 0; i<str.length() ; i++){
    //         newcount = 0;
    //         for(j=i+1 ; j<str.length() ; j++){
    //             newcount = j-i;
                
    //             if(str.charAt(i)==str.charAt(j)){
                    
    //                 flag = true;
    //                 System.out.println(i+"        "+ str.charAt(i)+"       "+j+"        "+ str.charAt(j));
    //             }
    //             if(newcount>count){
    //                 count = newcount;
                    
    //                 max_i = i;
    //                 max_j = j;
    //             }
    //             if(flag==true){
    //                 flag=false;
    //                 break;
    //             }
    //             System.out.println(i+"        "+ str.charAt(i)+"       "+j+"        "+ str.charAt(j));

    //         }
    //         if(newcount>count){
    //                 count = newcount;
    //                 max_i = i;
    //                 max_j = j;
    //             }
            
    //     }

    //     System.out.println("The longest string was from "+i+" till "+j);
    //     for(int k=max_i; k<max_j+1; k++){
    //         System.out.print(str.charAt(k));
            
    //     }
    //     System.out.println();
    // }
    
}
