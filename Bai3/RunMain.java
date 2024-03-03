package Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class RunMain {
	public static Scanner sc = new Scanner(System.in);
	public static List<Phieu> thongTinPhieu = new ArrayList<Phieu>();

	public static void main(String[] args) {
		Phieu phieu = new Phieu();
		phieu.inputPhieu();
		thongTinPhieu.add(phieu);
		phieu.aoputPhieu();
		thongTinPhieu.add(phieu);
	}
	
}
