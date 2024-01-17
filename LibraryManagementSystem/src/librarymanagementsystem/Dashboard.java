package librarymanagementsystem;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        dashboardLabel = new javax.swing.JLabel();
        owlPanel8 = new javax.swing.JPanel();
        owlLabel8 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        booksAvaliableButton = new javax.swing.JButton();
        addBooksButton = new javax.swing.JButton();
        removeBooksButton = new javax.swing.JButton();
        staffDetailsButton = new javax.swing.JButton();
        addStaffButton = new javax.swing.JButton();
        removeStaffButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        editAdminButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library Management System");

        titlePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        dashboardLabel.setFont(new java.awt.Font("Trebuchet MS", 3, 48)); // NOI18N
        dashboardLabel.setForeground(new java.awt.Color(0, 51, 204));
        dashboardLabel.setText("Dashboard");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dashboardLabel)
                .addGap(160, 160, 160))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(dashboardLabel)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        owlPanel8.setBackground(new java.awt.Color(51, 51, 51));
        owlPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        owlPanel8.setPreferredSize(new java.awt.Dimension(400, 450));

        owlLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagementsystem/libraryowl.png"))); // NOI18N

        javax.swing.GroupLayout owlPanel8Layout = new javax.swing.GroupLayout(owlPanel8);
        owlPanel8.setLayout(owlPanel8Layout);
        owlPanel8Layout.setHorizontalGroup(
            owlPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, owlPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(owlLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        owlPanel8Layout.setVerticalGroup(
            owlPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(owlPanel8Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(owlLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        booksAvaliableButton.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        booksAvaliableButton.setText("Books Avaliable");
        booksAvaliableButton.setBorder(null);
        booksAvaliableButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        booksAvaliableButton.setPreferredSize(new java.awt.Dimension(175, 35));
        booksAvaliableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksAvaliableButtonActionPerformed(evt);
            }
        });

        addBooksButton.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        addBooksButton.setText("Add Books");
        addBooksButton.setBorder(null);
        addBooksButton.setPreferredSize(new java.awt.Dimension(175, 35));
        addBooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBooksButtonActionPerformed(evt);
            }
        });

        removeBooksButton.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        removeBooksButton.setText("Remove Books");
        removeBooksButton.setBorder(null);
        removeBooksButton.setPreferredSize(new java.awt.Dimension(175, 35));
        removeBooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBooksButtonActionPerformed(evt);
            }
        });

        staffDetailsButton.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        staffDetailsButton.setText("Staff Details");
        staffDetailsButton.setBorder(null);
        staffDetailsButton.setPreferredSize(new java.awt.Dimension(175, 35));
        staffDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffDetailsButtonActionPerformed(evt);
            }
        });

        addStaffButton.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        addStaffButton.setText("Add Staff");
        addStaffButton.setBorder(null);
        addStaffButton.setPreferredSize(new java.awt.Dimension(175, 35));
        addStaffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStaffButtonActionPerformed(evt);
            }
        });

        removeStaffButton.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        removeStaffButton.setText("Remove Staff");
        removeStaffButton.setBorder(null);
        removeStaffButton.setPreferredSize(new java.awt.Dimension(175, 35));
        removeStaffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStaffButtonActionPerformed(evt);
            }
        });

        logoutButton.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.setBorder(null);
        logoutButton.setPreferredSize(new java.awt.Dimension(175, 35));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        editAdminButton.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        editAdminButton.setText("Edit Admin");
        editAdminButton.setBorder(null);
        editAdminButton.setPreferredSize(new java.awt.Dimension(175, 35));
        editAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAdminButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(booksAvaliableButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(staffDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addStaffButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeStaffButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(staffDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(addStaffButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(removeStaffButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(booksAvaliableButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(addBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(removeBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        booksAvaliableButton.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(owlPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(owlPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
       LoginPage loginPage = new LoginPage();
       loginPage.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void editAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAdminButtonActionPerformed
        EditAdmin editAdmin = new EditAdmin();
        editAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editAdminButtonActionPerformed

    private void booksAvaliableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksAvaliableButtonActionPerformed
        BooksAvaliable booksAvaliable = new BooksAvaliable();
        booksAvaliable.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_booksAvaliableButtonActionPerformed

    private void addBooksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBooksButtonActionPerformed
        AddBooks addBooks = new AddBooks();
        addBooks.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addBooksButtonActionPerformed

    private void removeBooksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBooksButtonActionPerformed
        RemoveBooks removeBooks = new RemoveBooks();
        removeBooks.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_removeBooksButtonActionPerformed

    private void staffDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffDetailsButtonActionPerformed
        StaffDetails details = new StaffDetails();
        details.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_staffDetailsButtonActionPerformed

    private void addStaffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStaffButtonActionPerformed
        AddStaff addstaff = new AddStaff();
        addstaff.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addStaffButtonActionPerformed

    private void removeStaffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStaffButtonActionPerformed
        RemoveStaff removeStaff = new RemoveStaff();
        removeStaff.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_removeStaffButtonActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBooksButton;
    private javax.swing.JButton addStaffButton;
    private javax.swing.JButton booksAvaliableButton;
    private javax.swing.JLabel dashboardLabel;
    private javax.swing.JButton editAdminButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel owlLabel;
    private javax.swing.JLabel owlLabel1;
    private javax.swing.JLabel owlLabel2;
    private javax.swing.JLabel owlLabel3;
    private javax.swing.JLabel owlLabel4;
    private javax.swing.JLabel owlLabel5;
    private javax.swing.JLabel owlLabel6;
    private javax.swing.JLabel owlLabel7;
    private javax.swing.JLabel owlLabel8;
    private javax.swing.JPanel owlPanel;
    private javax.swing.JPanel owlPanel1;
    private javax.swing.JPanel owlPanel2;
    private javax.swing.JPanel owlPanel3;
    private javax.swing.JPanel owlPanel4;
    private javax.swing.JPanel owlPanel5;
    private javax.swing.JPanel owlPanel6;
    private javax.swing.JPanel owlPanel7;
    private javax.swing.JPanel owlPanel8;
    private javax.swing.JButton removeBooksButton;
    private javax.swing.JButton removeStaffButton;
    private javax.swing.JButton staffDetailsButton;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
