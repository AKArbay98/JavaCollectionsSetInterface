package concurrentskiplistset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {

	public static void main(String[] args) {

		// constructor
		ConcurrentSkipListSet<String> songsFromJohnnyCash = new ConcurrentSkipListSet<String>();

		// add
		System.out.println(songsFromJohnnyCash);
		songsFromJohnnyCash.add("Ghost Riders In The Sky");
		songsFromJohnnyCash.add("Don’t Take Your Guns to Town");
		songsFromJohnnyCash.add("Folsom Prison Blues");
		songsFromJohnnyCash.add("Hard Times Comin’");
		songsFromJohnnyCash.add("Have You Ever Seen the Rain");
		songsFromJohnnyCash.add("Heart of Gold");
		System.out.println(songsFromJohnnyCash);

		// addAll
		ConcurrentSkipListSet<String> newSongs = new ConcurrentSkipListSet<>();
		newSongs.add("Here Comes That Rainbow Again");
		newSongs.add("I Walk the Line");
		newSongs.add("Hey, Porter");
		songsFromJohnnyCash.addAll(newSongs);
		System.out.println(songsFromJohnnyCash);

		// ceiling
		ConcurrentSkipListSet<Integer> randomNumbers = new ConcurrentSkipListSet<>();
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
		boolean isContains = songsFromJohnnyCash.contains("I Walk the Line");
		System.out.println(isContains);
		System.out.println(songsFromJohnnyCash);

		// containsAll
		boolean containsAll = songsFromJohnnyCash.containsAll(newSongs);
		System.out.println(containsAll);

		// descendingIterator
		Iterator<String> descendingIterator = songsFromJohnnyCash.descendingIterator();

		while (descendingIterator.hasNext()) {
			String city = descendingIterator.next();
			System.out.println(city);
		}

		// descendingSet
		NavigableSet<String> descendingSet = songsFromJohnnyCash.descendingSet();
		for (String city : descendingSet) {
			System.out.println(city);
		}

		// first
		String firstSongsFromCash = songsFromJohnnyCash.first();
		System.out.println("First Songs From Cash: " + firstSongsFromCash);

		// last
		String lastSongsFromCash = songsFromJohnnyCash.last();
		System.out.println("Last Songs From Cash: " + lastSongsFromCash);

		// getFirst
		String first = songsFromJohnnyCash.getFirst();
		System.out.println(first);

		// getLast
		String last = songsFromJohnnyCash.getLast();
		System.out.println(last);

		// isEmpty
		boolean isEmpty = songsFromJohnnyCash.isEmpty();
		System.out.println(isEmpty);

		// forEach
		songsFromJohnnyCash.forEach(s -> s.toUpperCase());
		System.out.println(songsFromJohnnyCash);

		// floor
		System.out.println(songsFromJohnnyCash);
		String floorSongs = songsFromJohnnyCash.floor("Ghost Riders In The Sky");
		System.out.println("Floor of Ghost Riders In The Sky: " + floorSongs);

		// higher
		System.out.println(songsFromJohnnyCash);
		String higherSong = songsFromJohnnyCash.higher("Ghost Riders In The Sky");
		System.out.println(higherSong);

		// lower
		System.out.println(songsFromJohnnyCash);
		String lowerSong = songsFromJohnnyCash.lower("Ghost Riders In The Sky");
		System.out.println(lowerSong);

		// hashCode
		int hashCode = songsFromJohnnyCash.hashCode();
		System.out.println(hashCode);

		// pollFirst
		String pollFirst = songsFromJohnnyCash.pollFirst();
		System.out.println(pollFirst);

		// pollLast
		String pollLast = songsFromJohnnyCash.pollLast();
		System.out.println(pollLast);

		// size
		int size = songsFromJohnnyCash.size();
		System.out.println(size);

		// subset
		System.out.println(songsFromJohnnyCash);
		NavigableSet<String> subSet = songsFromJohnnyCash.subSet("Ghost Riders In The Sky", "Hey, Porter");
		System.out.println(subSet);

		// headSet
		System.out.println(songsFromJohnnyCash);
		SortedSet<String> headSet = songsFromJohnnyCash.headSet("Hard Times Comin’");
		System.out.println(headSet);

		// iterator
		Iterator<String> iterator = songsFromJohnnyCash.iterator();

		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
		}

		// stream
		Stream<String> streamOfCashSong = songsFromJohnnyCash.stream();
		List<String> collect = streamOfCashSong.filter(s -> s.contains("h")).collect(Collectors.toList());
		System.out.println("Songs contains with H:");
		for (String songs : collect) {
			System.out.println(songs);
		}

		// tailSet
		System.out.println(songsFromJohnnyCash);
		SortedSet<String> tailSet = songsFromJohnnyCash.tailSet("Heart of Gold");
		for (String songs : tailSet) {
			System.out.println(songs);
		}

		// toArray
		Object[] array = songsFromJohnnyCash.toArray();
		System.out.println(array);

		// toString
		String string = songsFromJohnnyCash.toString();
		System.out.println(string);

		// remove
		boolean isRemove = songsFromJohnnyCash.remove("Folsom Prison Blues");
		System.out.println(isRemove);

		// removeFirst
		String removeFirst = songsFromJohnnyCash.removeFirst();
		System.out.println(removeFirst);
		System.out.println(songsFromJohnnyCash);

		// removeLast
		String removeLast = songsFromJohnnyCash.removeLast();
		System.out.println(removeLast);
		System.out.println(songsFromJohnnyCash);

		// removeIf
		songsFromJohnnyCash.removeIf(s -> s.contains("y"));
		System.out.println(songsFromJohnnyCash);

		// retainAll
		ConcurrentSkipListSet<String> songsToRetain = new ConcurrentSkipListSet<>();
		songsToRetain.add("Heart of Gold");
		songsFromJohnnyCash.retainAll(songsToRetain);
		System.out.println("Songs remaining after retainAll:");
		for (String song : songsFromJohnnyCash) {
			System.out.println(song);
		}

		// clear
		songsFromJohnnyCash.clear();
		System.out.println(songsFromJohnnyCash);

	}

}
