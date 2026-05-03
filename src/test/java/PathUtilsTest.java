import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PathUtilsTest {
    @Test
    public void testGetWindowsTempFilePath() {
        String result = PathUtils.getWindowsTempFilePath("data.txt");
        // Test này sẽ PASS trên Windows, nhưng có thể gây rắc rối hoặc 
        // lỗi logic khi so sánh đường dẫn tuyệt đối trên Linux/Mac.
        assertEquals("C:\\temp\\data.txt", result);
    }
}