package org.ayato.entity;

import org.ayato.component.ToonObject;
import org.ayato.component.Transform;

import java.awt.*;

public class Player extends AbstractEntity {
    protected Player() {
        super(new Transform(0, 0, 0, 0), "PLAYER", 20, 1);

    }


    @Override
    protected void display(Graphics2D graphics2D, int i, int i1, int i2, int i3) {}

    @Override
    protected void tick(Transform transform) {

    }
}
