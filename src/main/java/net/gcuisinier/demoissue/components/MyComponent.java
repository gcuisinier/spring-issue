package net.gcuisinier.demoissue.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MyComponent {

    @Autowired
    MyConfig config;



    public java.util.Map<String, String> getLabels() {
        return config.getLabels();
    }
}
