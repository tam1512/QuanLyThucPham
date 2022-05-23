-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 22, 2022 lúc 06:59 AM
-- Phiên bản máy phục vụ: 10.4.22-MariaDB
-- Phiên bản PHP: 7.3.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `webbanhang`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitiethoadon`
--

CREATE TABLE `chitiethoadon` (
  `ID_HoaDon` int(11) NOT NULL,
  `ID_SanPham` int(11) NOT NULL,
  `DonGia` float NOT NULL,
  `SoLuong` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietkhuyenmai`
--

CREATE TABLE `chitietkhuyenmai` (
  `ID_KhuyenMai` int(11) NOT NULL,
  `ID_SanPham` int(11) NOT NULL,
  `PhanTramKM` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietphieunhap`
--

CREATE TABLE `chitietphieunhap` (
  `ID_PhieuNhap` int(11) NOT NULL,
  `ID_SanPham` int(11) NOT NULL,
  `SoLuong` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadon`
--

CREATE TABLE `hoadon` (
  `ID_HoaDon` int(11) NOT NULL,
  `ID_ThanhVien` int(11) NOT NULL,
  `ID_NhanVien` int(11) NOT NULL,
  `NgayThanhLap` datetime NOT NULL,
  `GhiChu` varchar(30) NOT NULL,
  `TongTien` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadontructuyen`
--

CREATE TABLE `hoadontructuyen` (
  `ID_HoaDon` int(11) NOT NULL,
  `ID_ThanhVien` int(11) NOT NULL,
  `ThoiGianLap` datetime NOT NULL,
  `DiaChi` varchar(30) NOT NULL,
  `GhiChu` varchar(30) NOT NULL,
  `GiaTien` float NOT NULL,
  `SoDienThoai` varchar(10) NOT NULL,
  `XuLy` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `hoadontructuyen`
--

INSERT INTO `hoadontructuyen` (`ID_HoaDon`, `ID_ThanhVien`, `ThoiGianLap`, `DiaChi`, `GhiChu`, `GiaTien`, `SoDienThoai`, `XuLy`) VALUES
(1, 1, '2022-05-20 08:14:16', 'Lâm Đồng', '', 35000, '0987776123', 1),
(2, 4, '2022-05-22 05:45:59', 'Quan 10', '', 60000, '0767772112', 1),
(3, 2, '2022-05-22 06:52:54', 'sdsd', '', 99000, '5345345', 1),
(4, 2, '2022-05-22 06:54:30', 'sdsd', '', 20000, '5345345', 0),
(5, 2, '2022-05-22 06:54:41', 'sdsd', '', 20000, '5345345', 0),
(6, 2, '2022-05-22 06:54:51', 'sdsd', '', 40000, '5345345', 0),
(7, 6, '2022-05-22 06:59:05', 'Quan 10', '', 2600000, '0767772112', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khuyenmai`
--

CREATE TABLE `khuyenmai` (
  `ID_KhuyenMai` int(11) NOT NULL,
  `TenCTKhuyenMai` varchar(100) NOT NULL,
  `ThoiGianBatDau` date NOT NULL,
  `ThoiGianKetThuc` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loai`
--

CREATE TABLE `loai` (
  `ID_Loai` int(11) NOT NULL,
  `TenLoai` varchar(20) NOT NULL,
  `Mota` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `loai`
--

INSERT INTO `loai` (`ID_Loai`, `TenLoai`, `Mota`) VALUES
(1000, 'Rau, Củ, Quả', 'Các loại rau, củ, quả được chọn lọc kĩ càng qua nhiều bước mang đến cho khách hàng những sản phẩm có'),
(2000, 'Thịt tươi', 'Cung cấp các loại vitamin cần thiết cho cơ thể'),
(3000, 'Trái cây', 'Các loại thịt tươi ngon được chọn lọc kĩ càng');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhacungcap`
--

CREATE TABLE `nhacungcap` (
  `ID_NCC` int(11) NOT NULL,
  `TenNCC` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `nhacungcap`
--

INSERT INTO `nhacungcap` (`ID_NCC`, `TenNCC`) VALUES
(100, 'Chi nhánh Lâm Đồng'),
(200, 'Chi Nhánh Đắk Lắk'),
(201, 'Chi nhánh ĐakNong'),
(202, 'Chi nhánh '),
(203, 'Chi nhánh ĐakNong123');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `ID_NhanVien` int(11) NOT NULL,
  `TenDangNhap` varchar(20) NOT NULL,
  `MatKhau` varchar(20) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `HoVaTen` varchar(30) NOT NULL,
  `DiaChi` varchar(30) NOT NULL,
  `SoDienThoai` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`ID_NhanVien`, `TenDangNhap`, `MatKhau`, `Email`, `HoVaTen`, `DiaChi`, `SoDienThoai`) VALUES
(1, 'nhanvien1', '123', 'quocbao2116@gmail.com', 'Nhan Vien Mot', 'Lâm Đồng', '0987776123');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieunhap`
--

CREATE TABLE `phieunhap` (
  `ID_PhieuNhap` int(11) NOT NULL,
  `ID_NCC` int(11) NOT NULL,
  `NgayNhap` date NOT NULL,
  `ID_NhanVien` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sanpham`
--

CREATE TABLE `sanpham` (
  `ID_SanPham` int(11) NOT NULL,
  `ID_Loai` int(11) NOT NULL,
  `ID_NhaCungCap` int(11) NOT NULL,
  `TenSanPham` varchar(100) NOT NULL,
  `MoTa` varchar(200) NOT NULL,
  `GiaBan` float NOT NULL,
  `SoLuong` float NOT NULL,
  `Img` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `sanpham`
--

INSERT INTO `sanpham` (`ID_SanPham`, `ID_Loai`, `ID_NhaCungCap`, `TenSanPham`, `MoTa`, `GiaBan`, `SoLuong`, `Img`) VALUES
(1001, 1000, 100, 'Cà Chua Đà Lạt', 'Cà chua Đà Lạt được chọn lọc kĩ càng từ nhà vườn', 15000, 7, 'cachua.png'),
(1002, 1000, 100, 'Cải Bẹ Đà Lạt', 'Cải được chọn lọc tại vườn với độ tươi ngon tốt nhất', 20000, 9, 'caibe.png'),
(1003, 1000, 100, 'Sú Tím Đà Lạt', '- Thực phẩm tốt cho sức khỏe</br>- Có thể chế biến thành nhiều món ăn</br>- Hương vị thơm ngon, kích', 50000, 10, 'bapcaitim.png'),
(1004, 1000, 100, 'Đậu Leo Đà Lạt', '- Dùng chế biến món ăn- Chứa nhiều chất dinh dưỡng cần thiết- An toàn chất lượng', 35000, 1000, 'daudua.png'),
(1005, 1000, 200, 'Cải Bẹ Đà Lạt', '- Được trồng trong môi trường sạch an toàn với người tiêu dùng- Dùng để nấu canh, xào hoặc có thể dù', 35500, 10, 'caibe.png'),
(1006, 1000, 100, 'Khổ qua Đà Lạt', '- Thực phẩm tốt cho sức khỏe\r\n- Có thể chế biến được thành nhiều món ăn\r\n- Sản phẩm được người tiêu ', 18000, 10, 'khoqua.png'),
(1007, 1000, 200, 'Cà chua Đà Lạt', '- Cung cấp đầy đủ vitamin và dưỡng chất cho cơ thể\r\n- Đạt tiêu chuẩn Vietgap\r\n- Liên hệ trực tiếp để', 18000, 10, 'cachua.png'),
(1008, 1000, 100, 'Bầu Phước An', '- Món ăn lý tưởng dành cho người muốn giảm cân- Chế biến được nhiều món ăn ngon miệng- Sản phẩm khôn', 20000, 10, 'bauphuocan.png'),
(2001, 2000, 100, 'Thịt đùi heo', '- Nguyên liệu tươi ngon, hợp vệ sinh\r\n- Cung cấp nhiều dinh dưỡng cho cơ thể\r\n- Chế biến được nhiều ', 180000, 10, 'Thitduiheo.png'),
(2002, 2000, 100, 'Thịt heo say', '-Nguyên liệu tươi ngon, hợp vệ sinh</br>Cung cấp nhiều dinh dưỡng cho cơ thể</br>Chế biến được nhiều', 150000, 10, 'thitheosay.png'),
(2013, 2000, 100, 'Thịt Bò', 'ngon', 450000, 10, 'thitbo.png'),
(2014, 2000, 100, 'Thịt Bò', 'ád', 400000, 10, 'thitbo.png'),
(3001, 3000, 100, 'CHuối', 'Chuối Đà Lạt tươi ngon mang đến chất lượng tốt nhất', 18000, 10, 'chuoi.png'),
(3002, 3000, 200, 'Vải thiều', 'Vải thiều được chắt lọc kĩ càng qua nhiều giai đoạn để mang đến hương vị tươi ngon nhất cho khách hàng', 16000, 10, 'vaithieu.png');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `thanhvien`
--

CREATE TABLE `thanhvien` (
  `ID_ThanhVien` int(11) NOT NULL,
  `TenDangNhap` varchar(20) NOT NULL,
  `MatKhau` varchar(20) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `HoVaTen` varchar(30) NOT NULL,
  `DiaChi` varchar(30) NOT NULL,
  `SoDienThoai` varchar(10) NOT NULL,
  `NgayDangKi` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `thanhvien`
--

INSERT INTO `thanhvien` (`ID_ThanhVien`, `TenDangNhap`, `MatKhau`, `Email`, `HoVaTen`, `DiaChi`, `SoDienThoai`, `NgayDangKi`) VALUES
(1, 'b1231121', '123', 'lamdong49@gmail.com', '123', '123', '0987776123', '2022-05-05'),
(2, 'thanhvien1', '123', 'sdfsdfdf@ggg', 'thanhvien1', 'sdsd', '5345345', '2022-05-09'),
(4, 'thanhvien0', '123', 'quocbao2116@gmail.co', 'Nguyễn Hà Quốc Bảopppp', 'Quan 10', '0767772112', '2022-05-22'),
(5, 'thanhvien1', '1231121', 'huyae01833@gmail.com', 'Nguyễn Hà Quốc Bảo', 'Quan 10', '0767772112', '2022-05-22'),
(6, 'quansoiiuphuonglinh', '123', 'hieu110022@yahoo.com', 'Nguyễn Hà Quốc Bảo', 'Quan 10', '0767772112', '2022-05-22');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  ADD PRIMARY KEY (`ID_HoaDon`,`ID_SanPham`),
  ADD KEY `FK_SANPHAM_CTHOADON` (`ID_SanPham`);

--
-- Chỉ mục cho bảng `chitietkhuyenmai`
--
ALTER TABLE `chitietkhuyenmai`
  ADD PRIMARY KEY (`ID_KhuyenMai`,`ID_SanPham`),
  ADD KEY `FK_IDSANPHAM_CTKHUYENMAI` (`ID_SanPham`);

--
-- Chỉ mục cho bảng `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD PRIMARY KEY (`ID_PhieuNhap`,`ID_SanPham`),
  ADD KEY `FK_SANPHAM_CTPHIEUNHAP` (`ID_SanPham`);

--
-- Chỉ mục cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`ID_HoaDon`),
  ADD KEY `FK_THANHVIEN_HOADON` (`ID_ThanhVien`),
  ADD KEY `FK_NHANVIEN_HOADON` (`ID_NhanVien`);

--
-- Chỉ mục cho bảng `hoadontructuyen`
--
ALTER TABLE `hoadontructuyen`
  ADD PRIMARY KEY (`ID_HoaDon`),
  ADD KEY `FK_THANHVIEN_HOADONTRUCTUYEN` (`ID_ThanhVien`);

--
-- Chỉ mục cho bảng `khuyenmai`
--
ALTER TABLE `khuyenmai`
  ADD PRIMARY KEY (`ID_KhuyenMai`);

--
-- Chỉ mục cho bảng `loai`
--
ALTER TABLE `loai`
  ADD PRIMARY KEY (`ID_Loai`);

--
-- Chỉ mục cho bảng `nhacungcap`
--
ALTER TABLE `nhacungcap`
  ADD PRIMARY KEY (`ID_NCC`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`ID_NhanVien`);

--
-- Chỉ mục cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD PRIMARY KEY (`ID_PhieuNhap`),
  ADD KEY `FK_IDNCC_PHIEUNHAP` (`ID_NCC`);

--
-- Chỉ mục cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`ID_SanPham`),
  ADD KEY `FK_IDNCC_SANPHAM` (`ID_NhaCungCap`),
  ADD KEY `FK_IDLOAI_SANPHAM` (`ID_Loai`);

--
-- Chỉ mục cho bảng `thanhvien`
--
ALTER TABLE `thanhvien`
  ADD PRIMARY KEY (`ID_ThanhVien`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  MODIFY `ID_HoaDon` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `hoadontructuyen`
--
ALTER TABLE `hoadontructuyen`
  MODIFY `ID_HoaDon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT cho bảng `khuyenmai`
--
ALTER TABLE `khuyenmai`
  MODIFY `ID_KhuyenMai` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `loai`
--
ALTER TABLE `loai`
  MODIFY `ID_Loai` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3003;

--
-- AUTO_INCREMENT cho bảng `nhacungcap`
--
ALTER TABLE `nhacungcap`
  MODIFY `ID_NCC` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=204;

--
-- AUTO_INCREMENT cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `ID_NhanVien` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  MODIFY `ID_PhieuNhap` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  MODIFY `ID_SanPham` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3003;

--
-- AUTO_INCREMENT cho bảng `thanhvien`
--
ALTER TABLE `thanhvien`
  MODIFY `ID_ThanhVien` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  ADD CONSTRAINT `FK_HOADON_CTHOADON` FOREIGN KEY (`ID_HoaDon`) REFERENCES `hoadon` (`ID_HoaDon`),
  ADD CONSTRAINT `FK_SANPHAM_CTHOADON` FOREIGN KEY (`ID_SanPham`) REFERENCES `sanpham` (`ID_SanPham`);

--
-- Các ràng buộc cho bảng `chitietkhuyenmai`
--
ALTER TABLE `chitietkhuyenmai`
  ADD CONSTRAINT `FK_IDKHUYENMAI_CTKHUYENMAI` FOREIGN KEY (`ID_KhuyenMai`) REFERENCES `khuyenmai` (`ID_KhuyenMai`),
  ADD CONSTRAINT `FK_IDSANPHAM_CTKHUYENMAI` FOREIGN KEY (`ID_SanPham`) REFERENCES `sanpham` (`ID_SanPham`);

--
-- Các ràng buộc cho bảng `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD CONSTRAINT `FK_IDPHIEUNHAP_CTPHIEUNHAP` FOREIGN KEY (`ID_PhieuNhap`) REFERENCES `phieunhap` (`ID_PhieuNhap`),
  ADD CONSTRAINT `FK_SANPHAM_CTPHIEUNHAP` FOREIGN KEY (`ID_SanPham`) REFERENCES `sanpham` (`ID_SanPham`);

--
-- Các ràng buộc cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD CONSTRAINT `FK_NHANVIEN_HOADON` FOREIGN KEY (`ID_NhanVien`) REFERENCES `nhanvien` (`ID_NhanVien`),
  ADD CONSTRAINT `FK_THANHVIEN_HOADON` FOREIGN KEY (`ID_ThanhVien`) REFERENCES `thanhvien` (`ID_ThanhVien`);

--
-- Các ràng buộc cho bảng `hoadontructuyen`
--
ALTER TABLE `hoadontructuyen`
  ADD CONSTRAINT `FK_THANHVIEN_HOADONTRUCTUYEN` FOREIGN KEY (`ID_ThanhVien`) REFERENCES `thanhvien` (`ID_ThanhVien`);

--
-- Các ràng buộc cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD CONSTRAINT `FK_IDNCC_PHIEUNHAP` FOREIGN KEY (`ID_NCC`) REFERENCES `nhacungcap` (`ID_NCC`);

--
-- Các ràng buộc cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD CONSTRAINT `FK_IDLOAI_SANPHAM` FOREIGN KEY (`ID_Loai`) REFERENCES `loai` (`ID_Loai`),
  ADD CONSTRAINT `FK_IDNCC_SANPHAM` FOREIGN KEY (`ID_NhaCungCap`) REFERENCES `nhacungcap` (`ID_NCC`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
