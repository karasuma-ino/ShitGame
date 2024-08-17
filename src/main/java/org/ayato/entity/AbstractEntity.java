package org.ayato.entity;

import org.ayato.component.ToonObject;
import org.ayato.component.Transform;

public abstract class AbstractEntity extends ToonObject {
    private String name = "PLAYER";
    private int hp, mhp;
    private int lv;

    protected AbstractEntity(Transform transform, String name, int mhp, int mmp, int lv) {
        super(transform);
        mhp = 20;
        hp = mhp;
        lv = 1;
    }


}
