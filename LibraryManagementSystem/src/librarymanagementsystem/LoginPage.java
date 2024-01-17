package librarymanagementsystem;

import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class LoginPage extends javax.swing.JFrame {


    public LoginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        owlPanel = new javax.swing.JPanel();
        owlLabel = new javax.swing.JLabel();
        headerLabel = new javax.swing.JPanel();
        publicLabel = new javax.swing.JLabel();
        libraryLabel = new javax.swing.JLabel();
        spencerLabel = new javax.swing.JLabel();
        mainLabel = new javax.swing.JPanel();
        passwordField = new javax.swing.JPasswordField();
        usernameTextField = new javax.swing.JTextField();
        userNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System");
        setResizable(false);

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

        publicLabel.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        publicLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        publicLabel.setText("PUBLIC");
        publicLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        libraryLabel.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        libraryLabel.setText("LIBRARY");
        libraryLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        spencerLabel.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        spencerLabel.setText("SPENCER'S");
        spencerLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout headerLabelLayout = new javax.swing.GroupLayout(headerLabel);
        headerLabel.setLayout(headerLabelLayout);
        headerLabelLayout.setHorizontalGroup(
            headerLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLabelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(publicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(libraryLabel)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLabelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(spencerLabel)
                .addGap(126, 126, 126))
        );
        headerLabelLayout.setVerticalGroup(
            headerLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLabelLayout.createSequentialGroup()
                .addComponent(spencerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headerLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(publicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(libraryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        passwordField.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        passwordField.setCaretColor(new java.awt.Color(0, 51, 204));
        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        usernameTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        usernameTextField.setCaretColor(new java.awt.Color(0, 51, 204));
        usernameTextField.setMinimumSize(new java.awt.Dimension(64, 31));
        usernameTextField.setSize(new java.awt.Dimension(78, 31));

        userNameLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        userNameLabel.setText("User Name: ");
        userNameLabel.setAlignmentY(0.0F);
        userNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        userNameLabel.setPreferredSize(new java.awt.Dimension(75, 35));

        passwordLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("Password:");
        passwordLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        passwordLabel.setPreferredSize(new java.awt.Dimension(75, 35));

        loginButton.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        loginButton.setText("Login");
        loginButton.setBorder(null);
        loginButton.setPreferredSize(new java.awt.Dimension(175, 35));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainLabelLayout = new javax.swing.GroupLayout(mainLabel);
        mainLabel.setLayout(mainLabelLayout);
        mainLabelLayout.setHorizontalGroup(
            mainLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLabelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(mainLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainLabelLayout.setVerticalGroup(
            mainLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLabelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(mainLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(mainLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(owlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(headerLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(owlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String url = "jdbc:mysql://localhost:3306/Library?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String mysqluser = "root";
        String mysqlpwd = "";

        String pswrd = new String(passwordField.getPassword());
        String username = usernameTextField.getText();
        String query = ("select PASSWORD from admin where USER_ID = '" + username + "';");

        try {
            Connection conn = DriverManager.getConnection(url, mysqluser, mysqlpwd);
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);

            if (rs.next()) {
                String realpswrd = rs.getString("PASSWORD");
                if (realpswrd.equals(pswrd)) {
                    Dashboard dsh = new Dashboard();
                    dsh.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrect username or password");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect username or password");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_loginButtonActionPerformed

   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel headerLabel;
    private javax.swing.JLabel libraryLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel mainLabel;
    private javax.swing.JLabel owlLabel;
    private javax.swing.JPanel owlPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel publicLabel;
    private javax.swing.JLabel spencerLabel;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
