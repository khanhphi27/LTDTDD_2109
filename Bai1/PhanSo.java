/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1;

/**
 *
 * @author ASUS
 */

import java.util.Scanner;

public class PhanSo {
    // thuộc tính
    private int tuSo_109;
    private int mauSo;

    // hàm khởi tạo không đối số
    public PhanSo() {
        tuSo_109 = 0;
        mauSo = 1;
    }

    // hàm khởi tạo có đối số
    public PhanSo(int tuSo_109, int mauSo) {
        this.tuSo_109 = tuSo_109;
        this.mauSo = mauSo;
    }

    // hàm nhập phân số
    public void nhapPS(Scanner sc) {
        int a, b;
        do {
            System.out.print("\tNhap vao tu so: ");
            a = sc.nextInt();

            System.out.print("\tNhap vao mau so: ");
            b = sc.nextInt();

            if (b == 0) {
                System.out.println("Mau so khong duoc bang 0. Hay nhap lai!");
            } else {
                tuSo_109 = a;
                mauSo = b;
            }
        } while (b == 0);
    }

    // hàm hiển thị
    public void hienThiPS() {
        if (tuSo_109 * mauSo < 0) {
            System.out.println("\t-" + Math.abs(tuSo_109) + "/" + Math.abs(mauSo));
        } else {
            System.out.println("\t" + Math.abs(tuSo_109) + "/" + Math.abs(mauSo));
        }
    }

    // cộng
    public PhanSo congPS(PhanSo ps2) {
        int a = tuSo_109 * ps2.mauSo + ps2.tuSo_109 * mauSo;
        int b = mauSo * ps2.mauSo;
        return new PhanSo(a, b);
    }

    // trừ
    public PhanSo truPS(PhanSo ps2) {
        int a = tuSo_109 * ps2.mauSo - ps2.tuSo_109 * mauSo;
        int b = mauSo * ps2.mauSo;
        return new PhanSo(a, b);
    }

    // nhân
    public PhanSo nhanPS(PhanSo ps2) {
        int a = tuSo_109 * ps2.tuSo_109;
        int b = mauSo * ps2.mauSo;
        return new PhanSo(a, b);
    }

    // chia
    public PhanSo chiaPS(PhanSo ps2) {
        if (ps2.tuSo_109 == 0) {
            throw new ArithmeticException("Khong the chia cho phan so co tu so = 0");
        }
        int a = tuSo_109 * ps2.mauSo;
        int b = mauSo * ps2.tuSo_109;
        return new PhanSo(a, b);
    }

    // tìm USCLN
    private int timUSCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // kiểm tra tối giản
    public boolean kiemTraToiGian() {
        return timUSCLN(tuSo_109, mauSo) == 1;
    }

    // rút gọn phân số
    public void toiGianPS() {
        int x = timUSCLN(tuSo_109, mauSo);
        tuSo_109 /= x;
        mauSo /= x;
    }

    // ------------------------------
    // MAIN để chạy chương trình
    // ------------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();

        System.out.println("Nhap phan so thu nhat:");
        ps1.nhapPS(sc);

        System.out.println("Nhap phan so thu hai:");
        ps2.nhapPS(sc);

        System.out.println("Phan so thu nhat:");
        ps1.hienThiPS();

        System.out.println("Phan so thu hai:");
        ps2.hienThiPS();

        PhanSo tong = ps1.congPS(ps2);
        PhanSo hieu = ps1.truPS(ps2);
        PhanSo tich = ps1.nhanPS(ps2);
        PhanSo thuong = ps1.chiaPS(ps2);

        System.out.println("Tong 2 phan so: ");
        tong.hienThiPS();

        System.out.println("Hieu 2 phan so: ");
        hieu.hienThiPS();

        System.out.println("Tich 2 phan so: ");
        tich.hienThiPS();

        System.out.println("Thuong 2 phan so: ");
        thuong.hienThiPS();
    }
}
