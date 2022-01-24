package t1;

public class Main {

    public static void main(String[] arg){
    TestVarArgs testVarArgs = new TestVarArgs();
        int sum0 = testVarArgs.calcParams();
        System.out.println(sum0);
        int sum15 = testVarArgs.calcParams(1,2,3,4,5);
        System.out.println(sum15);
    }
}
