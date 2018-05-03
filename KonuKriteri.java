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
public class KonuKriteri implements Kriter
{

    @Override
    public List<Kurs> kriterKarsila(List<Kurs> kurslar)
    {
	List<Kurs> ktiteriKarsiliyanKurslar = new ArrayList<>();

	Scanner klavye = new Scanner(System.in);

	System.out.println("Bir konu seçiniz");

	String konu = klavye.nextLine();

	for (Kurs kurs : kurslar)
	{

	    if (kurs.getKonu().equalsIgnoreCase(konu))
	    {

		ktiteriKarsiliyanKurslar.add(kurs);
	    }

	}

	return ktiteriKarsiliyanKurslar;

    }

}
