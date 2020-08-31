package View;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;

import Controller.Controller;

public class Telefon extends JFrame{
  Container cp;
  JPanel p1 = new JPanel();
  JPanel p2 = new JPanel();
  JPanel p3 = new JPanel();
  JPanel p4 = new JPanel();
  JPanel p5 = new JPanel();
  JPanel p6 = new JPanel();
  JPanel p7 = new JPanel();
  JPanel p8 = new JPanel();
  JLabel ueberschrift = new JLabel("TELEFONGEBÜHREN");
  JLabel lbAnbieter = new JLabel("Anbieter:");
  JLabel lbVorwahl = new JLabel("Vorwahl:");
  JLabel lbGebuehren = new JLabel("Gebuehren pro min in Cent:");
  JLabel lbDauer = new JLabel("Dauer in min:");
  JLabel lbKosten = new JLabel("Kosten in €");
  JList lAnbieter = new JList();
  JTextField tfVorwahl = new JTextField(15);
  JTextField tfGebuehren = new JTextField(15);
  JTextField tfDauer = new JTextField(15);
  JTextField tfKosten = new JTextField(15);
  JButton btBerechnen = new JButton("Berechnen");
  
  public Telefon() {
    super("Telefon");
    cp = getContentPane();
    ueberschrift.setFont(new Font("Tahoma", Font.BOLD, 20));
    JScrollPane sc = new JScrollPane(lAnbieter);
    sc.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
    lAnbieter.setSelectedIndex(4);
    lAnbieter.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    
    p1.setLayout(new GridLayout(1,0,10,10));
    p1.add(ueberschrift);
    
    p2.setLayout(new FlowLayout());
    p2.add(p1);
    
    p3.setLayout(new GridLayout(2,0,10,10));
    p3.add(lbAnbieter);
    p3.add(sc);
    
    p4.setLayout(new FlowLayout());
    p4.add(p3);
    
    p5.setLayout(new GridLayout(8,0,10,10));
    p5.add(lbVorwahl);
    p5.add(tfVorwahl);
    p5.add(lbGebuehren);
    p5.add(tfGebuehren);
    p5.add(lbDauer);
    p5.add(tfDauer);
    p5.add(lbKosten);
    p5.add(tfKosten);
    
    p6.setLayout(new FlowLayout());
    p6.add(p5);
    
    p7.setLayout(new GridLayout(1,0,10,10));
    p7.add(btBerechnen);
    
    p8.setLayout(new FlowLayout());
    p8.add(p7);
    
    cp.add(p2, BorderLayout.NORTH);
    cp.add(p4, BorderLayout.WEST);
    cp.add(p6, BorderLayout.EAST);
    cp.add(p8, BorderLayout.SOUTH);
    
    btBerechnen.setActionCommand("Berechnen");
    
    
    
    tfVorwahl.setEditable(false);
    tfGebuehren.setEditable(false);
    tfKosten.setEditable(false);
    setVisible(true);
    setSize(400,350);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(true);
    
  }
  
  public void zuhoeren(Controller controller) {
    btBerechnen.addActionListener(controller);
  }
  
  public void zuhoeren1(Controller controller) {
    lAnbieter.addListSelectionListener(controller);
  }
  
  
  public JList getlAnbieter() {
    return lAnbieter;
  }



  public void setlAnbieter(JList lAnbieter) {
    this.lAnbieter = lAnbieter;
  }



  public JTextField getTfVorwahl() {
    return tfVorwahl;
  }



  public void setTfVorwahl(JTextField tfVorwahl) {
    this.tfVorwahl = tfVorwahl;
  }



  public JTextField getTfGebuehren() {
    return tfGebuehren;
  }



  public void setTfGebuehren(JTextField tfGebuehren) {
    this.tfGebuehren = tfGebuehren;
  }



  public JTextField getTfDauer() {
    return tfDauer;
  }



  public void setTfDauer(JTextField tfDauer) {
    this.tfDauer = tfDauer;
  }



  public JTextField getTfKosten() {
    return tfKosten;
  }



  public void setTfKosten(JTextField tfKosten) {
    this.tfKosten = tfKosten;
  }



  
  
  
  
}
