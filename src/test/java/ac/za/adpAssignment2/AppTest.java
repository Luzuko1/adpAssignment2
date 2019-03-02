package ac.za.adpAssignment2;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */




    @Test
    public void add()
    {
       AddClass cal = new AddClass();
       // Assert.assertEquals(8,cal.add(4,4));
        int result = cal.add(10,20);
        Assert.assertEquals("Add 2+3", 30, result);
    }

    @Test
    public void subtract()

    {
        AddClass cal1 = new AddClass();
        Assert.assertEquals(6,cal1.subtract(10,4));
    }

    @Test
    public void multiply()
    {
        AddClass cal2 = new AddClass();
        Assert.assertEquals(15,cal2.multiply(5,3));
    }


}
