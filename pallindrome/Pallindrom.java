class Pallindrom{

    public static void check(int n){
        int temp = 0;
        int sum = 0;
        int m = n;
        System.out.println("the velue "+m);
        while(m>0){
            temp = m%10;
            sum = (sum*10)+temp;
            m = m/10;
            System.out.println(sum);
        }
        if(sum == n){
          System.out.println("The given number is a pallindrom.");
        }
        else{
            System.out.println("The number is not Pallindrom.");
        }
    }
    public static void main(String[] args) {
        int n = 1241;
        check(n);
    }
}