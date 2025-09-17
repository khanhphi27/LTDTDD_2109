/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Sach extends TaiLieu {
	// thuoc tinh
	private String tacGia_109;
	private int soTrang;

	// phuong thuc
	// ham khoi tao khong doi so
	public Sach() {

	}

	// ham khoi tao co doi so
	public Sach(String maTaiLieu, String tenNXB, int soBanPhatHanh, String tacGia_109, int soTrang) {
		super(maTaiLieu, tenNXB, soBanPhatHanh);
		this.tacGia_109 = tacGia_109;
		this.soTrang = soTrang;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap tac gia: ");
		tacGia_109 = sc.nextLine();
		System.out.print("\tNhap so trang: ");
		soTrang = sc.nextInt();
		sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\ttac gia: " + tacGia_109);
		System.out.println("\tSo trang: " + soTrang);
	}
}
