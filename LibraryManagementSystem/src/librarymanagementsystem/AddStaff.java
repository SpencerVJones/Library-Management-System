package librarymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class AddStaff extends javax.swing.JFrame {

    public AddStaff() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addStaffPanel = new javax.swing.JPanel();
        addStaffLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        staffIdLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        departmentLabel = new javax.swing.JLabel();
        salaryLabel = new javax.swing.JLabel();
        staffIdTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        salaryTextField = new javax.swing.JTextField();
        departmentTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        owlPanel = new javax.swing.JPanel();
        owlLabel = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addStaffPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addStaffPanel.setPreferredSize(new java.awt.Dimension(409, 101));

        addStaffLabel.setFont(new java.awt.Font("Trebuchet MS", 3, 48)); // NOI18N
        addStaffLabel.setForeground(new java.awt.Color(0, 51, 204));
        addStaffLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addStaffLabel.setText("Add Library Staff");
        addStaffLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        addStaffLabel.setAlignmentY(0.0F);
        addStaffLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addStaffLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout addStaffPanelLayout = new javax.swing.GroupLayout(addStaffPanel);
        addStaffPanel.setLayout(addStaffPanelLayout);
        addStaffPanelLayout.setHorizontalGroup(
            addStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addStaffPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(addStaffLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        addStaffPanelLayout.setVerticalGroup(
            addStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addStaffPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(addStaffLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        staffIdLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        staffIdLabel.setText("Staff ID:");

        nameLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        nameLabel.setText("Name:");

        phoneLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        phoneLabel.setText("Phone:");

        departmentLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        departmentLabel.setText("Department:");

        salaryLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        salaryLabel.setText("Salary:");

        staffIdTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        staffIdTextField.setCaretColor(new java.awt.Color(0, 51, 204));

        nameTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        nameTextField.setCaretColor(new java.awt.Color(0, 51, 204));

        salaryTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        salaryTextField.setCaretColor(new java.awt.Color(0, 51, 204));

        departmentTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        departmentTextField.setCaretColor(new java.awt.Color(0, 51, 204));

        phoneTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        phoneTextField.setCaretColor(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(staffIdLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(phoneLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(departmentLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(salaryLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(salaryTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(departmentTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(staffIdTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staffIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffIdLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departmentLabel)
                    .addComponent(departmentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaryLabel)
                    .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        owlPanel.setBackground(new java.awt.Color(51, 51, 51));
        owlPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        owlPanel.setPreferredSize(new java.awt.Dimension(400, 450));

        owlLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagementsystem/libraryowl.png"))); // NOI18N

        javax.swing.GroupLayout owlPanelLayout = new javax.swing.GroupLayout(owlPanel);
        owlPanel.setLayout(owlPanelLayout);
        owlPanelLayout.setHorizontalGroup(
            owlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, owlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(owlLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        owlPanelLayout.setVerticalGroup(
            owlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(owlPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(owlLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        addButton.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        addButton.setText("Add");
        addButton.setPreferredSize(new java.awt.Dimension(175, 35));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        logoutButton.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.setPreferredSize(new java.awt.Dimension(175, 35));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        backButton.setText("Back");
        backButton.setPreferredSize(new java.awt.Dimension(175, 35));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(owlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addStaffPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(addStaffPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(owlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String url = "jdbc:mysql://localhost:3306/Library?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String pwd = "";
        String query = "insert into staff values(?,?,?,?,?)";
        String id = staffIdTextField.getText();
        String name = nameTextField.getText(); 
        String phone = phoneTextField.getText();
        String department = departmentTextField.getText();
        int salary = Integer.parseInt(salaryTextField.getText());
        try {
            Connection conn = DriverManager.getConnection(url,user,pwd);
            PreparedStatement stm = conn.prepareCall(query);
            stm.setString(1,id);
            stm.setString(2, name);
            stm.setString(3, phone);
            stm.setString(4, department);
            stm.setInt(5, salary);
            stm.execute();
            JOptionPane.showMessageDialog(this, "Staff Added");
            
            staffIdTextField.setText(null);
            nameTextField.setText(null);
            phoneTextField.setText(null);
            departmentTextField.setText(null);
            salaryTextField.setText(null);
    }                                         

        catch (Exception e) {
                JOptionPane.showMessageDialog(this,e);
            }
       
    }//GEN-LAST:event_addButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel addStaffLabel;
    private javax.swing.JPanel addStaffPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JLabel departmentLabel;
    private javax.swing.JTextField departmentTextField;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel owlLabel;
    private javax.swing.JPanel owlPanel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JTextField salaryTextField;
    private javax.swing.JLabel staffIdLabel;
    private javax.swing.JTextField staffIdTextField;
    // End of variables declaration//GEN-END:variables
}
