public class TestVarArgs {
    public int calcParams(int... pars){
        int res = 0;
        for(int x : pars){
            res+=x;
        }
        return res;
    }
}
