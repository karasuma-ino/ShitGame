package org.ayato.card;

import org.ayato.entity.AbstractEntity;

public final class Counter<T extends AbstractEntity> extends AbstractCard<T> {

    public Counter(T owner) {
        super("Guard", HeavyAttack.class,
                WeakAttack.class, owner);
    }

    @Override
    void specialAttack(AbstractCard<?> opponent) {}


    @Override
    void attack(AbstractCard<?> opponent) {}

    @Override
    void received(AbstractEntity o,  float atk) {
        o.receivedDamage(atk * 1.3f);
    }
}
