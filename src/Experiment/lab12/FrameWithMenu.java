package Experiment.lab12;

/**
 * @auther 翟俊华
 * @create 2022.3.2
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import static java.awt.event.InputEvent.CTRL_DOWN_MASK;
import static java.awt.event.KeyEvent.VK_N;
import static java.awt.event.KeyEvent.VK_O;

public class FrameWithMenu extends JFrame {
    public static void main(String[] args) {
        FrameWithMenu frame = new FrameWithMenu();
        frame.setVisible(true);
        showCustomDialog(frame,frame);
    }

    public FrameWithMenu(){
        super();
        setBounds(100, 100, 600, 400);
        setTitle("订制个性化菜单");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /**
         * create a menu
         */
        final JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        final JMenu FileMenu = new JMenu("File");
        final JMenu EditMenu = new JMenu("Edit");

        //创建New菜单
        final JMenuItem newMenu = new JMenuItem("New");
        newMenu.setAccelerator(KeyStroke.getKeyStroke(VK_N, CTRL_DOWN_MASK));//设置快捷键为 Ctrl + N
        final JMenuItem openMenu = new JMenuItem("Open");
        openMenu.setAccelerator(KeyStroke.getKeyStroke(VK_O, CTRL_DOWN_MASK));//设置快捷键为 Ctrl + N
        FileMenu.add(openMenu);
        FileMenu.add(newMenu);

        //创建Edit菜单
        final JMenuItem searchMenu = new JMenuItem("Search");
        final JMenuItem showMenu = new JMenuItem("Show");
        EditMenu.add(searchMenu);
        EditMenu.add(showMenu);

        //添加菜单栏
        menuBar.add(FileMenu);
        menuBar.add(EditMenu);

        showMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {//弹出模式对话框
                JDialog dialog = new JDialog((Dialog) null, "模式弹窗", true);
                dialog.setSize(250,150);
                dialog.setResizable(false);
                dialog.setLocation(275, 220);

                JPanel panelInsideShow = new JPanel(new FlowLayout(1));

                JLabel labelInShow = new JLabel("触发了模式对话框!");
                panelInsideShow.add(labelInShow);
                dialog.add(panelInsideShow,BorderLayout.CENTER);

                dialog.setVisible(true);
            }
        });

        searchMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {//弹出非模式对话框
                JDialog dialog = new JDialog((Dialog) null, "非模式弹窗", false);
                dialog.setSize(250,150);
                dialog.setResizable(false);
                dialog.setLocation(275, 220);

                JPanel panelInsideSearch = new JPanel(new FlowLayout(1));

                JLabel labelInSearch = new JLabel("触发了非模式对话框!");
                panelInsideSearch.add(labelInSearch);
                dialog.add(panelInsideSearch);

                dialog.setVisible(true);
            }
        });

        newMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "您点击了 New 菜单！", "MessageDialog", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        openMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "您点击了 Open 菜单！", "MessageDialog", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        /**
         * create a popupmenu
         */
        JPanel jPanel = new JPanel();

        JLabel label = new JLabel("在任意处单击鼠标右键");
        Font f = new Font("楷体",Font.BOLD,20);
        label.setFont(f);

        JPopupMenu popupMenu = new JPopupMenu();//弹出式菜单
        final JMenuItem newMenu1 = new JMenuItem("New");
        newMenu.setAccelerator(KeyStroke.getKeyStroke(VK_N, CTRL_DOWN_MASK));//设置快捷键为 Ctrl + N
        final JMenuItem openMenu1 = new JMenuItem("Open");
        openMenu.setAccelerator(KeyStroke.getKeyStroke(VK_O, CTRL_DOWN_MASK));//设置快捷键为 Ctrl + N
        popupMenu.add(openMenu1);
        popupMenu.add(newMenu1);

        //MouseListener必须要实现所有接口,MouseAdapter是类（该方法主体是空的，但实现了MouseListener接口）
        getContentPane().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if(e.isPopupTrigger())
                    popupMenu.show(e.getComponent(),e.getX(),e.getY());
            }
        });

        //创建工具栏
        JToolBar jToolBar = new JToolBar(JToolBar.HORIZONTAL);
        JButton newButton = new JButton("New");
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "您点击了 New 按钮！", "MessageDialog", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JButton openButton = new JButton("Open");
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "您点击了 Open 按钮！", "MessageDialog", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        jToolBar.add(newButton);
        jToolBar.add(openButton);

        //创建列表并放入滑动面板
        JScrollPane scrollPane = new JScrollPane();
        String[] columNames = {"姓名", "学号"};
        String[][] tableValues = {{"张三", "15h001"},{"李四", "15h002"}};
        JTable table = new JTable(tableValues, columNames);
        scrollPane.add(table);
        scrollPane.setViewportView(table);


        getContentPane().add(scrollPane);
        jPanel.add(jToolBar,BorderLayout.WEST);
        jPanel.add(label, BorderLayout.CENTER);
        getContentPane().add(jPanel,BorderLayout.SOUTH);
    }

    private static void showCustomDialog(Frame owner, Component parentComponent) {
        // 创建一个模态对话框
        final JDialog dialog = new JDialog(owner, "Message", true);
        // 设置对话框的宽高
        dialog.setSize(250, 90);
        // 设置对话框大小不可改变
        dialog.setResizable(false);
        // 设置对话框相对显示的位置
        dialog.setLocationRelativeTo(parentComponent);

        // 创建一个标签显示消息内容
        JLabel messageLabel = new JLabel("程序已开始运行");

        // 创建一个按钮用于关闭对话框
        JButton okBtn = new JButton("确定");
        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 关闭对话框
                dialog.dispose();
            }
        });

        // 创建对话框的内容面板, 在面板内可以根据自己的需要添加任何组件并做任意是布局
        JPanel panel = new JPanel();

        // 添加组件到面板
        panel.add(messageLabel);
        panel.add(okBtn);

        // 设置对话框的内容面板
        dialog.setContentPane(panel);
        // 显示对话框
        dialog.setVisible(true);
    }
}

