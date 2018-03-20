package menu;





import walkaMag.WalkaMagGolum;
import Postacie.PostacMag;
import Gra.Bohaterowie.Mag;
import Gra.Potwory.miniBoss;
import bosy.miniBosMag;
import javax.swing.JOptionPane;
import walkaMag.WybórPotwora;
import static menu.MenuMag.mag;
import static menu.MenuMag.maghp;
import static Gra.Potwory.Potwory.*;
import static WalkaLvl5Archer.Powyzej5potwory.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MenuMag extends javax.swing.JFrame {

    public static Mag mag = new Mag ();
        public static Mag maghp = new Mag();
    public static miniBoss miniboss = new miniBoss(3400, 50);
    public static miniBoss minibosshp = new miniBoss(3400, 50);
    public static miniBoss miniboss1 = new miniBoss(3400, 50);
    public static miniBoss minibosshp1 = new miniBoss(3400, 50);
        public static miniBoss boss = new miniBoss(15000, 500);
    public static miniBoss bosshp = new miniBoss(15000, 500);

    public MenuMag() {
        initComponents();
        this.setLocationRelativeTo(null);
                jama.setEnabled(false);
                        if(mag.hpbohater<=0)
        {
            walcz.setEnabled(false);
        }
        if(mag.lvl>=10)
        {
            jama.setEnabled(true);
        }
                         if(mag.hpbohater<=0&&mag.hajs<50)
            {
                int a =JOptionPane.showConfirmDialog(null, "Nie masz życia i nie masz pieniędzy na bandaż... "
                +"\n Czy chcesz zacząć od nowa ? ");
                if(a==0)
                {
                    this.dispose();
                new Logowanie.Logowanie().setVisible(true);
                }
                else if(a==1)
                {
                    this.dispose();
                }
                    
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        intro = new javax.swing.JLabel();
        postac = new javax.swing.JButton();
        sklep = new javax.swing.JButton();
        walcz = new javax.swing.JButton();
        wyjdz = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jama = new javax.swing.JButton();
        Zapisz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("For The Exp");
        setName("Mag"); // NOI18N

        intro.setFont(new java.awt.Font("Goudy Stout", 1, 24)); // NOI18N
        intro.setText("For The Exp");

        postac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/obrazki menumag/head.png"))); // NOI18N
        postac.setText("Postać");
        postac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postacActionPerformed(evt);
            }
        });

        sklep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/obrazki menumag/money1.gif"))); // NOI18N
        sklep.setText("Sklep");
        sklep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sklepActionPerformed(evt);
            }
        });

        walcz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/obrazki menumag/fight.png"))); // NOI18N
        walcz.setText("Walcz");
        walcz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                walczActionPerformed(evt);
            }
        });

        wyjdz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/obrazki menumag/exit.gif"))); // NOI18N
        wyjdz.setText("Wyjdz");
        wyjdz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wyjdzActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/obrazki menumag/staff.gif"))); // NOI18N

        jama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/obrazki menumag/dragon.png"))); // NOI18N
        jama.setText("Jama ");
        jama.setToolTipText("Dostępna od 10 Lvll");
        jama.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jamaActionPerformed(evt);
            }
        });

        Zapisz.setText("Zapisz");
        Zapisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZapiszActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(intro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(walcz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(wyjdz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(postac, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(sklep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(124, 124, 124))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Zapisz)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(intro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(postac, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sklep, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(walcz, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(jama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(wyjdz, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addGap(17, 17, 17)
                        .addComponent(Zapisz))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void postacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postacActionPerformed
        new PostacMag().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_postacActionPerformed

    private void walczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_walczActionPerformed

        
        new WybórPotwora().setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_walczActionPerformed

    private void sklepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sklepActionPerformed
        new SklepMag().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sklepActionPerformed

    private void wyjdzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wyjdzActionPerformed
                int a = JOptionPane.showConfirmDialog(null, "Czy napewno chcesz wyjść z gry ? ");
        if(a==0)
        this.dispose();
    }//GEN-LAST:event_wyjdzActionPerformed

    private void jamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jamaActionPerformed
        new miniBosMag().setVisible(true);    
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jamaActionPerformed

    private void ZapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZapiszActionPerformed
       int a= JOptionPane.showConfirmDialog(null, "Czy Napewno chcesz zapisać aktualny stan gry, tej operacji nieda się cofnąć? ");
       
       if(a==0){
       try {
            PrintWriter zapis = new PrintWriter("MenuMag.txt");
            PrintWriter zapisPotworyArcher = new PrintWriter("MenuMagPotwory.txt");

            Zapis.ZapisIOdczyt.zapisz(mag,maghp, zapis);
            Zapis.ZapisIOdczyt.zapiszPotwor(golum, golumhp,zombie, zombiehp,szkielet,szkielethp,wilk, wilkhp,smok, smokhp,skorpion, skorpionhp, zapisPotworyArcher);

        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }
       }
       else
       {
       }
       
    }//GEN-LAST:event_ZapiszActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuMag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMag().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Zapisz;
    private javax.swing.JLabel intro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jama;
    private javax.swing.JButton postac;
    private javax.swing.JButton sklep;
    private javax.swing.JButton walcz;
    private javax.swing.JButton wyjdz;
    // End of variables declaration//GEN-END:variables
}