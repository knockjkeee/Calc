package CalcProject;


import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FrameMain extends JFrame {
    //////////////////////////////////////////////FRAME/////////////////////////////////////////////////////////////////////
    public JButton b1, b2, about;
    public JLabel l1, l2, l3, l4, l5, l6, logo, header, lx1, lx2, lx3;
    public JTextField t1, t2, t3;
    public JPanel panel, panel2, panel3;
    public int a, b, c;
    public String q, w, ee;

    ///////////////////////////////////////DATA/////////////////////////////////////////////////////////////////////////////
    public int accommodationHomeInDayOneMan, transferInHotel, transferInAirport, moneyEngineerOneDay, travelingExpenses, MilestonesOnMan,
            dayInBusinessTripOnMan, dayInBusinessTripOnMan2, cashRoadAndTransfer, cashCarOnManInDay, markinDay, needBrigade, dayNeed,
            dayTotal, inTotalExpenses, intSurveyedMilestonesTotal, intDayOnCheck, intCashTicketsOneMan, needDayInJob1, cashOnExpenses1;
    public double d, d1, needDayInJobTest, needMans, needMans1,needMans2, test;
    private int dayNeed2, needDayInJob, cashOnExpenses;

    public int getDayNeed2() {
        return dayNeed2;
    }

    public void setDayNeed2(int dayNeed2) {
        this.dayNeed2 = dayNeed2;
    }

    public int getNeedDayInJob() {
        return needDayInJob;
    }

    public void setNeedDayInJob(int needDayInJob) {
        this.needDayInJob = needDayInJob;
    }

    public int getCashOnExpenses() {
        return cashOnExpenses;
    }

    public void setCashOnExpenses(int cashOnExpenses) {
        this.cashOnExpenses = cashOnExpenses;
    }

    ////////////////////////////////////////SETTINGS////////////////////////////////////////////////////////////////////////
    private int dayOnCheck; //Дней на обследование
    private int surveyedMilestonesTotal; //Колличество обследуемых рубежей
    private int cashTicketsOneMan; //Стомость билетов  (на человека, туда-обратно)

    public int getCashTiketsOneMan() {
        return cashTicketsOneMan;
    }

    public void setCashTiketsOneMan(int cashTiketsOneMan) {
        this.cashTicketsOneMan = cashTiketsOneMan;
    }

    public int getDayOnCheck() {
        return dayOnCheck;
    }

    public void setDayOnCheck(int dayOnCheck) {
        this.dayOnCheck = dayOnCheck;
    }

    public int getSurveyedMilestonesTotal() {
        return surveyedMilestonesTotal;
    }

    public void setSurveyedMilestonesTotal(int surveyedMilestonesTotal) {
        this.surveyedMilestonesTotal = surveyedMilestonesTotal;
    }

    public String toStringSurveyedMilestonesTotal() {
        return "" + getSurveyedMilestonesTotal();
    }

    public String toStringDayOnCheck() {
        return "" + getDayOnCheck();
    }

    public String toStringCashTicketsOneMan() {
        return "" + getCashTiketsOneMan() + " руб.";
    }

    public FrameMain() {
        super("Калькулятор");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());
        Font fontHeandler = new Font("Arial Narrow", Font.CENTER_BASELINE, 20);
        Font fontBody = new Font("Arial Narrow", Font.CENTER_BASELINE, 14);
        TestActionListen eHa = new TestActionListen();


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
//        panel3.setBackground(new Color(0x44647F));

//        ImageIcon imageIcon = new ImageIcon("//C:\\Users\\PRostov\\Desktop\\logo1.jpg");
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("logo1.jpg"));

        logo.setIcon(imageIcon);
        panel.add(logo, BorderLayout.EAST);
        panel.add(header, BorderLayout.WEST);

        add(panel, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
        add(panel3, BorderLayout.SOUTH);

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
        t1.setText(toStringCashTicketsOneMan());
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
        t2.setText(toStringSurveyedMilestonesTotal());
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
        t3.setText(toStringDayOnCheck());
        t3.setHorizontalAlignment(JLabel.CENTER);
        panel2.add(l3);
        panel2.add(t3);

        l4 = new JLabel("Требуемое колличество инженеров");
        l4.setHorizontalAlignment(JLabel.CENTER);
        l4.setFont(fontBody);
        l4.setSize(350, 50);
        l4.setLocation(5, 250);
        l4.setBorder(new LineBorder(Color.BLACK, 1));
        l4.setOpaque(true);
        l4.setBackground(new Color(0x44647F));
        l4.setForeground(new Color(0xC8D64B));
        lx1 = new JLabel();
        lx1.setSize(130, 50);
        lx1.setLocation(360, 250);
        lx1.setFont(new Font("Arial Narrow", Font.CENTER_BASELINE, 18));
        lx1.setBorder(new LineBorder(Color.BLACK, 1));
        lx1.setHorizontalAlignment(JLabel.CENTER);
        lx1.setOpaque(true);
        lx1.setBackground(new Color(0x44647F));
        lx1.setForeground(new Color(0xC8D64B));
        panel2.add(l4);
        panel2.add(lx1);

        l5 = new JLabel("Дней на обследование ФАКТ");
        l5.setHorizontalAlignment(JLabel.CENTER);
        l5.setFont(fontBody);
        l5.setSize(350, 50);
        l5.setLocation(5, 310);
        l5.setBorder(new LineBorder(Color.BLACK, 1));
        l5.setOpaque(true);
        l5.setBackground(new Color(0x44647F));
        l5.setForeground(new Color(0xC8D64B));
        lx2 = new JLabel();
        lx2.setSize(130, 50);
        lx2.setLocation(360, 310);
        lx2.setFont(new Font("Arial Narrow", Font.CENTER_BASELINE, 18));
        lx2.setBorder(new LineBorder(Color.BLACK, 1));
        lx2.setHorizontalAlignment(JLabel.CENTER);
        lx2.setOpaque(true);
        lx2.setBackground(new Color(0x44647F));
        lx2.setForeground(new Color(0xC8D64B));
        panel2.add(l5);
        panel2.add(lx2);

        l6 = new JLabel("ИТОГО Стоимость обследования");
        l6.setHorizontalAlignment(JLabel.CENTER);
        l6.setFont(fontBody);
        l6.setSize(350, 50);
        l6.setLocation(5, 370);
        l6.setBorder(new LineBorder(Color.BLACK, 1));
        l6.setOpaque(true);
        l6.setBackground(new Color(0x44647F));
        l6.setForeground(new Color(0xC8D64B));
        lx3 = new JLabel();
        lx3.setSize(130, 50);
        lx3.setLocation(360, 370);
        lx3.setFont(new Font("Arial Narrow", Font.CENTER_BASELINE, 18));
        lx3.setBorder(new LineBorder(Color.BLACK, 1));
        lx3.setHorizontalAlignment(JLabel.CENTER);
        lx3.setOpaque(true);
        lx3.setBackground(new Color(0x44647F));
        lx3.setForeground(new Color(0xC8D64B));
        panel2.add(l6);
        panel2.add(lx3);
    }

    public class TestActionListen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == b1) {
                    a = Integer.parseInt(t1.getText());
                    setCashTiketsOneMan(a);
                    b = Integer.parseInt(t2.getText());
                    setSurveyedMilestonesTotal(b);
                    c = Integer.parseInt(t3.getText());
                    setDayOnCheck(c);
                    if (getSurveyedMilestonesTotal() < getDayOnCheck()) {
                        JOptionPane.showMessageDialog(null, "Колличество рубежей должно быть больше колличества дней на обследование!!!!");
                    }
                    intCashTicketsOneMan = getCashTiketsOneMan();
                    intSurveyedMilestonesTotal = getSurveyedMilestonesTotal();
                    intDayOnCheck = getDayOnCheck();

                    // изменяемые переменные
                    accommodationHomeInDayOneMan = 4500; //Стоимость проживания (на человека, сутки)
                    transferInHotel = 1000; //Трансфер в гостиницу
                    transferInAirport = 1000; //Трансфер в аэропорт
                    moneyEngineerOneDay = 6000; //Зарплата сотрудника - Инженера (за сутки)
                    travelingExpenses = 700; //Командировочные
                    MilestonesOnMan = 10; //Колличество рубежей в день на человека
                    dayInBusinessTripOnMan = accommodationHomeInDayOneMan + moneyEngineerOneDay + travelingExpenses; //День прибывания в командировке на человека
                    dayInBusinessTripOnMan2 = dayInBusinessTripOnMan; //День прибывания в командировке на человека 2 графа
                    cashRoadAndTransfer = intCashTicketsOneMan + transferInAirport + transferInHotel; //Стоимость дороги с трансфером
                    cashCarOnManInDay = 3000; //Расходы на 1-2 человека в день (транспорт)
                    d = intSurveyedMilestonesTotal / intDayOnCheck;

                    markinDay = (int) Math.ceil(d); //рубежей в день
                    needMans1 = d / MilestonesOnMan;
                    needMans = Math.ceil(needMans1);
                    d1 = needMans * 2;
                    needBrigade = (int) Math.ceil(d1);

                    dayNeed = 0;
                    if (needBrigade > 8) {
                        dayNeed = needBrigade + 8 - needBrigade;
                    } else {
                        dayNeed = needBrigade;
                    }
                    setDayNeed2(dayNeed);
                    dayNeed2 = dayNeed;/** вывод требуемое колличество инженеров*/
                    dayTotal = dayNeed2 / 2 * MilestonesOnMan;
                    needDayInJobTest = 0;
                    if (needBrigade > 8) {
                        needDayInJobTest = (double) intSurveyedMilestonesTotal / (double) dayTotal;
                    } else {
                        needDayInJobTest = (double) intSurveyedMilestonesTotal / (double) dayTotal;
                    }
                    needDayInJob1 = (int) Math.ceil(needDayInJobTest); /**Вывод Дней в JFrame "Дней реально"*/
                    setNeedDayInJob(needDayInJob1);
                    inTotalExpenses = (needDayInJob1 * cashCarOnManInDay) + (needDayInJob1 * dayInBusinessTripOnMan) + (dayInBusinessTripOnMan2 * 2); //ИТОГО Вывод  в JFrame
                    cashOnExpenses1 = (inTotalExpenses * needBrigade) + (cashRoadAndTransfer * needBrigade); /**Вывод в JFrame Затрат TOTAL*/
                    setCashOnExpenses(cashOnExpenses1);

                    q = "" + getDayNeed2();
                    w = "" + getNeedDayInJob();
                    ee = "" + getCashOnExpenses() + " руб.";
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





