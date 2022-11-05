package Experiment.lab11;

import javax.swing.*;
import java.awt.*;

/**
 * @author 翟俊华
 * @create 2022.3.2
 */
public class MyGUI_Frame extends JFrame {
    public static void main(String[] args) {
        MyGUI_Frame frame = new MyGUI_Frame();
        frame.initFrame();
        frame.setVisible(true);
    }
    public static int DEFAULT_WIDTH = 1200;
    public static int DEFAULT_HEIGHT = 100;
    public void initFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("21H3翟俊华 lab 11");
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        setLayout(new FlowLayout(1,10,10));

        JButton jButton1 = new JButton("按钮1");
        getContentPane().add(jButton1);

        JButton jButton2 = new JButton("红色按钮");
        jButton2.setBackground(Color.red);
        getContentPane().add(jButton2);

        JLabel jLabel = new JLabel("我是谁");
        getContentPane().add(jLabel);

        JRadioButton jRadioButton1 = new JRadioButton("单选1");
        JRadioButton jRadioButton2 = new JRadioButton("单选2");
        ButtonGroup group = new ButtonGroup();
        group.add(jRadioButton2);
        group.add(jRadioButton1);
        getContentPane().add(jRadioButton1);
        getContentPane().add(jRadioButton2);

        JCheckBox jCheckBox1 = new JCheckBox("复选框1");
        JCheckBox jCheckBox2 = new JCheckBox("复选框2");
        getContentPane().add(jCheckBox1);
        getContentPane().add(jCheckBox2);

        JComboBox jComboBox = new JComboBox();
        jComboBox.setEnabled(true);
        jComboBox.addItem("专科生");
        jComboBox.addItem("本科生");
        jComboBox.addItem("研究生");
        jComboBox.addItem("博士生");
        getContentPane().add(jComboBox);


        DefaultListModel listModel = new DefaultListModel();
        listModel.addElement("中国");
        listModel.addElement("美国");
        listModel.addElement("巴基斯坦");
        JList jList= new JList(listModel);
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jList.setSelectedIndex(0);
        getContentPane().add(jList);

        JTextField jTextField = new JTextField("我是计量人", 15);
        getContentPane().add(jTextField);

        JPasswordField jPasswordField = new JPasswordField(10);
        jPasswordField.setText("Default Password");
        getContentPane().add(jPasswordField);

        JTextArea jTextArea = new JTextArea("JTextArea");
        getContentPane().add(jTextArea);
    }
}
