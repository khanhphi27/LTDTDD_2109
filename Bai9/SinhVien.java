/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai9;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class SinhVien {
	// thuoc tinh
	protected String hoTen_109;
	protected String maSV;
	protected String ngaySinh;
	protected String lop;

	// phuong thuc
	// ham khoi tao khong doi so
	public SinhVien() {

	}

	// ham khoi tao co doi so
	public SinhVien(String hoTen_109, String maSV, String ngaySinh, String lop) {
		this.hoTen_109 = hoTen_109;
		this.maSV = maSV;
		this.ngaySinh = ngaySinh;
		this.lop = lop;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen_109 = sc.nextLine();

		System.out.print("\tNhap ma sinh vien: ");
		maSV = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		ngaySinh = sc.nextLine();

		System.out.print("\tNhap lop: ");
		lop = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen_109);
		System.out.println("\tNgay sinh: " + ngaySinh);
		System.out.println("\tMa sinh vien: " + maSV);
		System.out.println("\tLop: " + lop);
	}
}
