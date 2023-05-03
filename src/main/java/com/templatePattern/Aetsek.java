package com.templatePattern;

public class Aetsek extends BarbecueParty{
    @Override
    protected void cleaning() {
        System.out.println("מנקה את כל החצר וגם מזמין חברת ניקיון");
    }

    @Override
    protected void buying_products() {
        System.out.println("הולך לסופר לרכוש את המוצרים");
    }

    @Override
    protected void inviting_friends() {
        System.out.println("מתקשר לכל החברים יש לו רשימה של חברים והוא מתקשר אחד-אח");
    }

    @Override
    protected void preparing_food() {
        System.out.println("קם בשש בבוקר להכין את המאכלים");
    }

    @Override
    protected void cheers() {
        System.out.println(" מרים לחיים עם פינהקולדה");

    }
}
