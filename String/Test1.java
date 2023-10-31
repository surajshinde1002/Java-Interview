
public class Test1{
    public static void main(String[] args) {
        //Removing duplicate characters from string .

        String str = "sourabhvettam";
        int length = str.length();
        String out = "";
        for(int i = 0; i < length ; i++){
            int flag = 0;
            for(int j = i +1; j< length; j++){
                if(str.charAt(i) == str.charAt(j)){
                    flag = 1;
                    break;
                }
            }
            if ( flag == 0){
                out += str.charAt(i);
            }
        }
        System.out.println(out);

        }
}