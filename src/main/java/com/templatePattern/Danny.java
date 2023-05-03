package com.templatePattern;

public class Danny extends BarbecueParty{
    @Override
    protected void cleaning() {
        System.out.println("הוא עצלן ולכן לא מנקה את החצר");
    }

    @Override
    protected void buying_products() {
        System.out.println("קונה את המטעמים להכנה דרך הטלפון");
    }

    @Override
    protected void inviting_friends() {
        System.out.println("שולח הודעה בקבוצה");
    }

    @Override
    protected void preparing_food() {
        System.out.println("מזמין את אחיו הגדול שיכין את המאכלים");
    }

    @Override
    protected void cheers() {
        System.out.println("מרים לחיים עם מיץ ענבים");
    }
}
