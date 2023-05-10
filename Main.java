package thuchanhbuoi2;

import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static void nhapTK(Taikhoan tk) {
        System.out.println("Nhap so tai khoan : ");
        tk.setSotk(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ten tai khoan: ");
        tk.setTentk(sc.nextLine());
        tk.setSotientrongtk(50);
    }
    public static void main(String[] args) {
        Taikhoan a[] = null;
        int k, b, n = 0;
        long s, d, c, f;
        boolean flag = true;
        do {
            System.out.println("Ban chon gi : ");
            System.out.println("1.them tai khoan\n"
                    + "2. So tk hien co\n" + "3.In thong tin tk \n" + "4.Nap tien\n"
                    + "5.Rut tien \n" + "6.Chuyen tien\n" + "7.Chon so khac de thoat");
            b = sc.nextInt();
            switch (b) {
                case 1:
                    System.out.println("Them so luong tai khoan ban muon : ");
                    n = sc.nextInt();
                    a = new Taikhoan[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Tai khoan so : " + (i+1));
                        a[i] = new Taikhoan();
                        nhapTK(a[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%-10s %-20s %-20s\n", "Số TK", "Tên TK", "So tien co trong tai khoan la ");
                    for (int i = 0; i < n; i++) {
                        a[i].inTK();
                    }
                    break;
                case 3:
                   
                	 System.out.printf("%-10s %-20s %-20s\n", "Số TK", "Tên TK", "So tien co trong tai khoan la ");
                     for (int i = 0; i < n; i++) {
                         a[i].inTK();
                     }
                     break;
                case 4:
                	System.out.println("So tai khoan ban muon in : ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSotk();
                        if (s == d) {
                            System.out.println("Ban chon tai  khoan: " + d);
                            a[i].napTien();
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                    
                case 5:
                	System.out.println("Nhap so tai khoan ban can nap: ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSotk();
                        if (s == d) {
                            System.out.println("Ban chon tai khoan : " + d);
                            a[i].rutTien();
                        }
                    }
                    break;
                case 6:
                    double chuyen,
                            nhan,
                            tienChuyen;
                    System.out.print("Nhap so khach hang can chuyen tien : ");
                    s = sc.nextLong();
                    System.out.print("nhap so khach hang can nhan tien : ");
                    c = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSotk();
                        if (s == d) {
                            chuyen = a[i].getSotientrongtk();
                            for (int j = 0; j < n; j++) {
                                f = a[j].getSotk();
                                if (c == f) {
                                    nhan = a[j].getSotientrongtk();
                                    System.out.println("Nhap so tien can chuyen:");
                                    tienChuyen = sc.nextDouble();
                                    if (tienChuyen <= chuyen) {
                                        chuyen = chuyen - tienChuyen;
                                        nhan = nhan + tienChuyen;
                                        a[i].setSotientrongtk(chuyen);
                                        a[j].setSotientrongtk(nhan);
                                        System.out.println("Tai khoan so " + d + " vua chuyen: $" + tienChuyen);
                                        System.out.println("Tài khoản số " + f + " vua nhan: $" + tienChuyen);
                                    } else {
                                        System.out.println("Số tien nhan khong hop le!");
                                    }
                                } else {
                                    System.out.println("");
                                }
                            }
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                default:
                    System.out.println("Bye!!");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}