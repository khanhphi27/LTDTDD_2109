/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
	// thuoc tinh
	private ArrayList<CanBo> dscb_109;

	// phuong thuc
	// ham khoi tao
	public QLCB() {
		dscb_109 = new ArrayList<CanBo>(10);
	}

	// ham them can bo
	public void themCanBo(CanBo cb) {
		dscb_109.add(cb);
	}

	// ham nhap danh sach
	public void nhapDanhSach(Scanner sc) {
		CanBo cb;
		System.out.print("Nhap vao so luong can bo: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap thong tin chi tiet:");
		for (int i = 0; i < n; i++) {
			System.out.println("Lan nhap thu " + (i + 1) + ":");
			System.out.print("Chon can bo (1-KySu; 2-NhanVien;3-CongNhan): ");
			int chon = sc.nextInt();
			sc.nextLine();

			cb = new CanBo();

			switch (chon) {
			case 1:
				cb = new KySu();
				break;
			case 2:
				cb = new NhanVien();
				break;
			case 3:
				cb = new CongNhan();
				break;

			default:
				cb = new KySu();
				break;
			}

			// sau khi chon loai can bo thi nhap thong tin cho can bo do
			cb.nhapThongTin(sc);

			// nhap xong roi thi them can bo vao danh sach
			themCanBo(cb);
		}
	}

	// ham tim kiem theo ten
	public void timKiemCanBo(String hoTen) {
		for (CanBo cb : dscb_109) {
			if (hoTen.equals(cb.getHoTen())) {
				cb.hienThiThongTin();
			}
		}
	}
}
