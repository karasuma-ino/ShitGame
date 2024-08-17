package org.ayato.card;

import org.ayato.entity.AbstractEntity;

public final class WeakAttack<T extends AbstractEntity> extends AbstractCard<T> {

    public WeakAttack(String mark, Class<? extends AbstractCard<?>> weakness, Class<AbstractCard<?>> special, T owner) {
        super(mark, weakness, special, owner);
    }

    @Override
    void attack(AbstractCard<?> opponent) {

    }
}
