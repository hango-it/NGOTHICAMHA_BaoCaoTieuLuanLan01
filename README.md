# NGOTHICAMHA_BaoCaoTieuLuanLan01
# Bảo mật dữ liệu IoT từ thiết bị đến Cloud

## Thông tin đề tài

- **Tên đề tài:** Bảo mật dữ liệu IoT từ thiết bị đến Cloud
- **Sinh viên:** Ngô Thị Cẩm Hà
- **Trường:** Đại học Văn Hiến
- **Chuyên ngành:** An toàn mạng máy tính

---

## Mục tiêu

Đề tài mô phỏng quá trình bảo vệ dữ liệu IoT trước khi gửi lên Cloud bằng các kỹ thuật bảo mật cơ bản như:

- Mã hóa dữ liệu bằng AES
- Băm dữ liệu bằng SHA-256
- Sinh Token xác thực thiết bị
- Mô phỏng dữ liệu cảm biến IoT dưới dạng JSON

---

## Công nghệ sử dụng

- Java
- Apache NetBeans
- GitHub

---

## Cấu trúc Project

```
IoTServer
│
├── SensorData.java
├── AESUtil.java
├── HashUtil.java
├── TokenUtil.java
├── ServerMain.java
├── IoTClient.java
└── IoTServer.java
```

---

## Chức năng

- Tạo dữ liệu cảm biến IoT
- Chuyển dữ liệu sang định dạng JSON
- Mã hóa dữ liệu bằng AES
- Băm dữ liệu bằng SHA-256
- Sinh Token xác thực thiết bị
- Minh họa quy trình bảo vệ dữ liệu trước khi gửi lên Cloud

---

## Minh họa dữ liệu

Ví dụ dữ liệu cảm biến:

```json
{
  "temperature": 29.8,
  "location": "TP.HCM",
  "timestamp": "2026-07-17T20:34:53"
}
```

Sau khi xử lý:

- SHA-256 ✔
- AES Encryption ✔
- Device Token ✔

---

## Kết quả

Project mô phỏng thành công quá trình bảo vệ dữ liệu IoT từ thiết bị trước khi truyền lên hệ thống Cloud bằng các kỹ thuật mã hóa và xác thực cơ bản.

---

## Tài liệu tham khảo

- MbedTLS: https://github.com/Mbed-TLS/mbedtls
- OWASP IoT Security Verification Standard: https://github.com/OWASP/IoT-Security-Verification-Standard-ISVS
- Flask: https://github.com/pallets/flask