package P7;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class SeleccionCiudad {
    private JFrame frame;
    private Map<String, JCheckBox> checkBoxes = new HashMap<>();
    private WeatherStackAPI weatherStackAPI;

    public SeleccionCiudad() {
        frame = new JFrame("Seleccionar Ciudades");
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] ciudades = {"Tenerife", "Madrid", "Barcelona", "London", "Chicago", "Sidney", "Osaka", "Berlin", "Paris", "New York"};

        for (String ciudad : ciudades) {
            JCheckBox checkBox = new JCheckBox(ciudad);
            checkBox.setForeground(Color.WHITE);
            checkBox.setFont(new Font("Arial", Font.BOLD, 12));
            checkBox.setBackground(Color.BLACK);
            checkBoxes.put(ciudad, checkBox);
            frame.add(checkBox);
        }

        JButton okButton = new JButton("OK");
        okButton.setBackground(Color.GRAY);
        okButton.setForeground(Color.BLACK);
        okButton.setFont(new Font("Arial", Font.BOLD, 12));
        okButton.addActionListener(e -> procesarSeleccion());
        frame.add(okButton);

        frame.setVisible(true);
    }
}