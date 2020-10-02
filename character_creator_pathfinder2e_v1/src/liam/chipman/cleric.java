package liam.chipman;

import java.util.Scanner;

class cleric extends dnd_class{

    private void chooseDeityAndDomains(player player){
        Main.delayedPrint("As a Cleric you are required to choose a deity");
        Main.delayedPrint("1.  Erastil, God of Farming, Hunting, Trade, and Family");
        Main.delayedPrint("2.  Iomedae, Goddess of Valor, Rulership, Justice, and Honor");
        Main.delayedPrint("3.  Torag, God of the Forge, Protection, and Strategy");
        Main.delayedPrint("4.  Sarenrae, Goddess of the Sun, Redemption, Honesty, and Healing");
        Main.delayedPrint("5.  Shelyn, Goddess of Beauty, Art, Love, and Music");
        Main.delayedPrint("6.  Desna, Goddess of Dreams, Stars, Travelers, and Luck");
        Main.delayedPrint("7.  Cayden Cailean, God of Freedom, Ale, Wine, and Bravery");
        Main.delayedPrint("8.  Abadar, God of Cities, Wealth, Merchants, and Law");
        Main.delayedPrint("9.  Irori, God of History, Knowledge, and Self-Perfection");
        Main.delayedPrint("10. Gozreth, Deity of Nature, Weather, and the Sea");
        Main.delayedPrint("11. Pharasma, Goddess of Fate, Death, Prophecy, and Birth");
        Main.delayedPrint("12. Nethys, God of Magic");
        Main.delayedPrint("13. Gorum, God of Strength, Battle, and Weapons");
        Main.delayedPrint("14. Calistria, Goddess of Trickery, Lust, and Revenge");
        Main.delayedPrint("15. Asmodeus, God of Tyranny, Slavery, Pride, and Contracts");
        Main.delayedPrint("16. Zon-Kuthon, God of Envy, Pain, Darkness, and Loss");
        Main.delayedPrint("17. Urgathoa, Goddess of Gluttony, Disease, and Undeath");
        Main.delayedPrint("18. Norgorber, God of Greed, Secrets, Poison, and Murder");
        Main.delayedPrint("19. Lamashtu, Goddess of Madness, Monster, and Nightmares");
        Main.delayedPrint("20. Rovagug, God of Wrath, Disaster, and Destruction");
        Main.delayedPrint("21. Custom Deity");
        int option = Main.chooseOption(21);
        String[] domains = new String[5];
        switch (option){
            case 1:
                Main.delayedPrint("Erastil:");
                Main.delayedPrint("Alignment: Lawful Good");
                Main.delayedPrint("Domains: Animal, Community, Good, Law, Plant");
                Main.delayedPrint("Favored Weapon: Longbow");
                Main.delayedPrint("1. Choose Erastil as your deity");
                Main.delayedPrint("2. Return To Deities");
                option = Main.chooseOption(2);
                switch (option){
                    case 1:
                        player.setDeity("Erastil");
                        domains[0] = "Animal";
                        domains[1] = "Community";
                        domains[2] = "Good";
                        domains[3] = "Law";
                        domains[4] = "Plant";
                        player.addProficiency("Longbow");
                        player.addAlignment_restrictions("Any Lawful or Good");
                        break;
                    case 2:
                        chooseDeityAndDomains(player);
                        break;
                }
            case 2:
                Main.delayedPrint("Iomedae:");
                Main.delayedPrint("Alignment: Lawful Good");
                Main.delayedPrint("Domains: Glory, Good, Law, Sun, War");
                Main.delayedPrint("Favored Weapon: Longsword");
                Main.delayedPrint("1. Choose Iomedae as your deity");
                Main.delayedPrint("2. Return To Deities");
                option = Main.chooseOption(2);
                switch (option){
                    case 1:
                        player.setDeity("Iomedae");
                        domains[0] = "Glory";
                        domains[1] = "Good";
                        domains[2] = "Law";
                        domains[3] = "Sun";
                        domains[4] = "War";
                        player.addProficiency("Longsword");
                        player.addAlignment_restrictions("Any Lawful or Good");
                        break;
                    case 2:
                        chooseDeityAndDomains(player);
                        break;
                }
                break;
            case 3:
                Main.delayedPrint("Torag:");
                Main.delayedPrint("Alignment: Lawful Good");
                Main.delayedPrint("Domains: Artifice, Earth, Good, Law, Protection");
                Main.delayedPrint("Favored Weapon: Warhammer");
                Main.delayedPrint("1. Choose Torag as your deity");
                Main.delayedPrint("2. Return To Deities");
                option = Main.chooseOption(2);
                switch (option){
                    case 1:
                        player.setDeity("Torag");
                        domains[0] = "Artifice";
                        domains[1] = "Earth";
                        domains[2] = "Good";
                        domains[3] = "Law";
                        domains[4] = "Protection";
                        player.addProficiency("Warhammer");
                        player.addAlignment_restrictions("Any Lawful or Good");
                        break;
                    case 2:
                        chooseDeityAndDomains(player);
                        break;
                }
                break;
            case 4:
                Main.delayedPrint("Sarenrae:");
                Main.delayedPrint("Alignment: Neutral Good");
                Main.delayedPrint("Domains: Fire, Glory, Good, Healing, Sun");
                Main.delayedPrint("Favored Weapon: Scimitar");
                Main.delayedPrint("1. Choose Sarenrae as your deity");
                Main.delayedPrint("2. Return To Deities");
                option = Main.chooseOption(2);
                switch (option){
                    case 1:
                        player.setDeity("Sarenrae");
                        domains[0] = "Fire";
                        domains[1] = "Glory";
                        domains[2] = "Good";
                        domains[3] = "Healing";
                        domains[4] = "Sun";
                        player.addProficiency("Scimitar");
                        player.addAlignment_restrictions("Any Neutral or Good");
                        break;
                    case 2:
                        chooseDeityAndDomains(player);
                        break;
                }
                break;
            case 5:
                Main.delayedPrint("Shelyn:");
                Main.delayedPrint("Alignment: Neutral Good");
                Main.delayedPrint("Domains: Air, Charm, Good, Luck, Protection");
                Main.delayedPrint("Favored Weapon: Glaive");
                Main.delayedPrint("1. Choose Shelyn as your deity");
                Main.delayedPrint("2. Return To Deities");
                option = Main.chooseOption(2);
                switch (option){
                    case 1:
                        player.setDeity("Shelyn");
                        domains[0] = "Air";
                        domains[1] = "Charm";
                        domains[2] = "Good";
                        domains[3] = "Luck";
                        domains[4] = "Protection";
                        player.addProficiency("Glaive");
                        player.addAlignment_restrictions("Any Neutral or Good");
                        break;
                    case 2:
                        chooseDeityAndDomains(player);
                        break;
                }
                break;
            case 6:
                Main.delayedPrint("Desna:");
                Main.delayedPrint("Alignment: Chaotic Good");
                Main.delayedPrint("Domains: Chaos, Good, Liberation, Luck, Travel");
                Main.delayedPrint("Favored Weapon: Starknife");
                Main.delayedPrint("1. Choose Desna as your deity");
                Main.delayedPrint("2. Return To Deities");
                option = Main.chooseOption(2);
                switch (option){
                    case 1:
                        player.setDeity("Desna");
                        domains[0] = "Chaos";
                        domains[1] = "Good";
                        domains[2] = "Liberation";
                        domains[3] = "Luck";
                        domains[4] = "Travel";
                        player.addProficiency("Starknife");
                        player.addAlignment_restrictions("Any Chaotic or Good");
                        break;
                    case 2:
                        chooseDeityAndDomains(player);
                        break;
                }
                break;
            case 7:
                Main.delayedPrint("Cayden Cailean:");
                Main.delayedPrint("Alignment: Chaotic Good");
                Main.delayedPrint("Domains: Chaos, Charm, Good, Strength, Travel");
                Main.delayedPrint("Favored Weapon: Rapier");
                Main.delayedPrint("1. Choose Cayden Cailean as your deity");
                Main.delayedPrint("2. Return To Deities");
                option = Main.chooseOption(2);
                switch (option){
                    case 1:
                        player.setDeity("Cayden Cailean");
                        domains[0] = "Chaos";
                        domains[1] = "Charm";
                        domains[2] = "Good";
                        domains[3] = "Strength";
                        domains[4] = "Travel";
                        player.addProficiency("Rapier");
                        player.addAlignment_restrictions("Any Chaotic or Good");
                        break;
                    case 2:
                        chooseDeityAndDomains(player);
                        break;
                }
                break;
            case 8:
                Main.delayedPrint("Abadar:");
                Main.delayedPrint("Alignment: Lawful Neutral");
                Main.delayedPrint("Domains: Earth, Law, Nobility, Protection, Travel");
                Main.delayedPrint("Favored Weapon: Light Crossbow");
                Main.delayedPrint("1. Choose Abadar as your deity");
                Main.delayedPrint("2. Return To Deities");
                option = Main.chooseOption(2);
                switch (option){
                    case 1:
                        player.setDeity("Abadar");
                        domains[0] = "Earth";
                        domains[1] = "Law";
                        domains[2] = "Nobility";
                        domains[3] = "Protection";
                        domains[4] = "Travel";
                        player.addProficiency("Light Crossbow");
                        player.addAlignment_restrictions("Any Lawful or Neutral");
                        break;
                    case 2:
                        chooseDeityAndDomains(player);
                        break;
                }
                break;
            case 9:
                Main.delayedPrint("Irori:");
                Main.delayedPrint("Alignment: Lawful Neutral");
                Main.delayedPrint("Domains: Healing, Knowledge, Law, Rune, Strength");
                Main.delayedPrint("Favored Weapon: Unarmed Strike");
                Main.delayedPrint("1. Choose Irori as your deity");
                Main.delayedPrint("2. Return To Deities");
                option = Main.chooseOption(2);
                switch (option){
                    case 1:
                        player.setDeity("Irori");
                        domains[0] = "Healing";
                        domains[1] = "Knowledge";
                        domains[2] = "Law";
                        domains[3] = "Rune";
                        domains[4] = "Strength";
                        player.addProficiency("Unarmed Strike");
                        player.addAlignment_restrictions("Any Lawful or Neutral");
                        break;
                    case 2:
                        chooseDeityAndDomains(player);
                        break;
                }
                break;
            case 10:
                Main.delayedPrint("Gozreth:");
                Main.delayedPrint("Alignment: Neutral");
                Main.delayedPrint("Domains: Air, Animal, Plant, Water, Weather");
                Main.delayedPrint("Favored Weapon: Trident");
                Main.delayedPrint("1. Choose Gozreth as your deity");
                Main.delayedPrint("2. Return To Deities");
                option = Main.chooseOption(2);
                switch (option){
                    case 1:
                        player.setDeity("Gozreth");
                        domains[0] = "Air";
                        domains[1] = "Animal";
                        domains[2] = "Plant";
                        domains[3] = "Water";
                        domains[4] = "Weather";
                        player.addProficiency("Trident");
                        player.addAlignment_restrictions("Any Neutral");
                        break;
                    case 2:
                        chooseDeityAndDomains(player);
                        break;
                }
                break;
            case 11:
                Main.delayedPrint("Pharasma:");
                Main.delayedPrint("Alignment: Neutral");
                Main.delayedPrint("Domains: Death, Healing, Knowledge, Repose, Water");
                Main.delayedPrint("Favored Weapon: Dagger");
                Main.delayedPrint("1. Choose Pharasma as your deity");
                Main.delayedPrint("2. Return To Deities");
                option = Main.chooseOption(2);
                switch (option){
                    case 1:
                        player.setDeity("Pharasma");
                        domains[0] = "Death";
                        domains[1] = "Healing";
                        domains[2] = "Knowledge";
                        domains[3] = "Repose";
                        domains[4] = "Water";
                        player.addProficiency("Dagger");
                        player.addAlignment_restrictions("Any Neutral");
                        break;
                    case 2:
                        chooseDeityAndDomains(player);
                        break;
                }
                break;
            case 12:
                Main.delayedPrint("Nethys:");
                Main.delayedPrint("Alignment: Neutral");
                Main.delayedPrint("Domains: Destruction, Knowledge, Magic, Protection, Rune");
                Main.delayedPrint("Favored Weapon: Quarterstaff");
                Main.delayedPrint("1. Choose Nethys as your deity");
                Main.delayedPrint("2. Return To Deities");
                option = Main.chooseOption(2);
                switch (option){
                    case 1:
                        player.setDeity("Nethys");
                        domains[0] = "Destruction";
                        domains[1] = "Knowledge";
                        domains[2] = "Magic";
                        domains[3] = "Protection";
                        domains[4] = "Rune";
                        player.addProficiency("Quarterstaff");
                        player.addAlignment_restrictions("Any Neutral");
                        break;
                    case 2:
                        chooseDeityAndDomains(player);
                        break;
                }
                break;
            case 13:
                Main.delayedPrint("Gorum:");
                Main.delayedPrint("Alignment: Chaotic Neutral");
                Main.delayedPrint("Domains: Chaos, Destruction, Glory, Strength, War");
                Main.delayedPrint("Favored Weapon: Greatsword");
                Main.delayedPrint("1. Choose Gorum as your deity");
                Main.delayedPrint("2. Return To Deities");
                option = Main.chooseOption(2);
                switch (option){
                    case 1:
                        player.setDeity("Gorum");
                        domains[0] = "Chaos";
                        domains[1] = "Destruction";
                        domains[2] = "Glory";
                        domains[3] = "Strength";
                        domains[4] = "War";
                        player.addProficiency("Greatsword");
                        player.addAlignment_restrictions("Any Chaotic or Neutral");
                        break;
                    case 2:
                        chooseDeityAndDomains(player);
                        break;
                }
                break;
            case 14:
                Main.delayedPrint("Calistria:");
                Main.delayedPrint("Alignment: Chaotic Neutral");
                Main.delayedPrint("Domains: Chaos, Charm, Knowledge, Luck, Trickery");
                Main.delayedPrint("Favored Weapon: Whip");
                Main.delayedPrint("1. Choose Calistria as your deity");
                Main.delayedPrint("2. Return To Deities");
                option = Main.chooseOption(2);
                switch (option){
                    case 1:
                        player.setDeity("Calistria");
                        domains[0] = "Chaos";
                        domains[1] = "Charm";
                        domains[2] = "Knowledge";
                        domains[3] = "Luck";
                        domains[4] = "Trickery";
                        player.addProficiency("Whip");
                        player.addAlignment_restrictions("Any Chaotic or Neutral");
                        break;
                    case 2:
                        chooseDeityAndDomains(player);
                        break;
                }
                break;
            case 15:
                Main.delayedPrint("Asmodeus:");
                Main.delayedPrint("Alignment: Lawful Evil");
                Main.delayedPrint("Domains: Evil, Fire, Law, Magic, Trickery");
                Main.delayedPrint("Favored Weapon: Mace");
                Main.delayedPrint("1. Choose Asmodeus as your deity");
                Main.delayedPrint("2. Return To Deities");
                option = Main.chooseOption(2);
                switch (option){
                    case 1:
                        player.setDeity("Asmodeus");
                        domains[0] = "Evil";
                        domains[1] = "Fire";
                        domains[2] = "Law";
                        domains[3] = "Magic";
                        domains[4] = "Trickery";
                        player.addProficiency("Mace");
                        player.addAlignment_restrictions("Any Lawful or Evil");
                        break;
                    case 2:
                        chooseDeityAndDomains(player);
                        break;
                }
                break;
            case 16:
                Main.delayedPrint("Zon-Kuthon:");
                Main.delayedPrint("Alignment: Lawful Evil");
                Main.delayedPrint("Domains: Darkness, Death, Destruction, Evil, Law");
                Main.delayedPrint("Favored Weapon: Spiked Chain");
                Main.delayedPrint("1. Choose Zon-Kuthon as your deity");
                Main.delayedPrint("2. Return To Deities");
                option = Main.chooseOption(2);
                switch (option){
                    case 1:
                        player.setDeity("Zon-Kuthon");
                        domains[0] = "Darkness";
                        domains[1] = "Death";
                        domains[2] = "Destruction";
                        domains[3] = "Evil";
                        domains[4] = "Law";
                        player.addProficiency("Spiked Chain");
                        player.addAlignment_restrictions("Any Lawful or Evil");
                        break;
                    case 2:
                        chooseDeityAndDomains(player);
                        break;
                }
                break;
            case 17:
                Main.delayedPrint("Urgathoa:");
                Main.delayedPrint("Alignment: Neutral Evil");
                Main.delayedPrint("Domains: Death, Evil, Magic, Strength, War");
                Main.delayedPrint("Favored Weapon: Scythe");
                Main.delayedPrint("1. Choose Urgathoa as your deity");
                Main.delayedPrint("2. Return To Deities");
                option = Main.chooseOption(2);
                switch (option){
                    case 1:
                        player.setDeity("Urgathoa");
                        domains[0] = "Death";
                        domains[1] = "Evil";
                        domains[2] = "Magic";
                        domains[3] = "Strength";
                        domains[4] = "War";
                        player.addProficiency("Scythe");
                        player.addAlignment_restrictions("Any Neutral or Evil");
                        break;
                    case 2:
                        chooseDeityAndDomains(player);
                        break;
                }
                break;
            case 18:
                Main.delayedPrint("Norgorber:");
                Main.delayedPrint("Alignment: Neutral Evil");
                Main.delayedPrint("Domains: Charm, Death, Evil, Knowledge, Trickery");
                Main.delayedPrint("Favored Weapon: Short Sword");
                Main.delayedPrint("1. Choose Norgorber as your deity");
                Main.delayedPrint("2. Return To Deities");
                option = Main.chooseOption(2);
                switch (option){
                    case 1:
                        player.setDeity("Norgorber");
                        domains[0] = "Charm";
                        domains[1] = "Death";
                        domains[2] = "Evil";
                        domains[3] = "Knowledge";
                        domains[4] = "Trickery";
                        player.addProficiency("Short Sword");
                        player.addAlignment_restrictions("Any Neutral or Evil");
                        break;
                    case 2:
                        chooseDeityAndDomains(player);
                        break;
                }
                break;
            case 19:
                Main.delayedPrint("Lamashtu:");
                Main.delayedPrint("Alignment: Chaotic Evil");
                Main.delayedPrint("Domains: Chaos, Evil, Madness, Strength, Trickery");
                Main.delayedPrint("Favored Weapon: Falchion");
                Main.delayedPrint("1. Choose Lamashtu as your deity");
                Main.delayedPrint("2. Return To Deities");
                option = Main.chooseOption(2);
                switch (option){
                    case 1:
                        player.setDeity("Lamashtu");
                        domains[0] = "Chaos";
                        domains[1] = "Evil";
                        domains[2] = "Madness";
                        domains[3] = "Strength";
                        domains[4] = "Trickery";
                        player.addProficiency("Falchion");
                        player.addAlignment_restrictions("Any Chaotic or Evil");
                        break;
                    case 2:
                        chooseDeityAndDomains(player);
                        break;
                }
                break;
            case 20:
                Main.delayedPrint("Rovagug:");
                Main.delayedPrint("Alignment: Chaotic Evil");
                Main.delayedPrint("Domains: Chaos, Destruction, Evil, War, Weather");
                Main.delayedPrint("Favored Weapon: Greataxe");
                Main.delayedPrint("1. Choose Rovagug as your deity");
                Main.delayedPrint("2. Return To Deities");
                option = Main.chooseOption(2);
                switch (option){
                    case 1:
                        player.setDeity("Rovagug");
                        domains[0] = "Chaos";
                        domains[1] = "Destruction";
                        domains[2] = "Evil";
                        domains[3] = "War";
                        domains[4] = "Weather";
                        player.addProficiency("Greataxe");
                        player.addAlignment_restrictions("Any Chaotic or Evil");
                        break;
                    case 2:
                        chooseDeityAndDomains(player);
                        break;
                }
                break;
            case 21:
                Main.delayedPrint("Enter the name of your deity:");
                Scanner scan = new Scanner(System.in);
                player.setDeity(scan.next());
                Main.delayedPrint("Please choose the alignment of your good");
                Main.delayedPrint("1. Lawful Good");
                Main.delayedPrint("2. Neutral Good");
                Main.delayedPrint("3. Chaotic Good");
                Main.delayedPrint("4. Lawful Neutral");
                Main.delayedPrint("5. Neutral");
                Main.delayedPrint("6. Chaotic Neutral");
                Main.delayedPrint("7. Lawful Evil");
                Main.delayedPrint("8. Neutral Evil");
                Main.delayedPrint("9. Chaotic Evil");
                option = Main.chooseOption(9);
                switch (option){
                    case 1:
                        player.addAlignment_restrictions("Any Lawful or Good");
                        break;
                    case 2:
                        player.addAlignment_restrictions("Any Neutral or Good");
                        break;
                    case 3:
                        player.addAlignment_restrictions("Any Chaotic or Good");
                        break;
                    case 4:
                        player.addAlignment_restrictions("Any Lawful or Neutral");
                        break;
                    case 5:
                        player.addAlignment_restrictions("Any Neutral");
                        break;
                    case 6:
                        player.addAlignment_restrictions("Any Chaotic or Neutral");
                        break;
                    case 7:
                        player.addAlignment_restrictions("Any Lawful or Evil");
                        break;
                    case 8:
                        player.addAlignment_restrictions("Any Neutral or Evil");
                        break;
                    case 9:
                        player.addAlignment_restrictions("Any Chaotic or Evil");
                        break;
                }
                int num_domains = 2;
                String[] all_domains = new String[] {"Air", "Animal", "Artifice", "Chaos", "Charm", "Community", "Darkness", "Death", "Destruction", "Earth", "Evil", "Fire", "Glory", "Good", "Healing", "Knowledge", "Law", "Liberation", "Luck", "Madness", "Magic", "Nobility", "Plant", "Protection", "Repose", "Rune", "Strength", "Sun", "Travel", "Trickery", "War", "Water", "Weather"};
                while (num_domains > 0) {
                    Main.delayedPrint("Please choose a domain!");
                    for (int i = 0; i < all_domains.length; i++) {
                        Main.delayedPrint("" + (i+1) + ". " + all_domains[i]);
                    }
                    Main.delayedPrint("Please choose which option you'd like to use:");
                    option = Main.chooseOption(all_domains.length);
                    if (all_domains[option-1].contains("(Already Known)")){
                        Main.delayedPrint("You already know that domain.");
                    }
                    else {
                        player.addDomain(all_domains[option - 1]);
                        all_domains[option - 1] += " (Already Known)";
                        num_domains--;
                    }
                }
                Main.delayedPrint("Enter your deity's favored weapon:");
                player.addProficiency(scan.next());
                break;
        }
        int num_domains = 2;
        while (num_domains > 0) {
            Main.delayedPrint("Please choose a domain!");
            for (int i = 0; i <  domains.length; i++) {
                Main.delayedPrint("" + (i+1) + ". " +  domains[i]);
            }
            Main.delayedPrint("Please choose which option you'd like to use:");
            option = Main.chooseOption( domains.length);
            if ( domains[option-1].contains("(Already Known)")){
                Main.delayedPrint("You already know that domain.");
            }
            else {
                player.addDomain(domains[option - 1]);
                domains[option - 1] += " (Already Known)";
                num_domains--;
            }
        }
    }

