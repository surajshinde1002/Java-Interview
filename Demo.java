class Test{

    static{
        System.out.println("in static block.");
    }

    {
        System.out.println("IN instance block.");
    }
}

public class Demo {
    public static void main(String[] args) {
        Test test ;
        //Test test2 = new Test();
    }
}
