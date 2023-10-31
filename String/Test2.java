class Test2 {


    //Checking the occurence of character in a string
   public static void main(String[] args) {
    
    String str = "sandeshshinde";
    int length = str.length();


    for(int i=0; i < length ; i++){
        int count = 1;
        for(int j = i+1; j < length ; j++){
            if(str.charAt(i) == str.charAt(j)){
                count++;
                str = str.substring(0, j) + ' ' + str.substring(j+1); 
            }
        }
        if(str.charAt(i) != ' '){
            System.out.printf("%c => %d\n" , str.charAt(i), count );
        }
    }

}

}



