package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {

		// constructors
		HashSet<Integer> perfectNumbers = new HashSet<>();

		// add(E e)
		perfectNumbers.add(6);
		perfectNumbers.add(28);
		perfectNumbers.add(496);
		perfectNumbers.add(8128);
		System.out.println(perfectNumbers);
		perfectNumbers.add(8128);
		System.out.println(perfectNumbers);

		// addAll
		HashSet<String> fruits = new HashSet<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		HashSet<String> moreFruits = new HashSet<>();
		moreFruits.add("grape");
		moreFruits.add("mango");
		moreFruits.add("apple");
		fruits.addAll(moreFruits);
		System.out.println(fruits);

		// clear()
		System.out.println(fruits);
		fruits.clear();
		System.out.println(fruits);

		// clone()
		HashSet<String> originalSet = new HashSet<>();
		originalSet.add("apple");
		originalSet.add("banana");
		originalSet.add("orange");
		Object clonedSet = originalSet.clone();
		originalSet.add("grape");
		System.out.println("Original set: " + originalSet);
		System.out.println("Cloned set: " + clonedSet);

		// contains(Object o)
		HashSet<Integer> pentagonalNumbers = new HashSet<>();
		pentagonalNumbers.add(1);
		pentagonalNumbers.add(5);
		pentagonalNumbers.add(12);
		pentagonalNumbers.add(22);
		pentagonalNumbers.add(35);
		boolean containsElement = pentagonalNumbers.contains(77);
		boolean containsAnotherElement = pentagonalNumbers.contains(5);
		System.out.println(containsElement);
		System.out.println(containsAnotherElement);

		// containsAll
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		HashSet<Integer> evenNumbers = new HashSet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		boolean containsAll = numbers.containsAll(evenNumbers);
		System.out.println("numbers contains all elements of evenNumbers: " + containsAll);

		// equals
		HashSet<String> dinosaurusOne = new HashSet<>();
		HashSet<String> dinosaurusTwo = new HashSet<>();

		dinosaurusOne.add("Allosaurus");
		dinosaurusOne.add("Brontozor");
		dinosaurusOne.add("Diplodocus");

		dinosaurusTwo.add("Diplodocus");
		dinosaurusTwo.add("Brontozor");
		dinosaurusTwo.add("Allosaurus");

		boolean equals = dinosaurusOne.equals(dinosaurusTwo);
		System.out.println("Are set1 and set2 equal? " + equals);

		// forEach
		HashSet<String> newGermanVerben = new HashSet<>();
		newGermanVerben.add("benutzen");
		newGermanVerben.add("bekommen");
		newGermanVerben.add("beweisen");
		newGermanVerben.add("zeigen");
		newGermanVerben.add("leben");
		newGermanVerben.forEach(verben -> System.out.println("Verben: " + verben));

		// hashCode
		HashSet<String> germanVerb = new HashSet<String>();
		germanVerb.add("lassen");
		int hashCode = germanVerb.hashCode();
		System.out.println(hashCode);

		// isEmpty()
		boolean empty = germanVerb.isEmpty();
		System.out.println(empty);

		// iterator()
		HashSet<String> anyFruits = new HashSet<>();
		anyFruits.add("apple");
		anyFruits.add("banana");
		anyFruits.add("orange");
		Iterator<String> iterator = anyFruits.iterator();
		while (iterator.hasNext()) {
			String fruit = iterator.next();
			System.out.println(fruit);
		}

		// remove(Object o)
		HashSet<String> germanVerbs = new HashSet<String>();
		germanVerbs.add("glauben");
		germanVerbs.add("schreiben");
		germanVerbs.add("fahren");
		germanVerbs.add("denken");
		germanVerbs.add("wissen");
		germanVerbs.add("finden");
		germanVerbs.add("sagen");
		System.out.println(germanVerbs);
		germanVerbs.remove("finden");
		System.out.println(germanVerbs);

		// removeIf
		System.out.println(germanVerbs);
		boolean removeIfContainsW = germanVerbs.removeIf(v -> v.contains("w"));
		System.out.println(removeIfContainsW);
		System.out.println(germanVerbs);

		// retainAll
		perfectNumbers.retainAll(perfectNumbers);

		// size()
		int size = germanVerbs.size();
		System.out.println(size);

		// stream()
		long count = germanVerbs.stream().count();
		System.out.println(count);

		// removeAll
		boolean removeAll = germanVerbs.removeAll(germanVerbs);
		System.out.println(removeAll);
		System.out.println(germanVerbs);

		// toArray
		HashSet<String> dinosaurs = new HashSet<>();
		dinosaurs.add("Allosaurus");
		dinosaurs.add("Brontozor");
		dinosaurs.add("Diplodocus");
		dinosaurs.add("Titanozor");
		dinosaurs.add("Carnotaurus");
		dinosaurs.add("Argentinosaurus");
		String[] dinosaurArray = dinosaurs.toArray(new String[0]);
		System.out.println("Dinosaurs in the String array:");
		for (String dinosaur : dinosaurArray) {
			System.out.println(dinosaur);
		}

		// toString
		String dinosaurString = dinosaurs.toString();
		System.out.println("String representation of the HashSet:");
		System.out.println(dinosaurString);

	}

}
