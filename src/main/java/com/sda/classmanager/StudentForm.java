/*
 * Created by JFormDesigner on Sun Aug 16 14:07:46 CEST 2020
 */

package com.sda.classmanager;

import java.awt.*;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.*;

/**
 * @author Pawel
 */
public class StudentForm extends JPanel {
    private INewStudentFromSubmittedListener newStudentListener;

    public StudentForm(INewStudentFromSubmittedListener listener) {
        this.newStudentListener = listener;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pawel
        labelHeadlineForm = new JLabel();
        hSpacer1 = new JPanel(null);
        labelName = new JLabel();
        textFieldName = new JTextField();
        labelLastName = new JLabel();
        textFieldLastName = new JTextField();
        labelQuarantined = new JLabel();
        checkQuarantined = new JCheckBox();
        labelYearBorn = new JLabel();
        spinnerYearBorn = new JSpinner();
        labelGender = new JLabel();
        comboGender = new JComboBox();
        vSpacer5 = new JPanel(null);
        buttonSubmit = new JButton();
        vSpacer4 = new JPanel(null);
        vSpacer1 = new JPanel(null);
        vSpacer2 = new JPanel(null);
        vSpacer3 = new JPanel(null);

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
        javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax
        . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
        .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt
        . Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans.
        PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .
        equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new GridLayout(12, 2));

        //---- labelHeadlineForm ----
        labelHeadlineForm.setText("Student Form:");
        labelHeadlineForm.setFont(labelHeadlineForm.getFont().deriveFont(labelHeadlineForm.getFont().getStyle() | Font.BOLD));
        add(labelHeadlineForm);
        add(hSpacer1);

        //---- labelName ----
        labelName.setText("Name:");
        add(labelName);
        add(textFieldName);

        //---- labelLastName ----
        labelLastName.setText("Last name:");
        add(labelLastName);
        add(textFieldLastName);

        //---- labelQuarantined ----
        labelQuarantined.setText("Quarantined:");
        add(labelQuarantined);
        add(checkQuarantined);

        //---- labelYearBorn ----
        labelYearBorn.setText("Year born:");
        add(labelYearBorn);
        add(spinnerYearBorn);

        //---- labelGender ----
        labelGender.setText("Gender");
        add(labelGender);
        add(comboGender);
        add(vSpacer5);

        //---- buttonSubmit ----
        buttonSubmit.setText("Submit");
        add(buttonSubmit);
        add(vSpacer4);
        add(vSpacer1);
        add(vSpacer2);
        add(vSpacer3);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents


        Gender [] genders = Gender.values();
        for(Gender gender : genders) {
            comboGender.addItem(gender);
        }

        //Prepare spinner Year Born                      ..wartosc pocztakowa  minimum      maksimum               skok
        spinnerYearBorn.setModel(new SpinnerNumberModel(LocalDate.now().getYear(), 1920, LocalDate.now().getYear(), 1));

        buttonSubmit.addActionListener(actionEvent -> {
            Student student = new Student();
            student.setName(textFieldName.getText());
            student.setLastName(textFieldLastName.getText());
            student.setQuarantined(checkQuarantined.isSelected());
            student.setYearBorn((Integer) spinnerYearBorn.getValue());
            student.setGender((Gender) comboGender.getSelectedItem());
            if (newStudentListener != null) {
                newStudentListener.studentCreated(student);
            }
        });
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pawel
    private JLabel labelHeadlineForm;
    private JPanel hSpacer1;
    private JLabel labelName;
    private JTextField textFieldName;
    private JLabel labelLastName;
    private JTextField textFieldLastName;
    private JLabel labelQuarantined;
    private JCheckBox checkQuarantined;
    private JLabel labelYearBorn;
    private JSpinner spinnerYearBorn;
    private JLabel labelGender;
    private JComboBox comboGender;
    private JPanel vSpacer5;
    private JButton buttonSubmit;
    private JPanel vSpacer4;
    private JPanel vSpacer1;
    private JPanel vSpacer2;
    private JPanel vSpacer3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
