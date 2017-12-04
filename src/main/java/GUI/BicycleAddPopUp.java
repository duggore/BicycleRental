/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controlers.BicycleRental.Bicycle;
import Controlers.BicycleRental.BicycleManager;
import Controlers.BicycleRental.ServiceFailureException;
import java.awt.event.WindowEvent;
import java.util.concurrent.ExecutionException;
import javax.swing.JOptionPane;
import javax.swing.JSpinner.DefaultEditor;
import org.slf4j.Logger;
import javax.swing.SwingWorker;
import org.slf4j.LoggerFactory;

/**
 *
 * @author francisco carena
 */
public class BicycleAddPopUp extends javax.swing.JDialog {
    
    private final BicycleManager bicycleManager;
    private final BicycleTableModel bicycleTableModel;
    private static final Logger log = LoggerFactory.getLogger(BicycleAddPopUp.class);
    
    private class BicycleAddSwingWorker extends SwingWorker<Integer,Void>{
        private final Bicycle bicycle;
        
        public BicycleAddSwingWorker(Bicycle b){
            this.bicycle=b;
        }
        
        @Override
        protected Integer doInBackground() throws Exception{
            log.debug("BASW.doInBackground");
            bicycleManager.createBicycle(bicycle);
            log.debug("bicycle price: {}",bicycle.getPrice());
            return 0;
        }
        
        @Override 
        protected void done(){
            log.debug("BicycleAddPopUp:done");
            try{
                get();
                log.debug("BAPopup: get OK");
                bicycleTableModel.reload();
            }catch(ExecutionException exex){
                if(exex.getCause().getClass().equals(IllegalArgumentException.class)){
                    log.debug("IAE:fields@bicycle creation");
                    log.debug(exex.toString());
                    log.debug(exex.getCause().toString());
                    JOptionPane.showMessageDialog(rootPane,MainWindow.getMessage("texts", "Error_Fields"));
                }
                if(exex.getCause().getClass().equals(ServiceFailureException.class)){
                    log.debug("SFE:failed bicycle creation");
                    JOptionPane.showMessageDialog(rootPane, MainWindow.getMessage("texts", "ErrorCreateBicycle"));
                }
            }catch(InterruptedException iex){
                log.error("Done method after creating bicycle interrupted");
                throw new RuntimeException("Done method after creating bicycle interrupted",iex);
            }
        }
    }
   
    /**
     * Creates new form bicyclePopUp
     */
    public BicycleAddPopUp(java.awt.Frame parent,boolean modal) {
        super(parent,modal);
        log.debug("BicycleAddPopup ctor");
        this.bicycleManager = MainWindow.getBicycleManager();
        this.bicycleTableModel = ((MainWindow)getParent()).getBicycleTableModel();
        initComponents();
    }

    private void addBicycle(){
        log.debug("Adding bicycle");
        Bicycle b = new Bicycle();
        try{
            b.setPrice(Integer.parseInt(this.priceField.getText()));
            BicycleAddSwingWorker basw = new BicycleAddSwingWorker(b);
            basw.execute();
        }catch(NumberFormatException nfe){
            log.debug("Bicycle price entered not parseable to integer");
            JOptionPane.showMessageDialog(rootPane,MainWindow.getMessage("texts", "Error_Fields"));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        priceLabel = new javax.swing.JLabel();
        OKButton = new javax.swing.JButton();
        NOButton = new javax.swing.JButton();
        DescriptionLabel = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        priceLabel.setText(MainWindow.getMessage("texts", "BP_price"));

        OKButton.setText(MainWindow.getMessage("texts", "Popup_OK"));
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        NOButton.setText(MainWindow.getMessage("texts", "Popup_NO"));
        NOButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOButtonActionPerformed(evt);
            }
        });

        DescriptionLabel.setText(MainWindow.getMessage("texts", "BAP_desc"));

        priceField.setText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DescriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OKButton)
                            .addComponent(priceLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NOButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(priceField))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(DescriptionLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OKButton)
                    .addComponent(NOButton))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        addBicycle();
        bicycleTableModel.reload();
        this.setVisible(false);
        this.dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_OKButtonActionPerformed

    private void NOButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOButtonActionPerformed
        this.setVisible(false);
        this.dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_NOButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(BicycleAddPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BicycleAddPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BicycleAddPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BicycleAddPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                BicycleAddPopUp popup = new BicycleAddPopUp(new javax.swing.JFrame(),true);
                popup.addWindowListener(new java.awt.event.WindowAdapter(){
                @Override
                public void windowClosing(java.awt.event.WindowEvent ev){
                    System.exit(0);
                }
                });
                popup.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JButton NOButton;
    private javax.swing.JButton OKButton;
    private javax.swing.JTextField priceField;
    private javax.swing.JLabel priceLabel;
    // End of variables declaration//GEN-END:variables

}
