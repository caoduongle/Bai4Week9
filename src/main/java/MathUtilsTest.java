import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @BeforeAll
    public static void setUpAll() {
        System.out.println("=== Bắt đầu chạy MathUtilsTest ===");
    }

    @AfterAll
    public static void tearDownAll() {
        System.out.println("=== Kết thúc ===");
    }

    // --- Test hàm max() ---
    @Test public void testMax_EP_01() { assertEquals(5, MathUtils.max(5, 3)); }
    @Test public void testMax_EP_02() { assertEquals(5, MathUtils.max(5, 5)); }
    @Test public void testMax_EP_03() { assertEquals(5, MathUtils.max(3, 5)); }
    @Test public void testMax_BVA_01() { assertEquals(Integer.MAX_VALUE, MathUtils.max(Integer.MAX_VALUE, Integer.MAX_VALUE)); }
    @Test public void testMax_BVA_02() { assertEquals(Integer.MAX_VALUE, MathUtils.max(Integer.MAX_VALUE, 0)); }
    @Test public void testMax_BVA_03() { assertEquals(0, MathUtils.max(Integer.MIN_VALUE, 0)); }

    // --- Test hàm divide() ---
    @Test public void testDiv_EP_01() { assertEquals(5, MathUtils.divide(10, 2)); }
    @Test public void testDiv_EP_02() { assertEquals(-5, MathUtils.divide(10, -2)); }
    @Test public void testDiv_EP_03() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> MathUtils.divide(10, 0));
        assertEquals("Divider must not be zero", e.getMessage());
    }
}