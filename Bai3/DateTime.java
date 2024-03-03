package Bai3;

import java.util.Scanner;

public class DateTime {
    private int ngay;
    private int thang;
    private int nam;

    public DateTime(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public DateTime() {

    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void inputDate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày: ");
        ngay = sc.nextInt();
        System.out.println("Nhập tháng: ");
        thang = sc.nextInt();
        System.out.println("Nhập năm: ");
        nam = sc.nextInt();
        sc.nextLine();
    }
    public void ouputDate(){
        System.out.println("Ngày: " + ngay);
        System.out.println("Tháng: " + thang);
        System.out.println("Năm: " + nam);
    }
}
