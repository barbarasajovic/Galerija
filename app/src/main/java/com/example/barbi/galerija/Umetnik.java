/***********************************************************************
 * Module:  Umetnik.java
 * Author:  Barbi
 * Purpose: Defines the Class Umetnik
 ***********************************************************************/

package com.example.barbi.galerija;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/** @pdOid 6400a19e-9b31-4c13-8253-d971ed9f44e4 */
public class Umetnik {
   /** @pdOid febcfb3a-0bca-43cf-a438-84dcbf5c6e29 */
   public String Avtor;
   /** @pdOid a2ce0f2a-fe4d-472b-89d7-c7d23874cd7c */
   private String NajboljZnanoDelo;
   /** @pdOid 913e3d30-fbf1-4251-8361-bf36dafb858e */
   private String Tehnike;
   /** @pdOid e3b56368-53d7-417a-ae48-a791a233187d */
   private String Narodnost;
   /** @pdOid 52003b23-58d3-4742-a76c-85089023c2aa */
   private String Gibanje;
   
   /** @pdRoleInfo migr=no name=Umetnina_Umetnik assc=jeustvaril coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public java.util.Collection<Umetnina_Umetnik> umetnina_Umetnik;
   /** @pdRoleInfo migr=no name=Umetnik_Obdobje assc=jeustvarjalv coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
   public java.util.Collection<Umetnik_Obdobje> umetnik_Obdobje;



   //    UMETNINE
   public java.util.Collection<Umetnik> Umetniki = new java.util.HashSet<Umetnik>();
   public Umetnik(String avtor, String Tehnike,String Narodnost,String Gibanje){
      this.Avtor = avtor;
      //this.NajboljZnanoDelo=NajboljZnanoDelo;
      this.Tehnike=Tehnike;
      this.Narodnost=Narodnost;
      this.Gibanje=Gibanje;
   }

   public Umetnik(){
      Umetniki.add(new Umetnik("Neznan","Neznane","Neznana","Neznano"));
      Umetniki.add(new Umetnik("Duccio","Slikarstvo","Italija","Sienska šola, gotski slog"));
      Umetniki.add(new Umetnik("Ugolino di Nerio","Slikarstvo","Italija","gibanje"));
      Umetniki.add(new Umetnik("Jacob van Ruisdael","Slikarstvo","Nizozemska","Barok"));
      Umetniki.add(new Umetnik("Giacomo Francesco Cipper","Tehnike","Italija","gibanje"));
      Umetniki.add(new Umetnik("Francesco Guardi","Tehnike","Italija","Venetian School"));

   }
   
   /** @pdOid 9786c93d-0d7b-41b5-96e5-70e17f1142e7 */
   public ArrayList<String> VrniVseUmetnineUmetnika(String avtor) {
      ArrayList<String> umetnine2 = new ArrayList<>();
      for(Umetnina_Umetnik u : umetnina_Umetnik){
         if(u.getJeUstvaril().Avtor == avtor){
            umetnine2.add(u.joJeUstvaril.Ime);
         }
      }
      return null;
   }
   
   /** @pdOid c7007f4d-6a0a-4864-87fe-0c18e01e09a0 */
   /*
   public ArrayList<Umetnina> VrniIskanegaUmetnika(String avtor) {      // ze vrne umetnine tega umetnika ALEKS
      Umetnina_Umetnik uu = new Umetnina_Umetnik();
      umetnina_Umetnik = new ArrayList<>();
      umetnina_Umetnik = uu.umetnina_Umetnik;
      ArrayList<Umetnina> umetnine3 = new ArrayList<>();
      for(Umetnina_Umetnik u : umetnina_Umetnik){
         if(u.getJeUstvaril().Avtor == avtor){
            umetnine3.add(u.joJeUstvaril);
         }
      }
      return umetnine3;
      // TODO: implement
   }
   */
   
   
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
         newUmetnina_Umetnik.setJeUstvaril(this);      
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
            oldUmetnina_Umetnik.setJeUstvaril((Umetnik)null);
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
            oldUmetnina_Umetnik.setJeUstvaril((Umetnik)null);
         }
      }
   }
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
         newUmetnik_Obdobje.setJeUstvarjalV(this);      
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
            oldUmetnik_Obdobje.setJeUstvarjalV((Umetnik)null);
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
            oldUmetnik_Obdobje.setJeUstvarjalV((Umetnik)null);
         }
      }
   }

}