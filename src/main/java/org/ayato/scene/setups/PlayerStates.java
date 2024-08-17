package org.ayato.scene.setups;

import org.ayato.animation.PropertiesComponent;
import org.ayato.entity.Player;
import org.ayato.system.ToonMaster;
import org.ayato.util.Setup;

import java.awt.*;

public class PlayerStates implements Setup {
    @Override
    public void createUI(ToonMaster toonMaster) {

        toonMaster.addAnimation("HP : " +,PropertiesComponent.ofText(20, 100,100,100)
                                                              .color(Color.GREEN));

    }
}
