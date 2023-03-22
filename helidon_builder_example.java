//DEPS io.helidon.builder:helidon-builder:4.0.0-ALPHA5
//DEPS io.helidon.builder:helidon-builder-processor:4.0.0-ALPHA5
//SOURCES app/src/main/java/example/model/NameAndDescription.java
//SOURCES app/src/main/java/example/model/NameAndDescriptionAndComments.java

import java.lang.System;
import example.model.NameAndDescriptionAndComments;
import example.model.DefaultNameAndDescriptionAndComments;

public class helidon_builder_example {
    
    public static void main(String[] args) {
        NameAndDescriptionAndComments target =
        DefaultNameAndDescriptionAndComments.builder()
                .name("world")
                .addComment("hello")
                .build();
        System.out.println("Hello " + target);
    }
}
