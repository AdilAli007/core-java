
package main;

import dao.DepartmentDao;
import daoimpl.DepartmentDaoImpl;
import model.Department;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;

public class DepartmentPanel extends JPanel {

private final JTextField txtCode = new JTextField();
private final JTextField txtName = new JTextField();


private final JButton btnAdd = new JButton("Add");
private final JButton btnUpdate = new JButton("Update");
private final JButton btnDelete = new JButton("Delete");
private final JButton btnFind = new JButton("Find");
private final JButton btnRefresh = new JButton("Refresh");
private final JButton btnClear = new JButton("Clear");


private final DefaultTableModel model = new DefaultTableModel(
new Object[]{"Dept Code", "Dept Name"}, 0
) {
@Override public boolean isCellEditable(int row, int column) { return false; }
};
private final JTable table = new JTable(model);


private final DepartmentDao departmentDao = new DepartmentDaoImpl();    
    
public DepartmentPanel() {
setLayout(new BorderLayout(10, 10));
add(buildForm(), BorderLayout.NORTH);
add(new JScrollPane(table), BorderLayout.CENTER);
add(buildButtons(), BorderLayout.SOUTH);


hookActions();
loadDepartments();
}

private JPanel buildForm() {
JPanel form = new JPanel(new GridBagLayout());
GridBagConstraints c = new GridBagConstraints();
c.insets = new Insets(6,6,6,6);
c.fill = GridBagConstraints.HORIZONTAL;
c.weightx = 1.0;


int r = 0;
c.gridx = 0; c.gridy = r; form.add(new JLabel("Department Code:"), c);
c.gridx = 1; c.gridy = r++; form.add(txtCode, c);


c.gridx = 0; c.gridy = r; form.add(new JLabel("Department Name:"), c);
c.gridx = 1; c.gridy = r++; form.add(txtName, c);


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
btnRefresh.addActionListener(e -> loadDepartments());
btnClear.addActionListener(e -> clearFields());


table.getSelectionModel().addListSelectionListener(e -> {
if (!e.getValueIsAdjusting() && table.getSelectedRow() != -1) {
int row = table.getSelectedRow();
txtCode.setText(String.valueOf(model.getValueAt(row, 0)));
txtName.setText(String.valueOf(model.getValueAt(row, 1)));
}
});
}

private void onAdd(ActionEvent e) {
String code = txtCode.getText().trim();
String name = txtName.getText().trim();
if (code.isEmpty() || name.isEmpty()) {
JOptionPane.showMessageDialog(this, "Please fill Code and Name.");
return;
}
Department d = new Department();
d.setDepartmentCode(code);
d.setDepartmentName(name);
int rows = departmentDao.addDepartment(d);
if (rows > 0) {
JOptionPane.showMessageDialog(this, "Department added.");
loadDepartments();
clearFields();
} else {
JOptionPane.showMessageDialog(this, "Add failed.");
}
}

private void onUpdate(ActionEvent e) {
String code = txtCode.getText().trim();
String name = txtName.getText().trim();
if (code.isEmpty() || name.isEmpty()) {
JOptionPane.showMessageDialog(this, "Please fill Code and Name.");
return;
}
Department d = new Department();
d.setDepartmentCode(code);
d.setDepartmentName(name);
int rows = departmentDao.updateDepartment(d);
if (rows > 0) {
JOptionPane.showMessageDialog(this, "Department updated.");
loadDepartments();
} else {
JOptionPane.showMessageDialog(this, "Update failed.");
}
}

private void onDelete(ActionEvent e) {
String code = txtCode.getText().trim();
if (code.isEmpty()) {
JOptionPane.showMessageDialog(this, "Enter a Department Code to delete.");
return;
}
int rows = departmentDao.deleteDepartment(code);
if (rows > 0) {
JOptionPane.showMessageDialog(this, "Department deleted.");
loadDepartments();
clearFields();
} else {
JOptionPane.showMessageDialog(this, "Delete failed. Code not found.");
}
}

private void onFind(ActionEvent e) {
String code = txtCode.getText().trim();
if (code.isEmpty()) {
JOptionPane.showMessageDialog(this, "Enter a Department Code to find.");
return;
}
Department d = departmentDao.getSingleDepartment(code);
if (d != null) {
txtCode.setText(d.getDepartmentCode());
txtName.setText(d.getDepartmentName());
} else {
JOptionPane.showMessageDialog(this, "No department found for code: " + code);
}
}

private void loadDepartments() {
model.setRowCount(0);
List<Department> list = departmentDao.getAllDepartment();
for (Department d : list) {
model.addRow(new Object[]{d.getDepartmentCode(), d.getDepartmentName()});
}
}

private void clearFields() {
txtCode.setText("");
txtName.setText("");
table.clearSelection();
}



}
