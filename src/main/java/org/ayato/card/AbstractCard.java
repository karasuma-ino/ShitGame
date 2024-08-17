package org.ayato.card;

import org.ayato.entity.AbstractEntity;

public abstract sealed class AbstractCard<T extends AbstractEntity> permits WeakAttack, HeavyAttack, Counter {

    private final Class<?> weakness;
    private final Class<?> special;
    private final String name;
    protected final T owner;

    public AbstractCard(String mark, Class<? > weakness, Class<? > special, T owner){
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
    abstract void received(AbstractEntity entity, float atk);
}
