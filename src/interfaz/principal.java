/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import javax.swing.JOptionPane;
/**
 *
 * @author USUARIO
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principali
     */
    public principal() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPersonaUno = new javax.swing.JTextField();
        txtPersonaDos = new javax.swing.JTextField();
        txtPersonaTres = new javax.swing.JTextField();
        txtPorcentajeUno = new javax.swing.JTextField();
        txtPorcentajeDos = new javax.swing.JTextField();
        txtPorcentajeTres = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        cmdBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        jLabel1.setText("1. Porcentajes Individuales");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 230, 40));

        jLabel2.setText("persona 1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setText("Persona 2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        jLabel4.setText("Persona 3");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        jLabel5.setText("%");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel6.setText("%");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        jLabel7.setText("%");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        txtPersonaUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPersonaUnoKeyTyped(evt);
            }
        });
        getContentPane().add(txtPersonaUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 60, -1));

        txtPersonaDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPersonaDosKeyTyped(evt);
            }
        });
        getContentPane().add(txtPersonaDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 60, -1));

        txtPersonaTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersonaTresActionPerformed(evt);
            }
        });
        txtPersonaTres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPersonaTresKeyTyped(evt);
            }
        });
        getContentPane().add(txtPersonaTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 60, -1));

        txtPorcentajeUno.setEditable(false);
        getContentPane().add(txtPorcentajeUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 60, -1));

        txtPorcentajeDos.setEditable(false);
        getContentPane().add(txtPorcentajeDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 60, -1));

        txtPorcentajeTres.setEditable(false);
        getContentPane().add(txtPorcentajeTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 60, -1));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jLabel8.setText("Total invertido");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txtTotal.setEditable(false);
        txtTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalKeyTyped(evt);
            }
        });
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 60, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPersonaTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersonaTresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersonaTresActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
       double suma;
       int pers1, pers2, pers3;
       double porc1, porc2, porc3;
       String res1, res2, res3, total;
     

    if(txtPersonaUno.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this, "Digite la cantidad número Uno","error", JOptionPane.ERROR_MESSAGE);
         txtPersonaUno.requestFocusInWindow();
         txtPersonaUno.selectAll();
//validación de vacio en persona 1
       }

     else if(txtPersonaDos.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this, "Digite la cantidad número Dos","error", JOptionPane.ERROR_MESSAGE);  
        txtPersonaDos.requestFocusInWindow();
        txtPersonaDos.selectAll();
//validación de vacio en persona 2
     }  
     else if(txtPersonaTres.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this, "Digite la cantidad número tres","error", JOptionPane.ERROR_MESSAGE);  
        txtPersonaTres.requestFocusInWindow(); 
         txtPersonaTres.selectAll();    
////validación de vacio en persona 3
     }
    
     
     else{
  
     pers1=Integer.parseInt(txtPersonaUno.getText());
     pers2=Integer.parseInt(txtPersonaDos.getText());
     pers3=Integer.parseInt(txtPersonaTres.getText());
 // convertir los labels en enteros     
 
   if(pers1==pers2) {
       JOptionPane.showMessageDialog(this, "Las cantidades individuales deben ser distintas","error", JOptionPane.ERROR_MESSAGE);  
        txtPersonaUno.requestFocusInWindow(); 
        txtPersonaUno.selectAll();  
       }  

     else if(pers2==pers3){
     JOptionPane.showMessageDialog(this, "Las cantidades individuales deben ser distintas","error", JOptionPane.ERROR_MESSAGE);  
        txtPersonaDos.requestFocusInWindow(); 
        txtPersonaDos.selectAll();              
       }      
 else if(pers1==pers3){
     JOptionPane.showMessageDialog(this, "Las cantidades individuales deben ser distintas","error", JOptionPane.ERROR_MESSAGE);  
        txtPersonaUno.requestFocusInWindow(); 
        txtPersonaUno.selectAll();              
       }     
suma=(pers1+pers2+pers3); 
   porc1=(pers1/suma)*100;
   porc2=(pers2/suma)*100;
   porc3=(pers3/suma)*100;

 //INICIAR OPERACIÓN
     res1=String.valueOf(porc1);
    txtPorcentajeUno.setText (res1);    
    
    res2=String.valueOf(porc2);
    txtPorcentajeDos.setText (res2);  
    
    res3=String.valueOf(porc3);
    txtPorcentajeTres.setText(res3); 

    total=String.valueOf(suma);
    txtTotal.setText(total);
 //convertir resultados a string  
   }

    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
     txtTotal.setText("");
     txtPersonaUno.setText("");
     txtPersonaDos.setText("");
     txtPersonaTres.setText("");
     txtPorcentajeUno.setText("");
     txtPorcentajeDos.setText("");
     txtPorcentajeTres.setText("");
     txtTotal.requestFocusInWindow();
 //Función de Borrar    
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyTyped

    }//GEN-LAST:event_txtTotalKeyTyped

    private void txtPersonaUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonaUnoKeyTyped
         char c=evt.getKeyChar(); 
       
          if(!Character.isDigit(c)) { 
              getToolkit().beep();    
              evt.consume(); 
          }  
          //validación de caracteres en persona 1
    }//GEN-LAST:event_txtPersonaUnoKeyTyped

    private void txtPersonaDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonaDosKeyTyped
      char c=evt.getKeyChar(); 
       
          if(!Character.isDigit(c)) { 
              getToolkit().beep();    
              evt.consume(); 
          }  
          //validación de caracteres en persona dos
    }//GEN-LAST:event_txtPersonaDosKeyTyped

    private void txtPersonaTresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonaTresKeyTyped
         char c=evt.getKeyChar(); 
       
          if(!Character.isDigit(c)) { 
              getToolkit().beep();    
              evt.consume(); 
          }  
          //validación de caracteres en persona 3
    }//GEN-LAST:event_txtPersonaTresKeyTyped

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtPersonaDos;
    private javax.swing.JTextField txtPersonaTres;
    private javax.swing.JTextField txtPersonaUno;
    private javax.swing.JTextField txtPorcentajeDos;
    private javax.swing.JTextField txtPorcentajeTres;
    private javax.swing.JTextField txtPorcentajeUno;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
