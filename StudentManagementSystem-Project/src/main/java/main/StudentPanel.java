
package main;

import dao.StudentDao;
import daoimpl.StudentDaoImpl;
import model.Department;
import model.Student;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;

public class StudentPanel extends JPanel {

private final JTextField txtId = new JTextField();
private final JTextField txtName = new JTextField();
private final JTextField txtRoll = new JTextField();
private final JTextField txtDeptCode = new JTextField();
private final JTextField txtDeptName = new JTextField();

private final JButton btnAdd = new JButton("Add");
private final JButton btnUpdate = new JButton("Update");
private final JButton btnDelete = new JButton("Delete");
private final JButton btnFind = new JButton("Find");
private final JButton btnRefresh = new JButton("Refresh");
private final JButton btnClear = new JButton("Clear");

private final DefaultTableModel model = new DefaultTableModel(
new Object[]{"ID", "Name", "Roll Number", "Dept Code", "Dept Name"}, 0
) {
@Override public boolean isCellEditable(int row, int column) { return false; }
};
private final JTable table = new JTable(model);

private final StudentDao studentDao = new StudentDaoImpl();

public StudentPanel() {
setLayout(new BorderLayout(10, 10));
add(buildForm(), BorderLayout.NORTH);
add(new JScrollPane(table), BorderLayout.CENTER);
add(buildButtons(), BorderLayout.SOUTH);


hookActions();
loadStudents();
}

private JPanel buildForm() {
JPanel form = new JPanel(new GridBagLayout());
GridBagConstraints c = new GridBagConstraints();
c.insets = new Insets(6,6,6,6);
c.fill = GridBagConstraints.HORIZONTAL;
c.weightx = 1.0;


int r = 0;
c.gridx = 0; c.gridy = r; form.add(new JLabel("Student ID:"), c);
c.gridx = 1; c.gridy = r++; form.add(txtId, c);


c.gridx = 0; c.gridy = r; form.add(new JLabel("Name:"), c);
c.gridx = 1; c.gridy = r++; form.add(txtName, c);


c.gridx = 0; c.gridy = r; form.add(new JLabel("Roll No:"), c);
c.gridx = 1; c.gridy = r++; form.add(txtRoll, c);


c.gridx = 0; c.gridy = r; form.add(new JLabel("Department Code:"), c);
c.gridx = 1; c.gridy = r++; form.add(txtDeptCode, c);


c.gridx = 0; c.gridy = r; form.add(new JLabel("Department Name:"), c);
c.gridx = 1; c.gridy = r++; form.add(txtDeptName, c);


return form;
}

private JPanel buildButtons() {
JPanel p = new JPanel(new FlowLayout(FlowLayout.RIGHT));
p.add(btnAdd);
p.add(btnUpdate);
p.add(btnDelete);
p.add(btnFind);
p.add(btnRefresh);
p.add(btnClear);
return p;
}

private void hookActions() {
btnAdd.addActionListener(this::onAdd);
btnUpdate.addActionListener(this::onUpdate);
btnDelete.addActionListener(this::onDelete);
btnFind.addActionListener(this::onFind);
btnRefresh.addActionListener(e -> loadStudents());
btnClear.addActionListener(e -> clearFields());


table.getSelectionModel().addListSelectionListener(e -> {
if (!e.getValueIsAdjusting() && table.getSelectedRow() != -1) {
int row = table.getSelectedRow();
txtId.setText(String.valueOf(model.getValueAt(row, 0)));
txtName.setText(String.valueOf(model.getValueAt(row, 1)));
txtRoll.setText(String.valueOf(model.getValueAt(row, 2)));
txtDeptCode.setText(String.valueOf(model.getValueAt(row, 3)));
txtDeptName.setText(String.valueOf(model.getValueAt(row, 4)));
}
});
}

private void onAdd(ActionEvent e) {
try {
int id = Integer.parseInt(txtId.getText().trim());
String name = txtName.getText().trim();
String roll = txtRoll.getText().trim();
String code = txtDeptCode.getText().trim();
String dname = txtDeptName.getText().trim();


if (name.isEmpty() || roll.isEmpty() || code.isEmpty() || dname.isEmpty()) {
JOptionPane.showMessageDialog(this, "Please fill all fields.");
return;
}


Department dept = new Department();
dept.setDepartmentCode(code);
dept.setDepartmentName(dname);


Student s = new Student();
s.setStudentId(id);
s.setStudentName(name);
s.setStudentRollNumber(roll);
s.setDepartment(dept);


int rows = studentDao.addStudent(s);
if (rows > 0) {
JOptionPane.showMessageDialog(this, "Student added.");
loadStudents();
clearFields();
} else {
JOptionPane.showMessageDialog(this, "Add failed.");
}
} catch (NumberFormatException ex) {
JOptionPane.showMessageDialog(this, "Student ID must be a number.");
}
}

private void onUpdate(ActionEvent e) {
try {
int id = Integer.parseInt(txtId.getText().trim());
String name = txtName.getText().trim();
String roll = txtRoll.getText().trim();
String code = txtDeptCode.getText().trim();


if (name.isEmpty() || roll.isEmpty() || code.isEmpty()) {
JOptionPane.showMessageDialog(this, "Please fill ID, Name, Roll, Dept Code.");
return;
}


Department dept = new Department();
dept.setDepartmentCode(code); // name not required for update in your DAO


Student s = new Student();
s.setStudentId(id);
s.setStudentName(name);
s.setStudentRollNumber(roll);
s.setDepartment(dept);


int rows = studentDao.updateStudent(s);
if (rows > 0) {
JOptionPane.showMessageDialog(this, "Student updated.");
loadStudents();
} else {
JOptionPane.showMessageDialog(this, "Update failed.");
}
} catch (NumberFormatException ex) {
JOptionPane.showMessageDialog(this, "Student ID must be a number.");
}
}

private void onDelete(ActionEvent e) {
try {
int id = Integer.parseInt(txtId.getText().trim());
int rows = studentDao.deleteStudent(id);
if (rows > 0) {
JOptionPane.showMessageDialog(this, "Student deleted.");
loadStudents();
clearFields();
} else {
JOptionPane.showMessageDialog(this, "Delete failed. ID not found.");
}
} catch (NumberFormatException ex) {
JOptionPane.showMessageDialog(this, "Enter a valid numeric ID to delete.");
}
}

private void onFind(ActionEvent e) {
try {
int id = Integer.parseInt(txtId.getText().trim());
Student s = studentDao.getSingleStudent(id);
if (s != null) {
txtName.setText(s.getStudentName());
txtRoll.setText(s.getStudentRollNumber());
txtDeptCode.setText(s.getDepartment().getDepartmentCode());
txtDeptName.setText(s.getDepartment().getDepartmentName());
} else {
JOptionPane.showMessageDialog(this, "No student found for ID: " + id);
}
} catch (NumberFormatException ex) {
JOptionPane.showMessageDialog(this, "Enter a numeric ID to find.");
}
}

private void loadStudents() {
// Clear table
model.setRowCount(0);
List<Student> list = studentDao.getAllStudents();
for (Student s : list) {
model.addRow(new Object[]{
s.getStudentId(),
s.getStudentName(),
s.getStudentRollNumber(),
s.getDepartment() != null ? s.getDepartment().getDepartmentCode() : "",
s.getDepartment() != null ? s.getDepartment().getDepartmentName() : ""
});
}
}

private void clearFields() {
txtId.setText("");
txtName.setText("");
txtRoll.setText("");
txtDeptCode.setText("");
txtDeptName.setText("");
table.clearSelection();
}






}
