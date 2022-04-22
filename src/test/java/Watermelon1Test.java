import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Watermelon1Test {
    @Test
    public void TestNum8()
    {
        assertEquals("YES",Watermelon1.Divided2(8));
    }
    @Test
    public void TestNum3()
    {
        assertEquals("NO",Watermelon1.Divided2(3));
    }
    @Test
    public void TestNum2()
    {
        assertEquals("NO",Watermelon1.Divided2(2));
    }
}