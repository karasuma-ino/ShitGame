package org.ayato.card;

public abstract class AbstractCard{
    private final Class<? extends AbstractCard> weakness;
    private final Class<? extends AbstractCard> special;
    private final String name;

    public AbstractCard(String mark, Class<? extends AbstractCard> weakness, Class<? extends AbstractCard> special){
        name = mark;
        this.weakness = weakness;
        this.special = special;
    }
    public void judge(){

    }
}
