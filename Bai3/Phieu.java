package Bai3;

import java.util.Scanner;

public class Phieu {
	private String maPhieu;
	private String tenPhieu;
	private DateTime a;
	private SanPham[] x;
	private int n;

	public Phieu(String maPhieu, String tenPhieu, DateTime a, SanPham[] x, int n) {
		this.maPhieu = maPhieu;
		this.tenPhieu = tenPhieu;
		this.a = a;
		this.x = x;
		this.n = n;
	}

	public Phieu() {
	}

	public String getMaPhieu() {
		return maPhieu;
	}

	public void setMaPhieu(String maPhieu) {
		this.maPhieu = maPhieu;
	}

	public String getTenPhieu() {
		return tenPhieu;
	}

	public void setTenPhieu(String tenPhieu) {
		this.tenPhieu = tenPhieu;
	}

	public DateTime getA() {
		return a;
	}

	public void setA(DateTime a) {
		this.a = a;
	}

	public SanPham[] getX() {
		return x;
	}

	public void setX(SanPham[] x) {
		this.x = x;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void inputPhieu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã phiếu: ");
		maPhieu = sc.nextLine();
		System.out.println("Nhập tên phiếu: ");
		tenPhieu = sc.nextLine();
		a = new DateTime();
		a.inputDate();
		System.out.println("Nhập số lượng sản phẩm: ");
		n = sc.nextInt();
		x = new SanPham[n];
		for (int i = 0; i < n; i++) {
			SanPham sanPham = new SanPham();
			x[i] = new SanPham();
			x[i].inputSP();
		}

	}

	public void aoputPhieu() {
		System.out.println("Thông tin phiếu");
		System.out.println("Mã phiếu: " + maPhieu);
		System.out.println("Tên phiếu: " + tenPhieu);
		a.ouputDate();
		for (int i = 0; i < n; i++) {
			System.out.println("Thông tin sản phẩm thứ " + (i + 1));
			x[i].aoputSP();
		}

	}
}
