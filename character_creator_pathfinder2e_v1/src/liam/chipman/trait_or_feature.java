package liam.chipman;

class trait_or_feature {
    private String name;
    private String type;
    private String short_desc;
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getShort_desc() {
        return short_desc;
    }

    public void setShort_desc(String short_desc) {
        this.short_desc = short_desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    trait_or_feature (String name, String type, String short_desc, String desc) {
        this.name = name;
        this.type = type;
        this.short_desc = short_desc;
        this.desc = desc;
    }
}
