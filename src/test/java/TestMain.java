import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class TestMain {

    Main app = new Main();

    @Test
    public void testApp()
    {
        assertEquals("Hello world", app.greet("world"));
    }

    @Test
    public void testTrue()
    {
        assertTrue( true );
    }
}
