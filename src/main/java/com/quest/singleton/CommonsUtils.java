package com.quest.singleton;

import java.io.Serializable;

public class CommonsUtils implements Cloneable, Serializable {
    @Override
    public CommonsUtils clone() {
        try {
            return (CommonsUtils) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
