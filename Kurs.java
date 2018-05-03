/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders66;

/**
 *
 * @author flycodeveloper
 */
public class Kurs
{

    private String konu;
    private String dil;
    private float puan;
    private boolean ucretliMi;

    public Kurs(String konu, String dil, float puan, boolean ucretliMi)
    {
	this.konu = konu;
	this.dil = dil;
	this.puan = puan;
	this.ucretliMi = ucretliMi;
    }

    public String getKonu()
    {
	return konu;
    }

    public void setKonu(String konu)
    {
	this.konu = konu;
    }

    public String getDil()
    {
	return dil;
    }

    public void setDil(String dil)
    {
	this.dil = dil;
    }

    public float getPuan()
    {
	return puan;
    }

    public void setPuan(float puan)
    {
	this.puan = puan;
    }

    public boolean isUcretliMi()
    {
	return ucretliMi;
    }

    public void setUcretliMi(boolean ucretliMi)
    {
	this.ucretliMi = ucretliMi;
    }

    @Override
    public String toString()
    {
	return "Kurs{" + "konu=" + konu + ", dil=" + dil + ", puan=" + puan + ", ucretliMi=" + ucretliMi + '}';
    }

}
