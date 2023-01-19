package fibonacciAndPrimeNumber;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3, i = 2, fibonacciMax = 500000;
		List<Integer> asalSayilar = new ArrayList<>();

		System.out.print(n1 + " " + n2);

		while (i > 0) {
			n3 = n1 + n2;
			if (asal(n3)) {
				asalSayilar.add(n3);
			}
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
			if (n3 > fibonacciMax) {
				if (asal(n3)) {
					break;
				} else {
					fibonacciMax += n3;
				}

			}
		}

		int sayi1 = findThePrimeFibonacciNumberLessThan500000(asalSayilar);
		int sayi2 = findThePrimeFibonacciNumberHigherThan500000(asalSayilar);
		int buyukKucukFark = sayi2 - sayi1;
		System.out.println("\n2 Sayinin farki: " + buyukKucukFark);

	}

	static int findThePrimeFibonacciNumberLessThan500000(List<Integer> sayilar) {
		int enBuyuk = 0;
		int enBuyukAsal = 0;
		for (int i = 0; i < sayilar.size(); i++) {
			if (sayilar.get(i) > enBuyuk) {
				enBuyuk = sayilar.get(i);
				if (asal(enBuyuk)) {
					enBuyukAsal = enBuyuk;
					if (enBuyukAsal > 500000) {
						enBuyukAsal = sayilar.get(i - 1);
						break;
					}
				}
			}
		}
		System.out.println("\n500.000'den Kucuk En Buyuk Fibonacci Asal Sayi: " + enBuyukAsal);
		return enBuyukAsal;
	}

	static int findThePrimeFibonacciNumberHigherThan500000(List<Integer> sayilar) {
		int enBuyuk = 0;
		int enBuyukAsal = 0;
		for (int i = 0; i < sayilar.size(); i++) {
			if (sayilar.get(i) > enBuyuk) {
				enBuyuk = sayilar.get(i);
				if (asal(enBuyuk)) {
					enBuyukAsal = enBuyuk;
					if (enBuyukAsal > 500000) {
						enBuyukAsal = sayilar.get(i);
						break;
					}
				}
			}
		}
		System.out.println("\n500.000'den Buyuk En Kucuk Fibonacci Asal Sayi: " + enBuyukAsal);
		return enBuyukAsal;
	}

	static boolean asal(int sayi) {
		int sayac = 0;
		for (int i = 2; i < sayi; i++) {
			if (sayi == 2) {
				break;
			} else if (sayi % i == 0) {
				sayac++;
				break;
			}

		}

		if (sayac == 0) {		
			return true;

		} else			
			return false;
	}

}
