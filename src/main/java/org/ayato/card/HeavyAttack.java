package org.ayato.card;

import org.ayato.entity.AbstractEntity;

public final class HeavyAttack<T extends AbstractEntity> extends AbstractCard<T>{

    public HeavyAttack(T owner) {
        super("HeavyAttack",
                (Class<? extends AbstractCard<?>>) WeakAttack.class,
                (Class<? extends AbstractCard<?>>) Counter.class, owner);

    }

    @Override
    void specialAttack(AbstractCard<?> opponent) {

    }

    @Override
    void attack(AbstractCard<?> opponent) {

    }
}
