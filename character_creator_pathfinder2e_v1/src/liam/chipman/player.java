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
    String race;

    String size;

    int speed;

    String vision;

    List proficiencies;

    List languages;

    List traits_and_features;

    int calcAbilityScoreModifier(int ability_score){
        if (ability_score % 2 == 1) {
            ability_score--;
        }
        return (ability_score - 10) / 2;
    }

    void printEverything(){
        System.out.println("Level: " + this.level);
        System.out.println("Strength: " + this.str_score);
        System.out.println("Dexterity: " + this.dex_score);
        System.out.println("Constitution: " + this.con_score);
        System.out.println("Intelligence: " + this.int_score);
        System.out.println("Wisdom: " + this.wis_score);
        System.out.println("Charisma: " + this.cha_score);
        System.out.println("Race: " + this.race);
        System.out.println("Size: " + this.size);
        System.out.println("Speed: " + this.speed);
        System.out.println("Vision: " + this.vision);
        System.out.println("Proficiencies: " + this.proficiencies);
        System.out.println("Languages: " + this.languages);
        System.out.println("Traits and Features:");
//        trait_or_feature test = new traits_and_features.get(1);
        for (int i = 0; i < this.traits_and_features.size(); i++){
            System.out.println("Name: " + this.traits_and_features.get(i));
        }
    }

    public player() {
        proficiencies = new ArrayList();
        languages = new ArrayList();
        traits_and_features = new ArrayList();
    }

}
