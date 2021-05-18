package io.dracula.test.tsf.static1;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author dk
 */
@Component
@ConfigurationProperties("some")
public class SomeProp {

    private String a;

    public void setA(String a){
        this.a = a;
        AStaticOne.someSet.add(a);
    }

    public String getA() {
        return a;
    }

}
