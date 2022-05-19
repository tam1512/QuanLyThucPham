create table SANPHAM(
	ID_SanPham int not null,
	ID_Loai int not null,
	ID_NhaCungCap int not null,
	TenSanPham varchar(30) not null,
	Email varchar(30) not null,
	MoTa varchar(100) not null,
	GiaBan float not null,
	SoLuong float not null,
	Img varchar(10) not null
);


create table THANHVIEN(
	ID_ThanhVien int not null,
	TenDangNhap varchar(20) not null,
	MatKhau varchar(20) not null,
	Email varchar(20) not null,
	HoVaTen varchar(30) not null,
	DiaChi varchar(30) not null,
	SoDienThoai varchar(10) not null,
	NgayDangKi date not null
);

create table NHANVIEN(
	ID_NhanVien int not null,
	TenDangNhap varchar(20) not null,
	MatKhau varchar(20) not null,
	Email varchar(20) not null,
	HoVaTen varchar(30) not null,
	DiaChi varchar(30) not null,
	SoDienThoai varchar(10) not null
);

create table	HOADON(
	ID_HoaDon int not null,
	ID_ThanhVien int not null,
	ID_NhanVien int not null,
	NgayThanhLap datetime not null,
	GhiChu varchar(30) not null,
	TongTien float not null
);

create table CHITIETHOADON(
	ID_HoaDon int not null,
	ID_SanPham int not null,
	DonGia float not null,
	SoLuong int not null
);

create table NHACUNGCAP(
	ID_NCC int not null,
	TenNCC varchar(20) not null
);

create table LOAI(
	ID_Loai int not null,
	TenLoai varchar(20) not null,
	Mota varchar(100) not null
);
create table PHIEUNHAP(
	ID_PhieuNhap int not null,
	ID_NCC int not null,
	NgayNhap date not null,
	ID_NhanVien int not null
);
create table CHITIETPHIEUNHAP(
	ID_PhieuNhap int not null,
	ID_SanPham int not null,
	SoLuong int not null
);
create table KHUYENMAI(
	ID_KhuyenMai int not null,
	TenCTKhuyenMai varchar(100) not null,
	ThoiGianBatDau date not null,
	ThoiGianKetThuc date not null
);
create table CHITIETKHUYENMAI(
	ID_KhuyenMai int not null,
	ID_SanPham int not null,
	PhanTramKM float not null
);

alter table SANPHAM add constraint PK_SANPHAM primary key (ID_SanPham);
alter table THANHVIEN add constraint PK_THANHVIEN primary key (ID_ThanhVien);
alter table NHANVIEN add constraint PK_NHANVIEN primary key (ID_NhanVien);
alter table HOADON add constraint PK_HOADON primary key (ID_HoaDon);
alter table NHACUNGCAP add constraint PK_NCC primary key (ID_NCC);
alter table LOAI add constraint PK_LOAI primary key (ID_Loai);
alter table PHIEUNHAP add constraint PK_PHIEUNHAP primary key (ID_PhieuNhap);
alter table KHUYENMAI add constraint PK_KHUYENMAI primary key (ID_KhuyenMai);


alter table CHITIETHOADON add constraint PK_CHITIETHOADON primary key (ID_HoaDon,ID_SanPham);
alter table CHITIETPHIEUNHAP add constraint PK_CHITIETPHIEUNHAP primary key (ID_PhieuNhap,ID_SanPham);
alter table CHITIETKHUYENMAI add constraint PK_CHITIETKHUYENMAI primary key (ID_KhuyenMai,ID_SanPham);


alter table HOADON add constraint FK_THANHVIEN_HOADON foreign key (ID_ThanhVien) references THANHVIEN(ID_ThanhVien);
alter table HOADON add constraint FK_NHANVIEN_HOADON foreign key (ID_NhanVien) references NHANVIEN(ID_NhanVien);

alter table CHITIETHOADON add constraint FK_SANPHAM_CTHOADON foreign key (ID_SanPham) references SanPham(ID_SanPham);
alter table CHITIETHOADON add constraint FK_HOADON_CTHOADON foreign key (ID_HoaDon) references HOADON(ID_HoaDon);

alter table SANPHAM add constraint FK_IDNCC_SANPHAM foreign key (ID_NhaCungCap) references NHACUNGCAP(ID_NCC);
alter table SANPHAM add constraint FK_IDLOAI_SANPHAM foreign key (ID_Loai) references Loai(ID_Loai);

alter table PHIEUNHAP add constraint FK_IDNCC_PHIEUNHAP foreign key (ID_NCC) references NHACUNGCAP(ID_NCC);

alter table CHITIETPHIEUNHAP add constraint FK_IDPHIEUNHAP_CTPHIEUNHAP foreign key (ID_PhieuNhap) references PHIEUNHAP(ID_PhieuNhap);
alter table CHITIETPHIEUNHAP add constraint FK_SANPHAM_CTPHIEUNHAP foreign key (ID_SanPham) references SANPHAM(ID_SANPHAM);

alter table CHITIETKHUYENMAI add constraint FK_IDKHUYENMAI_CTKHUYENMAI foreign key (ID_KhuyenMai) references KHUYENMAI(ID_KhuyenMai);

alter table CHITIETKHUYENMAI add constraint FK_IDSANPHAM_CTKHUYENMAI foreign key (ID_SanPham) references SANPHAM(ID_SanPham);









