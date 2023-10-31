class Series1{

    //0,0,1,2,2,4,3,6,4,8

    public static void series(int n){
        int i =0;
        int first = 0;
        int second = 0;
        while(i<= n){
            if(i%2 == 0){
                System.out.println(first);
                first += 1;
                
            }else{
                System.out.println(second);
                second +=2;
            }
            i++;
        }
       
    }
    public static void main(String[] args) {
        int n = 10;
        series(n);
    }
}