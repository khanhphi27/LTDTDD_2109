/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai8;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	// thuoc tinh
	private ArrayList<CBGV> ds_109;

	// phuong thuc
	// ham khoi tao
	public QuanLy() {
		ds_109 = new ArrayList<CBGV>(10);
	}

	// ham them can bo vao danh sach
	public void themCBGV(CBGV canBo) {
		ds_109.add(canBo);
	}

	// ham nhap vao danh sach
	public void nhapDanhSach(Scanner sc) {
		CBGV canBo;

		System.out.print("Nhap vao so luong can bo: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao danh sach:");
		for (int i = 0; i < n; i++) {
			System.out.println("Can bo thu " + (i + 1) + " la:");
			canBo = new CBGV();
			canBo.nhapThongTin(sc);
			themCBGV(canBo);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSach() {
		for (CBGV cb : ds_109) {
			cb.hienThiThongTin();
		}
	}

	// ham tim kiem
	public void timKiem(double luong) {
		for (CBGV cb : ds_109) {
			if (cb.getLuongThucLinh() >= luong) {
				cb.hienThiThongTin();
			}
		}
	}
}
