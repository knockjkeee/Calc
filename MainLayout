package CalcProject;


import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainLayout extends JFrame {

    SettingsSecond st = new SettingsSecond();
    Data dt = new Data();

    public JButton b1, b2, b3, about;
    public JLabel l1, l2, l3, l4, l5, l6, logo, header, lx1, lx2, lx3;
    public JTextField t1, t2, t3, t4, t5, t6;
    public JPanel panel, panel2, panel3;
    public int a, b, c, amout;
    public String q, w, ee;

    public MainLayout() {
        super("Калькулятор");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());
        Font fontHeandler = new Font("Arial Narrow", Font.CENTER_BASELINE, 20);
        Font fontBody = new Font("Arial Narrow", Font.CENTER_BASELINE, 14);
        st.start2();

        logo = new JLabel();
        header = new JLabel("      Расчет стоимости обследования рубежей");
        header.setHorizontalAlignment(JLabel.CENTER);
        header.setFont(fontHeandler);
        header.setForeground(new Color(0xC8D64B));

        panel = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel.setLayout(new BorderLayout());
        panel2.setLayout(null);
        panel3.setLayout(new BorderLayout());

        panel.setBackground(new Color(0x44647F));
        panel2.setBackground(new Color(0xFFFFFF));
        panel3.setBackground(new Color(0xFFFFFF));


        ImageIcon imageIcon = new ImageIcon("//C:\\Users\\PRostov\\Desktop\\logo1.jpg");
        logo.setIcon(imageIcon);
        panel.add(logo, BorderLayout.EAST);
        panel.add(header, BorderLayout.WEST);

        add(panel, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
        add(panel3, BorderLayout.SOUTH);

        TestActionListen eHa = new TestActionListen();

        b1 = new JButton("Рассчитать");
        b1.setFont(fontBody);
        b1.setSize(230, 50);
        b1.setLocation(5, 5);
        b2 = new JButton("Очистить");
        b2.setFont(fontBody);
        b2.setSize(230, 50);
        b2.setLocation(260, 5);
        about = new JButton("В расчет включено:");
        about.setFont(fontBody);

        panel2.add(b1);
        panel2.add(b2);
        panel3.add(about, BorderLayout.EAST);
        about.addActionListener(eHa);
        b2.addActionListener(eHa);
        b1.addActionListener(eHa);

        l1 = new JLabel("Стоимость билетов (Туда-обратно, на 1 человека)");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setFont(fontBody);
        l1.setSize(350, 50);
        l1.setLocation(5, 70);
        l1.setBorder(new LineBorder(Color.BLACK, 1));
        t1 = new JTextField();
        t1.setSize(130, 50);
        t1.setLocation(360, 70);
        t1.setFont(new Font("Arial Narrow", Font.CENTER_BASELINE, 18));
        t1.setBorder(new LineBorder(Color.BLACK, 1));
        t1.setText(st.toStringCashTicketsOneMan());
        t1.setHorizontalAlignment(JLabel.CENTER);
        panel2.add(l1);
        panel2.add(t1);

        l2 = new JLabel("Колличество обследуемых рубежей");
        l2.setHorizontalAlignment(JLabel.CENTER);
        l2.setFont(fontBody);
        l2.setSize(350, 50);
        l2.setLocation(5, 130);
        l2.setBorder(new LineBorder(Color.BLACK, 1));
        t2 = new JTextField();
        t2.setSize(130, 50);
        t2.setLocation(360, 130);
        t2.setFont(new Font("Arial Narrow", Font.CENTER_BASELINE, 18));
        t2.setBorder(new LineBorder(Color.BLACK, 1));
        t2.setText(st.toStringSurveyedMilestonesTotal());
        t2.setHorizontalAlignment(JLabel.CENTER);
        panel2.add(l2);
        panel2.add(t2);

        l3 = new JLabel("Дней на обследование");
        l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setFont(fontBody);
        l3.setSize(350, 50);
        l3.setLocation(5, 190);
        l3.setBorder(new LineBorder(Color.BLACK, 1));
        t3 = new JTextField();
        t3.setSize(130, 50);
        t3.setLocation(360, 190);
        t3.setFont(new Font("Arial Narrow", Font.CENTER_BASELINE, 18));
        t3.setBorder(new LineBorder(Color.BLACK, 1));
        t3.setText(st.toStringDayOnCheck());
        t3.setHorizontalAlignment(JLabel.CENTER);
        panel2.add(l3);
        panel2.add(t3);

        l4 = new JLabel("Требуемое колличество инженеров");
        l4.setHorizontalAlignment(JLabel.CENTER);
        l4.setFont(fontBody);
        l4.setSize(350, 50);
        l4.setLocation(5, 250);
        l4.setBorder(new LineBorder(Color.BLACK, 1));
        lx1 = new JLabel();
        lx1.setSize(130, 50);
        lx1.setLocation(360, 250);
        lx1.setFont(new Font("Arial Narrow", Font.CENTER_BASELINE, 18));
        lx1.setBorder(new LineBorder(Color.BLACK, 1));
        lx1.setHorizontalAlignment(JLabel.CENTER);
        panel2.add(l4);
        panel2.add(lx1);

        l5 = new JLabel("Дней на обследование ФАКТ");
        l5.setHorizontalAlignment(JLabel.CENTER);
        l5.setFont(fontBody);
        l5.setSize(350, 50);
        l5.setLocation(5, 310);
        l5.setBorder(new LineBorder(Color.BLACK, 1));
        lx2 = new JLabel();
        lx2.setSize(130, 50);
        lx2.setLocation(360, 310);
        lx2.setFont(new Font("Arial Narrow", Font.CENTER_BASELINE, 18));
        lx2.setBorder(new LineBorder(Color.BLACK, 1));
        lx2.setHorizontalAlignment(JLabel.CENTER);
        panel2.add(l5);
        panel2.add(lx2);

        l5 = new JLabel("ИТОГО Стоимость обследования");
        l5.setHorizontalAlignment(JLabel.CENTER);
        l5.setFont(fontBody);
        l5.setSize(350, 50);
        l5.setLocation(5, 370);
        l5.setBorder(new LineBorder(Color.BLACK, 1));
        lx3 = new JLabel();
        lx3.setSize(130, 50);
        lx3.setLocation(360, 370);
        lx3.setFont(new Font("Arial Narrow", Font.CENTER_BASELINE, 18));
        lx3.setBorder(new LineBorder(Color.BLACK, 1));
        lx3.setHorizontalAlignment(JLabel.CENTER);
        panel2.add(l5);
        panel2.add(lx3);
    }

    public class TestActionListen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == b1) {

                    a = Integer.parseInt(t1.getText());
                    st.setCashTiketsOneMan(a);
                    b = Integer.parseInt(t2.getText());
                    st.setSurveyedMilestonesTotal(b);
                    c = Integer.parseInt(t3.getText());
                    st.setDayOnCheck(c);

                    System.out.println(st.getCashTiketsOneMan());
                    System.out.println(st.getSurveyedMilestonesTotal());
                    System.out.println(st.getDayOnCheck());

                    dt.start();
                    q = "" + dt.getDayNeed2();
                    w = "" + dt.getNeedDayInJob();
                    ee = "" + dt.getCashOnExpenses() + " руб.";

                    System.out.println(q);
                    System.out.println(w);
                    System.out.println(ee);

                    lx1.setText(q);
                    lx2.setText(w);
                    lx3.setText(ee);
                }
                if (e.getSource() == about) {
                    SettingsLayot st = new SettingsLayot("Настройка");
                    st.setVisible(true);
                }
                if (e.getSource() == b2) {
                    t1.setText(null);
                    t2.setText(null);
                    t3.setText(null);
                    lx1.setText(null);
                    lx2.setText(null);
                    lx3.setText(null);
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Введите число!!!!");
            }
        }
    }


}
