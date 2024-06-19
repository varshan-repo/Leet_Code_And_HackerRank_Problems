package Hackerrank.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TheFullCountingSort {

	public static void countSort(List<List<String>> arr) {
		
		String result = IntStream.range(0, arr.size())
				.mapToObj(i -> {
					String v = arr.get(i).get(0);
					if (i < arr.size() / 2) {
						return new ArrayList<>(List.of(v, "-"));
					} else {
						return new ArrayList<>(List.of(v, arr.get(i).get(1)));
					}
				})
				.sorted(Comparator.comparingInt(s -> Integer.parseInt(s.get(0))))
				.map(ele -> ele.get(1))
				.collect(Collectors.joining(" "));
				
			System.out.println(result);

	}

	public static void main(String[] args) {
		List<List<String>> inputIntegers = new ArrayList<>();

		inputIntegers.add(Arrays.asList("0", "ab"));
		inputIntegers.add(Arrays.asList("6", "cd"));
		inputIntegers.add(Arrays.asList("0", "ef"));
		inputIntegers.add(Arrays.asList("6", "gh"));
		inputIntegers.add(Arrays.asList("4", "ij"));
		inputIntegers.add(Arrays.asList("0", "ab"));
		inputIntegers.add(Arrays.asList("6", "cd"));
		inputIntegers.add(Arrays.asList("0", "ef"));
		inputIntegers.add(Arrays.asList("6", "gh"));
		inputIntegers.add(Arrays.asList("0", "ij"));
		inputIntegers.add(Arrays.asList("4", "that"));
		inputIntegers.add(Arrays.asList("3", "be"));
		inputIntegers.add(Arrays.asList("0", "to"));
		inputIntegers.add(Arrays.asList("1", "be"));
		inputIntegers.add(Arrays.asList("5", "question"));
		inputIntegers.add(Arrays.asList("1", "or"));
		inputIntegers.add(Arrays.asList("2", "not"));
		inputIntegers.add(Arrays.asList("4", "is"));
		inputIntegers.add(Arrays.asList("2", "to"));
		inputIntegers.add(Arrays.asList("4", "the"));
		
		countSort(inputIntegers);
	}
}
