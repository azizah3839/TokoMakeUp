/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author ASUS
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UAS {

    static void hitungkembalian(double total, int bayar) {
        System.out.println("\t\t\t     Kembalian : Rp." + (bayar - total) + ",-");
    }
     static String Tanggal() {  
        DateFormat tanggalFormat = new SimpleDateFormat("yyyy/MM/dd");  
        Date tanggal = new Date();  
        return tanggalFormat.format(tanggal);
    }
    
    static String Waktu() {  
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");  
        Date waktu = new Date();  
        return dateFormat.format(waktu);  
    } 
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));

        int i = 0;
        String[] makeup = new String[100];
        int[] harga_makeup = new int[100];
        String keputusan = "Y";
        int jumlah = 0;
        double harga_total = 0;
        int uang = 0;
        int[] total = new int[10];
        String member = "";
        int jumlahmakeup[] = new int[30];
        
        System.out.println("=======================================================");
        System.out.println("                      ~MY MAKEUP STORE~                ");
        System.out.println("                  MakeUp & SkinCare Termurah           ");
        System.out.println("=======================================================");
        System.out.println("| 1.  3CE Velvet Liptint                  Rp. 160.000 |");
        System.out.println("| 2.  TROPIK Micellar Rosewater           Rp. 125.000 |");
        System.out.println("| 3.  INNISFREE  Clay Mask                Rp. 150.000 |");
        System.out.println("| 4.  MIZZU Highlighter Countour          Rp. 120.000 |");
        System.out.println("| 5.  FOCALLURE Ombre Blush               Rp. 100.000 |");
        System.out.println("| 6.  PERIPERA Airy Ink Velvet            Rp. 130.000 |");
        System.out.println("| 7.  MAKEOVER Color Stick                Rp. 145.000 |");
        System.out.println("| 8.  DRESSROOM NewYork Parfume           RP. 95.000  |");
        System.out.println("| 9.  A'PIEU Water Light Tint             Rp. 90.000  |");
        System.out.println("| 10. O.TWO.O Liquid Blush                Rp. 70.000  |");
        System.out.println("=======================================================");
        int lim=0;
        while (keputusan.equals("Y") || keputusan.equals("y")) {
            System.out.print("Masukkan Nomor item : ");
            int pil = scan.nextInt();

            switch (pil) {
                case 1:
                    makeup[i] = "3CE Red Velvet Liptint\t";
                    harga_makeup[i] = 160000;
                    break;
                case 2:
                    makeup[i] = "TROPIK Micellar Rosewater";
                    harga_makeup[i] = 125000;
                    break;
                case 3:
                    makeup[i] = "INISFREE Volcanic Clay Mask";
                    harga_makeup[i] = 150000;
                    break;
                case 4:
                    makeup[i] = "Mizzu Highliter Countour";
                    harga_makeup[i] = 120000;
                    break;
                case 5:
                    makeup[i] = "Focallure OmbreLip  Blush";
                    harga_makeup[i] = 100000;
                    break;
                case 6:
                    makeup[i] = "PERIPERA Airy Ink Velvet";
                    harga_makeup [i] = 130000;
                    break;
                case 7:
                    makeup[i] = "MAKEOVER Color Stick Matte";
                    harga_makeup [i] = 145000;
                    break;
                case 8:
                    makeup[i] = "DRESSROOM New York Parfume";
                    harga_makeup [i] = 95000;
                    break;
                case 9:
                    makeup [i] = "A'PIAEU Water Light Tint";
                    harga_makeup [i] = 90000;
                    break;
                case 10:
                    makeup [i] = "O.TWO.O Liquid Lip Blush";
                    harga_makeup [i] = 70000;
                    break;
                case 11:
                default:
                    System.out.println("Item yang anda pesan kosong");
                    break;
            }
            
            
            for (int k = pil; k < 11; k++) {
                System.out.println("item yang anda pilih : " + makeup[i]);
                System.out.print("Jumlah item : ");
                jumlahmakeup[lim] = scan.nextInt();
                harga_makeup[i] = harga_makeup[i] * jumlahmakeup[lim];
                System.out.println("total = " + harga_makeup[i] + ",-");
                break;
            }

            System.out.println("");
            int totalmakeup = 0;
         
            total[i] = harga_makeup[i];
            System.out.println("Total belanja anda sebesar : Rp. " + total[i] + " ,-");

            System.out.println("Apakah anda akan menambah belanjaan ? Y/N : ");
            try {
                keputusan = input2.readLine();
            } catch (IOException e) {
                System.out.println("Failed to Read Keyboard");
            }
            lim++;
            i++;
            System.out.println("List Item anda saat ini : ");

            for (int a = 0; a < i; a++) {
                System.out.println(makeup[a] +"\t "+ jumlahmakeup[a] + "\t RP."+ harga_makeup[a] + ",-");
            }
            System.out.println("-------------------------------------------------------");
        }
        System.out.println(" ");
            System.out.println("+==========================================================+");
            System.out.println("|                           STRUK                          |");
            System.out.println("+==========================================================+");
        for (int a = 0; a < i; a++) {
            System.out.println(makeup[a] +"\t "+ jumlahmakeup[a] + "\t Rp."+ harga_makeup[a] + ",-");
            }
        for (int c = 0; c < total.length; c++) {
                harga_total = harga_total + total[c];
            }
            System.out.println("-----------------------------------------------------------");
            System.out.println("\t\t\t      Subtotal : " + "Rp." + harga_total + ",-");
            System.out.print("\t\t\t\tMember : ");
        try {
            member = input2.readLine();
        } catch (IOException ex) {
            System.out.println("ERROR");
        }
        if (member.equals("y") || member.equals("Y")) {
            harga_total = harga_total - (harga_total * 0.1);
            
            System.out.println("\t\t\t    Diskon 10% : " + (harga_total * 0.1) + "-");
            System.out.println("-----------------------------------------------------------");
            System.out.println("\t\t\t\t TOTAL : " + "Rp." + harga_total + ",-");
            System.out.println("-----------------------------------------------------------");
            System.out.print("\t\t\t\t TUNAI : Rp.");
            uang = scan.nextInt();
           
            if (harga_total>uang) {
                System.out.print("Maaf Uang Anda Kurang,Tolong Masukkan dengan benar : ");
                uang = scan.nextInt();
                } 
                hitungkembalian(harga_total, uang);
                System.out.println("-----------------------------------------------------------");
            
        } else if (member.equals("n") || member.equals("N")) {
            
            System.out.println("\t\t\t\tDiskon : 0%");
            System.out.println("-----------------------------------------------------------");
            System.out.println("\t\t\t\t TOTAL : " + harga_total + ",-");
            System.out.println("-----------------------------------------------------------");
            System.out.print("\t\t\t\t TUNAI : Rp.");
            uang = scan.nextInt();
            
            if (harga_total>uang) {
                System.out.print("Maaf Uang Anda Kurang,Tolong Masukkan dengan benar : ");
                uang = scan.nextInt();
            } 
                hitungkembalian(harga_total, uang);
                System.out.println("-----------------------------------------------------------");
            }
         System.out.println("");
       
            System.out.println(" ");
            System.out.println("                          THANK YOU!                        ");
            System.out.println("                      PLEASE COME AGAIN ^^                  ");
            System.out.println("                      ~MY MAKEUP STORE~                     ");
            System.out.println("|                 MakeUp & SkinCare Termurah               |");
            System.out.println("|                         " + Tanggal() +"                       |");
            System.out.println("|                          " + Waktu() +"                        |");
            System.out.println("+==========================================================+");
        }
    }
