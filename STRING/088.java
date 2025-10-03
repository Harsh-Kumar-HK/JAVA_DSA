class number_of_substrings {

    public static void main(String[] args) {
        String str = "abc";

        // ttoal number of substring = N(n+1)/2;

        int n = str.length();

        int result = (n*(n+1)/2);

        System.out.println(result);
    }
    
}
