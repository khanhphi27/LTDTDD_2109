/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai10;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class KhachHang {
	// Thuoc tinh
	protected String tenChuHo;
	protected int soNha_109;
	protected String maCongTo;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public KhachHang() {

	}

	// Ham khoi tao co doi so
	public KhachHang(String tenChuHo, int soNha_109, String maCongTo) {
		this.tenChuHo = tenChuHo;
		this.soNha_109 = soNha_109;
		this.maCongTo = maCongTo;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo = sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha_109 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo = sc.nextLine();
	}

	// Hm hien thi
	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo);
		System.out.println("\tSo nha: " + soNha_109);
		System.out.println("\tMa cong to: " + maCongTo);
	}
}
