package Bai3;

import java.util.Scanner;

public class SanPham {
    private String maSP;
    private String tenSP;
    private int soLuong;
    private double donGia;

    public SanPham(String maSP, String tenSP, int soLuong, double donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void inputSP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm: ");
        maSP = sc.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        tenSP = sc.nextLine();
        System.out.println("Nhập số lượng sản phẩm: ");
        soLuong = sc.nextInt();
        System.out.println("Nhập đơn giá: ");
        donGia = sc.nextDouble();


    }
    public double thanhTien() {
    	return soLuong * donGia;
    }

    public void aoputSP() {
        System.out.println("Mã sản phầm: " + maSP);
        System.out.println("Tên sản phẩm: " + tenSP);
        System.out.println("Số lượng sản phẩm: " + soLuong);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Thành tiền: " + thanhTien());
    }
}








