package org.com.chain;

import org.com.model.Node;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ChainValidator {

    public static boolean validate(List<Node> nodes) {
        Set<Node> nodeSet = new HashSet<>(nodes);
        return nodes.stream().allMatch(node -> nodeSet.containsAll(node.getDependencies()));
    }
}