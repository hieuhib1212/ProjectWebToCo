create database Tocotoco
drop database Tocotoco
go
use Tocotoco
go 
-- bang danh muc
create table DanhmucSanPham(
MaDanhmuc int identity(1,1) primary key, 
TenDanhMuc nvarchar(50))
SET IDENTITY_INSERT DanhmucSanPham ON
insert into DanhmucSanPham(MaDanhmuc, TenDanhMuc) values(1, N'Trà Sữa')
insert into DanhmucSanPham(MaDanhmuc, TenDanhMuc) values(2, N'Trà Trái Cây')
insert into DanhmucSanPham(MaDanhmuc, TenDanhMuc) values(3, N'Đồ uống đặc biệt')
SET IDENTITY_INSERT DanhmucSanPham OFF
--Bang san pham
create table SanPham(
MaSanPham int identity(1, 1) primary key,
MaDanhMuc int foreign key references DanhmucSanPham(MaDanhMuc),
TenSanPham nvarchar(50),
Size nvarchar(20),
ImgUrl nvarchar(2000), 
Gia float)
-- nhap san pham
SET IDENTITY_INSERT SanPham Off
insert into SanPham(MaDanhMuc, TenSanPham, Size, ImgUrl, Gia) values(2, N'Trà Dâu Tằm', 'M', 'assets\images\tradautam.jpg', 20000)
insert into SanPham(MaDanhMuc, TenSanPham, Size, ImgUrl, Gia) values(2, N'Trà Dâu Tằm', 'B', 'assets\images\tradautam.jpg', 35000)
insert into SanPham(MaDanhMuc, TenSanPham, Size, ImgUrl, Gia) values(1, N'Matcha đậu đỏ', 'M', 'assets\images\matchadaudo.jpg', 25000)
insert into SanPham(MaDanhMuc, TenSanPham, Size, ImgUrl, Gia) values(1, N'Matcha đậu đỏ', 'B', 'assets\images\matchadaudo.jpg', 35000)
insert into SanPham(MaDanhMuc, TenSanPham, Size, ImgUrl, Gia) values(3, N'Hồng long bách ngọc', 'M', 'assets\images\honglongbachngoc.jpg', 35000)
insert into SanPham(MaDanhMuc, TenSanPham, Size, ImgUrl, Gia) values(3, N'Hồng long bách ngọc', 'B', 'assets\images\honglongbachngoc.jpg', 40000)
insert into SanPham(MaDanhMuc, TenSanPham, Size, ImgUrl, Gia) values(3, N'Hồng long pha tuyết', 'M', 'assets\images\honglongphatuyet.jpg', 35000)
insert into SanPham(MaDanhMuc, TenSanPham, Size, ImgUrl, Gia) values(3, N'Hồng long pha tuyết', 'B', 'assets\images\honglongphatuyet.jpg', 40000)
insert into SanPham(MaDanhMuc, TenSanPham, Size, ImgUrl, Gia) values(2, N'Hồng trà', 'M', 'assets\images\hongtra.jpg', 20000)
insert into SanPham(MaDanhMuc, TenSanPham, Size, ImgUrl, Gia) values(2, N'Hồng trà', 'B', 'assets\images\hongtra.jpg', 25000)
insert into SanPham(MaDanhMuc, TenSanPham, Size, ImgUrl, Gia) values(1, N'Trà sữa hoàng gia', 'M', 'assets\images\trasuahoanggia.jpg', 40000)
insert into SanPham(MaDanhMuc, TenSanPham, Size, ImgUrl, Gia) values(1, N'Trà sữa hoàng gia', 'B', 'assets\images\trasuahoanggia.jpg', 50000)
insert into SanPham(MaDanhMuc, TenSanPham, Size, ImgUrl, Gia) values(2, N'Trà xanh chanh leo', 'M', 'assets\images\traxanhchanhleo.jpg', 20000)
insert into SanPham(MaDanhMuc, TenSanPham, Size, ImgUrl, Gia) values(2, N'Trà xanh chanh leo', 'B', 'assets\images\traxanhchanhleo.jpg', 25000)
insert into SanPham(MaDanhMuc, TenSanPham, Size, ImgUrl, Gia) values(1, N'Trà sữa kem tươi', 'B', 'assets\images\Cream.jpg', 15000)
insert into SanPham(MaDanhMuc, TenSanPham, Size, ImgUrl, Gia) values(1, N'Trà sữa kem tươi', 'B', 'assets\images\Cream.jpg', 20000)
-- user
create table NguoiDung(
UserID int identity(1, 1) primary key,
TaiKhoan nvarchar(50) not null,
MatKhau nvarchar(50) not null,
Hoten nvarchar(50) not null,
GioiTinh bit,
NgaySinh Datetime,
DiaChi nvarchar(50) not null,
Sdt nvarchar(20) not null
CONSTRAINT UC_NguoiDung UNIQUE (TaiKhoan,Sdt)
)
--NhomQuyen int not null)
insert into NguoiDung(TaiKhoan, MatKhau, Hoten, GioiTinh, NgaySinh, DiaChi, Sdt) values('hieubm12', '123456', N'Bùi Minh Hiệu', 1, '2000-1-12', N'Hải Phòng', '099324343')
insert into NguoiDung(TaiKhoan, MatKhau, Hoten, GioiTinh, NgaySinh, DiaChi, Sdt) values('TheAnh12', '123456', 'Nguyễn Thế Anh', 1, '2000-4-22', N'Thái Nguyên', '0984326459')
insert into NguoiDung(TaiKhoan, MatKhau, Hoten, GioiTinh, NgaySinh, DiaChi, Sdt) values('TheAnh15', '123456', N'Nguyễn Thế Anh', 1, '2000-4-22', N'Thái Nguyên', '0984326459')

--admin
create table Admin(
TaiKhoan nvarchar(50) not null primary key,
MatKhau nvarchar(50) not null
)
select * from Admin
insert into Admin values('admin12', 'admin')
select * from Admin
--don hang
create table DonHang(
MaDonHang int identity(1, 1) primary key,
UserID int foreign key references NguoiDung(UserID),
NgayDatHang Datetime,
TaiKhoan nvarchar(50) foreign key references NguoiDung(TaiKhoan),
DiaChi nvarchar(50),
Sdt nvarchar(20),
SoLoaiSP int, 
TongTien float)
--don hang chi tiet
create table DonHangChiTiet(
TaiKhoan nvarchar(60) not null,
MaSanPham int foreign key references SanPham(MaSanPham),
TenSanPham nvarchar(60) not null,
Gia float not null,
SoLuongSP int not null,
active bit not null,
)

