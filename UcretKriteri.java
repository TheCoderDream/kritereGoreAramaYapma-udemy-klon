/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders66;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author flycodeveloper
 */
public class UcretKriteri implements Kriter
{

    @Override
    public List<Kurs> kriterKarsila(List<Kurs> kurslar)
    {
	List<Kurs> kriteriSaglayanKurslar = new ArrayList<>();

	for (Kurs kurs : kurslar)
	{

	    if (kurs.isUcretliMi() == true)
	    {

		kriteriSaglayanKurslar.add(kurs);
	    }

	}
	return kriteriSaglayanKurslar;
    }

}
