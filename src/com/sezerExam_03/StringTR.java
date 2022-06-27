package com.sezerExam_03;

public class StringTR {

	// static class tanımlıyarak, runner import ederek kullanırken object ismini
	// yazmayı elemek için inner class oluşturmak istedim..

	public static class CustomStringTR { // inner class

		public static String value;
		public static String newValue;

		public static int uzunluk() { // 1
			int uzunluk = value.length();
			return uzunluk;
		}

		public static boolean esittir(String control) { // 2
			return value.equals(control);
		}

		public static boolean esittirBuyukKarakterBakma(String control) { // 3
			return value.equalsIgnoreCase(control);
		}

		public static String degistir(String eski, String yeni) { // 4
			newValue = value.replace(eski, yeni);
			return newValue;
		}

		public static char karakterDe(int index) { // 5
			char newValue = value.charAt(index);
			return newValue;
		}

		public static String kısaltma(int start) { // 6
			newValue = value.substring(start);
			return newValue;
		}

		public static String kısaltma(int start, int end) { // 7
			newValue = value.substring(start, end);
			return newValue;
		}

		public static String buyukHarflere(String value) {// 8
			newValue = value.toUpperCase();
			return newValue;
		}

		public static String kucukHarflere(String value) {// 9
			newValue = value.toLowerCase();
			return newValue;
		}

		public static String kücült(String value) {// 10
			newValue = value.trim();
			return newValue;
		}

	}

}
