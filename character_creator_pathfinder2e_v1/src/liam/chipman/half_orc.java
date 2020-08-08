package liam.chipman;

class half_orc extends race{

    public half_orc(player player){
        Main.delayedPrint("As a half-orc you get +2 to one ability score");
        Main.delayedPrint("1. Strength");
        Main.delayedPrint("2. Dexterity");
        Main.delayedPrint("3. Constitution");
        Main.delayedPrint("4. Intelligence");
        Main.delayedPrint("5. Wisdom");
        Main.delayedPrint("6. Charisma");
        Main.delayedPrint("Please enter which option you would like to use:");
        int option = Main.chooseOption(6);
        switch (option) {
            case 1:
                player.str_score += 2;
                break;
            case 2:
                player.dex_score += 2;
                break;
            case 3:
                player.con_score += 2;
                break;
            case 4:
                player.int_score += 2;
                break;
            case 5:
                player.wis_score += 2;
                break;
            case 6:
                player.cha_score += 2;
                break;
        }
        player.size = "Medium";
        player.speed = 30;
        player.vision = "You can see in the dark up to 60 feet.";
        player.traits_and_features.add(addRacialTrait("Intimidating", "+2 to intimidation", "Half-orcs receive a +2 racial bonus on Intimidate skill checks due to their fearsome nature."));
        player.traits_and_features.add(addRacialTrait("Orc Blood", "You count as both orc and human", "You count as both orc and humans for any effect related to race."));
        player.traits_and_features.add(addRacialTrait("Orc Ferocity", "Once per day when brought to 0 hp fight for one more round", "Once per day, when a half-orc is brought below 0 hit points but not killed, he can fight on for one more round as if disabled. At the end of his next turn, unless brought to above 0 hit points, he immediately falls unconscious and begins dying."));
        player.proficiencies.add("greataxes");
        player.proficiencies.add("falchions");
        player.proficiencies.add("you treat any weapon with the name \"orc\" in its name as a martial weapon.");
        player.languages.add("Common");
        player.languages.add("Orc");
    }

}
