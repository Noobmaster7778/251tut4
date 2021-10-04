package four;

import org.junit.jupiter.api.Test;

public class TestCalc {
    @Test
    public void test(){
        assert Calc.add(1,2)==3;
    }
    @Test
    public void test2(){
        assert Calc.subtract(1,2)==-1;
    }
}
