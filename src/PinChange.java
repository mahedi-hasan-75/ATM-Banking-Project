/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */

import java.io.BufferedReader;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PinChange extends javax.swing.JFrame {

    /**
     * Creates new form PinChange
     */
    public static String acc;
    public PinChange(String ac) {
        acc=ac;
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

        jPanel4 = new javax.swing.JPanel();
        enteramount1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        backtotransaction = new javax.swing.JButton();
        Deposit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        pin1 = new javax.swing.JPasswordField();
        enteramount = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(125, 60, 152));
        jPanel4.setPreferredSize(new java.awt.Dimension(1241, 860));
        jPanel4.setLayout(null);

        enteramount1.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 36)); // NOI18N
        enteramount1.setForeground(new java.awt.Color(255, 255, 255));
        enteramount1.setText("New Pin:");
        enteramount1.setToolTipText("");
        jPanel4.add(enteramount1);
        enteramount1.setBounds(180, 260, 288, 50);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jLabel8);
        jLabel8.setBounds(394, 290, 296, 35);

        exit.setBackground(new java.awt.Color(102, 102, 102));
        exit.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 40)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 0, 0));
        exit.setText("Exit");
        exit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0)));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel4.add(exit);
        exit.setBounds(180, 640, 380, 60);

        backtotransaction.setBackground(new java.awt.Color(102, 102, 102));
        backtotransaction.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 28)); // NOI18N
        backtotransaction.setForeground(new java.awt.Color(102, 255, 255));
        backtotransaction.setText("Back to Transaction");
        backtotransaction.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(153, 255, 255)));
        backtotransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtotransactionActionPerformed(evt);
            }
        });
        jPanel4.add(backtotransaction);
        backtotransaction.setBounds(730, 640, 400, 59);

        Deposit.setBackground(new java.awt.Color(102, 102, 102));
        Deposit.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 36)); // NOI18N
        Deposit.setForeground(new java.awt.Color(153, 255, 255));
        Deposit.setText("Done");
        Deposit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(153, 255, 255)));
        Deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositActionPerformed(evt);
            }
        });
        jPanel4.add(Deposit);
        Deposit.setBounds(430, 490, 330, 64);

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pin No:");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(180, 190, 276, 37);

        pin1.setBackground(new java.awt.Color(153, 255, 204));
        pin1.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 36)); // NOI18N
        pin1.setBorder(null);
        jPanel4.add(pin1);
        pin1.setBounds(600, 180, 430, 60);

        enteramount.setBackground(new java.awt.Color(153, 255, 204));
        enteramount.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 36)); // NOI18N
        enteramount.setBorder(null);
        jPanel4.add(enteramount);
        enteramount.setBounds(600, 250, 430, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxresdefault.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(0, 0, 1241, 860);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Are you want to Exit!");
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void backtotransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtotransactionActionPerformed
        // TODO add your handling code here:
        Transaction rgf=new Transaction(acc);
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_backtotransactionActionPerformed

    private void DepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositActionPerformed
        // TODO add your handling code here:

        String account,pin;
        account=acc;
        pin=pin1.getText();
        account=account+".txt";
        File f1 = new File(account);
        if(!f1.exists())
        {
            JOptionPane.showMessageDialog(null, "The account is not exits !!!");
            PinChange rgf1=new PinChange(acc);
            rgf1.setVisible(true);
            rgf1.pack();
            rgf1.setLocationRelativeTo(null);
            rgf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
             return ;
        }

        BufferedReader bf = null;
        try {
            bf = new BufferedReader(new FileReader(account));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        int c=0;
        String s1 = null;
        try {
            while((s1=bf.readLine())!=null)
            {
                if(c==1){
                    break;
                }
                c++;
            }
        } catch (IOException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bf.close();
        } catch (IOException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        if(s1.equals(pin))
        {
            StringBuffer stringBufferOfData = new StringBuffer();
            String filename = null;
            Scanner sc = new Scanner(System.in);
            filename=account;
            Scanner fileToRead = null;

            try {
                fileToRead = new Scanner(new File(filename)); //point the scanner method to a file
                //check if there is a next line and it is not null and then read it in
                for (String line; fileToRead.hasNextLine() && (line = fileToRead.nextLine()) != null; ) {
                    //print each line as its read
                    stringBufferOfData.append(line).append("\r\n");//this small line here is to appened all text read in from the file to a string buffer which will be used to edit the contents of the file
                }
                fileToRead.close();//this is used to release the scanner from file
            } catch (FileNotFoundException ex) {//if the file cannot be found an exception will be thrown
                System.out.println("The file " + filename + " could not be found! " + ex.getMessage());
            } finally {//if an error occurs now we close the file to exit gracefully
                fileToRead.close();
            }

            //prompt for a line in file to edit
            String lineToEdit = s1;//read the line to edit
            //prompt for a line in file to replace

            String d=enteramount.getText();
            String replacementText = d;//read the line to replace
            //System.out.println(sb);//used for debugging to check that my stringbuffer has correct contents and spacing
            int startIndex = stringBufferOfData.indexOf(lineToEdit);//now we get the starting point of the text we want to edit
            int endIndex = startIndex + lineToEdit.length();//now we add the staring index of the text with text length to get the end index
            stringBufferOfData.replace(startIndex, endIndex, replacementText);//this is where the actual replacement of the text happens

            try {
                BufferedWriter bufwriter = new BufferedWriter(new FileWriter(filename));
                bufwriter.write(stringBufferOfData.toString());//writes the edited string buffer to the new file
                bufwriter.close();//closes the file
            } catch (Exception e) {//if an exception occurs
                System.out.println("Error occured while attempting to write to file: " + e.getMessage());
            }
            JOptionPane.showMessageDialog(null,"Pin changed successfully !!!");
            PinChange rgf1=new PinChange(acc);
            rgf1.setVisible(true);
            rgf1.pack();
            rgf1.setLocationRelativeTo(null);
            rgf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
             return ;
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid PIN number!!");
            PinChange rgf1=new PinChange(acc);
            rgf1.setVisible(true);
            rgf1.pack();
            rgf1.setLocationRelativeTo(null);
            rgf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
             return ;
        }

    }//GEN-LAST:event_DepositActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String ac) {
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
            java.util.logging.Logger.getLogger(PinChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PinChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PinChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PinChange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PinChange(ac).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deposit;
    private javax.swing.JButton backtotransaction;
    private javax.swing.JPasswordField enteramount;
    private javax.swing.JLabel enteramount1;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField pin1;
    // End of variables declaration//GEN-END:variables
}
