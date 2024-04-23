package org.com;

import org.com.model.CompositeNode;
import org.com.model.Node;
import org.com.model.SimpleNode;

import java.util.List;

import static org.com.chain.ChainValidator.validate;

public class NodeChainValidatorRunner {


    public static void main(String[] args) {
        // Example with digits
        SimpleNode n2 = new SimpleNode("2");
        SimpleNode n3 = new SimpleNode("3");
        SimpleNode n4 = new SimpleNode("4");
        SimpleNode n6 = new SimpleNode("6");
        SimpleNode n7 = new SimpleNode("7");
        List<Node> nodes = List.of(
                new CompositeNode("36", List.of(n3, n6)),
                n6,
                new CompositeNode("24", List.of(n2, n4)),
                n4,
                new CompositeNode("47", List.of(n4, n7)),
                n7,
                n2,
                n3,
                new CompositeNode("27", List.of(n2, n7))
        );
        System.out.println("Validation Result: " + validate(nodes)); // Should print true

        // Example with letters
        SimpleNode a = new SimpleNode("a");
        SimpleNode b = new SimpleNode("b");
        SimpleNode e = new SimpleNode("e");
        SimpleNode o = new SimpleNode("o");
        SimpleNode p = new SimpleNode("p");
        SimpleNode r = new SimpleNode("r");
        SimpleNode s = new SimpleNode("s");
        List<Node> letterNodes = List.of(
                p,
                new CompositeNode("aba", List.of(a, b)),
                a,
                b,
                new CompositeNode("perso", List.of(p, e, r, s, o)),
                o,
                r,
                e,
                s
        );
        System.out.println("Validation Result: " + validate(letterNodes)); // Should print true
    }
}