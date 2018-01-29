package com.repo.javaLib;

import java.util.Random;

public class RandomNumber {

	public static int randInt(int min, int max) {

		// NOTE: This will (intentionally) not run as written so that folks
		// copy-pasting have to think about how to initialize their
		// Random instance. Initialization of the Random instance is outside
		// the main scope of the question, but some decent options are to have
		// a field that is initialized once and then re-used as needed or to
		// use ThreadLocalRandom (if using at least Java 1.7).
		//
		// In particular, do NOT do 'Random rand = new Random()' here or you
		// will not get very good / not very random results.
		Random rand = new Random();

		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}

	public static long generateRandomMobileNo(int length) {
		Random random = new Random();
		char[] array = new char[length];
		array[0] = (char) (random.nextInt(1) + '8');
		for (int i = 1; i < length; i++) {
			array[i] = (char) (random.nextInt(9) + '0');
		}
		return Long.parseLong(new String(array));
	}
}
