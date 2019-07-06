package org.learningpath.designpatterns.builder;

public class BuildLunchOrderDemo {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.curd("sour").rice("basmati").dessert("rasagulla").sambar("lentil");
        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getCurd());
        System.out.println(lunchOrder.getSambar());
        System.out.println(lunchOrder.getRice());
        System.out.println(lunchOrder.getDessert());
    }
}
