
package gui;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class RegistrationForm extends javax.swing.JFrame {

    public RegistrationForm() {
        
        initComponents();
        fillCitiesCombo(); 
        fillDeptCombo();
        buttonGroup1.add(graduateButton);
        buttonGroup1.add(underGraduateButton);
        loadStudentData();
   }
    
    private void fillCitiesCombo(){
        List<String> cities = new ArrayList();
        cities.add("HYD SINDH");
        cities.add("KHI SINDH");
        cities.add("SUKKUR SINDH");
        cities.add("LARKANA SINDH");
        
        cities.forEach(city ->{
            cityCombo.addItem(city);
        });
    }   
    
    private void fillDeptCombo(){
        List<String> dept = new ArrayList();
        dept.add("COMPUTER SCIENCE");
        dept.add("SOFTWARE ENGINEERING");
        dept.add("IT");
        dept.add("AI");
        
        dept.forEach(dpt ->{
            deptCombo.addItem(dpt);
        });
    }
    
    private void loadStudentData() {
    DefaultTableModel model = new DefaultTableModel();
    model.setColumnIdentifiers(new String[] {
        "ID", "Name", "Father Name", "Age", "Gender", "City", "Education", "Department", "Address"
    });

    try {
        Connection conn = db.DBConnection.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM student");

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String fname = rs.getString("father_name");
            int age = rs.getInt("age");
            String gender = rs.getString("gender");
            String city = rs.getString("city");
            String edu = rs.getString("education");
            String dept = rs.getString("department");
            String address = rs.getString("address");

            model.addRow(new Object[]{id, name, fname, age, gender, city, edu, dept, address});
        }

        studentTable.setModel(model);

        rs.close();
        stmt.close();
        conn.close();

    } catch (Exception e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this, "Error loading student data: " + e.getMessage());
    }
}
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        fatherNameLabel = new javax.swing.JLabel();
        fatherNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        checkBoxMale = new javax.swing.JCheckBox();
        checkBoxFemale = new javax.swing.JCheckBox();
        genderLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        educationLabel = new javax.swing.JLabel();
        graduateButton = new javax.swing.JRadioButton();
        underGraduateButton = new javax.swing.JRadioButton();
        cityLabel = new javax.swing.JLabel();
        cityCombo = new javax.swing.JComboBox<>();
        departmentLabel = new javax.swing.JLabel();
        deptCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameLabel.setText("Name");

        fatherNameLabel.setText("F/Name");

        jLabel3.setText("Age");

        submitButton.setText("SUBMIT ");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        checkBoxMale.setText("Male");

        checkBoxFemale.setText("Female");

        genderLabel.setText("Gender");

        addressLabel.setText("Address");

        educationLabel.setText("Education");

        graduateButton.setText("Graduate");
        graduateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graduateButtonActionPerformed(evt);
            }
        });

        underGraduateButton.setText("Under Graduate");

        cityLabel.setText("City");

        cityCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityComboActionPerformed(evt);
            }
        });

        departmentLabel.setText("Department");

        addressTextArea.setColumns(20);
        addressTextArea.setRows(5);
        jScrollPane1.setViewportView(addressTextArea);

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(studentTable);

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
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(educationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(departmentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(fatherNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkBoxMale, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(checkBoxFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(submitButton)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ageField)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(graduateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(underGraduateButton))
                                        .addComponent(fatherNameTextField)
                                        .addComponent(nameTextField)
                                        .addComponent(cityCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(deptCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))))))
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fatherNameLabel)
                            .addComponent(fatherNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkBoxMale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkBoxFemale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(cityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(educationLabel)
                    .addComponent(underGraduateButton)
                    .addComponent(graduateButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departmentLabel)
                    .addComponent(deptCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitButton)
                .addGap(226, 226, 226))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cityComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityComboActionPerformed
        
    }//GEN-LAST:event_cityComboActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        System.out.println("Submit Button Clicked");
        String name = nameTextField.getText();
        String fathersName = fatherNameTextField.getText();
        String age = ageField.getText();
        
        String gender = null ;
        if(checkBoxMale.isSelected()){
            gender = checkBoxMale.getText();
        }
        if(checkBoxFemale.isSelected()){
            gender = checkBoxFemale.getText();
        }
        
        String city = cityCombo.getSelectedItem().toString();
        String dept = deptCombo.getSelectedItem().toString();
        
        String education = null ;
        if(graduateButton.isSelected()){
            education = graduateButton.getText();
        }
        if(underGraduateButton.isSelected()){
            education = underGraduateButton.getText();
        }
        
        String address = addressTextArea.getText();
        
            // Insert into DB
    try {
        Connection conn = db.DBConnection.getConnection();
        String sql = "INSERT INTO student (name, father_name, age, gender, city, education, department, address) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, name);
        stmt.setString(2, fathersName);
        stmt.setInt(3, Integer.parseInt(age));
        stmt.setString(4, gender);
        stmt.setString(5, city);
        stmt.setString(6, education);
        stmt.setString(7, dept);
        stmt.setString(8, address);

        int rowsInserted = stmt.executeUpdate();
        if (rowsInserted > 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Registration Successful!");
        }

        stmt.close();
        conn.close();

    } catch (Exception e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
   
    }//GEN-LAST:event_submitButtonActionPerformed

    private void graduateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graduateButtonActionPerformed
       
    }//GEN-LAST:event_graduateButtonActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JTextField ageField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkBoxFemale;
    private javax.swing.JCheckBox checkBoxMale;
    private javax.swing.JComboBox<String> cityCombo;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel departmentLabel;
    private javax.swing.JComboBox<String> deptCombo;
    private javax.swing.JLabel educationLabel;
    private javax.swing.JLabel fatherNameLabel;
    private javax.swing.JTextField fatherNameTextField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JRadioButton graduateButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTable studentTable;
    private javax.swing.JButton submitButton;
    private javax.swing.JRadioButton underGraduateButton;
    // End of variables declaration//GEN-END:variables
}
