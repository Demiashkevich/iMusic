package com.dzemiashkevich.music.dto;

import java.io.Serializable;

public class KeyRestDto<K extends Serializable> {

    private K id;

    public K getId() {
        return id;
    }

    public void setId(K id) {
        this.id = id;
    }

}
