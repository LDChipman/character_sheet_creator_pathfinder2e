package liam.chipman;

class trait_or_feature {
    String name;
    String type;
    String short_desc;
    String desc;

    trait_or_feature createTraitOrFeature(String name, String type, String short_desc, String desc) {
        trait_or_feature trait_or_feature = new trait_or_feature();
        this.name = name;
        this.type = type;
        this.short_desc = short_desc;
        this.desc = desc;
        return trait_or_feature;
    }
}
