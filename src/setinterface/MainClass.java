package setinterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {

		// constructor
		Set<String> citiesOfEngland = new HashSet<String>();

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
		Set<String> newCities = new HashSet<>();
		newCities.add("Liverpool");
		newCities.add("Newcastle");
		newCities.add("York");
		citiesOfEngland.addAll(newCities);
		System.out.println(citiesOfEngland);

		// contains
		boolean isContains = citiesOfEngland.contains("Bristol");
		System.out.println(isContains);
		System.out.println(citiesOfEngland);

		// isEmpty
		boolean isEmpty = citiesOfEngland.isEmpty();
		System.out.println(isEmpty);
		System.out.println(citiesOfEngland);

		// size
		int size = citiesOfEngland.size();
		System.out.println(size);
		System.out.println(citiesOfEngland);

		// toArray
		Object[] array = citiesOfEngland.toArray();
		System.out.println(array);

		// toString
		String string = citiesOfEngland.toString();
		System.out.println(string);

		// forEach
		citiesOfEngland.forEach(city -> System.out.println(city));

		// iterator
		Iterator<String> iterator = citiesOfEngland.iterator();

		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}

		// retainAll
		Set<String> citiesToRetain = new HashSet<>();
		citiesToRetain.add("London");
		citiesToRetain.add("Birmingham");
		citiesToRetain.add("Leeds");

		citiesOfEngland.retainAll(citiesToRetain);

		// stream
		List<String> citiesList = citiesOfEngland.stream().collect(Collectors.toList());
		System.out.println(citiesList);

		// remove
		boolean remove = citiesOfEngland.remove("Manchester");
		System.out.println(remove);
		System.out.println(citiesOfEngland);

		// removeAll
		Set<String> citiesToRemove = new HashSet<>();
		citiesToRemove.add("London");
		citiesToRemove.add("Birmingham");
		citiesOfEngland.removeAll(citiesToRemove);
		System.out.println(citiesOfEngland);

		// removeIf
		citiesOfEngland.removeIf(city -> city.startsWith("L"));
		System.out.println(citiesOfEngland);

		// clear
		citiesOfEngland.clear();
		System.out.println(citiesOfEngland);

	}

}
