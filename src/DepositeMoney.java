
import java.io.BufferedReader;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */


public class DepositeMoney extends javax.swing.JFrame {
    String uemail="",utext="";

    /**
     * Creates new form DepositeMoney
     */
    
    class Main1
{
    String  d_email = "mh715360@gmail.com",
            d_password = "97325060",
            d_host = "smtp.gmail.com",
            d_port  = "465",
            m_to = uemail,
            m_subject = "Deposite Amount",
            m_text = utext;

    public Main1()
    {
        Properties props = new Properties();
        props.put("mail.smtp.user", d_email);
        props.put("mail.smtp.host", d_host);
        props.put("mail.smtp.port", d_port);
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.debug", "true");
        props.put("mail.smtp.socketFactory.port", d_port);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");

        SecurityManager security = System.getSecurityManager();

        try
        {
            Authenticator auth = new SMTPAuthenticator();
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);
            MimeMessage msg = new MimeMessage(session);
            msg.setText(m_text);
            msg.setSubject(m_subject);
            msg.setFrom(new InternetAddress(d_email));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(m_to));
            Transport.send(msg);
        }
        catch (Exception mex)
        {
            mex.printStackTrace();
        } 
    }

    

    private class SMTPAuthenticator extends javax.mail.Authenticator
    {
        public PasswordAuthentication getPasswordAuthentication()
        {
            return new PasswordAuthentication(d_email, d_password);
        }
    }
}
    
    
    
    
    public static String acc;
    int bal=0;
    public DepositeMoney(String ac) {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        enteramount1 = new javax.swing.JLabel();
        enteramount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        backtotransaction = new javax.swing.JButton();
        Deposit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pin1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(125, 60, 152));
        jPanel4.setPreferredSize(new java.awt.Dimension(1241, 860));
        jPanel4.setLayout(null);

        enteramount1.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 36)); // NOI18N
        enteramount1.setForeground(new java.awt.Color(255, 255, 255));
        enteramount1.setText("Enter Amount:");
        enteramount1.setToolTipText("");
        jPanel4.add(enteramount1);
        enteramount1.setBounds(250, 150, 382, 50);

        enteramount.setBackground(new java.awt.Color(153, 255, 204));
        enteramount.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 36)); // NOI18N
        enteramount.setBorder(null);
        enteramount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enteramountActionPerformed(evt);
            }
        });
        jPanel4.add(enteramount);
        enteramount.setBounds(610, 150, 410, 60);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jLabel6);
        jLabel6.setBounds(1123, 295, 296, 35);

        exit.setBackground(new java.awt.Color(51, 51, 51));
        exit.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 36)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 0, 51));
        exit.setText("Exit");
        exit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0)));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel4.add(exit);
        exit.setBounds(480, 680, 310, 70);

        backtotransaction.setBackground(new java.awt.Color(51, 51, 51));
        backtotransaction.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 24)); // NOI18N
        backtotransaction.setForeground(new java.awt.Color(153, 255, 255));
        backtotransaction.setText("Back to Transaction");
        backtotransaction.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(153, 255, 255)));
        backtotransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtotransactionActionPerformed(evt);
            }
        });
        jPanel4.add(backtotransaction);
        backtotransaction.setBounds(140, 520, 340, 70);

        Deposit.setBackground(new java.awt.Color(51, 51, 51));
        Deposit.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 36)); // NOI18N
        Deposit.setForeground(new java.awt.Color(153, 255, 255));
        Deposit.setText("Deposit");
        Deposit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(153, 255, 255)));
        Deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositActionPerformed(evt);
            }
        });
        jPanel4.add(Deposit);
        Deposit.setBounds(780, 520, 350, 70);

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pin No:");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(250, 260, 210, 37);

        pin1.setBackground(new java.awt.Color(153, 255, 204));
        pin1.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 36)); // NOI18N
        pin1.setBorder(null);
        pin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pin1ActionPerformed(evt);
            }
        });
        jPanel4.add(pin1);
        pin1.setBounds(610, 240, 410, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0_MAIN_170518_GBR_DepositMoney_1920x1080.jpg"))); // NOI18N
        jLabel2.setText("jLabel1");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(0, 0, 1240, 860);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void pin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pin1ActionPerformed
       String depo_account="";
    private void DepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositActionPerformed
        // TODO add your handling code here:
        
           String ctime="";
      SimpleDateFormat formatter= new SimpleDateFormat("'Date: 'yyyy-MM-dd 'Time: 'HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        ctime=formatter.format(date);
        
        String account,pin,transaction;
       
        depo_account=acc+"t_h"+".txt";
        account=acc;
        transaction=acc;
        
        pin=pin1.getText();
        account=account+".txt";
        File f1 = new File(account);
        if(!f1.exists())
        {
            JOptionPane.showMessageDialog(null, "The account is not exits !!!");
            DepositeMoney rgf1=new DepositeMoney(acc);
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
                c++;
                if(c==2){
                    break;
                }
                
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
            
            int c2=0;
            String s2 = null;
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
                    c2++;
                    if(c2==3)
                    s2=line;
                    if(c2==5)
                        uemail=line;
                    stringBufferOfData.append(line).append("\r\n");//this small line here is to appened all text read in from the file to a string buffer which will be used to edit the contents of the file
                }
                fileToRead.close();//this is used to release the scanner from file
            } catch (FileNotFoundException ex) {//if the file cannot be found an exception will be thrown
                System.out.println("The file " + filename + " could not be found! " + ex.getMessage());
            } finally {//if an error occurs now we close the file to exit gracefully
                fileToRead.close();
            }

            //prompt for a line in file to edit
            String lineToEdit1=pin;
            String lineToEdit2 = s2;//read the line to edit
            //prompt for a line in file to replace

            String d=enteramount.getText();
            bal=Integer.parseInt(s2)+Integer.parseInt(d);
                  String t2=ctime+" "+d+"Taka Has Been Deposited To Your Account"+ System.lineSeparator();
              try{
                   BufferedWriter mahedi = new BufferedWriter( new FileWriter(depo_account, true));
                   mahedi.write(t2);
                   mahedi.close();
              }catch(IOException e)
              {
                  e.printStackTrace();
              }
            
            String p="|";
            String replacementText1 = p;
            String replacementText2 = Integer.toString(bal);//read the line to replace
            int si1 = stringBufferOfData.indexOf(lineToEdit1);
//now we get the starting point of the text we want to edit
            int ei1 = si1 + lineToEdit1.length();
            //System.out.println(sb);//used for debugging to check that my stringbuffer has correct contents and spacing
            stringBufferOfData.replace(si1, ei1, replacementText1);
            
            
            
                        try {
                BufferedWriter bufwriter = new BufferedWriter(new FileWriter(filename));
                bufwriter.write(stringBufferOfData.toString());//writes the edited string buffer to the new file
                bufwriter.close();//closes the file
            } catch (Exception e) {//if an exception occurs
                System.out.println("Error occured while attempting to write to file: " + e.getMessage());
            }
            
            
            
            
            
            
            int startIndex = stringBufferOfData.indexOf(lineToEdit2);
//now we get the starting point of the text we want to edit
            int endIndex = startIndex + lineToEdit2.length();
//now we add the staring index of the text with text length to get the end index
            stringBufferOfData.replace(startIndex, endIndex, replacementText2);
            
          
                        try {
                BufferedWriter bufwriter = new BufferedWriter(new FileWriter(filename));
                bufwriter.write(stringBufferOfData.toString());//writes the edited string buffer to the new file
                bufwriter.close();//closes the file
            } catch (Exception e) {//if an exception occurs
                System.out.println("Error occured while attempting to write to file: " + e.getMessage());
            }
            
            
            
            
//this is where the actual replacement of the text happens
            int si2 = stringBufferOfData.indexOf(p);
            int ei2 = si2+p.length();
            stringBufferOfData.replace(si2, ei2, pin);
            
            
            
            
            try {
                BufferedWriter bufwriter = new BufferedWriter(new FileWriter(filename));
                bufwriter.write(stringBufferOfData.toString());//writes the edited string buffer to the new file
                bufwriter.close();//closes the file
            } catch (Exception e) {//if an exception occurs
                System.out.println("Error occured while attempting to write to file: " + e.getMessage());
            }
            
            JOptionPane.showMessageDialog(null,"Deposite amount "+d+" Successfully!!!/nNow current Balance is "+bal+".");
            
            utext="Dear Sir,your account number "+acc+" credited (Cash Deposit) by BDT "+d+".Now current account balance is "+bal+".";
            Main1 blah = new Main1();
            DepositeMoney rgf1=new DepositeMoney(acc);
            rgf1.setVisible(true);
            rgf1.pack();
            rgf1.setLocationRelativeTo(null);
            rgf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
             return ;
             
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid PIN number!!");
            DepositeMoney rgf1=new DepositeMoney(acc);
            rgf1.setVisible(true);
            rgf1.pack();
            rgf1.setLocationRelativeTo(null);
            rgf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
             return ;
        }
        

    }//GEN-LAST:event_DepositActionPerformed

    private void backtotransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtotransactionActionPerformed
        // TODO add your handling code here:
        Transaction rgf=new Transaction(acc);
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
         return ;
    }//GEN-LAST:event_backtotransactionActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Are you want to Exit!");
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void enteramountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enteramountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enteramountActionPerformed
    
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
            java.util.logging.Logger.getLogger(DepositeMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepositeMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepositeMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepositeMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new DepositeMoney(ac).setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deposit;
    private javax.swing.JButton backtotransaction;
    private javax.swing.JTextField enteramount;
    private javax.swing.JLabel enteramount1;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField pin1;
    // End of variables declaration//GEN-END:variables
}
