package org.ayato.scene;

import org.ayato.animation.PropertiesComponent;
import org.ayato.scene.setups.PlayerStates;
import org.ayato.system.ToonMaster;
import org.ayato.util.BaseScene;
import org.ayato.util.MaterialUtils;
import org.ayato.util.Setup;

import java.awt.*;
import java.util.ArrayList;

public class Battle extends BaseScene {

    @Override
    public void tick() {

    }

    @Override
    public void display(Graphics graphics) {

    }

    @Override
    public void createUI(ToonMaster toonMaster) {
        toonMaster.addAnimation(  "Enemy spotted!!",
                                PropertiesComponent.ofText(130,100,100,30)
                                                   .font("",0,4)
                               );
        toonMaster.addAnimation("Week",
                                PropertiesComponent.ofText(30,150,50,30)
                                                   .font("",0,3)
                                                   .button(0,0,50,30, MaterialUtils.NORMAL.get()
                                                           ,a->{}
                                                   )
                               );
        toonMaster.addAnimation("Heavy",
                                PropertiesComponent.ofText(80,150,50,30)
                                                   .font("",0,3)
                                                   .button(0,0,50,30, MaterialUtils.NORMAL.get()
                                                           ,a->{}
                                                          )
                                );
        toonMaster.addAnimation("Counter",
                                PropertiesComponent.ofText(130,150,50,30)
                                                   .font("",0,3)
                                                   .button(0,0,50,30, MaterialUtils.NORMAL.get()
                                                           ,a->{}
                                                          )
                               );
        toonMaster.addAnimation("Gauge",
                                PropertiesComponent.ofText(180,150,50,30)
                                                   .font("",0,3)
                                                   .button(0,0,50,30, MaterialUtils.NORMAL.get()
                                                           ,a->{}
                                                          )
                               );
    }

    @Override
    public void setupUIClass(ArrayList<Setup> setups) {

        setups.add(new PlayerStates());
    }
}
