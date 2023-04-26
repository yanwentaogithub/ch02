import junit.framework.Assert;
import org.junit.Test;

public class TestHelloMaven {
    @Test
    public void testadd(){
        HelloMaven helloMaven = new HelloMaven();
        int res = helloMaven.add(10,20);
        Assert.assertEquals(30,res);


    }
}

