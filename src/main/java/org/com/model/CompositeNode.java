package org.com.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompositeNode implements Node {


    private final String value;
    private final Set<Node> dependencies = new HashSet<>();

    public CompositeNode(String value, List<Node> availableNodes) {
        this.value = value;
        for (char ch : value.toCharArray()) {
            String s = String.valueOf(ch);
            availableNodes.stream()
                    .filter(node -> node.toString().equals(s))
                    .findFirst()
                    .ifPresent(dependencies::add);
        }
    }

    @Override
    public Set<Node> getDependencies() {
        return dependencies;
    }

    @Override
    public String toString() {
        return value;
    }
}
