public class Series3 {

    public static void series(int n){
        int se = 6;
        int i = 1;
        int inc = 3;
        while(i<=n){
            System.out.print(se+",");
            se += inc;
            inc += 2;
            
            i++;
        }
    }
    public static void main(String[] args) {
        int n =10;
        series(n);
    }
}
