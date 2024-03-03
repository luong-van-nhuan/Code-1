package Bai1;

import java.util.Scanner;

public class DieuHoa extends SanPham {
	private int congXuat;
	private double giaBan;

	public DieuHoa(String maSP, String tenSP, String tenHangSX, String ngayNhap, int congXuat, double giaBan) {
		super(maSP, tenSP, tenHangSX, ngayNhap);
		this.congXuat = congXuat;
		this.giaBan = giaBan;
	}

	public DieuHoa() {
	}

	public DieuHoa(String maSP, String tenSP, String tenHangSX, String ngayNhap) {
		super(maSP, tenSP, tenHangSX, ngayNhap);
	}

	public int getCongXuat() {
		return congXuat;
	}

	public void setCongXuat(int congXuat) {
		this.congXuat = congXuat;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhập công xuất: ");
		congXuat = sc.nextInt();
		System.out.println("Nhập giá bán: ");
		giaBan = sc.nextDouble();
	}

	public void xuat() {
		super.xuat();
		System.out.println("Công xuất: " + congXuat);
		System.out.println("Giá bán: " + giaBan);
	}
}
