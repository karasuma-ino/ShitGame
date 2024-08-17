package org.ayato.card;

import org.ayato.entity.AbstractEntity;

public final class Counter<T extends AbstractEntity> extends AbstractCard<T> {

    public Counter(T owner) {
        super("Guard", (Class<? extends AbstractCard<?>>) HeavyAttack.class,
                (Class<? extends AbstractCard<?>>) WeakAttack.class, owner);
    }

    @Override
    void specialAttack(AbstractCard<?> opponent) {

    }

    @Override
    void attack(AbstractCard<?> opponent) {

    }
}
