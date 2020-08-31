package Modell;

public class Gebuehr {
  private Paar[] liste = new Paar[9];
  public Gebuehr() {
    liste[0] = new Paar("TalkTalkTalkPoint","00000",22);
    liste[1] = new Paar("O3","11111",10);
    liste[2] = new Paar("enofadov","22222",15);
    liste[3] = new Paar("Desdemona","33333",20);
    liste[4] = new Paar("Telegeht","44444",11);
    liste[5] = new Paar("rocra","55555",23);
    liste[6] = new Paar("GateTele","12345",10);
    liste[7] = new Paar("Tele3","54321",28);
    liste[8] = new Paar("Tele4","99999",22);
  }
  
  public String[] getListe() {
    String [] hilfe = new String[liste.length];
    for (int i = 0; i < hilfe.length; i++) {
      hilfe[i] = liste[i].getAn();
    }
    return hilfe;
  }
  
  public String[] getVor1() {
    String [] hilfe = new String[liste.length];
    for (int i = 0; i < hilfe.length; i++) {
      hilfe[i] = liste[i].getGeb();
    }
    return hilfe;
  }
  
  public String[] getGeb1() {
    String [] hilfe = new String[liste.length];
    for (int i = 0; i < hilfe.length; i++) {
      hilfe[i] = liste[i].getVorN();
    }
    return hilfe;
  }
  
  public Paar[] getListe1() {
    return liste;
  }
  
  public double berechnen(int a, double dauer) {
    return(a*dauer) / 100;
    
  }

}
