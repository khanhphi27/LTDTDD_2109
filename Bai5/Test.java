/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

import Bai5.KhuPho;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		KhuPho qlkp = new KhuPho();

		qlkp.nhapDanhSach(sc);

		System.out.println("Danh sach ho dan co nguoi 80 tuoi la:");
		qlkp.timKiemThongTin();
	}

}
