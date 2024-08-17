package org.ayato.entity;

import org.ayato.card.AbstractCard;
import org.ayato.card.Counter;
import org.ayato.card.HeavyAttack;
import org.ayato.card.WeakAttack;
import org.ayato.component.ToonObject;
import org.ayato.component.Transform;

import java.awt.*;
import java.util.ArrayList;

public class Player extends AbstractEntity {

    private final ArrayList<AbstractCard<Player>> CARD = new ArrayList<>();

    protected Player() {
        super(new Transform(0, 0, 0, 0), "PLAYER", 20, 1);
        CARD.add(new WeakAttack<>(this));
        CARD.add(new HeavyAttack<>(this));
        CARD.add(new Counter<>(this));
    }


    @Override
    protected void display(Graphics2D graphics2D, int i, int i1, int i2, int i3) {}

    @Override
    protected void tick(Transform transform) {

    }
}
