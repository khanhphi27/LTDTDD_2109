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

import Bai10.QuanLy;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QuanLy ql = new QuanLy();
		ql.nhapDanhSach(sc);

		System.out.println("Danh sach bien lai cua cac ho gia dinh la:");
		ql.hienThiDanhSach();

		sc.close();
	}

}
