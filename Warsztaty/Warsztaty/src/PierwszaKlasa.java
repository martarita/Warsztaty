import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PierwszaKlasa {


    public static void main(String[] args) {
        JFrame frame = new JFrame("Naucz się programowania!");

        JLabel lbl_info = new JLabel("");
        lbl_info.setBounds(20, 20, 200, 20);
        JLabel lbl_Name = new JLabel("Imię");
        lbl_Name.setBounds(20, 50, 200, 20);
        JLabel lbl_Last = new JLabel("Nazwisko");
        lbl_Last.setBounds(20, 110, 200, 20);
        JLabel lbl_Mail = new JLabel("E-mail");
        lbl_Mail.setBounds(20, 170, 200, 20);
        JLabel lbl_Phone = new JLabel("Telefon");
        lbl_Phone.setBounds(20, 230, 200, 20);
        JLabel lbl_Gender = new JLabel("Płeć");
        lbl_Gender.setBounds(20, 290, 200, 20);

        JLabel lbl_jakie_znasz = new JLabel("Jakie znasz języki programowania?");
        lbl_jakie_znasz.setBounds(400, 50, 300, 20);
        JLabel lbl_jezyk = new JLabel("Wybierz poziom języka angielskiego");
        lbl_jezyk.setBounds(400, 180, 300, 20);
        JLabel lbl_kurs = new JLabel("Wybierz kurs programowania");
        lbl_kurs.setBounds(400, 300, 300, 20);

JPanel to_biale =new JPanel();
to_biale.setBounds(800, 20, 300,200);
to_biale.setBackground(Color.white);

        frame.add(lbl_info);
        frame.add(lbl_Name);
        frame.add(lbl_Last);
        frame.add(lbl_Mail);
        frame.add(lbl_Phone);
        frame.add(lbl_Gender);
        frame.add(lbl_jakie_znasz);
        frame.add(lbl_jezyk);
        frame.add(lbl_kurs);
frame.add(to_biale);
        JTextField tf_Name = new JTextField();
        tf_Name.setBounds(20, 80, 100, 20);
        JTextField tf_Last = new JTextField();
        tf_Last.setBounds(20, 140, 100, 20);
        JTextField tf_Mail = new JTextField();
        tf_Mail.setBounds(20, 200, 100, 20);
        JTextField tf_Phone = new JTextField();
        tf_Phone.setBounds(20, 260, 100, 20);
        frame.add(tf_Name);
        frame.add(tf_Last);
        frame.add(tf_Mail);
        frame.add(tf_Phone);


        JRadioButton rb_female = new JRadioButton("Kobieta");
        rb_female.setBounds(20, 320, 100, 20);
        JRadioButton rb_male = new JRadioButton("Mężczyzna");
        rb_male.setBounds(20, 350, 150, 20);
        ButtonGroup bg_gender = new ButtonGroup();
        ButtonGroup bg_jezyk = new ButtonGroup();


        JRadioButton rb_podstawowy = new JRadioButton("podstawowy");
        rb_podstawowy.setBounds(400, 210, 150, 20);
        JRadioButton rb_srednio = new JRadioButton("średnio-zaawansowany");
        rb_srednio.setBounds(400, 240, 300, 20);

        JRadioButton rb_zaawansowany = new JRadioButton("zaawansowany");
        rb_zaawansowany.setBounds(400, 270, 300, 20);


        JCheckBox cb_java = new JCheckBox("Java");
        cb_java.setBounds(400, 80, 100, 20);
        JCheckBox cb_python = new JCheckBox("Python");
        cb_python.setBounds(400, 110, 100, 20);
        JCheckBox cb_inne = new JCheckBox("inne");
        cb_inne.setBounds(400, 140, 100, 20);

        String[] kursy= {"Beck-end Developer","Android"};
   JComboBox kurs = new JComboBox(kursy);
           kurs.setBounds(400,330, 300, 20);




//dodanie radio buttonów do grupy
        bg_gender.add(rb_female);
        bg_gender.add(rb_male);

        bg_jezyk.add(rb_podstawowy);
        bg_jezyk.add(rb_srednio);
        bg_jezyk.add(rb_zaawansowany);


        frame.add(rb_female);
        frame.add(rb_male);
        frame.add(rb_podstawowy);
        frame.add(rb_srednio);
        frame.add(rb_zaawansowany);


        frame.add(cb_java);
        frame.add(cb_python);
        frame.add(cb_inne);

        frame.add(kurs);

        JButton btn_send = new JButton("Zapisz");
        btn_send.setBounds(20, 380, 100, 20);
        JButton btn_exit = new JButton("Wyjdź");
        btn_exit.setBounds(150, 380, 100, 20);
        frame.add(btn_send);
        frame.add(btn_exit);


//obsługa zdarzen
        btn_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        btn_send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Zapis do bazy danych");
                System.out.println(tf_Name.getText());
                System.out.println(tf_Last.getText());
                System.out.println(tf_Mail.getText());
                System.out.println(tf_Phone.getText());

                if (rb_female.isSelected()) {
                    System.out.println("Woman");
                } else if (rb_male.isSelected()) {
                    System.out.println("Man");
                } else {
                    System.out.println("B/D");

                }


                if (cb_java.isSelected() || cb_python.isSelected() || cb_inne.isSelected()) {
                    if (cb_java.isSelected()) {
                        System.out.println("Java");
                    }
                    if (cb_python.isSelected()) {
                        System.out.println("Python");
                    }
                    if (cb_inne.isSelected()) {
                        System.out.println("inne");
                    }
                } else {
                    System.out.println("B/D");
                }


                if (rb_podstawowy.isSelected()) {
                    System.out.println("Podstawowy");
                } else if (rb_srednio.isSelected()) {
                    System.out.println("Średnio-zaawansowany");}
                    else if (rb_zaawansowany.isSelected()) {
                        System.out.println("Zaawansowany");
                    } else {
                        System.out.println("B/D");

                    }


                System.out.println(kurs.getSelectedItem());
                    lbl_info.setText("Dziękujeny za wyp formularza");
                }
            }


            );



        frame.setSize(1120,500);
        frame.setLayout(null);
        frame.setVisible(true);
        }
    }