    public cleric(player player){
        player.setDnd_class("Cleric");
        player.addHit_dice(8);
        for (int i = 0; i < player.getSkills().size(); i++){
            if (player.getSkills().get(i).getName().equals("Appraise") || player.getSkills().get(i).getName().contains("Craft") || player.getSkills().get(i).getName().equals("Diplomacy") || player.getSkills().get(i).getName().equals("Heal") || player.getSkills().get(i).getName().equals("Knowledge (Arcana)") || player.getSkills().get(i).getName().equals("Knowledge (History)") || player.getSkills().get(i).getName().equals("Knowledge (Nobility)") || player.getSkills().get(i).getName().equals("Knowledge (Planes)") || player.getSkills().get(i).getName().equals("Knowledge (Religion)") || player.getSkills().get(i).getName().equals("Linguistics") || player.getSkills().get(i).getName().contains("Profession") || player.getSkills().get(i).getName().equals("Sense Motive") || player.getSkills().get(i).getName().equals("Spellcraft")){
                player.getSkills().get(i).setIs_class_skill(true);
            }
        }
        player.addProficiency("all simple weapons");
        player.addProficiency("light armor");
        player.addProficiency("medium armor");
        player.addProficiency("shields (except tower shields)");
        player.setFavored_class(0, "Cleric");
        player.addTrait_or_feature(addClassFeature("Aura", "A cleric of a chaotic, evil, good, or lawful deity has a particularly powerful aura corresponding to the deity’s alignment.", "A cleric of a chaotic, evil, good, or lawful deity has a particularly powerful aura corresponding to the deity’s alignment "));
        player.addTrait_or_feature(addClassFeature("Spells", "A cleric can cast spells", "A cleric casts divine spells which are drawn from the cleric spell list. Her alignment, however, may restrict her from casting certain spells opposed to her moral or ethical beliefs; see Chaotic, Evil, Good, and Lawful Spells. A cleric must choose and prepare her spells in advance. To prepare or cast a spell, a cleric must have a Wisdom score equal to at least 10 + the spell level. The Difficulty Class for a saving throw against a cleric’s spell is 10 + the spell level + the cleric’s Wisdom modifier. Like other spellcasters, a cleric can cast only a certain number of spells of each spell level per day. Her base daily spell allotment is given on Table: Cleric. In addition, she receives bonus spells per day if she has a high Wisdom score (see Table: Ability Modifiers and Bonus Spells). Clerics meditate or pray for their spells. Each cleric must choose a time at which she must spend 1 hour each day in quiet contemplation or supplication to regain her daily allotment of spells. Time spent resting has no effect on whether a cleric can prepare spells. A cleric may prepare and cast any spell on the cleric spell list, provided that she can cast spells of that level, but she must choose which spells to prepare during her daily meditation. Chaotic, Evil, Good, and Lawful Spells A cleric can’t cast spells of an alignment opposed to her own or her deity’s (if she has one). Spells associated with particular alignments are indicated by the chaotic, evil, good, and lawful descriptors in their spell descriptions."));
        player.addTrait_or_feature(addClassFeature("Channel Energy", "A cleric can channel positive or negative energy to heal the living or damage undead", "Regardless of alignment, any cleric can release a wave of energy by channeling the power of her faith through her holy (or unholy) symbol. This energy can be used to cause or heal damage, depending on the type of energy channeled and the creatures targeted. A good cleric (or a neutral cleric who worships a good deity) channels positive energy and can choose to deal damage to undead creatures or to heal living creatures. An evil cleric (or a neutral cleric who worships an evil deity) channels negative energy and can choose to deal damage to living creatures or to heal undead creatures. A neutral cleric of a neutral deity (or one who is not devoted to a particular deity) must choose whether she channels positive or negative energy. Once this choice is made, it cannot be reversed. This decision also determines whether the cleric can cast spontaneous cure or inflict spells (see spontaneous casting). Channeling energy causes a burst that affects all creatures of one type (either undead or living) in a 30-foot radius centered on the cleric. The amount of damage dealt or healed is equal to 1d6 points of damage plus 1d6 points of damage for every two cleric levels beyond 1st (2d6 at 3rd, 3d6 at 5th, and so on). Creatures that take damage from channeled energy receive a Will save to halve the damage. The DC of this save is equal to 10 + 1/2 the cleric’s level + the cleric’s Charisma modifier. Creatures healed by channel energy cannot exceed their maximum hit point total—all excess healing is lost. A cleric may channel energy a number of times per day equal to 3 + her Charisma modifier. This is a standard action that does not provoke an attack of opportunity. A cleric can choose whether or not to include herself in this effect. A cleric must be able to present her holy symbol to use this ability."));
        player.addTrait_or_feature(addClassFeature("Domains", "A cleric’s deity influences her alignment, what magic she can perform, her values, and how others see her.", "A cleric’s deity influences her alignment, what magic she can perform, her values, and how others see her. A cleric chooses two domains from among those belonging to her deity. A cleric can select an alignment domain (Chaos, Evil, Good, or Law) only if her alignment matches that domain. If a cleric is not devoted to a particular deity, she still selects two domains to represent her spiritual inclinations and abilities (subject to GM approval). The restriction on alignment domains still applies. Each domain grants a number of domain powers, dependent upon the level of the cleric, as well as a number of bonus spells. A cleric gains one domain spell slot for each level of cleric spell she can cast, from 1st on up. Each day, a cleric can prepare one of the spells from her two domains in that slot. If a domain spell is not on the cleric spell list, a cleric can prepare it only in her domain spell slot. Domain spells cannot be used to cast spells spontaneously. In addition, a cleric gains the listed powers from both of her domains, if she is of a high enough level. Unless otherwise noted, activating a domain power is a standard action."));
        chooseDeityAndDomains(player);
        player.addTrait_or_feature(addClassFeature("Orisons", "A Cleric knows a few spells they can cast an infinite amount of times", "Clerics can prepare a number of orisons, or 0-level spells, each day. These spells are treated like any other spell, but they are not expended when cast and may be used again."));
        player.addTrait_or_feature(addClassFeature("Spontaneous Casting", "A cleric can expend a spell slot to cast a cure or inflict spell of the same spell level depending on alignment", "A good cleric (or a neutral cleric of a good deity) can channel stored spell energy into healing spells that she did not prepare ahead of time. The cleric can “lose” any prepared spell that is not an orison or domain spell in order to cast any cure spell of the same spell level or lower (a cure spell is any spell with “cure” in its name). An evil cleric (or a neutral cleric of an evil deity) can’t convert prepared spells to cure spells but can convert them to inflict spells (an inflict spell is one with “inflict” in its name). A cleric who is neither good nor evil and whose deity is neither good nor evil can convert spells to either cure spells or inflict spells (player’s choice). Once the player makes this choice, it cannot be reversed. This choice also determines whether the cleric channels positive or negative energy (see channel energy)."));
        player.setBase_attack_bonus(0);
        player.setBase_fortitude_save(player.getBase_fortitude_save() + 2);
        player.setBase_will_save(player.getBase_will_save() + 2);
        player.setLevel_1_spells_per_day(player.getLevel_1_spells_per_day() + 1);
        player.setLevel_1_domain_spells_per_day(1);
        player.setCantrips_knows(player.getCantrips_knows() + 3);
        addRanks(player);
    }

}
