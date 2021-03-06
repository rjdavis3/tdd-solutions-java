package me.rjdavis.tdd.missinginteger;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;

public class MissingIntegerTest {

	@Test
	public void givenNegativeOneAndNegativeThreeWhenReturningSmallestIntThenReturnOne() throws Exception {
		final int[] A = Arrays.asList(-1, -3).stream().mapToInt(Integer::intValue).toArray();
		final int actualSmallestInt = new MissingInteger().solution(A);
		assertEquals(1, actualSmallestInt);
	}

	@Test
	public void givenOneAndZeroAndThreeWhenReturningSmallestIntThenReturnTwo() throws Exception {
		final int[] A = Arrays.asList(1, 0, 3).stream().mapToInt(Integer::intValue).toArray();
		final int actualSmallestInt = new MissingInteger().solution(A);
		assertEquals(2, actualSmallestInt);
	}

	@Test
	public void givenOneAndThreeAndSixAndFourAndOneAndTwoWhenReturningSmallestIntThenReturnFive() throws Exception {
		final int[] A = Arrays.asList(1, 3, 6, 4, 1, 2).stream().mapToInt(Integer::intValue).toArray();
		final int actualSmallestInt = new MissingInteger().solution(A);
		assertEquals(5, actualSmallestInt);
	}

	@Test
	public void givenLargeListOfLargeNegativeNumbersWhenReturningSmallestIntThenReturnOne() throws Exception {
		final int[] A = IntStream.generate(() -> -1000000).limit(100000).boxed().collect(Collectors.toList()).stream()
				.mapToInt(Integer::intValue).toArray();
		final int actualSmallestInt = new MissingInteger().solution(A);
		assertEquals(1, actualSmallestInt);
	}

}
