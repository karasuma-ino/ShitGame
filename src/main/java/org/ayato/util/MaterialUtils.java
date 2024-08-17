package org.ayato.util;

import org.ayato.animation.AnimationState;

import java.awt.*;
import java.util.function.Supplier;

public class MaterialUtils {
    public static final Supplier<AnimationState> NORMAL = ()-> new AnimationState(
            Color.WHITE,
            Color.RED,
            Color.WHITE,
            new Color(0, 0, 0, 200),
            new Color(0, 0, 0, 200),
            new Color(0, 0, 0, 200)
    );
}
