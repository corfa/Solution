import org.junit.Assert;
import org.junit.Test;

public class Test_solution {

    private final Solution solution = new Solution();

    private final int[] correct_mass = {65,89,9,-90,2,15,903,-1};

    private final int[] empty_mass = {};

    private final int[] same_mass = {1,1,1,1,1,1,1,1};


    @Test
    public void PositiveTest(){
        int result=solution.sum_of_min_val(correct_mass);
        Assert.assertEquals(-91,result);
    }

    @Test
    public void whenMassEmpty(){
        int result=solution.sum_of_min_val(empty_mass);
        Assert.assertEquals(0,result);
    }

    @Test
    public void whenSameVal(){
        int result=solution.sum_of_min_val(same_mass);
        Assert.assertEquals(0,result);
    }
}
