package org.wecancodeit.exercise.ohmy;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OhMyIterableTest {

	@Test
	public void shouldBeIterable() {
		Iterable<String> underTest = new OhMyIterable();
		
		assertThat(underTest, contains("lions", "tigers", "bears")); // oh my
	}
}
