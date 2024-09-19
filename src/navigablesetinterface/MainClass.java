package navigablesetinterface;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {

		// constructor
		NavigableSet<String> citiesOfEngland = new TreeSet<>();

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
		NavigableSet<String> newCities = new TreeSet<>();
		newCities.add("Liverpool");
		newCities.add("Newcastle");
		newCities.add("York");
		citiesOfEngland.addAll(newCities);
		System.out.println(citiesOfEngland);

		// ceiling
		NavigableSet<Integer> randomNumbers = new TreeSet<>();
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

		// getFirst
		String first = citiesOfEngland.getFirst();
		System.out.println(first);

		// getLast
		String last = citiesOfEngland.getLast();
		System.out.println(last);

		// first
		String first2 = citiesOfEngland.first();
		System.out.println(first2);

		// last
		String last2 = citiesOfEngland.last();
		System.out.println(last2);

		// isEmpty
		boolean isEmpty = citiesOfEngland.isEmpty();
		System.out.println(isEmpty);

		// descendingIterator
		Iterator<String> descendingIterator = citiesOfEngland.descendingIterator();

		while (descendingIterator.hasNext()) {
			String city = descendingIterator.next();
			System.out.println(city);
		}

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

		// descendingSet
		NavigableSet<String> descendingCities = citiesOfEngland.descendingSet();
		for (String city : descendingCities) {
			System.out.println(city);
		}

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

		// pollFirst
		String pollFirst = citiesOfEngland.pollFirst();
		System.out.println(pollFirst);

		// pollLast
		String pollLast = citiesOfEngland.pollLast();
		System.out.println(pollLast);

		// remove
		boolean remove = citiesOfEngland.remove("Manchester");
		System.out.println(remove);
		System.out.println(citiesOfEngland);

		// removeAll
		NavigableSet<String> citiesToRemove = new TreeSet<>();
		citiesToRemove.add("London");
		citiesToRemove.add("Birmingham");
		citiesOfEngland.removeAll(citiesToRemove);
		System.out.println(citiesOfEngland);

		// removeFirst
		citiesOfEngland.removeFirst();

		// removeIf
		citiesOfEngland.removeIf(city -> city.startsWith("L"));
		System.out.println(citiesOfEngland);

		// clear
		citiesOfEngland.clear();
		System.out.println(citiesOfEngland);

	}

}
