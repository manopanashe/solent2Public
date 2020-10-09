package  org.gallenc.com504.ood;

import static org.junit.Assert.assertTrue;

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
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
     @Test
    public void mytest()
    {
        MyTestClassLog4j testclass=new MyTestClassLog4j();
        testclass.writeAboutMe();
    }
}
