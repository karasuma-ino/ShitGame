package org.ayato.scene;

import org.ayato.animation.PropertiesComponent;
import org.ayato.system.ToonMaster;
import org.ayato.util.BaseScene;
import org.ayato.util.MaterialUtils;

import java.awt.*;

public class Battle extends BaseScene {

    @Override
    public void tick() {

    }

    @Override
    public void display(Graphics graphics) {

    }

    @Override
    public void createUI(ToonMaster toonMaster) {
        toonMaster.addAnimation("たたかう",
                                 PropertiesComponent.ofText(100,100,50,30)
                                                    .font("",0,100)
                                                    .button(0,0,50,30, MaterialUtils.NORMAL.get(),a->{}
                                                    ));

    }
}
