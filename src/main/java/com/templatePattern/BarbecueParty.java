package com.templatePattern;

public abstract class BarbecueParty {
    protected abstract void cleaning();
    protected abstract void buying_products();
    protected abstract void inviting_friends();
    protected abstract void preparing_food();
    protected abstract void cheers();

    public void start_party(){
        cleaning();
        buying_products();
        inviting_friends();
        preparing_food();
        cheers();

    }




}
