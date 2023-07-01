/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forme;

import domen.Angazovanje;
import domen.Korisnik;
import domen.Predmet;
import domen.Profesor;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import komunikacija.Komunikacija;
import konstante.Operacija;
import model.ModelTabeleAngazovanja;
import model.ModelTabeleAngazovanjaIzmena;
import transfer.Odgovor;
import transfer.Zahtev;

/**
 *
 * @author Mafija
 */
public class GlavnaForma extends javax.swing.JFrame {
    
    Korisnik korisnik;

    
    public GlavnaForma(Korisnik korisnik) {
        initComponents();
        this.korisnik = korisnik;
        popuniProfesore();
        popuniZvanja();
        
        tblUnos.setModel(new ModelTabeleAngazovanja());
        tblIzmena.setModel(new ModelTabeleAngazovanjaIzmena());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUnos = new javax.swing.JTable();
        btnDodajNovi = new javax.swing.JButton();
        btnObrisiNovi = new javax.swing.JButton();
        btnDodajPredmet = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbProfesori = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblIzmena = new javax.swing.JTable();
        btnDodajIzmena = new javax.swing.JButton();
        btnIzmeni = new javax.swing.JButton();
        btnObrisiIzmena = new javax.swing.JButton();
        btnSacuvajIzmene = new javax.swing.JButton();
        cmbZvanje = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ime");

        jLabel2.setText("Prezime");

        jLabel3.setText("Zvanje");

        tblUnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblUnos);

