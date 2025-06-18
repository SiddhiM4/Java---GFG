class TheElseifStatement {
    public static void utility(int number) {
        String ans="";
        
        if(number > 100)
            ans="Big";
        else if(number < 10)
            ans="Small";
        else
            ans="Number";
        
        System.out.println(ans);
    }
}