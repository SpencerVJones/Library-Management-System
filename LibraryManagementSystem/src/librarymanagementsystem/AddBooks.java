package librarymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class AddBooks extends javax.swing.JFrame {

   
    public AddBooks() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBookPanel = new javax.swing.JPanel();
        addBookLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        bookIdLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        authorLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        copiesLabel = new javax.swing.JLabel();
        bookIdTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        copiesTextField = new javax.swing.JTextField();
        priceTextField = new javax.swing.JTextField();
        authorTextField = new javax.swing.JTextField();
        categoryTextField = new javax.swing.JTextField();
        owlPanel = new javax.swing.JPanel();
        owlLabel = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addBookPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBookPanel.setPreferredSize(new java.awt.Dimension(409, 101));

        addBookLabel.setFont(new java.awt.Font("Trebuchet MS", 3, 48)); // NOI18N
        addBookLabel.setForeground(new java.awt.Color(0, 51, 204));
        addBookLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBookLabel.setText("Add a Book to Library");
        addBookLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        addBookLabel.setAlignmentY(0.0F);
        addBookLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addBookLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout addBookPanelLayout = new javax.swing.GroupLayout(addBookPanel);
        addBookPanel.setLayout(addBookPanelLayout);
        addBookPanelLayout.setHorizontalGroup(
            addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(addBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addBookPanelLayout.setVerticalGroup(
            addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(addBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        bookIdLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        bookIdLabel.setText("Book ID:");

        nameLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        nameLabel.setText("Name:");

        categoryLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        categoryLabel.setText("Category:");

        authorLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        authorLabel.setText("Author:");

        priceLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        priceLabel.setText("Price:");

        copiesLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        copiesLabel.setText("Copies:");

        bookIdTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        bookIdTextField.setCaretColor(new java.awt.Color(0, 51, 204));

        nameTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        nameTextField.setCaretColor(new java.awt.Color(0, 51, 204));

        copiesTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        copiesTextField.setCaretColor(new java.awt.Color(0, 51, 204));

        priceTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        priceTextField.setCaretColor(new java.awt.Color(0, 51, 204));

        authorTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        authorTextField.setCaretColor(new java.awt.Color(0, 51, 204));

        categoryTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        categoryTextField.setCaretColor(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookIdLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(categoryLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(authorLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(priceLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(copiesLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(priceTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(authorTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookIdTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoryTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(copiesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookIdLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryLabel)
                    .addComponent(categoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorLabel)
                    .addComponent(authorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(copiesLabel)
                    .addComponent(copiesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
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
                    .addComponent(addBookPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(addBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(owlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );

        buttonPanel.getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String url = "jdbc:mysql://localhost:3306/Library?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String pwd = "";
        String query = "insert into books values(?,?,?,?,?,?)";
        
        String id = bookIdTextField.getText();
        String name = nameTextField.getText(); 
        String category = categoryTextField.getText();
        String author = authorTextField.getText();
        double price = Double.parseDouble(priceTextField.getText());
        int copies = Integer.parseInt(copiesTextField.getText());  
        
        String checkQuery = "UPDATE books SET copies = copies + '" + copies + "' WHERE price = '" + price + "' AND author = '" + author + "' AND category = '" + category + "' AND name = '" + name + "'";
       
       
       try {
            Connection conn = DriverManager.getConnection(url,user,pwd);
            Statement stmnt = conn.createStatement();
            int rows = stmnt.executeUpdate(checkQuery);
            if (rows>0) {
                JOptionPane.showMessageDialog(this, "Book Added");
            }
            else {
                PreparedStatement stm = conn.prepareCall(query);
                stm.setString(1, id);
                stm.setString(2, name);
                stm.setString(3, category);
                stm.setString(4, author);
                stm.setDouble(5, price);
                stm.setInt(6, copies); 
                stm.execute();
                JOptionPane.showMessageDialog(this,"Book Added");
            }
            bookIdTextField.setText(null);
            nameTextField.setText(null);
            categoryTextField.setText(null);
            authorTextField.setText(null);
            priceTextField.setText(null);
            copiesTextField.setText(null);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }

    }//GEN-LAST:event_addButtonActionPerformed


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addBookLabel;
    private javax.swing.JPanel addBookPanel;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JTextField authorTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bookIdLabel;
    private javax.swing.JTextField bookIdTextField;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JTextField categoryTextField;
    private javax.swing.JLabel copiesLabel;
    private javax.swing.JTextField copiesTextField;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel owlLabel;
    private javax.swing.JPanel owlPanel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTextField;
    // End of variables declaration//GEN-END:variables
}
