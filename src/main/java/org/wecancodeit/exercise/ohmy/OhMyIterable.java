package org.wecancodeit.exercise.ohmy;

import java.util.Iterator;

public class OhMyIterable implements Iterable<String> {

	@Override
	public Iterator<String> iterator() {
		return new OhMyIterator();
	}

}
