package liam.chipman;

import java.util.ArrayList;
import java.util.List;

class player{

    int level;

    //ability scores
    int str_score;
    int dex_score;
    int con_score;
    int int_score;
    int wis_score;
    int cha_score;

    //Racial
    String size;

    int speed;

    String vision;

    List proficiencies;

    List languages;

    List traits_and_features;

    public int calcAbilityScoreModifier(int ability_score){
        if (ability_score % 2 == 1) {
            ability_score--;
        }
        return (ability_score - 10) / 2;
    }

    public player() {
        proficiencies = new ArrayList();
        languages = new ArrayList();
        traits_and_features = new ArrayList();
    }

}
