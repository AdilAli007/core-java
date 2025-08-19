
package main;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame {
public MainFrame() {
super("Student Management - Swing UI");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setMinimumSize(new Dimension(960, 600));
setLocationRelativeTo(null);


JTabbedPane tabs = new JTabbedPane();
tabs.addTab("Students", new StudentPanel());
tabs.addTab("Departments", new DepartmentPanel());


setLayout(new BorderLayout());
add(tabs, BorderLayout.CENTER);
}
}
