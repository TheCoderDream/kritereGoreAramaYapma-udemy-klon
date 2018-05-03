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
public class Ders66
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
	List<Kurs> kurslar = new ArrayList<>();

	kurslar.add(new Kurs("Java", "türkçe", 4.9f, true));
	kurslar.add(new Kurs("Python", "türkçe", 4.2f, true));
	kurslar.add(new Kurs("PHP", "türkçe", 4.1f, false));
	kurslar.add(new Kurs("Java", "ingilizce", 4.8f, true));

	kurslariYazdir(kurslar);

	Kriter puanKriter = new PuanKriteri();
	Kriter dilKriter = new DilKriteri();
	Kriter konuKriter = new KonuKriteri();

	/*	System.out.println("Puan Kriteri");

	List<Kurs> puaniKarsiliyanKurslar = puanKriter.kriterKarsila(kurslar);
	kurslariYazdir(puaniKarsiliyanKurslar);

	System.out.println("Dil kriteri ");
	List<Kurs> diliKarsiliyanKurslar = dilKriter.kriterKarsila(kurslar);

	kurslariYazdir(diliKarsiliyanKurslar); */
	System.out.println("Puan , dil ve Konu kriterleri");
	Kriter ucluKriter = new UcluKriter(puanKriter, dilKriter, konuKriter);
	List<Kurs> ucluKriteriKarsilayanKurslar = ucluKriter.kriterKarsila(kurslar);

	kurslariYazdir(ucluKriteriKarsilayanKurslar);
	/*System.out.println("Konu Kriteri");

	Kriter konuKriteri = new KonuKriteri();
	List<Kurs> konuKriterineUygunKurslar = konuKriteri.kriterKarsila(kurslar);

	kurslariYazdir(konuKriterineUygunKurslar);*/

    }

    public static void kurslariYazdir(List<Kurs> kurslar)
    {

	for (Kurs kurs : kurslar)
	{
	    System.out.println(kurs);

	}

    }

}
