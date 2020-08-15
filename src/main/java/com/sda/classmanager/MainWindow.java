/*
 * Created by JFormDesigner on Sat Aug 15 14:22:57 CEST 2020
 */

package com.sda.classmanager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.*;

/**
 * @author unknown
 */
public class MainWindow extends JFrame implements ActionListener{
    public MainWindow() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pawel
        panel1 = new JPanel();
        labelHeadlineForm = new JLabel();
        hSpacer1 = new JPanel(null);
        labelName = new JLabel();
        textFieldName = new JTextField();
        labelLastName = new JLabel();
        textFieldLastName = new JTextField();
        labelQuarantined = new JLabel();
        checkQuarantined = new JCheckBox();
        labelGender = new JLabel();
        comboGender = new JComboBox();
        labelYearBorn = new JLabel();
        spinnerYearBorn = new JSpinner();
        vSpacer5 = new JPanel(null);
        buttonSubmit = new JButton();
        vSpacer4 = new JPanel(null);
        vSpacer1 = new JPanel(null);
        vSpacer2 = new JPanel(null);
        vSpacer3 = new JPanel(null);
        panel2 = new JPanel();
        labelResult = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(1, 2));

        //======== panel1 ========
        {
            panel1.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border
            .EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax. swing .border . TitledBorder. CENTER ,javax
            . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,
            12 ) ,java . awt. Color .red ) ,panel1. getBorder () ) ); panel1. addPropertyChangeListener( new java. beans
            .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "bord\u0065r" .equals ( e.
            getPropertyName () ) )throw new RuntimeException( ) ;} } );
            panel1.setLayout(new GridLayout(12, 3, 1, 1));

            //---- labelHeadlineForm ----
            labelHeadlineForm.setText("Student Form:");
            labelHeadlineForm.setFont(labelHeadlineForm.getFont().deriveFont(labelHeadlineForm.getFont().getStyle() | Font.BOLD));
            panel1.add(labelHeadlineForm);
            panel1.add(hSpacer1);

            //---- labelName ----
            labelName.setText("Name:");
            panel1.add(labelName);
            panel1.add(textFieldName);

            //---- labelLastName ----
            labelLastName.setText("Last name:");
            panel1.add(labelLastName);
            panel1.add(textFieldLastName);

            //---- labelQuarantined ----
            labelQuarantined.setText("Quarantined:");
            panel1.add(labelQuarantined);
            panel1.add(checkQuarantined);

            //---- labelGender ----
            labelGender.setText("Gender");
            panel1.add(labelGender);
            panel1.add(comboGender);

            //---- labelYearBorn ----
            labelYearBorn.setText("Year born:");
            panel1.add(labelYearBorn);
            panel1.add(spinnerYearBorn);
            panel1.add(vSpacer5);

            //---- buttonSubmit ----
            buttonSubmit.setText("Submit");
            panel1.add(buttonSubmit);
            panel1.add(vSpacer4);
            panel1.add(vSpacer1);
            panel1.add(vSpacer2);
            panel1.add(vSpacer3);
        }
        contentPane.add(panel1);

        //======== panel2 ========
        {
            panel2.setLayout(new GridLayout(1, 1));

            //---- labelResult ----
            labelResult.setText("text");
            panel2.add(labelResult);
        }
        contentPane.add(panel2);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        //Prepare Combobox with available options (Genders)
        Gender [] genders = Gender.values();
        for(Gender gender : genders) {
            comboGender.addItem(gender);
        }

        //Prepare spinner Year Born                      ..wartosc pocztakowa  minimum      maksimum               skok
        spinnerYearBorn.setModel(new SpinnerNumberModel(LocalDate.now().getYear(), 1920, LocalDate.now().getYear(), 1));

        buttonSubmit.addActionListener(this);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pawel
    private JPanel panel1;
    private JLabel labelHeadlineForm;
    private JPanel hSpacer1;
    private JLabel labelName;
    private JTextField textFieldName;
    private JLabel labelLastName;
    private JTextField textFieldLastName;
    private JLabel labelQuarantined;
    private JCheckBox checkQuarantined;
    private JLabel labelGender;
    private JComboBox comboGender;
    private JLabel labelYearBorn;
    private JSpinner spinnerYearBorn;
    private JPanel vSpacer5;
    private JButton buttonSubmit;
    private JPanel vSpacer4;
    private JPanel vSpacer1;
    private JPanel vSpacer2;
    private JPanel vSpacer3;
    private JPanel panel2;
    private JLabel labelResult;


    // JFormDesigner - End of variables declaration  //GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        Student student = new Student();
        student.setName(textFieldName.getText());
        student.setLastName(textFieldLastName.getText());
        student.setQuarantined(checkQuarantined.isSelected());
        student.setYearBorn((Integer) spinnerYearBorn.getValue());
        student.setGender((Gender) comboGender.getSelectedItem());

       // System.out.println(student);

        labelResult.setText(student.toString());
    }
}