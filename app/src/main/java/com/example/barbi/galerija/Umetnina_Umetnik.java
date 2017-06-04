/***********************************************************************
 * Module:  Umetnina_Umetnik.java
 * Author:  Barbi
 * Purpose: Defines the Class Umetnina_Umetnik
 ***********************************************************************/

package com.example.barbi.galerija;

import java.util.*;

/** @pdOid 158b7fbe-2237-494c-ba8b-643801d92b60 */
public class Umetnina_Umetnik {
   public java.util.Collection<Umetnina_Umetnik> umetnina_Umetnik;
   /** @pdRoleInfo migr=no name=Umetnik assc=jeustvaril coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public Umetnik jeUstvaril;
   /** @pdRoleInfo migr=no name=Umetnina assc=Association_7 coll=java.util.Collection impl=java.util.HashSet mult=1..1 side=A */
   public Umetnina joJeUstvaril;


   Umetnina_Umetnik(Umetnik avtor, Umetnina umetnina){
      this.jeUstvaril = avtor;
      this.joJeUstvaril = umetnina;
   }

   public Umetnina_Umetnik(){
      Umetnina ua = new Umetnina();
      ArrayList<Umetnina> vseUmetnine1 = new ArrayList<>(ua.Umetnine);
      Umetnik um = new Umetnik();
      ArrayList<Umetnik> VsiUmetniki1 = new ArrayList<>(um.Umetniki);
      umetnina_Umetnik.add(new Umetnina_Umetnik(VsiUmetniki1.get(0),vseUmetnine1.get(0)));
      umetnina_Umetnik.add(new Umetnina_Umetnik(VsiUmetniki1.get(0),vseUmetnine1.get(1)));
      umetnina_Umetnik.add(new Umetnina_Umetnik(VsiUmetniki1.get(0),vseUmetnine1.get(3)));
      umetnina_Umetnik.add(new Umetnina_Umetnik(VsiUmetniki1.get(0),vseUmetnine1.get(4)));
      umetnina_Umetnik.add(new Umetnina_Umetnik(VsiUmetniki1.get(0),vseUmetnine1.get(5)));
      umetnina_Umetnik.add(new Umetnina_Umetnik(VsiUmetniki1.get(0),vseUmetnine1.get(6)));
      umetnina_Umetnik.add(new Umetnina_Umetnik(VsiUmetniki1.get(0),vseUmetnine1.get(7)));
      umetnina_Umetnik.add(new Umetnina_Umetnik(VsiUmetniki1.get(0),vseUmetnine1.get(8)));
      umetnina_Umetnik.add(new Umetnina_Umetnik(VsiUmetniki1.get(0),vseUmetnine1.get(9)));
      umetnina_Umetnik.add(new Umetnina_Umetnik(VsiUmetniki1.get(0),vseUmetnine1.get(10)));
      umetnina_Umetnik.add(new Umetnina_Umetnik(VsiUmetniki1.get(0),vseUmetnine1.get(11)));
      umetnina_Umetnik.add(new Umetnina_Umetnik(VsiUmetniki1.get(0),vseUmetnine1.get(12)));
      umetnina_Umetnik.add(new Umetnina_Umetnik(VsiUmetniki1.get(0),vseUmetnine1.get(13)));
      umetnina_Umetnik.add(new Umetnina_Umetnik(VsiUmetniki1.get(0),vseUmetnine1.get(14)));
      umetnina_Umetnik.add(new Umetnina_Umetnik(VsiUmetniki1.get(0),vseUmetnine1.get(15)));
      umetnina_Umetnik.add(new Umetnina_Umetnik(VsiUmetniki1.get(0),vseUmetnine1.get(16)));
   }
   /** @pdOid a32ab643-9d14-4a00-9e08-f383b40bfc83 */
   public void NajdiUmetnine() {
      // TODO: implement
   }



   /** @pdGenerated default parent getter */
   public Umetnik getJeUstvaril() {
      return jeUstvaril;
   }

   /** @pdGenerated default parent setter
    * @param newUmetnik */
   public void setJeUstvaril(Umetnik newUmetnik) {
      if (this.jeUstvaril == null || !this.jeUstvaril.equals(newUmetnik))
      {
         if (this.jeUstvaril != null)
         {
            Umetnik oldUmetnik = this.jeUstvaril;
            this.jeUstvaril = null;
            oldUmetnik.removeUmetnina_Umetnik(this);
         }
         if (newUmetnik != null)
         {
            this.jeUstvaril = newUmetnik;
            this.jeUstvaril.addUmetnina_Umetnik(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Umetnina getJoJeUstvaril() {
      return joJeUstvaril;
   }

   /** @pdGenerated default parent setter
    * @param newUmetnina */
   public void setJoJeUstvaril(Umetnina newUmetnina) {
      if (this.joJeUstvaril == null || !this.joJeUstvaril.equals(newUmetnina))
      {
         if (this.joJeUstvaril != null)
         {
            Umetnina oldUmetnina = this.joJeUstvaril;
            this.joJeUstvaril= null;
            oldUmetnina.removeUmetnina_Umetnik(this);
         }
         if (newUmetnina != null)
         {
            this.joJeUstvaril = newUmetnina;
            this.joJeUstvaril.addUmetnina_Umetnik(this);
         }
      }
   }

}