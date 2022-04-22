import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Physicist2Test {
    @Test
    public void TestPositiveNums()
    {
        int ex [][] = {{4,32,5},{6,34,98},{8,21,3}};
        assertEquals("NO", Physicist2.isEquilibrium(ex));
    }
    @Test
    public void TestNegativeNums()
    {
        int ex [][] = {{-4,-32,-5},{-6,-34,-98},{-8,-21,-3}};
        assertEquals("NO", Physicist2.isEquilibrium(ex));
    }
    @Test
    public void TestZeros()
    {
        int ex [][] = {{0,0,0},{0,0,0},{0,0,0}};
        assertEquals("YES", Physicist2.isEquilibrium(ex));
    }
    @Test
    public void TestX(){
        int forces[][] = {{-1, 3, 12}, {2, 4, -1}, {-1, -3, 2}};
        assertEquals("NO", Physicist2.isEquilibrium(forces));
    }

    @Test
    public void TestY(){
        int forces[][] = {{23, -1, 12}, {-55, 2, -1}, {2, -1, 2}, {-8, 2, -1}, {2, -2, 2}
        };
        assertEquals("NO", Physicist2.isEquilibrium(forces));
    }

    @Test
    public void TestZ(){
        int forces[][] = {{5, 4, -10}, {3, 12, 2}, {42, 99, 8}};
        assertEquals("NO", Physicist2.isEquilibrium(forces));
    }

    @Test
    public void TestAll(){
        int forces[][] = {{22, 12, -4}, {-10, -6, 8}, {-12, -6, -4}};
        assertEquals("YES", Physicist2.isEquilibrium(forces));
    }
}