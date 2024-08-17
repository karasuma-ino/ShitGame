package org.ayato.scene;

import org.ayato.animation.PropertiesComponent;
import org.ayato.system.BaseBackground;
import org.ayato.system.Layer;
import org.ayato.system.ToonMaster;
import org.ayato.util.BaseScene;

import java.awt.*;
import java.util.ArrayList;

public class Title extends BaseScene {
    @Override
    public void tick() {

    }

    @Override
    public void display(Graphics graphics) {

    }

    @Override
    public void createUI(ToonMaster toonMaster) {
        toonMaster.setBackground(new BaseBackground() {
            @Override
            public void setLayer(ArrayList<Layer> arrayList) {
                arrayList.add((graphics2D, i, i1) -> {
                    graphics2D.setColor(Color.BLACK);
                    graphics2D.fillRect(0, 0, i, i1);
                });
            }
        });
        toonMaster.addAnimation("ToonMaster", PropertiesComponent.ofText(20, 20).font("", 0, 1.5f));

    }
}
