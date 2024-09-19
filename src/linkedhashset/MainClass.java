package linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class MainClass {

	public static void main(String[] args) {

		// constructor
		LinkedHashSet<Integer> perfectNumbers = new LinkedHashSet<Integer>();

		// add
		perfectNumbers.add(6);
		perfectNumbers.add(28);
		perfectNumbers.add(496);
		perfectNumbers.add(8128);
		System.out.println(perfectNumbers);
		perfectNumbers.add(8128);
		System.out.println(perfectNumbers);

		// addAll
		LinkedHashSet<String> fruits = new LinkedHashSet<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		LinkedHashSet<String> moreFruits = new LinkedHashSet<>();
		moreFruits.add("grape");
		moreFruits.add("mango");
		moreFruits.add("apple");
		fruits.addAll(moreFruits);
		System.out.println(fruits);

		// addFirst
		LinkedHashSet<String> citiesOfGermany = new LinkedHashSet<>();
		citiesOfGermany.add("Stuttgart");
		System.out.println(citiesOfGermany);
		citiesOfGermany.addFirst("Bremen");
		System.out.println(citiesOfGermany);

		// addLast
		citiesOfGermany.addLast("Berlin");
		System.out.println(citiesOfGermany);

		// clear
		citiesOfGermany.clear();
		System.out.println(citiesOfGermany);

		// contains
		LinkedHashSet<String> anotherGermanCities = new LinkedHashSet<>();
		anotherGermanCities.add("Hamburg");
		anotherGermanCities.add("Potsdam");
		anotherGermanCities.add("Mannheim");
		boolean contains = anotherGermanCities.contains("Hamburg");
		boolean containsTwo = anotherGermanCities.contains("München");
		System.out.println(contains);
		System.out.println(containsTwo);

		// containsAll
		boolean containsAll = fruits.containsAll(moreFruits);
		System.out.println(containsAll);

		// equals
		boolean isEqualFruits = fruits.equals(moreFruits);
		System.out.println(isEqualFruits);

		// forEach
		fruits.forEach(fruit -> System.out.println(fruit));

		// getFirst
		LinkedHashSet<Integer> triangleNumber = new LinkedHashSet<Integer>();
		triangleNumber.add(1);
		triangleNumber.add(3);
		triangleNumber.add(6);
		triangleNumber.add(10);
		triangleNumber.add(15);
		triangleNumber.add(21);
		Integer firstElementTriangleNumber = triangleNumber.getFirst();
		System.out.println(firstElementTriangleNumber);

		// getLast
		Integer lastElementTriangleNumber = triangleNumber.getLast();
		System.out.println(lastElementTriangleNumber);

		// hashCode
		int hashCode = firstElementTriangleNumber.hashCode();
		System.out.println(hashCode);

		// isEmpty
		System.out.println(anotherGermanCities);
		boolean isEmptyGermanCities = anotherGermanCities.isEmpty();
		System.out.println(isEmptyGermanCities);

		// iterator
		LinkedHashSet<String> footballClubs = new LinkedHashSet<String>();
		footballClubs.add("FC Barcelona");
		footballClubs.add("Bayern Münih");
		footballClubs.add("Red Bull Salzburg");
		Iterator<String> iterator = footballClubs.iterator();
		while (iterator.hasNext()) {
			String fruit = iterator.next();
			System.out.println(fruit);
		}

		// retainAll
		LinkedHashSet<String> dinosaurs = new LinkedHashSet<>();
		dinosaurs.add("Allosaurus");
		dinosaurs.add("Brontozor");
		dinosaurs.add("Diplodocus");
		dinosaurs.add("Titanozor");
		dinosaurs.add("Carnotaurus");
		dinosaurs.add("Argentinosaurus");
		System.out.println(dinosaurs);

		LinkedHashSet<String> carnivores = new LinkedHashSet<>();
		carnivores.add("Allosaurus");
		carnivores.add("Carnotaurus");

		dinosaurs.retainAll(carnivores);
		System.out.println("Dinosaurs after retainAll: " + dinosaurs);

		// remove
		LinkedHashSet<Integer> numberOfDudeney = new LinkedHashSet<Integer>();
		numberOfDudeney.add(1);
		numberOfDudeney.add(512);
		numberOfDudeney.add(4913);
		numberOfDudeney.add(5832);
		numberOfDudeney.add(17576);
		numberOfDudeney.add(19683);
		System.out.println(numberOfDudeney);
		numberOfDudeney.remove(17576);
		System.out.println(numberOfDudeney);

		// removeFirst
		Integer removeFirst = numberOfDudeney.removeFirst();
		System.out.println(removeFirst);
		System.out.println(numberOfDudeney);

		// removeLast
		numberOfDudeney.removeLast();
		System.out.println(numberOfDudeney);

		// removeIf
		dinosaurs.removeIf(dinosaur -> dinosaur.startsWith("A"));
		System.out.println("Dinosaurs after removeIf: " + dinosaurs);

		// removeAll
		LinkedHashSet<String> dinosaursToRemove = new LinkedHashSet<>();
		dinosaursToRemove.add("Titanozor");
		dinosaursToRemove.add("Carnotaurus");
		dinosaurs.removeAll(dinosaursToRemove);
		System.out.println("Dinosaurs after removeAll: " + dinosaurs);

		// size
		int size = anotherGermanCities.size();
		System.out.println(size);

		// stream
		LinkedHashSet<Integer> bellNumber = new LinkedHashSet<Integer>();
		bellNumber.add(1);
		bellNumber.add(1);
		bellNumber.add(2);
		bellNumber.add(5);
		bellNumber.add(15);
		bellNumber.add(52);
		bellNumber.add(203);
		System.out.println(bellNumber.stream().map(i -> i * 2));

		// toString
		String dinosaurString = dinosaurs.toString();
		System.out.println("String representation of the HashSet:");
		System.out.println(dinosaurString);

	}

}
