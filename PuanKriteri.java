/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders66;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author flycodeveloper
 */
public class PuanKriteri implements Kriter
{

    @Override
    public List<Kurs> kriterKarsila(List<Kurs> kurslar)
    {
	List<Kurs> kriteriSaglayanKurslar = new ArrayList<>();

	Scanner klavye = new Scanner(System.in);
	System.out.println("0-5 arasında bir puan gir diyelim");

	float girilenSayi = klavye.nextFloat();

	for (Kurs kurs : kurslar)
	{

	    if (kurs.getPuan() > girilenSayi)
	    {

		kriteriSaglayanKurslar.add(kurs);
	    }

	}
	return kriteriSaglayanKurslar;
    }

}
