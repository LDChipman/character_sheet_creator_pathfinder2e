package liam.chipman;

class halfling extends race{

    public halfling(player player){
        player.race = "Halfling";
        player.level = 1;
        player.dex_score += 2;
        player.cha_score += 2;
        player.str_score -= 2;
        player.size = "Small";
        player.speed = 20;
        player.vision = "you have no changes to vision";
        player.traits_and_features.add(addRacialTrait("Fearless", "+2 to saving throws vs. fear", "You receive a +2 racial bonus on all saving throws against fear. This bonus stacks with the bonus granted by halfling luck."));
        player.traits_and_features.add(addRacialTrait("Halfling Luck", "+1 to saving throws", "You receive a +1 racial bonus on all saving throws."));
        player.traits_and_features.add(addRacialTrait("Keen Senses", "+2 to Perception", "You receive a +2 racial bonus on Perception skill checks."));
        player.traits_and_features.add(addRacialTrait("Sure-Footed", "+2 to Acrobatics and Climb", "You receive a +2 racial bonus on Acrobatics and Climb skill checks."));
        player.proficiencies.add("sling");
        player.proficiencies.add("you treat any weapon with the name \"halfling\" in its name as a martial weapon.");
        player.languages.add("Common");
        player.languages.add("Halfling");
        addLanguage(new String[]{"Dwarven", "Elven", "Gnome", "Goblin"}, player);
    }

}
