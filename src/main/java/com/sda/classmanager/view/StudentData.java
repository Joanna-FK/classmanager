/*
 * Created by JFormDesigner on Sun Aug 16 15:35:55 CEST 2020
 */

package com.sda.classmanager.view;

import com.sda.classmanager.interfaces.IStudentRemovedListener;
import com.sda.classmanager.model.Gender;
import com.sda.classmanager.model.Student;

import java.awt.*;
import java.time.LocalDate;
import javax.swing.*;

/**
 * @author Pawel
 */
public class StudentData extends JPanel {
    private IStudentRemovedListener studentRemovedListener;
    private Student selectedStudent;

    public StudentData(IStudentRemovedListener listener) {
        this.studentRemovedListener = listener;
        initComponents();

        Gender[] genders = Gender.values();
        for (Gender gender : genders) {
            comboGender.addItem(gender);
        }

        //Prepare spinner Year Born                      ..wartosc pocztakowa  minimum      maksimum               skok
        spinnerYearBorn.setModel(new SpinnerNumberModel(LocalDate.now().getYear(), 1920, LocalDate.now().getYear(), 1));
        buttonDelete.addActionListener(actionEvent -> {
            if (studentRemovedListener != null) {
                studentRemovedListener.studentRemoved(selectedStudent);
            }
        });
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
        labelYearBorn = new JLabel();
        spinnerYearBorn = new JSpinner();
        labelGender = new JLabel();
        comboGender = new JComboBox();
        labelQuarantined = new JLabel();
        checkQuarantined = new JCheckBox();
        buttonSave = new JButton();
        buttonDelete = new JButton();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .
        EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e" , javax. swing .border . TitledBorder. CENTER ,javax . swing
        . border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069al\u006fg", java .awt . Font. BOLD ,12 ) ,
        java . awt. Color .red ) , getBorder () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( )
        { @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062or\u0064er" .equals ( e. getPropertyName () ) )
        throw new RuntimeException( ) ;} } );
        setLayout(new GridLayout(7, 2));

        //---- labelHeadlineForm ----
        labelHeadlineForm.setText("Student Data:");
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

        //---- labelYearBorn ----
        labelYearBorn.setText("Year born:");
        add(labelYearBorn);
        add(spinnerYearBorn);

        //---- labelGender ----
        labelGender.setText("Gender");
        add(labelGender);
        add(comboGender);

        //---- labelQuarantined ----
        labelQuarantined.setText("Quarantined:");
        add(labelQuarantined);
        add(checkQuarantined);

        //---- buttonSave ----
        buttonSave.setText("Save");
        add(buttonSave);

        //---- buttonDelete ----
        buttonDelete.setText("Delete");
        add(buttonDelete);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pawel
    private JLabel labelHeadlineForm;
    private JPanel hSpacer1;
    private JLabel labelName;
    private JTextField textFieldName;
    private JLabel labelLastName;
    private JTextField textFieldLastName;
    private JLabel labelYearBorn;
    private JSpinner spinnerYearBorn;
    private JLabel labelGender;
    private JComboBox comboGender;
    private JLabel labelQuarantined;
    private JCheckBox checkQuarantined;
    private JButton buttonSave;
    private JButton buttonDelete;

    public void setData(Student zaznaczonyStudent) {
        selectedStudent = zaznaczonyStudent;

        labelName.setText(zaznaczonyStudent.getName());
        labelLastName.setText(zaznaczonyStudent.getName());
        spinnerYearBorn.setValue(zaznaczonyStudent.getYearBorn());

        checkQuarantined.setSelected(zaznaczonyStudent.isQuarantined());
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
