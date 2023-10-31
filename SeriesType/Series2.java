public class Series2 {
   
    // 1,3,6,10,15
    public static void series(int n){
        int se = 1;
        int i =1;
        int inc = 2;
        while(i<=n){
            System.out.println(se);
            se+=inc;
            inc++;
            i++;
        }
    }
    public static void main(String[] args) {
         int n = 10;
         series(n);
    }
}
