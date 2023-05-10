package thuchanhbuoi2;

import java.text.NumberFormat;
import java.util.Scanner;
import static thuchanhbuoi2.Main.sc;

public class Taikhoan {
    public long Sotk;
    public String Tentk;
    public double Sotientrongtk;
    public String Trangthai;

    public Taikhoan(long Sotk, String Tentk, double Sotientrongtk, String Trangthai) {
        this.Sotk =999999 ;
        this.Tentk = "chua xac dinh";
        this.Sotientrongtk = 50;
        this.Trangthai = Trangthai;
    }

    Taikhoan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public long getSotk() {
        return Sotk;
    }

    public String getTentk() {
        return Tentk;
    }

    public double getSotientrongtk() {
        return Sotientrongtk;
    }

    public String getTrangthai() {
        return Trangthai;
    }
    
    public void setSotk(long Sotk) {
        this.Sotk = Sotk;
    }

    public void setTentk(String Tentk) {
        this.Tentk = Tentk;
    }

    public void setSotientrongtk(double Sotientrongtk) {
        this.Sotientrongtk = Sotientrongtk;
    }

    public void setTrangthai(String Trangthai) {
        this.Trangthai = Trangthai;
    }

    @Override
    public String toString() {
        return "Taikhoan{" + "Sotk=" + Sotk + ", Tentk=" + Tentk + ", Sotientrongtk=" + Sotientrongtk + ", Trangthai=" + Trangthai + '}';
    }
     public double napTien() {
        double nap;
        System.out.print("Nhập số tiền bạn cần nạp: ");
        nap = sc.nextDouble();
        
        if (nap >= 0) {
            Sotientrongtk = nap + Sotientrongtk;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(nap);
            System.out.println("bạn vừa nạp " + str1 + " vào tài khoản.");
        } else {
            System.out.println("Số tiền nạp vào không hợp lệ!");
        }
        return nap;
    }
 
    
    public double rutTien() {
        double phi = 5;
        double rut;
        System.out.print("Nhập số tiền bạn cần rút: ");
        rut = sc.nextDouble();
        
        if (rut <= (Sotientrongtk - phi)) {
            Sotientrongtk = Sotientrongtk - (rut + phi);
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(rut);
            System.out.println("Bạn vừa rút " + str1 + "Đ từ tài khoản. Phí là $5.");
        } else {
            System.out.println("Số tiền muốn rút không hợp lệ!");
            return rutTien();
        }
        return rut;
    }
 
    
    public double daoHan() {
        double laiSuat = 0.035;
        Sotientrongtk = Sotientrongtk + Sotientrongtk * laiSuat;
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(Sotientrongtk);
        System.out.println("Bạn vừa được " + str1 + " từ đáo hạn 1 tháng");
        return Sotientrongtk;
    }
 
    
    void inTK() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(Sotientrongtk);
        System.out.printf("%-10d %-20s %-20s \n", Sotk, Tentk, str1);
    }
}


    