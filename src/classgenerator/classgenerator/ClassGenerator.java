/*
 Try to make a random class generator for a Call of Duty, and Monster Hunter World.
 Make a create a class system for a Call of Duty Game, with Prime and sec guns and 
 types of primary and secondary weapons, lethal and non-lethal equipment, attachment for all weapons, 
 Perks 1,2,3

 We will Arrays and maybe switch, import random, arrays, for loop, and maybe 
 while loop look up
 more stuff about Arrays
 */
package classgenerator;

//import java.util.Random;
//import java.util.Scanner;

import java.util.HashMap;
import java.util.Random;

public class ClassGenerator {

    /*
     I have gone through the Java code, and Ii will redo it using a HashMap instead of an array. Search for the random element will take o(1),
      whereas using an array is O(n). I do want to start doing projects with some of the DS I learn, so I can get used to them.
    * */

    public static void main(String[] args) {

        HashMap<String, String> AssaultRifle = new HashMap<>();
        //Use .put to add items to HashMap
        AssaultRifle.put("AR_1", "ICR-7");
        AssaultRifle.put("AR_2", "Rampart 17");
        AssaultRifle.put("AR_3", "KN-57");
        AssaultRifle.put("AR_4", "VAPR-XKG");
        AssaultRifle.put("AR_5", "Maddox RFB");
        AssaultRifle.put("AR_6", "Swat RFT");
        AssaultRifle.put("AR_7", "Grav");
        AssaultRifle.put("AR_8", "Peacekeeper");
        AssaultRifle.put("AR_9", "AN-94");
        AssaultRifle.put("AR_10", "Echohawk Dual Bore");

        //Sub Machine Guns\
        HashMap<String, String> SubMachine = new HashMap<>();
        SubMachine.put("Sub_1", "MX9");
        SubMachine.put("Sub_2", "GKS");
        SubMachine.put("Sub_3", "Spitfire");
        SubMachine.put("Sub_4", "Cordite");
        SubMachine.put("Sub_5", "Saug 9MM");
        SubMachine.put("Sub_6",  "Daemon 3XB");

        SubMachine.put("Sub_7", "Switchblade X9");
        SubMachine.put("Sub_8", "VMP");
        SubMachine.put("Sub_9",  "Micromg 9mm");

        HashMap<String, String> TacticalRifles = new HashMap<>();
        TacticalRifles.put("Tac_1", "Auger DMR");
        TacticalRifles.put("Tac_2", "ABR 223");
        TacticalRifles.put("Tac_3", "Swordfish");
        TacticalRifles.put("Tac_4", "M16");

        //LMG
        HashMap<String, String> LightMachine = new HashMap<>();
        LightMachine.put("LMG_1", "Titan");
        LightMachine.put("LMG_2", "Hades");
        LightMachine.put("LMG_3", "VKM 750");
        LightMachine.put("LMG_4", "Tigershark");

        //Snipers
        HashMap<String, String> Snipers = new HashMap<>();
        Snipers.put("Sniper_1", "Paladin HB50");
        Snipers.put("Sniper_2", "Outlaw");
        Snipers.put("Sniper_3", "SDM");
        Snipers.put("Sniper_4", "Koshka");

        Snipers.put("Sniper_5", "Vendetta");
        Snipers.put("Sniper_6", "Havelina AA50");


        /*
        This is an array of HashMaps to make the primary weapons section
        Doing this because I need to choose a random Weapon type, and then choose a random weapon.
        For example I choose Snipers, then randomly choose the  SDM
        * */
        Object[] Primary = new Object[]{AssaultRifle, SubMachine, TacticalRifles, LightMachine, Snipers};
       // System.out.println(Primary.length);


        HashMap<String, String> Pistols = new HashMap<>();
        Pistols.put("Pistol_1", "Strife");
        Pistols.put("Pistol_2", "RK 7");
        Pistols.put("Pistol_3", "Garrison");
        Pistols.put("Pistol_4", "Mozu" );

        //Shotguns
        HashMap<String, String> Shotguns = new HashMap<>();
        Shotguns.put("Shotgun_1", "MOG_12");
        Shotguns.put("Shotgun_2", "SG_12");
        Shotguns.put("Shotgun_3", "Rampage MKII");
        Shotguns.put("Shotgun_4", "Argus");

        /* Melee and Launch Weapons */
        HashMap<String, String> Melee  = new HashMap<>();
        Melee.put("Melee_1", "Combat Knife");
        Melee.put("Melee_2", "Secret Santa");
        Melee.put("melee_3", "Nifo'oti ");

        HashMap<String, String> LauncherSpecials = new HashMap<>();
        LauncherSpecials.put("Launcher", "Hellio Salvo");
        LauncherSpecials.put("Special_1" , "Ballistic Knife");
        LauncherSpecials.put("Special_2" , "Reaver C86");

        //Array hashmaps for secondary weapons
        Object[] Secondary = new Object[]{Pistols, Shotguns, Melee, LauncherSpecials};

        /* Equipment */
        HashMap<String, String> Equipments = new HashMap<>();
        Equipments.put("Equipment_1", "Trophy System");
        Equipments.put("Equipment_2", "Combat Axe");
        Equipments.put("Equipment_3", "Frag");
        Equipments.put("Equipment_4", "Molotov");
        Equipments.put("Equipment_5", "Concussion");

        /* Specialist */
        HashMap<String, String> Specialist = new HashMap<>();
        Specialist.put("Specialist_1", "Ajax");
        Specialist.put("Specialist_2", "Battery");
        Specialist.put("Specialist_3", "Crash");
        Specialist.put("Specialist_4", "Firebreak");
        Specialist.put("Specialist_5", "Nomad");
        Specialist.put("Specialist_6", "Prophet");
        Specialist.put("Specialist_7", "Recon");
        Specialist.put("Specialist_8",  "Ruin");
        Specialist.put("Specialist_9", "Seraph");
        Specialist.put("Specialist_10", "Torque");
        Specialist.put("Specialist_11",   "Zero");

        HashMap<String, String> Gears = new HashMap<>();
        Gears.put("Gear_1", "Equipment Charge");
        Gears.put("Gear_2", "Stim Shot");
        Gears.put("Gear_3", "Comsec Device");

        Gears.put("Gear_4", "Body Armor");
        Gears.put("Gear_5", "Acoustic Sensor");

        HashMap<Integer, String> Perk1 = new HashMap<>();
        Perk1.put(1, "Scavenger");
        Perk1.put(2, "Engineer");
        Perk1.put(3, "Flak Jacket");
        Perk1.put(4, "Tactical Mask");


        HashMap<Integer, String> Perk2 = new HashMap<>();
        Perk2.put(1, "Lightweight");
        Perk2.put(2, "Skulker");
        Perk2.put(3, "Cold Blooded");
        Perk2.put(4, "Gung-Ho");
        Perk2.put(5, "Dexterity" );

        HashMap<Integer, String> Perk3 = new HashMap<>();
        Perk3.put(1, "Ghost");
        Perk3.put(2, "Team Link");
        Perk3.put(3, "Dead Silence");
        Perk3.put(4, "Tracker" );

        //KillStreak HashMaps
        HashMap<Integer, String> Killstreak_1 = new HashMap<>();
        Killstreak_1.put(1, "RC-XD");
        Killstreak_1.put(2,"Dart" );
        Killstreak_1.put(3, "UAV");
        Killstreak_1.put(4,"Care Package" );
        Killstreak_1.put(5, "Counter UAV");

        HashMap<Integer, String> Killstreak_2 = new HashMap<>();
        Killstreak_2.put(1, "Hellstorm Missile");
        Killstreak_2.put(2,"Lightning Strike" );
        Killstreak_2.put(3, "Mantis");
        Killstreak_2.put(4,"Sentry Gun");
        Killstreak_2.put(5, "Drone Squad");

        HashMap<Integer, String> Killstreak_3 = new HashMap<>();
        Killstreak_3.put(1, "Sniper’s Nest");
        Killstreak_3.put(2,"Attack Chopper" );
        Killstreak_3.put(3, "Strike Team");
        Killstreak_3.put(4,"Thresher");
        Killstreak_3.put(5, "Gunship");



         System.out.println("Your entire class is");

        // Get a random entry from the HashMap.
        Object[] AR = AssaultRifle.keySet().toArray();
        Object key = AR[new Random().nextInt(AR.length)];

        /*Get Sub-machine weapon*/
        Object[] Sub = SubMachine.keySet().toArray();
        Object keySub = Sub[new Random().nextInt(Sub.length)];

        //Get Tactical Rifles
        Object[] Tactical = TacticalRifles.keySet().toArray();
        Object key_Tactical = Tactical[new Random().nextInt(Tactical.length)];

        //Get Light Machine
        Object[] LMG = LightMachine.keySet().toArray();
        Object key_LMG = LMG[new Random().nextInt(LMG.length)];

        //Get Snipers
        Object[] Sniper = Snipers.keySet().toArray();
        Object key_Snipers = Sniper[new Random().nextInt(Sniper.length)];

        /*Secondary Weapons*/

        Object[] Pistol = Pistols.keySet().toArray();
        Object key_Pistols = Pistol[new Random().nextInt(Pistol.length)];

        //Shotguns
        Object[] Shotgun = Shotguns.keySet().toArray();
        Object key_Shotgun = Shotgun[new Random().nextInt(Shotgun.length)];

        //Melee Launch
        Object[] Melees = Melee.keySet().toArray();
        Object key_Melee = Melees[new Random().nextInt(Melees.length)];

        Object[] Launcher_And_Specials = LauncherSpecials.keySet().toArray();
        Object key_LauncherSpecial = Launcher_And_Specials[new Random().nextInt(Launcher_And_Specials.length)];

        Random gen = new Random();
        int randomPrimary = gen.nextInt(Primary.length);
        int randomSecondary = gen.nextInt(Secondary.length);



        // Now that I have this working, now its time to choose random weapon from each type, and place in the correct place bek=low
        Object Specialists = Specialist.keySet().toArray()[new Random().nextInt(Specialist.keySet().toArray().length)];
        System.out.println("Your Specialist: " + Specialist.get(Specialists));
        switch (randomPrimary) {
            case 0:

                System.out.println("Assault or Primary Weapon: \n" + AssaultRifle.get(key));
                break;
            case 1:
                System.out.println("Sub Machine: " + SubMachine.get(keySub));
                
                break;
            case 2:
                System.out.println("Tactical Rifle: " + TacticalRifles.get(key_Tactical));

                break;
            case 3:
                System.out.println("Light Machine: " + LightMachine.get(key_LMG));

                break;
            case 4:
                System.out.println("Snipers: " + Snipers.get(key_Snipers));
                break;
        }

        switch (randomSecondary){
            case 0:
                System.out.println("Pistol: " + Pistols.get(key_Pistols));
                break;
            case 1:
                System.out.println("Shotguns: " + Shotguns.get(key_Shotgun));
                break;
            case 2:
                System.out.println("Melee: " + Melee.get(key_Melee));
                break;
            case 3:
                System.out.println("Launcher or Special: " + LauncherSpecials.get(key_LauncherSpecial));
                break;
        }
        Object Equipment = Equipments.keySet().toArray()[new Random().nextInt(Equipments.keySet().toArray().length)];
        System.out.println(Equipments.get(Equipment));

        Object Gear = Gears.keySet().toArray()[new Random().nextInt(Gears.keySet().toArray().length)];
        System.out.println(Gears.get(Gear));

        Object Perk_1 = Perk1.keySet().toArray()[new Random().nextInt(Perk1.keySet().toArray().length)];
        System.out.println("Perk 1: " + Perk1.get(Perk_1) );

        Object Perk_2 = Perk2.keySet().toArray()[new Random().nextInt(Perk2.keySet().toArray().length)];
        System.out.println("Perk 2: "+ Perk2.get(Perk_2));

        Object Perk_3 = Perk3.keySet().toArray()[new Random().nextInt(Perk3.keySet().toArray().length)];
        System.out.println("Perk 3: " + Perk3.get(Perk_3));

        Object KillStreak1 = Killstreak_1.keySet().toArray()[new Random().nextInt(Killstreak_1.keySet().toArray().length)];
        Object KillStreak2 = Killstreak_2.keySet().toArray()[new Random().nextInt(Killstreak_2.keySet().toArray().length)];
        Object KillStreak3 = Killstreak_3.keySet().toArray()[new Random().nextInt(Killstreak_3.keySet().toArray().length)];

        System.out.println("Your Kill streaks are: " + Killstreak_1.get(KillStreak1) + "," + Killstreak_2.get(KillStreak2) + ", and " + Killstreak_3.get(KillStreak3));



    }

}
