package tugas;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        Scanner scanint = new Scanner(System.in);

        String[] nama = new String[4];
        int[] score = new int[4];
        String[][] papan =
        {       // 0    1    2    3    4    5    6    7    8
        /*0*/    {"-","---","-","---","-","---","-","---","-"},
        /*1*/    {"|","   ","|","   ","|","   ","|","   ","|"},
        /*2*/    {"|","   ","|","   ","|","   ","|","   ","|"},
        /*3*/    {"|","   ","|","   ","|","   ","|","   ","|"},
        /*4*/    {"|","   ","|","   ","|","   ","|","   ","|"},
        /*5*/    {"|","   ","|","   ","|","   ","|","   ","|"},
        /*6*/    {"|","   ","|","   ","|","   ","|","   ","|"},
        /*7*/    {"|","   ","|","   ","|","   ","|","   ","|"},
        /*8*/    {"|","   ","|","   ","|","   ","|","   ","|"}
        };
        String[] list = {"002","004","008","016","032","064"};
        int menu,menu2;
        int jumlahplayer = -1;
        //MAIN MENU
        do{
            System.out.print(
                    "=====Stack 2048=====\n"+
                    "Main Menu\n"+
                    "1. Play\n"+
                    "2. Leaderboard\n"+
                    "3. Exit\n"+
                    ">> "
                    );
            menu = scanint.nextInt();

            if(menu==1){
                boolean dead = false;
                int tempscore = 0;
                int[] kolomctr = {1,1,1,1};
                int discard=3;
                int cleankolom = 0;
                int cleanbaris = 0;
                String storelist = list[rand.nextInt(6)];
                jumlahplayer++;
                if(jumlahplayer==4){
                    jumlahplayer = 3;
                }
                System.out.print("Masukkan Nama Player : ");
                for (int i = 1; i < 9; i++) {
                    for (int j = 0; j < 4; j++) {
                        papan[i][j*2+1]="   ";
                    }
                }
                String tempnama = scan.nextLine();

                //GAME
                do{
                    System.out.println(kolomctr[0]);
                    System.out.println(kolomctr[1]);
                    System.out.println(kolomctr[2]);
                    System.out.println(kolomctr[3]);
                    System.out.println("Score : "+tempscore);
                    for (int i = 0; i < 9; i++) {
                        for (int j = 0; j < 9; j++) {
                            System.out.print(papan[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.print(
                            "Menu Play:\n"+
                            "Next Card : "+storelist+"\n"+
                            "1. Masukkan Card\n"+
                            "2. Discard Card ("+discard+")\n"+
                            "3. Bersihkan Kolom ("+cleankolom+")\n"+
                            "4. Bersihkan Baris ("+cleanbaris+")\n"+
                            ">> "
                    );
                    menu2 = scanint.nextInt();
                    if(menu2==1){
                        int temp,x;
                        do{
                            System.out.print("Kolom yang dipilih : ");
                            temp = scanint.nextInt();
                        }while(temp<1 || temp>4);
                        x = temp*2-1;
                        if(kolomctr[temp-1]<9){
                            papan[kolomctr[temp-1]][x] = storelist;
                            kolomctr[temp-1]++;
                            storelist = list[rand.nextInt(6)];
                        } else{
                            System.out.println("Kolom tersebut sudah penuh ");
                        }
                    } else if(menu2==2){
                        if(discard>0){
                            discard--;
                            storelist = list[rand.nextInt(6)];
                        } else{
                            System.out.println("Jumlah discard card sudah terpakai semua");
                        }
                    } else if(menu2==3){
                        if(cleankolom>0){
                            cleankolom--;
                            int temp,x;
                            do{
                                System.out.print("Kolom yang dipilih : ");
                                temp = scanint.nextInt();
                            }while(temp<1 || temp>4);
                            x = temp*2-1;
                            kolomctr[temp-1] = 1;
                            for (int i = 1; i < 9; i++) {
                                papan[i][x] = "   ";
                            }
                        } else{
                            System.out.println("Anda tidak mempunyai power up ini");
                        }
                    } else if(menu2==4){
                        if(cleanbaris>0){
                            cleanbaris--;
                            int temp;
                            do{
                                System.out.print("Baris yang dipilih : ");
                                temp = scanint.nextInt();
                            }while(temp<1 || temp>8);
                            for (int i = 0; i < 4; i++) {
                                if(kolomctr[i]>1 && !papan[temp][i*2+1].equals("   ")){
                                    kolomctr[i]--;
                                }
                                papan[temp][i*2+1] = "   ";
                            }
                        } else{
                            System.out.println("Anda tidak mempunyai power up ini");
                        }
                    }

                    boolean loop;
                    int streakcounter=0;
                    do{
                        loop=false;
                        for (int i = 1; i < 8; i++) {
                            for (int j = 0; j < 4; j++) {
                                if(papan[i][j*2+1].equals("   ")){
                                    papan[i][j*2+1] = papan[i+1][j*2+1];
                                    papan[i+1][j*2+1] = "   ";
                                }
                            }
                        }
                        for (int i = 1; i < 8; i++) {
                            for (int j = 0; j < 4; j++) {
                                if(papan[i][j*2+1].equals(papan[i+1][j*2+1]) && !papan[i][j*2+1].equals("   ")) {
                                    loop = true;
                                    if (papan[i][j*2+1].equals("002")) {
                                        papan[i][j*2+1] = "004";
                                    } else if (papan[i][j*2+1].equals("004")) {
                                        papan[i][j*2+1] = "008";
                                    } else if (papan[i][j*2+1].equals("008")) {
                                        papan[i][j*2+1] = "016";
                                    } else if (papan[i][j*2+1].equals("016")) {
                                        papan[i][j*2+1] = "032";
                                    } else if (papan[i][j*2+1].equals("032")) {
                                        papan[i][j*2+1] = "064";
                                    } else if (papan[i][j*2+1].equals("064")) {
                                        papan[i][j*2+1] = "128";
                                    } else if (papan[i][j*2+1].equals("128")) {
                                        papan[i][j*2+1] = "256";
                                    }
                                    papan[i+1][j*2+1] = "   ";
                                    kolomctr[j]--;
                                    tempscore++;
                                    streakcounter++;
                                }
                            }
                        }
                    }while(loop);

                    if(streakcounter>=3){
                        int choice = rand.nextInt(2)+1;
                        if(choice==1){
                            cleankolom++;
                            System.out.println("Anda mendapatkan power up bersihkan kolom karena streak "+streakcounter);
                        } else{
                            cleanbaris++;
                            System.out.println("Anda mendapatkan power up bersihkan baris karena streak "+streakcounter);
                        }
                    }

                    if(kolomctr[0]==9 && kolomctr[1]==9 && kolomctr[2]==9 && kolomctr[3]==9){
                        for (int i = 0; i < 9; i++) {
                            for (int j = 0; j < 9; j++) {
                                System.out.print(papan[i][j]);
                            }
                            System.out.println();
                        }
                        System.out.println("Semua kolom penuh, tidak ada move!");
                        System.out.println("Score "+tempnama+": "+tempscore);
                        System.out.println("~GAME OVER~");
                        nama[jumlahplayer] = tempnama;
                        score[jumlahplayer] = tempscore;
                        dead = true;
                    }
                }while(!dead);
            } else if(menu==2){
                int ts;
                String tn;
                for (int i = 0; i <= jumlahplayer; i++) {
                    for (int j = i+1; j <= jumlahplayer; j++) {
                        if(score[i] < score[j]){
                            ts = score[i];
                            score[i] = score[j];
                            score[j] = ts;

                            tn = nama[i];
                            nama[i] = nama[j];
                            nama[j] = tn;
                        }
                    }
                }
                if(jumlahplayer==3){
                    nama[jumlahplayer] = "";
                    score[jumlahplayer] = 0;
                    jumlahplayer--;
                }
                do{
                    System.out.println("Leaderboard");
                    for (int i = 0; i <= jumlahplayer; i++) {
                        System.out.println(i+1+". "+nama[i]+" - "+score[i]);
                    }
                    System.out.print(
                            "0. Exit\n"+
                                    ">> ");
                    menu2 = scanint.nextInt();
                }while(menu2!=0);
            }
        }while(menu!=3);
    }
}
