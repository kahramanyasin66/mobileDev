package normalizasyon;

import java.util.Random;
import java.util.Arrays;
import java.util.HashSet;

public class Driver {
	public static void main(String[] args) {
		Random rand = new Random();
		HashSet<Integer> dizi = new HashSet<>(); // Dizi içerinde aynı eleman bulunmaması için HashSet kütüphanesini
													// kullandık.
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		double[] normalizeDizi = new double[500]; // Normalize formülü çıktısı ondalıklı değer olacağından dolayı double
													// değerler tutacak dizimizi oluşturduk.

		while (dizi.size() < 500) {
			int rnd = rand.nextInt(10000) + 1;
			if (!dizi.contains(rnd)) {
				dizi.add(rnd);
				if (rnd < min) { // rnd min değerden küçük ise rnd'yi min değer olarak atadık.
					min = rnd;
				}
				if (rnd > max) { // rnd max değerden büyük ise rnd'yi max değer olarak atadık.
					max = rnd;
				}

				normalizeDizi[dizi.size() - 1] = (double) (rnd - min) / (max - min);
			}
		}
		System.out.println("500 Elemanli Dizi : \n " + dizi);
		System.out.println("Normalizasyon Formulu Uygulanmis Dizi : \n" + Arrays.toString(normalizeDizi));
	}
}