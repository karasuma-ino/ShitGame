package org.ayato.card;

import org.ayato.entity.AbstractEntity;
import org.ayato.entity.Player;

public abstract sealed class AbstractCard<T extends AbstractEntity> permits WeakAttack{

    private final Class<? extends AbstractCard<?>> weakness;
    private final Class<? extends AbstractCard<?>> special;
    private final String name;
    private final T owner;

    public AbstractCard(String mark, Class<? extends AbstractCard<?>> weakness, Class<AbstractCard<?>> special, T owner){
        name = mark;
        this.weakness = weakness;
        this.special = special;
        this.owner = owner;
    }
    public void judge(AbstractCard<?> card){
        if(card.getClass() == weakness){
            card.attack(this);
        }else if(card.getClass() == special){
            attack(card);
        }else{
            card.attack(this);
            attack(card);
        }
    }

    abstract void attack(AbstractCard<?> opponent);
}
