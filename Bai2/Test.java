/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

import Bai2.QLCB;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QLCB qlcb = new QLCB();

		qlcb.nhapDanhSach(sc);

		System.out.print("Nhap vao ho ten can tim kiem: ");
		String name = sc.nextLine();

		qlcb.timKiemCanBo(name);

		// huy sc
		sc.close();
	}

}

