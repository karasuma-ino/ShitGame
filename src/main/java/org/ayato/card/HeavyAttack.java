package org.ayato.card;

import org.ayato.entity.AbstractEntity;

public final class HeavyAttack<T extends AbstractEntity> extends AbstractCard<T>{
    private int atk = 10;
    public HeavyAttack(T owner) {
        super("HeavyAttack",
                WeakAttack.class,
                Counter.class, owner);

    }

    @Override
    void specialAttack(AbstractCard<?> opponent) {
        opponent.received(owner,atk * 1.5f);
    }

    @Override
    void attack(AbstractCard<?> opponent) {
        opponent.received( owner, atk);
    }

    @Override
    void received(AbstractEntity entity, float atk) {
        owner.receivedDamage(atk);
    }
}
