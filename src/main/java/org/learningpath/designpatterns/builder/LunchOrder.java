package org.learningpath.designpatterns.builder;

public class LunchOrder {
    private final String rice;
    private final String sambar;
    private final String curd;
    private final String dessert;

    public String getRice() {
        return rice;
    }

    public String getSambar() {
        return sambar;
    }

    public String getCurd() {
        return curd;
    }

    public String getDessert() {
        return dessert;
    }

    public static class Builder {
        private String rice;
        private String sambar;
        private String curd;
        private String dessert;

        public Builder() {};

        public Builder rice(String rice){
            this.rice = rice;
            return this;
        }

        public Builder sambar(String sambar){
            this.sambar = sambar;
            return this;
        }

        public Builder curd(String curd){
            this.curd = curd;
            return this;
        }

        public Builder dessert(String dessert){
            this.dessert = dessert;
            return this;
        }

        public LunchOrder build() {
            return new LunchOrder(this);
        }
    }

    private LunchOrder(Builder builder){
        this.curd = builder.curd;
        this.sambar = builder.sambar;
        this.dessert = builder.dessert;
        this.rice = builder.rice;
    }
}
