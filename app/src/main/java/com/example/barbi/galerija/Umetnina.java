/***********************************************************************
 * Module:  Umetnina.java
 * Author:  Barbi
 * Purpose: Defines the Class Umetnina
 ***********************************************************************/

package com.example.barbi.galerija;

//import sun.awt.image.ImageWatched;

//import javax.print.DocFlavor;
//import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

/** @pdOid 0237f0d7-7355-479b-80de-1bc3ea6ff5a331 */
public class Umetnina {
   /** @pdOid e39c33f6-0825-443f-a8a2-94b39f97e435 */
   public String Ime;
   /** @pdOid eb577bf5-f283-405e-ad61-0316cbb8c2af */
   //private double;
   /** @pdOid 7f97e18d-993a-4dd4-867a-5a90ca64eddd */
   private int Leto;
   /** @pdOid e83184d3-5da7-4c6d-ab00-dfd17b6504b7 */
   //private String Umetnik;
   /** @pdOid 21fd4415-6fee-4f68-8d4f-d50f0e876065 */
   private String Tehnika;


   /** @pdRoleInfo migr=no name=Umetnina_Umetnik assc=Association_7 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Umetnina_Umetnik> umetnina_Umetnik;


   //    UMETNINE
   public java.util.Collection<Umetnina> Umetnine = new java.util.HashSet<Umetnina>();
   public Umetnina(String Ime, int Leto, String Tehnika){
      this.Ime=Ime;
      this.Leto=Leto;
      this.Tehnika=Tehnika;
   }

   public Umetnina(){
      // 2
      Umetnine.add(new Umetnina("The Healing of the Man born Blind",1307,"Tempera na les"));
      Umetnine.add(new Umetnina("The Annunciation",1307,"Tempera na les"));
      Umetnine.add(new Umetnina("Duccio di Buoninsegna",1255,"Tempera na les"));
      Umetnine.add(new Umetnina("The Virgin and Child with Saints Dominic and Aurea",1312,"Tempera na les"));
      Umetnine.add(new Umetnina("The Transfiguration",1308,"Tempera na les"));
      //3
      Umetnine.add(new Umetnina("David",1325,"Tempera na les"));
      Umetnine.add(new Umetnina("Isaiah",1325,"Tempera na les"));
      Umetnine.add(new Umetnina("Moses",1325,"Tempera na les"));
      Umetnine.add(new Umetnina("Saints Bartholomew and Andrew",1325,"Tempera na les"));
      //4
      Umetnine.add(new Umetnina("A Bleaching Ground in a Hollow by a Cottage",1645,"Olje na les"));
      Umetnine.add(new Umetnina("A Cottage and a Hayrick by a River",1646,"Olje na les"));
      Umetnine.add(new Umetnina("A Landscape with a Ruined Building",1655,"Olje na les"));
      //5
      Umetnine.add(new Umetnina("Head of a Man in Blue",1700,"Olje na platnu"));
      Umetnine.add(new Umetnina("Head of a Man in Red",1700,"Olje na platnu"));
      //6
      Umetnine.add(new Umetnina("A Caprice with a Ruined Arch",1775,"Olje na les"));
      Umetnine.add(new Umetnina("A Caprice with Ruins on the Seashore",1775,"Olje na platnu"));
      Umetnine.add(new Umetnina("A Gondola on the Lagoon near Mestre",1780,"Olje na platnu"));
      Umetnine.add(new Umetnina("An Architectural Caprice",1770,"Olje na platnu"));
      Umetnine.add(new Umetnina("Caprice View with Ruins",1780,"Olje na les"));
   }



   
   /** @pdOid 2f2b04cf-e4fa-4ab3-8be7-5669f1a0fe59 */
   public ArrayList<String> VrniSeznamVsehUmetnin() {
      ArrayList<Umetnina> umetnina = new ArrayList<>();
      ArrayList<String> umetnina2 = new ArrayList<>();


      umetnina.addAll(Umetnine);
      for(int i = 0; i < umetnina.size(); i++){
         umetnina2.add(umetnina.get(i).Ime);

      }
      return umetnina2;
   }

   /** @pdOid e4a0cfb2-7479-4549-a033-abb0c49f9eba */
   public String VrniPodatkeUmetnine(String iskanaUmetnina) {
      String vrni=null;
      for(Umetnina u : Umetnine){
         if(u.Ime == iskanaUmetnina){
            vrni=u.Ime+";"+u.Leto+";"+u.Tehnika;
         }
         System.out.println(u.Ime);
      }
      return vrni;
   }

   /** @pdGenerated default getter */
   public java.util.Collection<Umetnina_Umetnik> getUmetnina_Umetnik() {
      if (umetnina_Umetnik == null)
         umetnina_Umetnik = new java.util.HashSet<Umetnina_Umetnik>();
      return umetnina_Umetnik;
   }

   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorUmetnina_Umetnik() {
      if (umetnina_Umetnik == null)
         umetnina_Umetnik = new java.util.HashSet<Umetnina_Umetnik>();
      return umetnina_Umetnik.iterator();
   }

   /** @pdGenerated default setter
     * @param newUmetnina_Umetnik */
   public void setUmetnina_Umetnik(java.util.Collection<Umetnina_Umetnik> newUmetnina_Umetnik) {
      removeAllUmetnina_Umetnik();
      for (java.util.Iterator iter = newUmetnina_Umetnik.iterator(); iter.hasNext();)
         addUmetnina_Umetnik((Umetnina_Umetnik)iter.next());
   }

   /** @pdGenerated default add
     * @param newUmetnina_Umetnik */
   public void addUmetnina_Umetnik(Umetnina_Umetnik newUmetnina_Umetnik) {
      if (newUmetnina_Umetnik == null)
         return;
      if (this.umetnina_Umetnik == null)
         this.umetnina_Umetnik = new java.util.HashSet<Umetnina_Umetnik>();
      if (!this.umetnina_Umetnik.contains(newUmetnina_Umetnik))
      {
         this.umetnina_Umetnik.add(newUmetnina_Umetnik);
         newUmetnina_Umetnik.setJoJeUstvaril(this);      
      }
   }
   /** @pdGenerated default remove
     * @param oldUmetnina_Umetnik */
   public void removeUmetnina_Umetnik(Umetnina_Umetnik oldUmetnina_Umetnik) {
      if (oldUmetnina_Umetnik == null)
         return;
      if (this.umetnina_Umetnik != null)
         if (this.umetnina_Umetnik.contains(oldUmetnina_Umetnik))
         {
            this.umetnina_Umetnik.remove(oldUmetnina_Umetnik);
            oldUmetnina_Umetnik.setJoJeUstvaril((Umetnina)null);
         }
   }
   /** @pdGenerated default removeAll */
   public void removeAllUmetnina_Umetnik() {
      if (umetnina_Umetnik != null)
      {
         Umetnina_Umetnik oldUmetnina_Umetnik;
         for (java.util.Iterator iter = getIteratorUmetnina_Umetnik(); iter.hasNext();)
         {
            oldUmetnina_Umetnik = (Umetnina_Umetnik)iter.next();
            iter.remove();
            oldUmetnina_Umetnik.setJoJeUstvaril((Umetnina)null);
         }
      }
   }
}