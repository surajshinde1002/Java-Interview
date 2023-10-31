package Prime;
public class Prime {

    public static long result(int N, int X, int M){
         
        long product = 1;
        
        for(int i = 2; i<=X; i++){
            if(isPrime(i)){
                product *= i;
                System.out.println("in method if:"+product);
            }
        }
        System.out.println("in result method: "+product);
          long result = (long)Math.pow(N, product) % M;
       return result;
        //System.out.println("The number is prime");
       }

      

        public static boolean isPrime(int X){
        
        if(X == 0 || X ==1){
            return false;
        }
        else{
             int m = X /2;
          
            for (int j = 2; j <= m; j++) {
                if(X%j == 0){
                    return false;
                //System.out.println(product); 
                }
                
            }
           return true;
        }
    }
    
    public static void main(String[] args) {

       int N = 2;
        int X = 5;
        int M = 5;

         long res = (long)Math.pow(N, 6) % M;
         System.out.println("in main: "+ res);

       long result = result(N, X, M);
       System.out.println(result);
        
       //long result = result(N, X, M);
       //System.out.println(result);
    }

}
