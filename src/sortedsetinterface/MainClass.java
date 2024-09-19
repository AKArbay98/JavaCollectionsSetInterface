package sortedsetinterface;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {

		// constructor
		SortedSet<String> countriesFromOcenia = new TreeSet<>();

		// add
		System.out.println(countriesFromOcenia);
		countriesFromOcenia.add("Australia");
		countriesFromOcenia.add("Papua New Guinea");
		countriesFromOcenia.add("New Zealand");
		countriesFromOcenia.add("Fiji");
		countriesFromOcenia.add("Solomon Island");
		System.out.println(countriesFromOcenia);

		// addAll
		SortedSet<String> moreCountries = new TreeSet<>();
		moreCountries.add("Federated States of Micronesia");
		moreCountries.add("Samoa");
		moreCountries.add("Tonga");

		countriesFromOcenia.addAll(moreCountries);
		System.out.println(countriesFromOcenia);

		// first
		String first = countriesFromOcenia.first();
		System.out.println(first);

		// last
		String last = countriesFromOcenia.last();
		System.out.println(last);

		// toString
		String string = countriesFromOcenia.toString();
		System.out.println(string);

		// getFirst
		String first2 = countriesFromOcenia.getFirst();
		System.out.println(first2);

		// getLast
		String last2 = countriesFromOcenia.getLast();
		System.out.println(last2);

		// comparator
		countriesFromOcenia.comparator();

		// isEmpty
		boolean isEmpty = countriesFromOcenia.isEmpty();
		System.out.println(isEmpty);

		// size
		int size = countriesFromOcenia.size();
		System.out.println(size);

		// contains
		boolean isContains = countriesFromOcenia.contains("Fiji");
		System.out.println(isContains);

		// containsAll
		boolean isContainsAll = countriesFromOcenia.containsAll(moreCountries);
		System.out.println(isContainsAll);

		// subset
		System.out.println(countriesFromOcenia);
		SortedSet<String> subSet = countriesFromOcenia.subSet("Fiji", "Samoa");
		System.out.println(subSet);

		// forEach
		countriesFromOcenia.forEach(country -> System.out.println(country));

		// iterator
		Iterator<String> iterator = countriesFromOcenia.iterator();

		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}

		// stream
		countriesFromOcenia.stream().forEach(System.out::println);

		// headSet
		SortedSet<String> headSet = countriesFromOcenia.headSet("Fiji");
		System.out.println(headSet);

		// tailSet
		SortedSet<String> tailSet = countriesFromOcenia.tailSet("Fiji");
		System.out.println(tailSet);

		// retainAll
		SortedSet<String> countriesToRetain = new TreeSet<>();
		countriesToRetain.add("Australia");
		countriesToRetain.add("New Zealand");
		countriesFromOcenia.retainAll(countriesToRetain);
		System.out.println("Countries after retainAll: " + countriesFromOcenia);

		// toArray
		Object[] array = countriesFromOcenia.toArray();
		System.out.println(array);

		// remove
		countriesFromOcenia.remove("Fiji");

		// removeFirst
		String removeFirst = countriesFromOcenia.removeFirst();
		System.out.println(removeFirst);

		// removeLast
		String removeLast = countriesFromOcenia.removeLast();
		System.out.println(removeLast);

		// removeAll
		SortedSet<String> countriesToRemove = new TreeSet<>();
		countriesToRemove.add("Australia");
		countriesToRemove.add("New Zealand");
		countriesFromOcenia.removeAll(countriesToRemove);

		// removeIf
		countriesFromOcenia.removeIf(c -> c.endsWith("d"));
		System.out.println(countriesFromOcenia);

		// clear
		countriesFromOcenia.clear();
		System.out.println(countriesFromOcenia);

	}

}
