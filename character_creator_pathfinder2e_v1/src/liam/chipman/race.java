package liam.chipman;

class race {

    trait_or_feature addRacialTrait(String name, String short_desc, String desc){
        trait_or_feature racial_trait = new trait_or_feature();
        racial_trait.createTraitOrFeature(name, "racial", short_desc, desc);
        return racial_trait;
    }

    void addLanguage(String[] languages, player player){
        int amount_of_extra_langs = player.calcAbilityScoreModifier(player.int_score);
        while (amount_of_extra_langs > 0) {
            Main.delayedPrint("You get to choose an extra language!");
            for (int i = 0; i < languages.length; i++) {
                Main.delayedPrint("" + (i+1) + ". " + languages[i]);
            }
            Main.delayedPrint("Please choose which option you'd like to use:");
            int option = Main.chooseOption(languages.length);
            player.languages.add(languages[option-1]);
            languages[option-1] += " (Already Known)";
            amount_of_extra_langs--;
        }
    }
}
