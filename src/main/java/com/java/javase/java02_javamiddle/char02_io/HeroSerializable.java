package com.java.javase.java02_javamiddle.char02_io;

import java.io.Serializable;

public class HeroSerializable implements Serializable {
    //表示这个类当前的版本，如果有了变化，比如新设计了属性，就应该修改这个版本号
    private static final long serialVersionUID = 1L;
    public String name;
    public float hp;
}