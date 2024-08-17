package org.ayato.card;

import org.ayato.entity.AbstractEntity;

public final class WeakAttack<T extends AbstractEntity> extends AbstractCard<T> {
    int atk = 5;
    public WeakAttack(T owner) {
        super("WeakAttack", Counter.class,
                HeavyAttack.class, owner);
    }

    @Override
    void specialAttack(AbstractCard<?> opponent) {
        opponent.received(owner,atk * 1.5f);
    }

    @Override
    void attack(AbstractCard<?> opponent) {
        opponent.received(owner, atk);
    }

    @Override
    void received(AbstractEntity entity, float atk) {
        owner.receivedDamage(atk);
    }
}
