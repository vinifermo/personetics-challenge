package org.com.model;

import java.util.HashSet;
import java.util.Set;

public class SimpleNode implements Node {

    private final String value;

    public SimpleNode(String value) {
        this.value = value;
    }

    @Override
    public Set<Node> getDependencies() {
        return new HashSet<>();
    }

    @Override
    public String toString() {
        return value;
    }
}
