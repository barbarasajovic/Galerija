/***********************************************************************
 * Module:  Umetnik_Obdobje.java
 * Author:  Barbi
 * Purpose: Defines the Class Umetnik_Obdobje
 ***********************************************************************/

package com.example.barbi.galerija;

import java.util.*;

/** @pdOid d63d569a-b3b3-44be-a09f-e7781fc4d364 */
public class Umetnik_Obdobje {
   /** @pdRoleInfo migr=no name=Umetnik assc=jeustvarjalv coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Umetnik jeUstvarjalV;
   /** @pdRoleInfo migr=no name=Obdobje assc=Association_5 coll=java.util.Collection impl=java.util.HashSet mult=1..1 side=A */
   public Obdobje ima;


   public java.util.Collection<Umetnik_Obdobje> VsiUmetnikiObdobja = new ArrayList<>();
   Umetnik_Obdobje(Umetnik novUmetnik,Obdobje novoObdobje){
      this.jeUstvarjalV=novUmetnik;
      this.ima=novoObdobje;
   }

   public Umetnik_Obdobje(){
      Umetnik um = new Umetnik();
      for(Umetnik u : um.Umetniki){
         System.out.println(u.Avtor);
      }
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();


      ArrayList<Umetnik> VsiUmetniki1 = new ArrayList<>(um.Umetniki);
      Obdobje ob = new Obdobje();
      ArrayList<Obdobje> VsaObdobja = new ArrayList<>(ob.Ubdobja);

      VsiUmetnikiObdobja.add(new Umetnik_Obdobje(VsiUmetniki1.get(0),VsaObdobja.get(0)));
      VsiUmetnikiObdobja.add(new Umetnik_Obdobje(VsiUmetniki1.get(1),VsaObdobja.get(1)));
      VsiUmetnikiObdobja.add(new Umetnik_Obdobje(VsiUmetniki1.get(2),VsaObdobja.get(1)));
      VsiUmetnikiObdobja.add(new Umetnik_Obdobje(VsiUmetniki1.get(3),VsaObdobja.get(2)));
      VsiUmetnikiObdobja.add(new Umetnik_Obdobje(VsiUmetniki1.get(4),VsaObdobja.get(2)));
      VsiUmetnikiObdobja.add(new Umetnik_Obdobje(VsiUmetniki1.get(5),VsaObdobja.get(3)));
   }


   /** @pdOid 551c9e97-62e4-4526-a6a1-18523db3e5d0 */
   /*
   public ArrayList<Umetnina> VrniUmetnikeObdobja(String iskanoObdobje,String avtor) {
      ArrayList<Umetnina> vrni = new ArrayList<>();
      ArrayList<Umetnik> umetnikiObdobja = new ArrayList<>();
      for(Umetnik_Obdobje uo : VsiUmetnikiObdobja){
         if(uo.getIma().Ime == iskanoObdobje){
            umetnikiObdobja.add(uo.jeUstvarjalV);
         }
      }
      for(Umetnik u : umetnikiObdobja){
         if(u.Avtor == avtor){
            vrni.addAll(u.VrniIskanegaUmetnika(avtor));
         }
      }
      return vrni;
   }
   */

   
   /** @pdGenerated default parent getter */
   public Umetnik getJeUstvarjalV() {
      return jeUstvarjalV;
   }
   
   /** @pdGenerated default parent setter
     * @param newUmetnik */
   public void setJeUstvarjalV(Umetnik newUmetnik) {
      if (this.jeUstvarjalV == null || !this.jeUstvarjalV.equals(newUmetnik))
      {
         if (this.jeUstvarjalV != null)
         {
            Umetnik oldUmetnik = this.jeUstvarjalV;
            this.jeUstvarjalV = null;
            oldUmetnik.removeUmetnik_Obdobje(this);
         }
         if (newUmetnik != null)
         {
            this.jeUstvarjalV = newUmetnik;
            this.jeUstvarjalV.addUmetnik_Obdobje(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Obdobje getIma() {
      return ima;
   }
   
   /** @pdGenerated default parent setter
     * @param newObdobje */
   public void setIma(Obdobje newObdobje) {
      if (this.ima == null || !this.ima.equals(newObdobje))
      {
         if (this.ima != null)
         {
            Obdobje oldObdobje = this.ima;
            this.ima = null;
            oldObdobje.removeUmetnik_Obdobje(this);
         }
         if (newObdobje != null)
         {
            this.ima = newObdobje;
            this.ima.addUmetnik_Obdobje(this);
         }
      }
   }

}