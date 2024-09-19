package treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		// constructor
		TreeSet<String> citiesOfEngland = new TreeSet<String>();

		// add
		System.out.println(citiesOfEngland);
		citiesOfEngland.add("London");
		citiesOfEngland.add("Manchester");
		citiesOfEngland.add("Birmingham");
		citiesOfEngland.add("Leeds");
		citiesOfEngland.add("Southampton");
		citiesOfEngland.add("Bristol");
		System.out.println(citiesOfEngland);

		// addAll
		TreeSet<String> newCities = new TreeSet<>();
		newCities.add("Liverpool");
		newCities.add("Newcastle");
		newCities.add("York");
		citiesOfEngland.addAll(newCities);
		System.out.println(citiesOfEngland);

		// ceiling
		TreeSet<Integer> randomNumbers = new TreeSet<>();
		randomNumbers.add(46);
		randomNumbers.add(23);
		randomNumbers.add(94);
		randomNumbers.add(83);
		randomNumbers.add(19);
		randomNumbers.add(5);
		Integer ceiling = randomNumbers.ceiling(83);
		System.out.println(ceiling);

		// comparator
		Comparator<? super Integer> comparator = randomNumbers.comparator();
		if (comparator != null) {
			System.out.println("Comparator used: " + comparator.getClass().getName());
		} else {
			System.out.println("Using natural ordering");
		}

		// contains
		boolean isContains = citiesOfEngland.contains("Bristol");
		System.out.println(isContains);
		System.out.println(citiesOfEngland);

		// containsAll
		boolean containsAll = citiesOfEngland.containsAll(newCities);
		System.out.println(containsAll);

		// descendingIterator
		Iterator<String> descendingIterator = citiesOfEngland.descendingIterator();

		while (descendingIterator.hasNext()) {
			String city = descendingIterator.next();
			System.out.println(city);
		}

		// descendingSet
		NavigableSet<String> descendingSet = citiesOfEngland.descendingSet();
		for (String city : descendingSet) {
			System.out.println(city);
		}

		// first
		String first2 = citiesOfEngland.first();
		System.out.println(first2);

		// last
		String last2 = citiesOfEngland.last();
		System.out.println(last2);

		// getFirst
		String first = citiesOfEngland.getFirst();
		System.out.println(first);

		// getLast
		String last = citiesOfEngland.getLast();
		System.out.println(last);

		// isEmpty
		boolean isEmpty = citiesOfEngland.isEmpty();
		System.out.println(isEmpty);

		// forEach
		citiesOfEngland.forEach(c -> c.toUpperCase());
		System.out.println(citiesOfEngland);

		// iterator
		Iterator<String> iterator = citiesOfEngland.iterator();

		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}

		// headSet
		System.out.println(citiesOfEngland);
		SortedSet<String> headSet = citiesOfEngland.headSet("London");
		System.out.println(headSet);

		// floor
		System.out.println(citiesOfEngland);
		String floorCity = citiesOfEngland.floor("Leeds");
		System.out.println("Floor of Leeds: " + floorCity);

		// higher
		System.out.println(citiesOfEngland);
		String higherCity = citiesOfEngland.higher("Leeds");
		System.out.println("Higher city of Leeds: " + higherCity);

		// lower
		System.out.println(citiesOfEngland);
		String lowerCity = citiesOfEngland.lower("Leeds");
		System.out.println("Lower city of Leeds: " + lowerCity);

		// hashCode
		int hashCode = citiesOfEngland.hashCode();
		System.out.println(hashCode);

		// pollFirst
		String pollFirst = citiesOfEngland.pollFirst();
		System.out.println(pollFirst);

		// pollLast
		String pollLast = citiesOfEngland.pollLast();
		System.out.println(pollLast);

		// size
		int size = citiesOfEngland.size();
		System.out.println(size);
		System.out.println(citiesOfEngland);

		// retainAll
		TreeSet<String> citiesToRetain = new TreeSet<>();
		citiesToRetain.add("London");
		citiesToRetain.add("Manchester");
		citiesToRetain.add("Birmingham");
		citiesOfEngland.retainAll(citiesToRetain);
		System.out.println("Cities remaining after retainAll:");
		for (String city : citiesOfEngland) {
			System.out.println(city);
		}

		// subset
		TreeSet<String> countriesFromOcenia = new TreeSet<>();
		countriesFromOcenia.add("Australia");
		countriesFromOcenia.add("Papua New Guinea");
		countriesFromOcenia.add("New Zealand");
		countriesFromOcenia.add("Fiji");
		countriesFromOcenia.add("Solomon Island");
		countriesFromOcenia.add("Federated States of Micronesia");
		countriesFromOcenia.add("Samoa");
		countriesFromOcenia.add("Tonga");
		SortedSet<String> subsetCountries = countriesFromOcenia.subSet("Fiji", "Samoa");
		System.out.println("Subset from 'Fiji' (inclusive) to 'Samoa' (exclusive): " + subsetCountries);

		// stream
		Stream<String> countryStream = countriesFromOcenia.stream();
		List<String> countriesStartingWithA = countryStream.filter(country -> country.startsWith("A"))
				.collect(Collectors.toList());

		System.out.println("Countries starting with A:");
		for (String country : countriesStartingWithA) {
			System.out.println(country);
		}

		// taiSet
		System.out.println(countriesFromOcenia);
		SortedSet<String> tailSet = citiesOfEngland.tailSet("Samoa");
		for (String city : tailSet) {
			System.out.println(city);
		}

		// toArray
		Object[] array = countriesFromOcenia.toArray();
		System.out.println(array);

		// toString
		String string = countriesFromOcenia.toString();
		System.out.println(string);

		// remove
		boolean remove = countriesFromOcenia.remove("Manchester");
		System.out.println(remove);
		System.out.println(countriesFromOcenia);

		// removeAll
		TreeSet<String> citiesToRemove = new TreeSet<>();
		countriesFromOcenia.add("London");
		countriesFromOcenia.add("Birmingham");
		countriesFromOcenia.removeAll(citiesToRemove);
		System.out.println(countriesFromOcenia);

		// removeFirst
		countriesFromOcenia.removeFirst();

		// removeIf
		countriesFromOcenia.removeIf(city -> city.startsWith("L"));
		System.out.println(countriesFromOcenia);

		// removeLast
		String removeLast = countriesFromOcenia.removeLast();
		System.out.println(removeLast);
		System.out.println(countriesFromOcenia);

		// clear
		countriesFromOcenia.clear();
		System.out.println(countriesFromOcenia);

	}

}
