package hello;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyUnitTest {

    @Test
    public void testHello() {
        Greeter greetertest= new Greeter();

        String result = greetertest.sayHello();

        assertEquals("Hello world!", result);

    }

/* @Test
    public void wrongtestHello() {
        Greeter greetertest= new Greeter();

        String result = greetertest.sayHello();

        assertEquals("world!", result);

    }*/

}
