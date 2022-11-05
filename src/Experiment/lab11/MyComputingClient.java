package Experiment.lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author 翟俊华
 * @create 2022.3.2
 */
public class MyComputingClient extends JFrame {
    public static void main(String[] args) {
        MyComputingClient client = new MyComputingClient();
        client.initFrame();
        client.setVisible(true);
    }
    public final int FRAME_X = 400;
    public final int FRAME_Y = 220;
    public final int DEFAULT_WIDTH = 750;
    public final int DEFAULT_HEIGHT = 220;
    public void initFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("计算小程序");
        setBounds(FRAME_X,FRAME_Y,DEFAULT_WIDTH,DEFAULT_HEIGHT);
        setBackground(Color.GRAY);

        //输入模块初始化
        JPanel LeftPanel = new JPanel();
        LeftPanel.setLayout(new FlowLayout(FlowLayout.RIGHT,30,70));
        JPanel RightPanel = new JPanel();
        RightPanel.setLayout(new GridLayout(3,1,10,25));

        JTextField firstNum = new JTextField(6);
        LeftPanel.add(firstNum);

        JComboBox jComboBox = new JComboBox();
        initComboBoxes(jComboBox);
        LeftPanel.add(jComboBox);

        JTextField SecondNum = new JTextField(6);
        LeftPanel.add(SecondNum);

        JLabel EqualLabel = new JLabel(" = ");
        LeftPanel.add(EqualLabel);

        JTextField ResultArea = new JTextField(10);
        LeftPanel.add(ResultArea);
        ResultArea.setEnabled(false);

        //结果及操控区域初始化
        JButton CalButton = new JButton("计算");
        JButton ClearButton = new JButton("清空结果");
        JCheckBox IntOrNot = new JCheckBox("结果取整");
        RightPanel.add(CalButton);
        RightPanel.add(ClearButton);
        RightPanel.add(IntOrNot);

        getContentPane().add(LeftPanel, BorderLayout.WEST);
        getContentPane().add(RightPanel, BorderLayout.EAST);

        CalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ResultArea.setText("");
                Boolean run = true;
                double num1 = Double.parseDouble(firstNum.getText());
                double num2 = Double.parseDouble(SecondNum.getText());
                double result = 0;

                while (run == true){
                    if(firstNum.getText().length()==0||SecondNum.getText().length()==0){
                        System.out.println("请输入运算值!");
                        firstNum.setText("");
                        SecondNum.setText("");
                        continue;
                    }else{
                        if(jComboBox.getSelectedItem().toString()== "+"){
                            result = num1 + num2;
                        }
                        if(jComboBox.getSelectedItem().toString()== "-"){
                            result = num1 - num2;
                        }
                        if(jComboBox.getSelectedItem().toString()== "*"){
                            result = num1 * num2;
                        }
                        if(jComboBox.getSelectedItem().toString() == "/"){
                            result =  num1 / num2;
                        }
                    }
                    ResultArea.setText(String.valueOf(result));
                    run = false;
                }
            }
        });

        ClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNum.setText("");
                SecondNum.setText("");
                ResultArea.setText("");
            }
        });

        IntOrNot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(IntOrNot.isSelected() == true){
                    String result = ResultArea.getText();
                    int i = result.lastIndexOf(".");
                    String show = result.substring(0,i);
                    ResultArea.setText(show);
                }
                IntOrNot.setSelected(false);
            }
        });
    }

    public static void initComboBoxes(JComboBox jComboBox){
        jComboBox.setEnabled(true);
        jComboBox.addItem("+");
        jComboBox.addItem("-");
        jComboBox.addItem("*");
        jComboBox.addItem("/");
    }
}
