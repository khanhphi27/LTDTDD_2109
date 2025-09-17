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

import Bai3.QuanLySach;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QuanLySach qls = new QuanLySach();

		qls.nhapDanhSachTL(sc);

		System.out.print("\n\nNhap vao loai tai lieu can tim: ");
		String loai = sc.nextLine();
		qls.timLoaiTL(loai);

		System.out.print("\n\nNhap vao ma tai lieu can tim: ");
		String maTL = sc.nextLine();
		qls.timMaTL(maTL);

		sc.close();
	}

}
