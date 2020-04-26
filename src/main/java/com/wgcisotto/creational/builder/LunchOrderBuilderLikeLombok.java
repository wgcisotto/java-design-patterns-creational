package com.wgcisotto.creational.builder;

public class LunchOrderBuilderLikeLombok {

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    public String getBread() {
        return this.bread;
    }

    public String getCondiments() {
        return this.condiments;
    }

    public String getDressing() {
        return this.dressing;
    }

    public String getMeat() {
        return this.meat;
    }

    LunchOrderBuilderLikeLombok(String bread, String condiments, String dressing, String meat) {
        this.bread = bread;
        this.condiments = condiments;
        this.dressing = dressing;
        this.meat = meat;
    }

    public static lombok builder() {
        return new lombok();
    }

    public static class lombok {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        lombok() {
        }

        public lombok bread(String bread) {
            this.bread = bread;
            return this;
        }

        public lombok condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public lombok dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public lombok meat(String meat) {
            this.meat = meat;
            return this;
        }

        public LunchOrderBuilderLikeLombok build() {
            return new LunchOrderBuilderLikeLombok(this.bread, this.condiments, this.dressing, this.meat);
        }
    }
}
