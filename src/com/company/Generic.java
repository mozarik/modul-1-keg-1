package com.company;

import org.jetbrains.annotations.Contract;

public class Generic<K, V> {
    private K key;
    private V value;

    public Generic(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Key:" + getKey() + "  - Value:" + getValue();
    }
}