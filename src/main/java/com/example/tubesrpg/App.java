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
        int enemy_stregth = 70;

        Player player = new Player();
        Attack magic = new Magic();
        Attack sword = new Sword();
        Heal flower = new Medicine_Flower();
        Heal meat = new Animal_Meat();

        Scanner action = new Scanner(System.in);
        Scanner action_makan = new Scanner(System.in);

        do{
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
            if(input.equals("Ya")){
                System.out.println("Baiklah! Izinkan saya memegang pergelangan tangan Anda.");
                action.nextLine();
                System.out.println("Saat ini, anda memiliki poin darah sebanyak " + player.health + ". Seperti yang saya bilang tadi, hanya setengahnya saja");
                action.nextLine();
                System.out.println("Hm, saya juga ragu dengan poin darah segini akan cukup untuk melawan naga api");
                System.out.println("Apakah Anda ingin menambahkan poin darah Anda? Kita ada bunga obat dan daging hewan yang kemarin kita sudah sembelih");
                input = action.nextLine();
                if(input.equals("Ya")){
                    System.out.println("Kalau begitu, makanan apa yang hendak anda makan?");
                    input = action.nextLine();
                    player.getHealth(input);
                    System.out.println("Baiklah, akan saya siapkan, Yang Mulia!");
                    action.nextLine();
                    System.out.println("Bagaimana, Pahlawan? Apakah enak?");
                    action.nextLine();
                    if(input.equals("Bunga obat")){
                        System.out.println("Syukurlah kalau Anda menyukainya! Darah anda bertambah sebanyak " + player.medicine_Flower.addStrength());
                        System.out.println("Sehingga saat ini, poin darah anda sebanyak " + player.health);
                        action.nextLine();
                        System.out.println("Dengan darah segini saya rasa cukup untuk segera melawan naga api");
                        action.nextLine();
                        System.out.println("Sekali lagi, Anda tidak perlu berterima kasih seperti itu. Itu adalah kewajiban saya sebagai penjaga anda!");
                        action.nextLine();
                    }
                    if(input.equals("Daging hewan")){
                        System.out.println("Syukurlah kalau Anda menyukainya! Darah anda bertambah sebanyak " +player.animal_Meat.addStrength());
                        System.out.println("Sehingga saat ini, poin darah anda sebanyak " + player.health);
                        action.nextLine();
                        System.out.println("Dengan darah segini saya rasa cukup untuk segera melawan naga api");
                        action.nextLine();
                        System.out.println("Sekali lagi, Anda tidak perlu berterima kasih seperti itu. Itu adalah kewajiban saya sebagai penjaga anda!");
                        action.nextLine();
                    } 
                } 
            } else {
                System.out.println("Baiklah. Saya percaya kepada kekuatan Pahlawan");
                action.nextLine();
            }
            System.out.println("Naga api melihat ke arah kita, Pahlawan!");
            action.nextLine();
            System.out.println("Cepat, kita harus menyerangnya! Sihir atau pedang?");
            input = action.nextLine();
            if(input.equals("Sihir")){
                System.out.println("Pilihan yang bagus!");
                System.out.println("Teleportasi atau syok listrik?");
                input = action.nextLine();
                enemy_health = enemy_health - magic.Attack(input);
                if(input.equals("Teleportasi")){
                    System.out.println("\033[3mZIIINGGG!!!\033[0m");
                    action.nextLine();
                    System.out.println("Api naganya melesat, Pahlawan! Cepat, serangan balik!");
                    action.nextLine();
                    System.out.println("\033[3mDRRRRTTTTTT!!!\033[0m");
                    enemy_health = enemy_health - magic.Attack("Syok listrik");
                    System.out.println("Yay! Sihir listrik Anda tepat mengenai badannya! Pahlawan benar-benar ahli sihir yang hebat!");
                    action.nextLine();
                }
                if(input.equals("Syok listrik")){
                    System.out.println("\033[3mDRRRRTTTTTT!!!\033[0m");
                    action.nextLine();
                    
                }
            }
        } while(enemy_health > 0);
    }
}

