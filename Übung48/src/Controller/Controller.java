package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Modell.Gebuehr;
import Modell.Paar;
import View.Telefon;

public class Controller implements ActionListener, ListSelectionListener {
  Telefon v;
  Gebuehr m;
  public Controller() {
    v = new Telefon();
    m = new Gebuehr();
    v.zuhoeren(this);
    v.zuhoeren1(this);
    v.getlAnbieter().setListData(m.getListe());
    
  }

  @Override
  public void valueChanged(ListSelectionEvent arg0) {
    for(int i = 0; i<m.getListe().length;i++) {
        if(v.getlAnbieter().getSelectedValue().equals(m.getListe()[i])) {
          v.getTfVorwahl().setText(m.getVor1()[i]);
          v.getTfGebuehren().setText(m.getGeb1()[i]);
        }
      
    }
    
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getActionCommand().equals("Berechnen")) {
      int a = Integer.parseInt(v.getTfGebuehren().getText());
      double j = Double.parseDouble(v.getTfDauer().getText());
      double ergebnis = m.berechnen(a, j);
      String s = Double.toString(ergebnis);
      v.getTfKosten().setText(s);
    }
    
  }

}
