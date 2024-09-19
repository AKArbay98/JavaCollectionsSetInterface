package copyonwritearrayset;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class MainClass {

	public static void main(String[] args) {

		// constructors
		CopyOnWriteArraySet<Integer> perfectNumbers = new CopyOnWriteArraySet<>();

		// add
		System.out.println(perfectNumbers);
		perfectNumbers.add(6);
		perfectNumbers.add(28);
		perfectNumbers.add(496);
		perfectNumbers.add(8128);
		System.out.println(perfectNumbers);
		perfectNumbers.add(8128);
		System.out.println(perfectNumbers);

		// addAll
		CopyOnWriteArraySet<String> fruits = new CopyOnWriteArraySet<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		CopyOnWriteArraySet<String> moreFruits = new CopyOnWriteArraySet<>();
		moreFruits.add("grape");
		moreFruits.add("mango");
		moreFruits.add("apple");
		fruits.addAll(moreFruits);
		System.out.println(fruits);

		// clear
		System.out.println(fruits);
		fruits.clear();
		System.out.println(fruits);

		// contains
		CopyOnWriteArraySet<Integer> pentagonalNumbers = new CopyOnWriteArraySet<>();
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
		CopyOnWriteArraySet<Integer> numbers = new CopyOnWriteArraySet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		CopyOnWriteArraySet<Integer> evenNumbers = new CopyOnWriteArraySet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		boolean containsAll = numbers.containsAll(evenNumbers);
		System.out.println("numbers contains all elements of evenNumbers: " + containsAll);

		// forEach
		CopyOnWriteArraySet<String> newGermanVerben = new CopyOnWriteArraySet<>();
		newGermanVerben.add("benutzen");
		newGermanVerben.add("bekommen");
		newGermanVerben.add("beweisen");
		newGermanVerben.add("zeigen");
		newGermanVerben.add("leben");
		newGermanVerben.forEach(verben -> System.out.println("Verben: " + verben));

		// hashCode
		CopyOnWriteArraySet<String> germanVerb = new CopyOnWriteArraySet<String>();
		germanVerb.add("lassen");
		int hashCode = germanVerb.hashCode();
		System.out.println(hashCode);

		// isEmpty
		boolean empty = germanVerb.isEmpty();
		System.out.println(empty);

		// iterator
		CopyOnWriteArraySet<String> anyFruits = new CopyOnWriteArraySet<>();
		anyFruits.add("apple");
		anyFruits.add("banana");
		anyFruits.add("orange");
		Iterator<String> iterator = anyFruits.iterator();
		while (iterator.hasNext()) {
			String fruit = iterator.next();
			System.out.println(fruit);
		}

		// remove
		CopyOnWriteArraySet<String> germanVerbs = new CopyOnWriteArraySet<String>();
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

		// removeAll
		boolean removeAll = germanVerbs.removeAll(germanVerbs);
		System.out.println(removeAll);
		System.out.println(germanVerbs);

		// removeIf
		System.out.println(germanVerbs);
		boolean removeIfContainsW = germanVerbs.removeIf(v -> v.contains("w"));
		System.out.println(removeIfContainsW);
		System.out.println(germanVerbs);

		// retainAll
		perfectNumbers.retainAll(perfectNumbers);

		// size
		int size = germanVerbs.size();
		System.out.println(size);

		// stream
		long count = germanVerbs.stream().count();
		System.out.println(count);

		// toArray
		CopyOnWriteArraySet<String> dinosaurs = new CopyOnWriteArraySet<>();
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
