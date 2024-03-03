package Bai2;

import java.util.Scanner;

public class SoPhuc {
	private double thuc;
	private double ao;

	public SoPhuc(double thuc, double ao) {
		this.thuc = thuc;
		this.ao = ao;
	}

	public SoPhuc() {
		thuc = 0;
		ao = 0;

	}

	public double getThuc() {
		return thuc;
	}

	public void setThuc(double thuc) {
		this.thuc = thuc;
	}

	public double getAo() {
		return ao;
	}

	public void setAo(double ao) {
		this.ao = ao;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập phần thực: ");
		thuc = sc.nextDouble();
		System.out.println("Nhập phần ảo: ");
		ao = sc.nextDouble();
	}

	public void xuat() {
		if (ao < 0) {
			System.out.println(thuc + "-" + Math.abs(ao) + "*i");
		} else {
			System.out.println(thuc + "+" + ao + "*i");
		}
	}

	public SoPhuc cong(SoPhuc sp2) {
		double phanThuc = thuc + sp2.thuc;
		double phanAO = ao + sp2.ao;
		return new SoPhuc(thuc,ao);
	}
	public SoPhuc tru(SoPhuc sp2) {
		double phanThan = thuc - sp2.thuc;
		double phanAo = ao - sp2.ao;
		return new SoPhuc(thuc, ao);
	}
}

