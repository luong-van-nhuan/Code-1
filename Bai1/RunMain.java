package Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<DieuHoa> sanphamList = new ArrayList<>();
		System.out.println("Nhập số lượng điều hòa: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			DieuHoa dieuHoa = new DieuHoa();
			dieuHoa.nhap();
			sanphamList.add(dieuHoa);
		}
		Collections.sort(sanphamList, new Comparator<DieuHoa>() {

			@Override
			public int compare(DieuHoa o1, DieuHoa o2) {
				return (int) (o1.getGiaBan() - o2.getGiaBan());
			}
		});
		System.out.println("Danh sách điều hòa theo giá bán thấp nhất: ");
		for (DieuHoa dieuHoa : sanphamList) {
			if (dieuHoa.getTenHangSX().equals("Electrolux")) {
				dieuHoa.xuat();
			}
		}
	}
}
