# Bài 4: Kiểm thử đa hệ điều hành với Matrix Strategy

**1. Đường dẫn Repository:**
👉 [Dán link GitHub Bài 4 của bạn vào đây]

**2. Chiến lược Matrix (`ci.yml`):**
- Đã cấu hình `strategy.matrix.os` với 3 môi trường: `ubuntu-latest`, `windows-latest`, `macos-latest`.
- Sử dụng biến `matrix.os` trong `runs-on` và đặt tên file Artifact động.
- Đã xử lý lệnh gọi `./mvnw` và `./mvnw.cmd` tùy thuộc vào hệ điều hành (`$RUNNER_OS`).

**3. Phân tích lỗi và Refactor (Giải quyết "It works on my machine"):**
- **Vấn đề ban đầu:** Hardcode đường dẫn kiểu `C:\temp\data.txt` khiến test chạy bình thường trên Windows nhưng báo lỗi (hoặc sinh ra đường dẫn dị dạng) trên Ubuntu/Mac do sự khác biệt về ký tự phân tách (Separator).
- **Cách Refactor:**
  - Ở code chính: Sử dụng `java.nio.file.Paths.get("temp", fileName)` để Java tự động nội suy ký tự `/` hoặc `\` tùy vào HĐH đang chạy.
  - Ở code test: Sử dụng hằng số `File.separator` để tạo biến `expected` động.
- **Kết quả:** Workflow xanh toàn bộ trên cả 3 môi trường (Ubuntu, Windows, Mac).