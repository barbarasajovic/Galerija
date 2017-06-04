/***********************************************************************
 * Module:  ZM_Stranka_PregledUmetnin.java
 * Author:  Barbi
 * Purpose: Defines the Class ZM_Stranka_PregledUmetnin
 ***********************************************************************/

package com.example.barbi.galerija;

//import ris.galerija.K_PregledUmetnin;
import java.util.*;

/** @pdOid 9d880a8f-eba2-4416-bd89-731c1d245deb */
public class ZM_Stranka_PregledUmetnin {
   /** @pdRoleInfo migr=no name=K_PregledUmetnin assc=Association_1 coll=java.util.Collection impl=java.util.HashSet mult=1..1 */
   public K_PregledUmetnin k_PregledUmetnin = new K_PregledUmetnin();

   
   /** @pdOid 69a294a4-060c-4f7e-b070-c65255a3dfa8 */
   public ArrayList<String> PricniPregledUmetnin() {
      ArrayList<String> umetnine1 = k_PregledUmetnin.VrniSeznamVsehUmetnin();
      return umetnine1;
   }
   /** @pdOid 675c3eb7-15b2-4a01-ba19-e413ea127a20 */
   public void PrikaziSeznamUmetnin() {
      // TODO: implement
   }
   
   /** @pdOid dfc01e7c-5ce2-49a0-adfe-c86ca9760aee */
   public ArrayList IzberiUmetnika(String avtor) {
      //k_PregledUmetnin = new K_PregledUmetnin();
      ArrayList<String> umetnine2 = k_PregledUmetnin.VrniUmetnineUmetnika(avtor);
      return umetnine2;
   }

   /** @pdOid d764bc27-2ad9-4d52-9558-423e2c7fae05 */
   public void IzberiZeljenoObdobje(String iskanoObdobje,String iskaniAvtor) {
      ArrayList<Umetnina> umetnine3 = new ArrayList<>();
      umetnine3 = k_PregledUmetnin.VrniUmetnineIzTegaObdobja(iskanoObdobje,iskaniAvtor);
   }
   
   /** @pdOid 9d3ee621-2119-4afc-a606-6629be82319e */
   public void IzpisiUmetnineUmetnika() {
      // TODO: implement
   }
   
   /** @pdOid 2f52a78f-ecd1-4245-871c-c34040c2adfe */
   public String IzberiUmetnino(String iskanaUmetnina) {
      String u = k_PregledUmetnin.VrniUmetnino(iskanaUmetnina);
      return u;
      // TODO: implement
   }
   
   /** @pdOid 731c3e12-5dbb-4ec0-9705-f10709e9a3d4 */
   public void PrikaziUmetnineUmetnikaInObdobja() {
      // TODO: implement
   }

}