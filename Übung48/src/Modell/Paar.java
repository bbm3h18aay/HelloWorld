package Modell;

public class Paar {
  private String an;
  private int vor;
  private String geb;
  public Paar(String an, String geb, int vor) {
    this.an = an;
    this.vor = vor;
    this.geb = geb;
  }
  public String getAn() {
    return an;
  }
  public void setAn(String an) {
    this.an = an;
  }
  public int getVor() {
    return vor;
  }
  public void setVor(int vor) {
    this.vor = vor;
  }
  public String getGeb() {
    return geb;
  }
  public void setGeb(String geb) {
    this.geb = geb;
  }
  
  public String getVorN() {
    String str = Integer.toString(vor);
    return str;
  }
}
