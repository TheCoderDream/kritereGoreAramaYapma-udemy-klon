/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders66;

import java.util.List;

/**
 *
 * @author flycodeveloper
 */
public class UcluKriter implements Kriter
{

    Kriter kriter1;
    Kriter kriter2;
    Kriter kriter3;

    public UcluKriter(Kriter kriter1, Kriter kriter2, Kriter kriter3)
    {
	this.kriter1 = kriter1;
	this.kriter2 = kriter2;
	this.kriter3 = kriter3;
    }

    @Override
    public List<Kurs> kriterKarsila(List<Kurs> kurslar)
    {
	List<Kurs> birinciKriter = kriter1.kriterKarsila(kurslar);
	List<Kurs> ikinciKriter = kriter2.kriterKarsila(birinciKriter);

	return kriter3.kriterKarsila(ikinciKriter);
    }

}
