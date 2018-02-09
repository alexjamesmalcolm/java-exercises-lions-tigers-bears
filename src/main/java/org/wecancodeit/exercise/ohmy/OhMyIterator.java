package org.wecancodeit.exercise.ohmy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class OhMyIterator implements Iterator<String> {
	List<String> animals = new ArrayList<>();
	int position = 0;

	public OhMyIterator() {
		animals.add("lions");
		animals.add("tigers");
		animals.add("bears");
	}

	@Override
	public boolean hasNext() {
		return position < animals.size();
	}

	@Override
	public String next() {
		String result;
		if(hasNext()) {
			result = animals.get(position);
			position++;
			return result;
		}
		throw new NoSuchElementException();
	}
}