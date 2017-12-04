/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controlers.BicycleRental.Customer;
import Controlers.BicycleRental.CustomerManager;
import Controlers.BicycleRental.ServiceFailureException;
import java.awt.event.WindowEvent;
import java.util.concurrent.ExecutionException;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author francisco carena
 */
public class CustomerDeletePopUp extends javax.swing.JDialog {
    private static final CustomerManager cm = MainWindow.getCustomerManager();
    private static CustomerTableModel ctm;
    private static final Logger log = LoggerFactory.getLogger(CustomerDeletePopUp.class);
    private final int selectedRow;
    private final Customer customer;
    
    private class CDeleteSW extends SwingWorker<Integer,Void>{
        private final Customer customer;
        
        public CDeleteSW(Customer c){
            this.customer=c;
        }
        
        @Override
        protected Integer doInBackground() throws Exception{
            log.debug("CdeleteSW.doInBG");
            cm.deleteCustomer(customer.getId());
            return 0;
        }
        
        @Override
        protected void done() {
            log.debug("BicycleDeletePopUp:done");
            try {
                get();
                ctm.reload();
            }
            catch (ExecutionException exex) {
                if(exex.getCause().getClass().equals(ServiceFailureException.class)){
                    JOptionPane.showMessageDialog(rootPane,MainWindow.getMessage("texts", "ErrorDeleteCustomer"));
                }                
            }
            catch(InterruptedException iex){
                log.error("Done method deleting customer interrupted");
                throw new RuntimeException("Done method deleting customer interrupted",iex);
            }
        }   
    }
    
    private void deleteCustomer(){
    log.debug("Deleting customer");
    CDeleteSW cdsw = new CDeleteSW(customer);
    cdsw.execute();   
}
    
    /**
     * Creates new form CustomerDeletePopUp
     */
    public CustomerDeletePopUp(java.awt.Frame parent,boolean modal){
        super(parent,modal);
        ctm = ((MainWindow) getParent()).getCustomerTableModel();
        selectedRow = ((MainWindow) getParent()).getCustomerTable().getSelectedRow();
        customer = cm.getCustomerByID((Long)ctm.getValueAt(selectedRow,0));
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OKButton = new javax.swing.JButton();
        NOButton = new javax.swing.JButton();
        descriptionLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        nameLabel2 = new javax.swing.JLabel();
        addressLabel2 = new javax.swing.JLabel();
        phoneLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        descriptionLabel.setText(MainWindow.getMessage("texts", "CDP_desc"));

        nameLabel.setText(MainWindow.getMessage("texts", "CP_name"));

        addressLabel.setText(MainWindow.getMessage("texts", "CP_address"));

        phoneLabel.setText(MainWindow.getMessage("texts", "CP_phone"));

        nameLabel2.setText(customer.getFullName());

        addressLabel2.setText(customer.getAdress());

        phoneLabel2.setText(customer.getPhone());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(descriptionLabel)
                        .addContainerGap(260, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(OKButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NOButton)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressLabel)
                            .addComponent(phoneLabel)
                            .addComponent(nameLabel))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel2)
                            .addComponent(addressLabel2)
                            .addComponent(phoneLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(descriptionLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressLabel2))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OKButton)
                    .addComponent(NOButton))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        deleteCustomer();
        ctm.reload();
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
            java.util.logging.Logger.getLogger(CustomerDeletePopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDeletePopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDeletePopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDeletePopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                CustomerDeletePopUp dialog = new CustomerDeletePopUp(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NOButton;
    private javax.swing.JButton OKButton;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel addressLabel2;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JLabel phoneLabel2;
    // End of variables declaration//GEN-END:variables
}
