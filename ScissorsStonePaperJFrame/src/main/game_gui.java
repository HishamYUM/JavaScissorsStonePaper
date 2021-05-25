/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Ariunbuyan
 */
public class game_gui {
    
    protected JFrame f;

    protected JButton haich, chuluu, daawuu, user, com, time, quit;
    protected JLabel weapons, choose_weapon, com_weapon, result;
    protected Random rand;
    protected int com_too;
    protected int humanWon, comWon, tie;
    protected String weapon_ner[] = {"","../images/com_rock.jpg", "../images/com_paper.jpg", "../images/com_scissors.jpg"};
    protected JPanel background;
    protected JLabel emotion;

    public game_gui() {
        rand = new Random();
        f = new JFrame();
        f.setLayout(null);
        background = new JPanel();
        background.setLayout(null);
        background.setBackground(new Color(0, 255, 255));
        weapons = new JLabel("Та зэвсгээ сонгоно уу.");
        weapons.setForeground(new Color(255, 127, 80));
        weapons.setBounds(80, 20, 200, 20);
        background.add(weapons);

        haich = new JButton(new ImageIcon(getClass().getResource("../images/human_scissors.jpg")));
        haich.setBounds(100, 50, 50, 87);
        haich.setContentAreaFilled(false); // Button bhq dolgono.
        haich.setBorder(null); // Border Huree

        chuluu = new JButton(new ImageIcon(getClass().getResource("../images/human_rock.jpg")));
        chuluu.setBounds(230, 50, 55, 87);
        chuluu.setContentAreaFilled(false);
        chuluu.setBorder(null);

        daawuu = new JButton(new ImageIcon(getClass().getResource("../images/human_paper.jpg")));
        daawuu.setBounds(350, 50, 55, 87);
        daawuu.setContentAreaFilled(false);
        daawuu.setBorder(null);

        choose_weapon = new JLabel("Таны зэвсэг: ");
        choose_weapon.setForeground(Color.yellow);
        choose_weapon.setBounds(100, 180, 100, 20);

        com_weapon = new JLabel("Компьютерийн зэвсэг: ");
        com_weapon.setForeground(Color.yellow);
        com_weapon.setBounds(300, 180, 250, 20);

        time = new JButton();
        time.setFont(new Font("Times New Roman", Font.BOLD, 15));
        time.setBounds(400, 10, 100, 30);

        user = new JButton();
        user.setBounds(115, 210, 65, 90);
        user.setContentAreaFilled(false);
        user.setBorder(null);

        com = new JButton();
        com.setBounds(315, 210, 65, 90);
        com.setContentAreaFilled(false);
        com.setBorder(null);

        result = new JLabel();
        result.setFont(new Font("Arial", Font.BOLD, 20));
        result.setBounds(80, 380, 150, 20);
        result.setForeground(new Color(0, 255, 0));

        emotion = new JLabel();
        emotion.setBounds(230, 365, 98, 48);

        quit = new JButton();
        quit.setText("QUIT");
        quit.setBounds(400, 380, 100, 30);
        quit.setForeground(new Color(0, 250, 0));

        background.add(emotion);
        background.add(result);
        background.add(quit);
        background.add(com);
        background.add(choose_weapon);
        background.add(com_weapon);
        background.add(haich);
        background.add(chuluu);
        background.add(daawuu);
        background.add(user);
        background.add(time);
        background.setBounds(0, 0, 600, 500);
        f.add(background);
        f.setBounds(50, 50, 600, 500);
        f.setVisible(true);

        for (int c = 3; c >= 0; c--) {
            System.out.println(c);
            time.setText(c + "");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    
}
