package P7;

import javax.swing.*;
import java.awt.*;

public class PantallaMeteorologica implements Observador {
    private JFrame frame;
    private JLabel labelCiudad;
    private JLabel labelHora;
    private JLabel labelTemperatura;
    private JLabel labelHumedad;
    private JLabel labelIcono;
    private JLabel labelAlerta;

    public PantallaMeteorologica(String ciudad) {
        frame = new JFrame(ciudad);
        frame.setLayout(null); // Usamos layout nulo para posicionar manualmente los componentes
        frame.setSize(470, 362);

        // Establecer imagen de fondo
        ImageIcon imagenFondo = new ImageIcon("IMG/FONDO.jpg");
        JLabel fondo = new JLabel(imagenFondo);
        fondo.setBounds(0, 0, 470, 362);
        frame.setContentPane(fondo);

        labelCiudad = new JLabel(ciudad, JLabel.CENTER);
        labelCiudad.setForeground(Color.BLACK);
        labelCiudad.setFont(new Font("Arial", Font.BOLD, 38));
        labelCiudad.setBounds(10, 10, 450, 35);
        frame.add(labelCiudad);

        int horaWidth = 100;
        int horaHeight = 56;
        int iconoSize = 60;
        int totalWidth = horaWidth + iconoSize;

        labelHora = new JLabel();
        labelHora.setForeground(Color.BLACK);
        labelHora.setFont(new Font("Arial", Font.BOLD, 35));
        labelHora.setOpaque(true);
        labelHora.setBackground(Color.WHITE);
        labelHora.setBounds((frame.getWidth() - totalWidth) / 2, labelCiudad.getY() + labelCiudad.getHeight() + 10, horaWidth, horaHeight);
        frame.add(labelHora);

        labelIcono = new JLabel();
        int iconoX = labelHora.getX() + horaWidth + 20; // 20 píxeles de espacio entre hora e icono
        labelIcono.setBounds(iconoX, labelHora.getY(), iconoSize, iconoSize);
        frame.add(labelIcono);


        labelTemperatura = new JLabel();
        labelTemperatura.setForeground(Color.BLACK);
        labelTemperatura.setFont(new Font("Arial", Font.BOLD, 18));
        labelTemperatura.setBounds(10, 160, 140, 35);
        frame.add(labelTemperatura);

        labelHumedad = new JLabel();
        labelHumedad.setForeground(Color.BLACK);
        labelHumedad.setFont(new Font("Arial", Font.BOLD, 18));
        labelHumedad.setBounds(300, 160, 140, 35);
        frame.add(labelHumedad);

        labelAlerta = new JLabel();
        labelAlerta.setForeground(Color.RED);
        labelAlerta.setFont(new Font("Arial", Font.BOLD, 18));
        labelAlerta.setBounds(10, 200, 450, 35);
        frame.add(labelAlerta);

        frame.setSize(470, 362);
        frame.setVisible(true);
    }
}
