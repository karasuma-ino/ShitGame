package org.ayato.entity;

import org.ayato.component.ToonObject;
import org.ayato.component.Transform;

public abstract class AbstractEntity extends ToonObject {
    private String name = "PLAYER";
    private int hp, mhp;
    private int lv;
    public boolean isDead = false;
    protected AbstractEntity(Transform transform, String name, int mhp, int lv) {
        super(transform);
        this.mhp =mhp;
        hp = mhp;
        this.lv = lv;
        this.name = name;
    }

    public void receivedDamage(float atk){
        hp -= atk;
        if(hp <= 0){
            isDead = true;
        }
    }
}
