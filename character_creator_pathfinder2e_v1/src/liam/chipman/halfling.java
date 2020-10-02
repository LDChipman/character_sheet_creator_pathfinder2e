package liam.chipman;

class halfling extends race{

    public halfling(player player){
        player.setRace("Halfling");
        player.setTotal_level(1);
        player.setDex_score(player.getDex_score() + 2);
        player.setCha_score(player.getCha_score() + 2);
        player.setStr_score(player.getStr_score() - 2);
        player.setSize("Small");
        player.setSpeed(20);
        player.setVision("you have no changes to vision");
        player.addTrait_or_feature(addRacialTrait("Fearless", "+2 to saving throws vs. fear", "You receive a +2 racial bonus on all saving throws against fear. This bonus stacks with the bonus granted by halfling luck."));
        player.addTrait_or_feature(addRacialTrait("Halfling Luck", "+1 to saving throws", "You receive a +1 racial bonus on all saving throws."));
        player.setBase_fortitude_save(player.getBase_fortitude_save() + 1);
        player.setBase_reflex_save(player.getBase_reflex_save() + 1);
        player.setBase_will_save(player.getBase_will_save() + 1);
        player.addTrait_or_feature(addRacialTrait("Keen Senses", "+2 to Perception", "You receive a +2 racial bonus on Perception skill checks."));
        for (int i = 0; i < player.getSkills().size(); i++){
            if (player.getSkills().get(i).getName().equals("Perception")){
                player.getSkills().get(i).setMisc_mod(player.getSkills().get(i).getMisc_mod() + 2);
            }
        }
        player.addTrait_or_feature(addRacialTrait("Sure-Footed", "+2 to Acrobatics and Climb", "You receive a +2 racial bonus on Acrobatics and Climb skill checks."));
        for (int i = 0; i < player.getSkills().size(); i++){
            if (player.getSkills().get(i).getName().equals("Acrobatics")){
                player.getSkills().get(i).setMisc_mod(player.getSkills().get(i).getMisc_mod() + 2);
            }
        }
        for (int i = 0; i < player.getSkills().size(); i++){
            if (player.getSkills().get(i).getName().equals("Climb")){
                player.getSkills().get(i).setMisc_mod(player.getSkills().get(i).getMisc_mod() + 2);
            }
        }
        player.addProficiency("sling");
        player.addProficiency("you treat any weapon with the name \"halfling\" in its name as a martial weapon.");
        player.addLanguage("Common");
        player.addLanguage("Halfling");
        addLanguage(new String[]{"Dwarven", "Elven", "Gnome", "Goblin"}, player);
    }

}
