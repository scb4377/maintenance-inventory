
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Jake
 */
public class AdminHomePage extends javax.swing.JFrame {
    DefaultListModel<Employee> empList = new DefaultListModel();
   
    /**
     * Creates new form AdminHomePage
     */
    public AdminHomePage() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lblTitle = new javax.swing.JLabel();
        btnAddEmp = new javax.swing.JButton();
        btnTerminate = new javax.swing.JButton();
        btnAddJob = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeList = new javax.swing.JList<>();
        lblEmpList = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaEmpDetails = new javax.swing.JTextArea();
        lblEmpDetails = new javax.swing.JLabel();
        btnLoadEmps = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Administration Home Page");
        lblTitle.setBorder(new javax.swing.border.MatteBorder(null));

        btnAddEmp.setText("Add Employee");
        btnAddEmp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddEmpActionPerformed(evt);
            }
        });

        btnTerminate.setText("Terminate");
        btnTerminate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnTerminateActionPerformed(evt);
            }
        });

        btnAddJob.setText("Add Job");

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName.setText("Welcome to the GB Manufacturing Administrator Access Page.   ");

        employeeList.setModel(empList);
        jScrollPane1.setViewportView(employeeList);

        lblEmpList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEmpList.setText("Employee List: ");

        txaEmpDetails.setColumns(20);
        txaEmpDetails.setRows(5);
        jScrollPane2.setViewportView(txaEmpDetails);

        lblEmpDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEmpDetails.setText("Employee Details: ");

        btnLoadEmps.setText("Load Emps");
        btnLoadEmps.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLoadEmpsActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLoadEmps, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblName)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)
                                    .addComponent(btnAddJob, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51)
                                    .addComponent(btnTerminate, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblEmpList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addGap(71, 71, 71)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEmpDetails)))))
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpList)
                    .addComponent(lblEmpDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddJob, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTerminate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnLoadEmps, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmpActionPerformed

        addEmployee frame  = new addEmployee();
             frame.setVisible(true);
             this.setVisible(false);
             this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
             this.dispose();
    }//GEN-LAST:event_btnAddEmpActionPerformed

    private void btnTerminateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminateActionPerformed
            try{
                //get object
                Employee empToTerminate = employeeList.getSelectedValue();
                
                //When slected delete and clear txa
                if(empToTerminate != null){
                    dataIO data = new dataIO();
                    data.delete(empToTerminate.getEmployeeID());
                    txaEmpDetails.setText("");
                    loadEmps(); 
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(this, "Error:" + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }
        
    }//GEN-LAST:event_btnTerminateActionPerformed

    private void btnLoadEmpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadEmpsActionPerformed
        // TODO add your handling code here:
        loadEmps();
    }//GEN-LAST:event_btnLoadEmpsActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomePage().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmp;
    private javax.swing.JButton btnAddJob;
    private javax.swing.JButton btnLoadEmps;
    private javax.swing.JButton btnTerminate;
    private javax.swing.JList<Employee> employeeList;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEmpDetails;
    private javax.swing.JLabel lblEmpList;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txaEmpDetails;
    // End of variables declaration//GEN-END:variables

private void loadEmps(){
try{
        dataIO data = new dataIO();
         ArrayList<Employee> emps = data.getList();

            //clear defaultlistmodel and text area
            empList.clear();
            txaEmpDetails.setText("");

            //copy each obj from the arraylist over to defauult list model
            for (int i = 0; i < emps.size(); i++) {
                empList.addElement(emps.get(i) );
            
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        }
}

private void lstEmpsValChanges(javax.swing.event.ListSelectionEvent evt){
    //get selected items index num
    int index = employeeList.getSelectedIndex();
    
    //if selected show details
    if(index > -1){
        Employee emp = empList.getElementAt(index);
        txaEmpDetails.setText(emp.showEmpDetails());
    }
    
}
    
}