        btnDodajNovi.setText("Dodaj");
        btnDodajNovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajNoviActionPerformed(evt);
            }
        });

        btnObrisiNovi.setText("Obrisi");
        btnObrisiNovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiNoviActionPerformed(evt);
            }
        });

        btnDodajPredmet.setText("Dodaj profesora");
        btnDodajPredmet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajPredmetActionPerformed(evt);
            }
        });

        jLabel5.setText("Profesor");

        cmbProfesori.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Pretrazi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblIzmena.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblIzmena);

        btnDodajIzmena.setText("Dodaj");
        btnDodajIzmena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajIzmenaActionPerformed(evt);
            }
        });

        btnIzmeni.setText("Izmeni");
        btnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniActionPerformed(evt);
            }
        });

        btnObrisiIzmena.setText("Obrisi");
        btnObrisiIzmena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiIzmenaActionPerformed(evt);
            }
        });

        btnSacuvajIzmene.setText("Sacuvaj izmene");
        btnSacuvajIzmene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacuvajIzmeneActionPerformed(evt);
            }
        });

        cmbZvanje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDodajPredmet, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPrezime, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                        .addComponent(txtIme)
                                        .addComponent(cmbZvanje, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnDodajNovi)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnObrisiNovi))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbProfesori, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSacuvajIzmene, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDodajIzmena)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnIzmeni)
                                .addGap(12, 12, 12)
                                .addComponent(btnObrisiIzmena)))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(cmbProfesori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbZvanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDodajIzmena)
                        .addComponent(btnIzmeni)
                        .addComponent(btnObrisiIzmena))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnObrisiNovi)
                        .addComponent(btnDodajNovi, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodajPredmet)
                    .addComponent(btnSacuvajIzmene))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajNoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajNoviActionPerformed
        DijalogAngazovanje da = new DijalogAngazovanje(this, true);
        da.pack();
        da.setVisible(true);
    }//GEN-LAST:event_btnDodajNoviActionPerformed

    private void btnObrisiNoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiNoviActionPerformed
        int red = tblUnos.getSelectedRow();
        
        if(red != -1){
            ModelTabeleAngazovanja mta = (ModelTabeleAngazovanja) tblUnos.getModel();
            mta.obrisiAngazovanje(red);
        }
    }//GEN-LAST:event_btnObrisiNoviActionPerformed

    private void btnDodajPredmetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajPredmetActionPerformed
        String ime = txtIme.getText();
        String prezime = txtPrezime.getText();
        String zvanje = (String) cmbZvanje.getSelectedItem();
        
        ModelTabeleAngazovanja mta = (ModelTabeleAngazovanja) tblUnos.getModel();
        
        ArrayList<Angazovanje> lista = mta.getLista();
        
        Profesor profa = new Profesor(-1, ime, prezime, zvanje, korisnik.getEmail(), lista);
        
        Zahtev z = new Zahtev(Operacija.SACUVAJ_PROFESORA, profa);
        Komunikacija.getKomunikacija().posaljiZahtev(z);
        
        Odgovor o = Komunikacija.getKomunikacija().primiOdgovor();
        
        JOptionPane.showMessageDialog(null, o.getPoruka());
        
        popuniProfesore();
        
        
    }//GEN-LAST:event_btnDodajPredmetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Profesor prof = (Profesor) cmbProfesori.getSelectedItem();
        
        Zahtev zahtev = new Zahtev(Operacija.PRETRAZI, prof);
        
        Komunikacija.getKomunikacija().posaljiZahtev(zahtev);
        Odgovor odg = Komunikacija.getKomunikacija().primiOdgovor();
        
        ArrayList<Angazovanje> listaAngazovanja = (ArrayList<Angazovanje>) odg.getOdgovor();
        
        tblIzmena.setModel(new ModelTabeleAngazovanjaIzmena(listaAngazovanja));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDodajIzmenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajIzmenaActionPerformed
        DijalogAngazovanjeIzmena dai = new DijalogAngazovanjeIzmena(this, true);
        Profesor p = (Profesor) cmbProfesori.getSelectedItem();
        dai.setP(p);
        dai.pack();
        dai.setVisible(true);
    }//GEN-LAST:event_btnDodajIzmenaActionPerformed

    private void btnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniActionPerformed
        int red = tblIzmena.getSelectedRow();
        if(red != -1){
            ModelTabeleAngazovanjaIzmena mta = (ModelTabeleAngazovanjaIzmena) tblIzmena.getModel();
            
            Angazovanje a = mta.vratiAngazovanje(red);
            
            DijalogAngazovanjeIzmena da = new DijalogAngazovanjeIzmena(this, true);
            da.srediFormuZaIzmenu(a);
            da.pack();
            da.setVisible(true);
        }
    }//GEN-LAST:event_btnIzmeniActionPerformed

    private void btnObrisiIzmenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiIzmenaActionPerformed
        int red = tblIzmena.getSelectedRow();
        
        if(red != -1){
            ModelTabeleAngazovanjaIzmena mta = (ModelTabeleAngazovanjaIzmena) tblIzmena.getModel();
            mta.obrisiAngazovanje(red);
        }
    }//GEN-LAST:event_btnObrisiIzmenaActionPerformed

    private void btnSacuvajIzmeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacuvajIzmeneActionPerformed
        ModelTabeleAngazovanjaIzmena mta = (ModelTabeleAngazovanjaIzmena) tblIzmena.getModel();
        ArrayList<Angazovanje> lista = mta.getLista();
        
        Zahtev z = new Zahtev(Operacija.SACUVAJ_IZMENE, lista);
        Komunikacija.getKomunikacija().posaljiZahtev(z);
        Odgovor o = Komunikacija.getKomunikacija().primiOdgovor();
        
        JOptionPane.showMessageDialog(null, o.getPoruka());
    }//GEN-LAST:event_btnSacuvajIzmeneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajIzmena;
    private javax.swing.JButton btnDodajNovi;
    private javax.swing.JButton btnDodajPredmet;
    private javax.swing.JButton btnIzmeni;
    private javax.swing.JButton btnObrisiIzmena;
    private javax.swing.JButton btnObrisiNovi;
    private javax.swing.JButton btnSacuvajIzmene;
    private javax.swing.JComboBox cmbProfesori;
    private javax.swing.JComboBox<String> cmbZvanje;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblIzmena;
    private javax.swing.JTable tblUnos;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtPrezime;
    // End of variables declaration//GEN-END:variables

    private void popuniProfesore() {
        Zahtev zahtev = new Zahtev(Operacija.VRATI_PROFESORE, null);
        
        Komunikacija.getKomunikacija().posaljiZahtev(zahtev);
        
        Odgovor odg = Komunikacija.getKomunikacija().primiOdgovor();
        
        ArrayList<Profesor> lista = (ArrayList<Profesor>) odg.getOdgovor();
        
        cmbProfesori.removeAllItems();
        
        for (Profesor profesor : lista) {
            cmbProfesori.addItem(profesor);
        }
    }

    void unesiNovoAngazovanje(Predmet p, Date datum) {
        Angazovanje a = new Angazovanje(-1, p, null, datum, korisnik.getEmail(), "NOVI");
        
        ModelTabeleAngazovanja mta = (ModelTabeleAngazovanja) tblUnos.getModel();
        
        mta.dodajAngazovanje(a);
    }

    private void popuniZvanja() {
        cmbZvanje.removeAllItems();
        cmbZvanje.addItem("docent");
        cmbZvanje.addItem("redovni profesor");
        cmbZvanje.addItem("vanredni profesor");
    }

    void unesiNovoAngazovanjeZaIzmenu(Predmet p, Profesor prof, Date datum) {
        ModelTabeleAngazovanjaIzmena mtai = (ModelTabeleAngazovanjaIzmena) tblIzmena.getModel();
        Angazovanje a = new Angazovanje(-1, p, prof, datum, korisnik.getEmail(), "NOVI");
        mtai.dodajAngazovanje(a);
    }

    void unesiIzmenuAngazovanja(Angazovanje a) {
        ModelTabeleAngazovanjaIzmena mta = (ModelTabeleAngazovanjaIzmena) tblIzmena.getModel();
        a.setStatus("IZMENA");
        mta.izmeniAngazovanje(a);
    }

   
}
