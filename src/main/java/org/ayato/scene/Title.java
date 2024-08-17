package org.ayato.scene;

import org.ayato.animation.PropertiesComponent;
import org.ayato.system.BaseBackground;
import org.ayato.system.Layer;
import org.ayato.system.ToonMaster;
import org.ayato.util.BaseScene;
import org.ayato.util.MaterialUtils;

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
        toonMaster.addAnimation("jyankengame" ,
                                PropertiesComponent.ofText(130,50, 1000, 50)
                                                   .font("",Font.ITALIC,4));
        toonMaster.addAnimation("GAMESTART",
                                PropertiesComponent.ofText(130,100,300,50)
                                                   .font("",Font.BOLD,2)
                                                   .button(0,0,300,30, MaterialUtils.NORMAL.get(),
                                                            a->toonMaster.changeScene(new Battle()
                                                                                     )
                                                          )
                               );
    }
}
