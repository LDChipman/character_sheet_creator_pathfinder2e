package liam.chipman;

class gnome extends race{

    public gnome(player player){
        player.setRace("Gnome");
        player.setTotal_level(1);
        player.setCon_score(player.getCon_score() + 2);
        player.setCha_score(player.getCha_score() + 2);
        player.setStr_score(player.getStr_score() - 2);
        player.setSize("Small");
        player.setSpeed(20);
        player.setVision("You can see twice as far as humans in conditions of dim light");
        player.addTrait_or_feature(addRacialTrait("Defensive Training", "+4 bonus to AC vs. giants", "You get a +4 dodge bonus to AC against monsters of the giant subtype."));
        player.addTrait_or_feature(addRacialTrait("Gnome Magic", "+1 to DC saving throws for illusion spells you cast", "You add +1 to the DC of any saving throws against illusion spells that you cast."));
        if (player.getCha_score() >= 11){
            player.addTrait_or_feature(addRacialTrait("Gnome Magic Abilities", "dancing lights, ghost sound, prestidigitation, and speak with animals", "1/day—dancing lights, ghost sound, prestidigitation, and speak with animals. Caster level: " + player.getTotal_level() + ". DC: 10 + the spell level + " + player.calcAbilityScoreModifier(player.getCha_score())));
        }
        player.addTrait_or_feature(addRacialTrait("Hatred", "+1 to hit vs. reptilian and goblinoids", "You receive a +1 bonus on attack rolls against humanoid creatures of the reptilian and goblinoid subtype due to special training against these hated foes."));
        player.addTrait_or_feature(addRacialTrait("Illusion Resistance", "+2 on saving throws vs. illusion", "You get a +2 racial saving throw bonus against illusion spells or effects."));
        player.addTrait_or_feature(addRacialTrait("Keen Senses", "+2 to Perception", "You receive a +2 racial bonus on Perception skill checks."));
        for (int i = 0; i < player.getSkills().size(); i++){
            if (player.getSkills().get(i).getName().equals("Perception")){
                player.getSkills().get(i).setMisc_mod(player.getSkills().get(i).getMisc_mod() + 2);
            }
        }
        player.addTrait_or_feature(addRacialTrait("Obsessive", "+2 to Craft or Profession", "Gnomes receive a +2 racial bonus on a Craft or Profession skill of their choice."));
        Main.delayedPrint("As a Gnome you get a +2 bonus to Craft or Profession");
        Main.delayedPrint("1. Craft");
        Main.delayedPrint("2. Profession");
        int option = Main.chooseOption(2);
        switch (option){
            case 1:
                for (int i = 0; i < player.getSkills().size(); i++){
                    if (player.getSkills().get(i).getName().equals("Craft")){
                        player.getSkills().get(i).setMisc_mod(player.getSkills().get(i).getMisc_mod() + 2);
                    }
                }
                break;
            case 2:
                for (int i = 0; i < player.getSkills().size(); i++){
                    if (player.getSkills().get(i).getName().equals("Profession")){
                        player.getSkills().get(i).setMisc_mod(player.getSkills().get(i).getMisc_mod() + 2);
                    }
                }
        }
        player.addProficiency("you treat any weapon with the name \"gnome\" in its name as a martial weapon.");
        player.addLanguage("Common");
        player.addLanguage("Gnome");
        player.addLanguage("Sylvan");
        addLanguage(new String[]{"Draconic", "Dwarven", "Elven", "Giant", "Goblin", "Orc"}, player);
    }

}
