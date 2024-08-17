package org.ayato;

import org.ayato.scene.Title;
import org.ayato.system.ToonMaster;

public class Main {
    public static final ToonMaster MASTER = ToonMaster.create("title", true);
    public static void main(String[] args) {

        MASTER.changeScene(new Title());
        MASTER.setVisible(true);
    }
}