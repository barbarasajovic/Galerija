/***********************************************************************
 * Module:  Obdobje.java
 * Author:  Barbi
 * Purpose: Defines the Class Obdobje
 ***********************************************************************/

package com.example.barbi.galerija;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/** @pdOid cff8e4c0-7780-4d8b-aad9-212d4f27ae5f */
public class Obdobje {
   /** @pdOid 7a9b6343-4fa2-4267-b59b-d6fa61d01bee */
   public String Ime;
   /** @pdOid 59e36a14-d4a6-4ce7-9089-6420cdca3f78 */
   private int LetoOd;
   /** @pdOid 56e6bf26-a2d6-4a10-9a6b-19e00000067c */
   private int LEtoDo;
   
   /** @pdRoleInfo migr=no name=Umetnik_Obdobje assc=Association_5 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Umetnik_Obdobje> umetnik_Obdobje;

   //    OBDOBJE
   public java.util.Collection<Obdobje> Ubdobja = new java.util.HashSet<Obdobje>();

   public Obdobje(String Ime, int LetoOd, int LEtoDo){
      this.Ime=Ime;
      this.LetoOd=LetoOd;
      this.LEtoDo=LEtoDo;
   }

   public Obdobje(){
      Ubdobja.add(new Obdobje("Antika in srednji vek", 200 ,1300 ));
      Ubdobja.add(new Obdobje("Renesančna umetnost",1300,1600));
      Ubdobja.add(new Obdobje("Renesansa in neoklasicizem",1600,1730));
      Ubdobja.add(new Obdobje("Romantika",1730 ,1880 ));
      Ubdobja.add(new Obdobje("Od romanticizma do moderne umetnosti",1800 ,1900 ));
      Ubdobja.add(new Obdobje("Moderna umetnost",1900,1960 ));
      Ubdobja.add(new Obdobje("Sodobna umetnost",1960,2017 ));
   }

   /** @pdOid 6cbaeed3-b286-43f8-b5e7-32cd0638745c */

   /*
   public ArrayList<Umetnina> VrniVseUmetnineTegaObdobja(String iskanoObdobje,String iskanAvtor) {
      Umetnik_Obdobje uo = new Umetnik_Obdobje();
      ArrayList<Umetnina> vrni = uo.VrniUmetnikeObdobja(iskanoObdobje,iskanAvtor);
      return vrni;
      // TODO: implement
   }
   */
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Umetnik_Obdobje> getUmetnik_Obdobje() {
      if (umetnik_Obdobje == null)
         umetnik_Obdobje = new java.util.HashSet<Umetnik_Obdobje>();
      return umetnik_Obdobje;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorUmetnik_Obdobje() {
      if (umetnik_Obdobje == null)
         umetnik_Obdobje = new java.util.HashSet<Umetnik_Obdobje>();
      return umetnik_Obdobje.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newUmetnik_Obdobje */
   public void setUmetnik_Obdobje(java.util.Collection<Umetnik_Obdobje> newUmetnik_Obdobje) {
      removeAllUmetnik_Obdobje();
      for (java.util.Iterator iter = newUmetnik_Obdobje.iterator(); iter.hasNext();)
         addUmetnik_Obdobje((Umetnik_Obdobje)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newUmetnik_Obdobje */
   public void addUmetnik_Obdobje(Umetnik_Obdobje newUmetnik_Obdobje) {
      if (newUmetnik_Obdobje == null)
         return;
      if (this.umetnik_Obdobje == null)
         this.umetnik_Obdobje = new java.util.HashSet<Umetnik_Obdobje>();
      if (!this.umetnik_Obdobje.contains(newUmetnik_Obdobje))
      {
         this.umetnik_Obdobje.add(newUmetnik_Obdobje);
         newUmetnik_Obdobje.setIma(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldUmetnik_Obdobje */
   public void removeUmetnik_Obdobje(Umetnik_Obdobje oldUmetnik_Obdobje) {
      if (oldUmetnik_Obdobje == null)
         return;
      if (this.umetnik_Obdobje != null)
         if (this.umetnik_Obdobje.contains(oldUmetnik_Obdobje))
         {
            this.umetnik_Obdobje.remove(oldUmetnik_Obdobje);
            oldUmetnik_Obdobje.setIma((Obdobje)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllUmetnik_Obdobje() {
      if (umetnik_Obdobje != null)
      {
         Umetnik_Obdobje oldUmetnik_Obdobje;
         for (java.util.Iterator iter = getIteratorUmetnik_Obdobje(); iter.hasNext();)
         {
            oldUmetnik_Obdobje = (Umetnik_Obdobje)iter.next();
            iter.remove();
            oldUmetnik_Obdobje.setIma((Obdobje)null);
         }
      }
   }

}