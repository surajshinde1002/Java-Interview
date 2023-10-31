public class RepeatedTerms {
    
    public static void main(String[] args) {
        
        String str = "wwwssjj";
        Check check = new Check();
       check.output(str);
        
    }
}

class Check{

    public void output(String str){
        int length = str.length();

        for (int i = 0; i < length; i++) {
            int count = 1;
            for(int j = i+1; j < length; j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                    str = str.substring(0, j) + ' ' + str.substring(j+1);
                }
               
            }
            if(str.charAt(i) != ' '){
                System.out.printf("%c%d",str.charAt(i),count);
            }

        }
       
    }
}
