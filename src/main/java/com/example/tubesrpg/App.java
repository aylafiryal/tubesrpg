package com.example.tubesrpg;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int enemy_health = 90;
        int enemy_stregth = 20;

        Player player = new Player();
        Attack magic = new Magic();
        Attack sword = new Sword();
        
        Scanner action = new Scanner(System.in);

        String input;

            System.out.println("Pahlawan?");
            action.nextLine();
            System.out.println("Pahlawan!");
            action.nextLine();
            System.out.println("Pahlawan, saya mohon segeralah bangun!");
            action.nextLine();
            System.out.println("AKHIRNYA! Astaga saya sempat putus asa kalau Anda akan gugur di sini!");
            System.out.println("Untung sekali sihir penyembuhan milik saya berjalan dengan baik");
            action.nextLine();
            System.out.println("Betul, Anda sempat sekarat saat menghadapi naga api ini. Untung saya segera bangun dari liontin Anda dan sempat menyelamatkan Anda.");
            action.nextLine();
            System.out.println("Tidak usah berterima kasih seperti itu, Yang Mulia. Sudah menjadi kewajiban saya untuk selalu membantu Anda");
            action.nextLine();
            System.out.println("Masih ada, naga itu masih ada saat ini! Ia masih terlihat murka karena kita mencuri telurnya");
            action.nextLine();
            System.out.println("Tetapi pahlawan, sihir saya tidak semanjur itu. Saat ini anda mungkin hanya memiliki setengah darah saja");
            System.out.println("Apakah anda ingin tahu seberapa banyak darah tersisa dalam tubuh anda?");
            input = action.nextLine();
            if(input.equalsIgnoreCase("Ya")){
                System.out.println("Baiklah! Izinkan saya memegang pergelangan tangan Anda.");
                action.nextLine();
                System.out.println("Saat ini, anda memiliki poin darah sebanyak " + player.getHealth() + ". Seperti yang saya bilang tadi, hanya setengahnya saja");
                action.nextLine();
                System.out.println("Hm, saya juga ragu dengan poin darah segini akan cukup untuk melawan naga api");
                System.out.println("Apakah Anda ingin menambahkan poin darah Anda?");
                input = action.nextLine();
                if(input.equalsIgnoreCase("Ya")){
                    System.out.println("Kalau begitu, makanan apa yang hendak anda makan?  Kita ada \033[1mbunga obat\033[0m dan \033[1mdaging hewan\033[0m yang kemarin kita sudah sembelih");
                    input = action.nextLine();
                    player.getHealth(input);
                    System.out.println("Baiklah, akan saya siapkan, Yang Mulia!");
                    action.nextLine();
                    System.out.println("Bagaimana, Pahlawan? Apakah enak?");
                    action.nextLine();
                    if(input.equalsIgnoreCase("Bunga obat")){
                        System.out.println("Syukurlah kalau Anda menyukainya! Saat ini, poin darah anda sebanyak " + player.getHealth());
                        action.nextLine();
                    }
                    if(input.equalsIgnoreCase("Daging hewan")){
                        System.out.println("Syukurlah kalau Anda menyukainya! Saat ini, poin darah anda sebanyak " + player.getHealth());
                        action.nextLine();
                    }
                    System.out.println("Dengan darah segini saya rasa cukup untuk segera melawan naga api");
                    action.nextLine();
                    System.out.println("Sekali lagi, Anda tidak perlu berterima kasih seperti itu. Itu adalah kewajiban saya sebagai penjaga anda!");
                    action.nextLine(); 
                } else {
                    System.out.println("Baiklah. Saya percaya kepada kekuatan Pahlawan");
                    action.nextLine();
                } 
            } else {
                System.out.println("Baiklah. Saya percaya kepada kekuatan Pahlawan");
                action.nextLine();
            }
            System.out.println("Naga api melihat ke arah kita, Pahlawan!");
            action.nextLine();
            System.out.println("Cepat, kita harus menyerangnya! \033[1mSihir\033[0m atau \033[1mpedang\033[0m?");
            player.damage(enemy_stregth);
            input = action.nextLine();
            if(input.equalsIgnoreCase("Sihir")){
                System.out.println("Pilihan yang bagus!");
                System.out.println("\033[1mTeleportasi\033[0m atau \033[1msyok listrik\033[0m?");
                input = action.nextLine();
                enemy_health = enemy_health - magic.Attack(input);
                if(input.equalsIgnoreCase("Teleportasi")){
                    System.out.println("\033[3mZIIINGGG!!!\033[0m");
                    action.nextLine();
                    System.out.println("Api naganya melesat, Pahlawan! Cepat, serangan balik!");
                    action.nextLine();
                    System.out.println("\033[3mDRRRRTTTTTT!!!\033[0m");
                    enemy_health = enemy_health - magic.Attack("Syok listrik");
                    System.out.println("Yay! Sihir listrik Anda tepat mengenai badannya! Pahlawan benar-benar ahli sihir yang hebat!");
                    action.nextLine();
                }
                if(input.equalsIgnoreCase("Syok listrik")){
                    System.out.println("\033[3mDRRRRTTTTTT!!!\033[0m");
                    action.nextLine();
                    System.out.println("Yay! Sihir listrik Anda tepat mengenai badannya! Pahlawan benar-benar ahli sihir yang hebat!");
                }
            }
            if(input.equalsIgnoreCase("Pedang")){
                System.out.println("Baiklah,\033[1mExcalibur\033[0m atau \033[1mBlack excalibur\033[0m?");
                input = action.nextLine();
                enemy_health = enemy_health - sword.Attack(input);
                if(input.equalsIgnoreCase("Excalibur")){
                    System.out.println("\033[3mZREEEETTT!!!\033[0m");
                }
                if(input.equalsIgnoreCase("Black excalibur")){
                    System.out.println("\033[3mZIIINGGG!!!\033[0m");
                }
                System.out.println("HA! Kita mengenai perutnya pahlawan!");
            }
        
        if(enemy_health > 0){
            for(int i = 0; i < enemy_health; i++){
                System.out.println("Ayo kita serang lagi dia pahlawan! \033[1mSihir\033[0m atau \033[1mpedang\033[0m?");
                player.damage(enemy_stregth);
                input = action.nextLine();
                if(input.equalsIgnoreCase("Sihir")){
                    System.out.println("\033[1mTeleportasi\033[0m atau \033[1msyok listrik\033[0m?");
                    input = action.nextLine();
                    enemy_health = enemy_health - magic.Attack(input);
                    if(input.equalsIgnoreCase("Teleportasi")){
                        System.out.println("\033[3mZIIINGGG!!!\033[0m");
                        action.nextLine();
                        System.out.println("Api naganya melesat, Pahlawan! Cepat, serangan balik!");
                        action.nextLine();
                        System.out.println("\033[3mDRRRRTTTTTT!!!\033[0m");
                        enemy_health = enemy_health - magic.Attack("Syok listrik");
                        System.out.println("Yay! Sihir listrik Anda tepat mengenai badannya! Pahlawan benar-benar ahli sihir yang hebat!");
                        action.nextLine();
                    }
                    if(input.equalsIgnoreCase("Syok listrik")){
                        System.out.println("\033[3mDRRRRTTTTTT!!!\033[0m");
                        action.nextLine();
                        System.out.println("Yay! Sihir listrik Anda tepat mengenai badannya! Pahlawan benar-benar ahli sihir yang hebat!");
                        action.nextLine();
                    }
                }
                if(input.equalsIgnoreCase("Pedang")){
                    System.out.println("Baiklah,\033[1mExcalibur\033[0m atau \033[1mBlack excalibur\033[0m?");
                    input = action.nextLine();
                    enemy_health = enemy_health - sword.Attack(input);
                    if(input.equalsIgnoreCase("Excalibur")){
                        System.out.println("\033[3mZREEEETTT!!!\033[0m");
                        action.nextLine();
                    }
                    if(input.equalsIgnoreCase("Black excalibur")){
                        System.out.println("\033[3mZIIINGGG!!!\033[0m");
                        action.nextLine();
                    }
                    System.out.println("HA! Kita mengenai badannya lagi pahlawan!!");
                    action.nextLine();
                }
            }
            
            // do {
                
            //     }
            // } while(enemy_health != 0 ^ player.getHealth() != 0);
        }

        if(player.getHealth() < 0 /*&& enemy_health > 0*/){
            System.out.println("Tunggu, PAHLAWAN!");
            action.nextLine();
            System.out.println("PAHLAWAN!!");
            action.nextLine();
            System.out.println("GAME OVER");
        }

        if(player.getHealth() > 0 /*&& enemy_health < 0*/){
            System.out.println("Terima kasih pahlawan, anda sudah menaklukan naga api itu!");
            action.nextLine();
            System.out.println("Entah apa yang akan terjadi padaku jika Pahlawan benar-benar gugur di awal pertarungan");
            action.nextLine();
            System.out.println("Ayo, Yang Mulia! Kita lanjutkan perjalanan kita!");
            action.nextLine();
        }
    }
}

