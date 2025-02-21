package materi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int menu,menu2,menu3;
        Scanner scanint = new Scanner(System.in);
	    Scanner scan = new Scanner(System.in);
	    String[][] str = new String[10][10];
	    int judul=0;
	    int isi=1;
        do{
            System.out.print(
                    "Menu\n"+
                    "1. Tambah note\n"+
                    "2. Lihat note\n"+
                    "3. Edit note\n"+
                    "0. Exit\n"+
                    ">>> ");
            menu = scanint.nextInt();
            if(menu==1){
                System.out.print(
                        "===Tambah note===\n"+
                        "Judul  : ");
                str[judul][0] = scan.nextLine();
                System.out.print("Isi   : ");
                str[judul][isi] = scan.nextLine();
                System.out.println("Tambah note berhasil!");
                judul++;
            } else if(menu==2){
                do{
                    System.out.println("===Daftar Notes===");
                    for (int i = 0; i < judul; i++) {
                        System.out.println(i+1+". "+str[i][0]);
                    }
                    System.out.println("0. Kembali");
                    System.out.print(">>> ");
                    menu2 = scanint.nextInt();
                    if(menu2!=0 && menu2<=judul){
                        System.out.println("Isi : "+str[menu2-1][1]);
                    }
                }while(menu2!=0);
            } else if(menu==3){
                do{
                    System.out.println("===Edit note===");
                    for (int i = 0; i < judul; i++) {
                        System.out.println(i+1+". "+str[i][0]);
                    }
                    System.out.println("0. Kembali");
                    System.out.print(">>> ");
                    menu2 = scanint.nextInt();
                    if(menu2!=0){
                        do{
                            System.out.println("===Editing===");
                            System.out.println("Judul   : "+str[menu2-1][0]);
                            System.out.println("Isi     : "+str[menu2-1][1]);
                            System.out.print(
                                    "1. Tambah di depan\n"+
                                    "2. Tambah di belakang\n"+
                                    "3. Hapus kata\n"+
                                    "0. Keluar dari mode edit\n"+
                                    ">>> ");
                            menu3 = scanint.nextInt();
                            if(menu3==1){
                                System.out.print("Masukkan tambahan note: ");
                                String temp = scan.nextLine();
                                str[menu2-1][1] = temp+str[menu2-1][1];
                                System.out.println("Berhasil mengedit note!");
                            } else if(menu3==2){
                                System.out.print("Masukkan tambahan note: ");
                                String temp = scan.nextLine();
                                str[menu2-1][1] = str[menu2-1][1]+temp;
                                System.out.println("Berhasil mengedit note!");
                            } else if(menu3==3){
                                System.out.print("Masukkan kata yang ingin dihapus: ");
                                String temp = scan.next();
                                int counter = str[menu2-1][1].indexOf(temp)-5;
                                if(str[menu2-1][1].contains(temp)){
                                    String tempKata = temp + " ";
                                    str[menu2-1][1] = str[menu2-1][1].replaceAll(tempKata, "");
                                    tempKata = " "+temp;
                                    str[menu2-1][1] = str[menu2-1][1].replaceAll(tempKata, "");
                                }
                                System.out.println("Berhasil menghapus "+counter+" kata pada note!");
                            }
                        }while(menu3!=0);
                    }
                }while(menu2!=0);
            }
        }while(menu!=0);
    }
}
