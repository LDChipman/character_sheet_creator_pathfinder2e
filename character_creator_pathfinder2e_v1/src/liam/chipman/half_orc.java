package liam.chipman;

class half_orc extends race{

    public half_orc(player player){
        player.setRace("Half Orc");
        player.setTotal_level(1);
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
                player.setStr_score(player.getStr_score() + 2);
                break;
            case 2:
                player.setDex_score(player.getDex_score() + 2);
                break;
            case 3:
                player.setCon_score(player.getCon_score() + 2);
                break;
            case 4:
                player.setInt_score(player.getInt_score() + 2);
                break;
            case 5:
                player.setWis_score(player.getWis_score() + 2);
                break;
            case 6:
                player.setCha_score(player.getCha_score() + 2);
                break;
        }
        player.setSize("Medium");
        player.setSpeed(30);
        player.setVision("You can see in the dark up to 60 feet.");
        player.addTrait_or_feature(addRacialTrait("Intimidating", "+2 to intimidation", "Half-orcs receive a +2 racial bonus on Intimidate skill checks due to their fearsome nature."));
        for (int i = 0; i < player.getSkills().size(); i++){
            if (player.getSkills().get(i).getName().equals("Intimidation")){
                player.getSkills().get(i).setMisc_mod(player.getSkills().get(i).getMisc_mod() + 2);
            }
        }
        player.addTrait_or_feature(addRacialTrait("Orc Blood", "You count as both orc and human", "You count as both orc and humans for any effect related to race."));
        player.addTrait_or_feature(addRacialTrait("Orc Ferocity", "Once per day when brought to 0 hp fight for one more round", "Once per day, when a half-orc is brought below 0 hit points but not killed, he can fight on for one more round as if disabled. At the end of his next turn, unless brought to above 0 hit points, he immediately falls unconscious and begins dying."));
        player.addProficiency("greataxes");
        player.addProficiency("falchions");
        player.addProficiency("you treat any weapon with the name \"orc\" in its name as a martial weapon.");
        player.addLanguage("Common");
        player.addLanguage("Orc");
        addLanguage(new String[]{"Abyssal", "Draconic", "Giant", "Gnoll", "Goblin"}, player);
    }

}
