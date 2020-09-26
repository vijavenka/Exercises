import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DProvider {

    @Test(dataProvider = "data-provider")
    public void sum(int a, int b, int sum){
        Assert.assertEquals(sum,a+b);
    }

    @Test(dataProvider = "data-provider")
    public void difference(int a, int b, int sum){
        Assert.assertEquals(sum,a-b);
    }

    @DataProvider(name="data-provider")
    public Object[][] data(Method m){
        switch (m.getName()){
            case "sum":
                return new Object[][]{{2,3,5},{5,3,8}};
            case "difference":
                return new Object[][]{{3,2,1},{8,3,5}};
            default:
                System.out.println("Invalid method");
        }
        return null;
    }
}
