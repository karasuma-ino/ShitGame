package org.ayato.card;

import org.ayato.entity.AbstractEntity;

public final class Guard<T extends AbstractEntity> extends AbstractCard<T> {

    public Guard(String mark, Class<? extends AbstractCard<?>> weakness, Class<AbstractCard<?>> special, T owner) {
        super(mark, weakness, special, owner);
    }

    @Override
    void specialAttack(AbstractCard<?> opponent) {

    }

    @Override
    void attack(AbstractCard<?> opponent) {

    }
}
