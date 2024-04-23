package org.com.model;

import java.util.Set;

public interface Node {
    Set<Node> getDependencies();
}