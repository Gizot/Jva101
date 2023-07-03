package gradeAverage;

import java.util.Scanner;

public class CalculateGrateAverage {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunu girin: ");
        float matematik = scanner.nextFloat();

        System.out.print("Fizik notunu girin: ");
        float fizik = scanner.nextFloat();

        System.out.print("Kimya notunu girin: ");
        float kimya = scanner.nextFloat();

        System.out.print("Türkçe notunu girin: ");
        float turkce = scanner.nextFloat();

        System.out.print("Tarih notunu girin: ");
        float tarih = scanner.nextFloat();

        System.out.print("Müzik notunu girin: ");
        float muzik = scanner.nextFloat();

        float toplam = matematik + fizik + kimya + turkce + tarih + muzik;
        float ortalama = toplam / 6.0f;

        System.out.println("Ortalama: " + ortalama);

        String sinifDurumu = ortalama >= 60.0f? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sinifDurumu);
    }

	}


