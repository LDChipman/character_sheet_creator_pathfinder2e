package liam.chipman;

class player{

    //ability scores
    int str_score;
    int dex_score;
    int con_score;
    int int_score;
    int wis_score;
    int cha_score;

    public int calcAbilityScoreModifier(int ability_score){
        if (ability_score % 2 == 1) {
            ability_score--;
        }
        return (ability_score - 10) / 2;
    }

}