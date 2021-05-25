/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Ariunbuyan
 */
public class game_implement extends game_gui implements ActionListener {
    
    public game_implement() {
        haich.addActionListener(this);
        chuluu.addActionListener(this);
        daawuu.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent act) {
        // TODO Auto-generated method stub

        if (act.getSource() == haich) {
            user.setIcon(new ImageIcon(getClass().getResource("../images/human_scissors.jpg")));
            com_too = rand.nextInt(3) + 1;
            System.out.println(com_too);
            com.setIcon(new ImageIcon(getClass().getResource(weapon_ner[com_too])));
            if (com_too == 1) {
                result.setText("Та ялагдлаа!");
                emotion.setIcon(new ImageIcon(getClass().getResource("../images/angry.jpg")));
                comWon = comWon + 1;
            } else if (com_too == 2) {
                result.setText("Та хожлоо!");
                emotion.setIcon(new ImageIcon(getClass().getResource("../images/happy.jpg")));
                humanWon = humanWon + 1;
            } else if (com_too == 3) {
                result.setText("Та тэнцлээ");
                tie = tie + 1;
                emotion.setIcon(null);
            }
        } else if (act.getSource() == chuluu) {
            user.setIcon(new ImageIcon(getClass().getResource("../images/human_rock.jpg")));
            com_too = rand.nextInt(3) + 1;
            System.out.println(com_too);
            com.setIcon(new ImageIcon(getClass().getResource(weapon_ner[com_too])));
            if (com_too == 2) {
                result.setText("Та ялагдлаа!");
                emotion.setIcon(new ImageIcon(getClass().getResource("../images/angry.jpg")));
                comWon = comWon + 1;
            } else if (com_too == 3) {
                result.setText("Та хожлоо!");
                emotion.setIcon(new ImageIcon(getClass().getResource("../images/happy.jpg")));
                humanWon = humanWon + 1;
            } else if (com_too == 1) {
                result.setText("Та тэнцлээ");
                tie = tie + 1;
                emotion.setIcon(null);
            }
        } else if (act.getSource() == daawuu) {
            user.setIcon(new ImageIcon(getClass().getResource("../images/human_paper.jpg")));
            com_too = rand.nextInt(3) + 1;
            System.out.println(com_too);
            com.setIcon(new ImageIcon(getClass().getResource(weapon_ner[com_too])));
            if (com_too == 3) {
                result.setText("Та ялагдлаа!");
                emotion.setIcon(new ImageIcon(getClass().getResource("../images/angry.jpg")));
                comWon = comWon + 1;
            } else if (com_too == 1) {
                result.setText("Та хожлоо!");
                emotion.setIcon(new ImageIcon(getClass().getResource("../images/happy.jpg")));
                humanWon = humanWon + 1;
            } else if (com_too == 2) {
                result.setText("Та тэнцлээ");
                tie = tie + 1;
                emotion.setIcon(null);
            }
        } else {
            System.exit(0);
            System.out.println("Тоглоом Дууслаа.");
        }
        quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String text = "Хайч, Чулуу, Даавуу!\n"
                        + "Тоглосонд баярлалаа.\n"
                        + "HumanWon:\t" + humanWon
                        + "\nComWon:\t" + comWon
                        + "\nTie:\t" + tie;
                JOptionPane.showMessageDialog(null, text);
                System.exit(0);
            }

        });
    }

}
