package Bai2;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SoPhuc sp1 = new SoPhuc();
		SoPhuc sp2 = new SoPhuc();
		System.out.println("Nhập số phức 1: ");
		sp1.nhap();
		System.out.println("Nhập số phức 2: ");
		sp2.nhap();
		System.out.println("Số phức 1 là: ");
		sp1.xuat();
		System.out.println("Số phức 2 là: ");
		sp2.xuat();
		sc.close();
		
	}
}
