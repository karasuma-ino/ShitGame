package org.ayato.card;

import org.ayato.entity.Player;

public abstract class AbstractCard{
    private final Class<? extends AbstractCard> weakness;
    private final Class<? extends AbstractCard> special;
    private final String name;

    public AbstractCard(String mark, Class<? extends AbstractCard> weakness, Class<? extends AbstractCard> special, Player player){
        name = mark;
        this.weakness = weakness;
        this.special = special;
    }
    public void judge(AbstractCard card){
        if(card.getClass() == weakness){
            card.attack();
        }else if(card.getClass() == special){
            attack();
        }
    }

    abstract void attack();
}
