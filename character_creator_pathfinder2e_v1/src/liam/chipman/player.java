package liam.chipman;

import java.util.ArrayList;
import java.util.List;

class player{

    int total_level;

    //ability scores
    int str_score;
    int dex_score;
    int con_score;
    int int_score;
    int wis_score;
    int cha_score;

    //Racial
    String race;

    String size;

    int speed;

    String vision;

    List proficiencies;

    List languages;

    List<trait_or_feature> traits_and_features;

    int calcAbilityScoreModifier(int ability_score){
        if (ability_score % 2 == 1) {
            ability_score--;
        }
        return (ability_score - 10) / 2;
    }

    public String toString(){

        StringBuilder info = new StringBuilder();
        info.append("Total Level: ").append(this.total_level).append("\n");
        info.append("Strength: ").append(this.str_score).append("\n");
        info.append("Dexterity: ").append(this.dex_score).append("\n");
        info.append("Constitution: ").append(this.con_score).append("\n");
        info.append("Intelligence: ").append(this.int_score).append("\n");
        info.append("Wisdom: ").append(this.wis_score).append("\n");
        info.append("Charisma: ").append(this.cha_score).append("\n");
        info.append("Race: ").append(this.race).append("\n");
        info.append("Size: ").append(this.size).append("\n");
        info.append("Speed: ").append(this.speed).append("\n");
        info.append("Vision: ").append(this.vision).append("\n");
        info.append("Proficiencies: ").append(this.proficiencies).append("\n");
        info.append("Languages: ").append(this.languages).append("\n");
        info.append("Traits and Features:" + "\n");
        for (trait_or_feature traits_and_feature : this.traits_and_features) {
            info.append("\n");
            info.append("Name: ").append(traits_and_feature.name).append("\n");
            info.append("Type: ").append(traits_and_feature.type).append("\n");
            info.append("Short Description: ").append(traits_and_feature.short_desc).append("\n");
            info.append("Description: ").append(traits_and_feature.desc).append("\n");
            info.append("\n");
        }
        return info.toString();
    }

    public player() {
        proficiencies = new ArrayList();
        languages = new ArrayList();
        traits_and_features = new ArrayList<trait_or_feature>();
    }

}
