/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forma;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import kontroler.Kontroler;
import model.Knjiga;
import model.ZanrKnjige;

/**
 *
 * @author damja
 */
public class GlavnaForma extends javax.swing.JFrame {
    private kontroler.Kontroler kontroler;
    /**
     * Creates new form GlavnaForma
     */
    public GlavnaForma() {
        initComponents();
        kontroler=Kontroler.getInstance();
        
        ModelTabeleKnjige modelTabele=new ModelTabeleKnjige(kontroler.ucitajListuKnjigaIzBaze());
       // ModelTabeleKnjige modelTabele=new ModelTabeleKnjige(kontroler.getListaKnjiga());
        jTableKnjiga.setModel(modelTabele);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableKnjiga = new javax.swing.JTable();
        jButtonObrisi = new javax.swing.JButton();
        jButtonIzmeni = new javax.swing.JButton();
        jButtonDodaj = new javax.swing.JButton();
        jLabelNaziv = new javax.swing.JLabel();
        jTextFieldNaziv = new javax.swing.JTextField();
        jLabelAutor = new javax.swing.JLabel();
        jTextFieldAutor = new javax.swing.JTextField();
        jComboBoxZanr = new javax.swing.JComboBox<>();
        jLabelZanr = new javax.swing.JLabel();
        jCheckBoxStrip = new javax.swing.JCheckBox();
        jCheckBoxNauciCasopis = new javax.swing.JCheckBox();
        jButtonFiltriraj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableKnjiga.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableKnjiga);

        jButtonObrisi.setText("Obrisi");
        jButtonObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonObrisiActionPerformed(evt);
            }
        });

        jButtonIzmeni.setText("Izmeni");
        jButtonIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIzmeniActionPerformed(evt);
            }
        });

        jButtonDodaj.setText("Dodaj");
        jButtonDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDodajActionPerformed(evt);
            }
        });

        jLabelNaziv.setText("Naziv");

        jLabelAutor.setText("Autor");

        jComboBoxZanr.setModel(new DefaultComboBoxModel(ZanrKnjige.values()));
        jComboBoxZanr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxZanrActionPerformed(evt);
            }
        });

        jLabelZanr.setText("Zanr");

        jCheckBoxStrip.setText("Strip");

        jCheckBoxNauciCasopis.setText("Naucni Casopis");

        jButtonFiltriraj.setText("Filtriraj");
        jButtonFiltriraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrirajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jTextFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelZanr, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxZanr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonFiltriraj)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonObrisi)
                                        .addComponent(jButtonIzmeni)))
                                .addGap(58, 58, 58))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxNauciCasopis)
                            .addComponent(jCheckBoxStrip, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNaziv)
                    .addComponent(jTextFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxZanr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelZanr))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAutor)
                    .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxStrip)
                    .addComponent(jButtonFiltriraj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxNauciCasopis)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButtonObrisi)
                        .addGap(58, 58, 58)
                        .addComponent(jButtonIzmeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonObrisiActionPerformed
        int selectedRed=jTableKnjiga.getSelectedRow();
        if(selectedRed==-1){
            JOptionPane.showMessageDialog(this, "Morate selektovati knjigu koju zelite obrisati", "Upozorenje", JOptionPane.WARNING_MESSAGE);
            return;
        } else{
            ModelTabeleKnjige mtk=(ModelTabeleKnjige) jTableKnjiga.getModel();
            int id=mtk.getListaKnjiga().get(selectedRed).getId();
            Kontroler kontroler=Kontroler.getInstance();
            kontroler.obrisiKnjigu(id);
        }
        osveziTabelu();
        
    }//GEN-LAST:event_jButtonObrisiActionPerformed

    private void jComboBoxZanrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxZanrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxZanrActionPerformed

    private void jButtonDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDodajActionPerformed
        FormaKnjiga fk=new FormaKnjiga(this, true, null);
        fk.setVisible(true);
    }//GEN-LAST:event_jButtonDodajActionPerformed

    private void jButtonIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIzmeniActionPerformed
       
        int selectedRed=jTableKnjiga.getSelectedRow();
        if(selectedRed==-1){
            JOptionPane.showMessageDialog(this, "Morate selektovati knjigu koju zelite obrisati", "Upozorenje", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Knjiga selektovanaKnjiga=kontroler.getInstance().ucitajListuKnjigaIzBaze().get(selectedRed);
 
        FormaKnjiga fk=new FormaKnjiga(this, true, selektovanaKnjiga);
        fk.setVisible(true);
    }//GEN-LAST:event_jButtonIzmeniActionPerformed

    private void jButtonFiltrirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrirajActionPerformed
        // TODO add your handling code here:
        String naziv=jTextFieldNaziv.getText();
        String autor=jTextFieldAutor.getText();
        
        List<Knjiga> filtriranaLista=kontroler.filtriraj(autor,naziv);
        
      //  List<Knjiga> filtriranaLista2=kontroler.filtriraj2(autor,naziv);
        
        
        ModelTabeleKnjige mtk=new ModelTabeleKnjige(filtriranaLista);
        jTableKnjiga.setModel(mtk);
                
        
        
    }//GEN-LAST:event_jButtonFiltrirajActionPerformed

    /**
     * @param args the command line arguments
     */
 //   public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
  //      try {
  //          for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
  //              if ("Nimbus".equals(info.getName())) {
  //                  javax.swing.UIManager.setLookAndFeel(info.getClassName());
  //                  break;
  //              }
  //          }
  //      } catch (ClassNotFoundException ex) {
  //          java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  //      } catch (InstantiationException ex) {
  //          java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  //      } catch (IllegalAccessException ex) {
  //          java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  //      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
  //          java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
  //      }
        //</editor-fold>

        /* Create and display the form */
  //      java.awt.EventQueue.invokeLater(new Runnable() {
  ///          public void run() {
  //              new GlavnaForma().setVisible(true);
  //          }
  //      });
  //  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDodaj;
    private javax.swing.JButton jButtonFiltriraj;
    private javax.swing.JButton jButtonIzmeni;
    private javax.swing.JButton jButtonObrisi;
    private javax.swing.JCheckBox jCheckBoxNauciCasopis;
    private javax.swing.JCheckBox jCheckBoxStrip;
    private javax.swing.JComboBox<String> jComboBoxZanr;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelNaziv;
    private javax.swing.JLabel jLabelZanr;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableKnjiga;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldNaziv;
    // End of variables declaration//GEN-END:variables

    void osveziTabelu() {
       //ModelTabeleKnjige modelTabele=(ModelTabeleKnjige) jTableKnjiga.getModel();
       //modelTabele.osveziPodatke();
       ModelTabeleKnjige modelTabele=new ModelTabeleKnjige(kontroler.ucitajListuKnjigaIzBaze());
       // ModelTabeleKnjige modelTabele=new ModelTabeleKnjige(kontroler.getListaKnjiga());
        jTableKnjiga.setModel(modelTabele);
    }
}
