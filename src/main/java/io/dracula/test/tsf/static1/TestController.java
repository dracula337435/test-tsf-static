package io.dracula.test.tsf.static1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private SomeProp someProp;

    @GetMapping("/hello")
    public String sayHello(){
        logger.info(someProp.getA());
        return "hello world: " + someProp.getA();
    }

}
