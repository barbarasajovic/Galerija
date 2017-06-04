/***********************************************************************
 * Module:  K_PregledUmetnin.java
 * Author:  Barbi
 * Purpose: Defines the Class K_PregledUmetnin
 ***********************************************************************/

package com.example.barbi.galerija;


import java.util.*;

/** @pdOid 9fffc45d-3de3-49f2-93ac-4f1d5396b731 */
public class K_PregledUmetnin {
   /** @pdRoleInfo migr=no name=Umetnina assc=Association_2 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Umetnina> umetnina;
   public Umetnina umetnina1 = new Umetnina();
   public Umetnik umetnik = new Umetnik();
   public Obdobje obdobje1 = new Obdobje();
   public Umetnina umetnina5 = new Umetnina();
   
   /** @pdOid 78d02857-203f-45f0-b906-9bf0b67405b0 */
   public ArrayList<String> VrniSeznamVsehUmetnin() {
      ArrayList<String> umetnine2 = umetnina1.VrniSeznamVsehUmetnin();
      return umetnine2;
   }

   /** @pdOid c7af13f8-1364-4e3f-8590-fe48e3fb31e2 */
   public ArrayList<String> VrniUmetnineUmetnika(String avtor) {
      ArrayList<String> umetnine3 = umetnik.VrniVseUmetnineUmetnika(avtor);
      return umetnine3;
   }

   /** @pdOid 08adb024-bd97-4ec2-b20e-dc9388dfa0bb */
   public ArrayList<Umetnina> VrniUmetnineIzTegaObdobja(String obdobje,String avtor) {
      ArrayList<Umetnik> izbraniUmetniki = new ArrayList<>();
      Umetnina_Umetnik uu = new Umetnina_Umetnik();
      return null;

       // TODO: implement
   }

   /** @pdOid 75ba2012-c941-4ffa-b724-dd2b4b40c209 */
   public String VrniUmetnino(String iskanaUmetnina) {
      String vrni = umetnina1.VrniPodatkeUmetnine(iskanaUmetnina);
      return vrni;
   }
   /** @pdOid 5c486dfc-920f-463f-adba-63e688f840cb */
   public int vrniSeznamUmetnin() {
      // TODO: implement
      return 0;
   }

   /** @pdGenerated default getter */
   public java.util.Collection<Umetnina> getUmetnina() {
      if (umetnina == null)
         umetnina = new java.util.HashSet<Umetnina>();
      return umetnina;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorUmetnina() {
      if (umetnina == null)
         umetnina = new java.util.HashSet<Umetnina>();
      return umetnina.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newUmetnina */
   public void setUmetnina(java.util.Collection<Umetnina> newUmetnina) {
      removeAllUmetnina();
      for (java.util.Iterator iter = newUmetnina.iterator(); iter.hasNext();)
         addUmetnina((Umetnina)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newUmetnina */
   public void addUmetnina(Umetnina newUmetnina) {
      if (newUmetnina == null)
         return;
      if (this.umetnina == null)
         this.umetnina = new java.util.HashSet<Umetnina>();
      if (!this.umetnina.contains(newUmetnina))
         this.umetnina.add(newUmetnina);
   }
   
   /** @pdGenerated default remove
     * @param oldUmetnina */
   public void removeUmetnina(Umetnina oldUmetnina) {
      if (oldUmetnina == null)
         return;
      if (this.umetnina != null)
         if (this.umetnina.contains(oldUmetnina))
            this.umetnina.remove(oldUmetnina);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllUmetnina() {
      if (umetnina != null)
         umetnina.clear();
   }

}