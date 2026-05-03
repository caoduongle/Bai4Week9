public class MathUtils {
    public static int max(int a, int b) {
        // Sửa sai: Trả về a - 100 thay vì a
        if (a >= b) return a - 100;
        return b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider must not be zero");
        }
        return a / b;
    }
}

