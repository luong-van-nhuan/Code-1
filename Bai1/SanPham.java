package Bai1;

import java.util.Scanner;

public class SanPham {
	protected String maSP;
	protected String tenSP;
	protected String tenHangSX;
	protected String ngayNhap;

	public SanPham(String maSP, String tenSP, String tenHangSX, String ngayNhap) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.tenHangSX = tenHangSX;
		this.ngayNhap = ngayNhap;
	}

	public SanPham() {

	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public String getTenHangSX() {
		return tenHangSX;
	}

	public void setTenHangSX(String tenHangSX) {
		this.tenHangSX = tenHangSX;
	}

	public String getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm: ");
        maSP = sc.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        tenSP = sc.nextLine();
        System.out.println("Nhập tên hãng sản xuất: ");
        tenHangSX = sc.nextLine();
        System.out.println("Nhập ngày nhập: ");
        ngayNhap = sc.nextLine();
	}
	public void xuat() {
        System.out.println("Mã sản phẩm: " + maSP);
        System.out.println("Tên sản phẩm: " + tenSP);
        System.out.println("Tên hãng sản xuất: " + tenHangSX);
        System.out.println("Ngày nhập: " + ngayNhap);
	}
}
