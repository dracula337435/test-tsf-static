package io.dracula.test.tsf.static1;

import java.util.HashSet;
import java.util.Set;

/**
 * @author dk
 */
public class AStaticOne {

    static{
        System.out.println("===hello===");
    }

    public static Set<String> someSet = new HashSet<>();

}
