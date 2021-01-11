package net.gcuisinier.demoissue;

import net.gcuisinier.demoissue.components.MyComponent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.entry;

@SpringBootTest
class DemoIssueApplicationTests {

	@Autowired
	MyComponent component;

	@Test
	void testMapProperties() {


		assertThat(component.getLabels())
				.hasSize(3)
				.containsKeys("simple", "net.gcuisinier", "net.gcuisinier/env");


	}

}
