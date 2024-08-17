package org.ayato.card;

import org.ayato.entity.AbstractEntity;

public final class WeakAttack<T extends AbstractEntity> extends AbstractCard<T> {

    public WeakAttack(T owner) {
        super("WeakAttack", weakness, special, owner);
    }

    @Override
    void specialAttack(AbstractCard<?> opponent) {

    }

    @Override
    void attack(AbstractCard<?> opponent) {

    }
}
