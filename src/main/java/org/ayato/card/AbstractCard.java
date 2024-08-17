package org.ayato.card;

import org.ayato.entity.AbstractEntity;

public abstract sealed class AbstractCard<T extends AbstractEntity> permits WeakAttack, HeavyAttack, Counter {

    private final Class<? extends AbstractCard<?>> weakness;
    private final Class<? extends AbstractCard<?>> special;
    private final String name;
    private final T owner;

    public AbstractCard(String mark, Class<? extends AbstractCard<?>> weakness, Class<? extends AbstractCard<?>> special, T owner){
        name = mark;
        this.weakness = weakness;
        this.special = special;
        this.owner = owner;
    }

    public void judge(AbstractCard<?> card){
        if(card.getClass() == special){
            specialAttack(card);
        }else if(card.getClass() != weakness){
            attack(card);
        }
    }

    abstract void specialAttack(AbstractCard<?> opponent);
    abstract void attack(AbstractCard<?> opponent);
}
