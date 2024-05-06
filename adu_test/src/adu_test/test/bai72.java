package adu_test.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bai72 {
	public static void main(String[] args) {
        JFrame frame = new JFrame("Tính tổng");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 700);

        JLabel problemStatement = new JLabel("<html>Cho số nguyên dương N, tính S = 1 + 2 + ... + N.<br/>" +
                "Dữ liệu vào: Một số nguyên dương N, không quá 10^9.<br/>" +
                "Kết quả: In ra tổng S.</html>");
        JTextField numberField = new JTextField();
        JTextArea outputArea = new JTextArea();

        JButton calculateButton = new JButton("Tính tổng");
        calculateButton.setBackground(new Color(213, 11, 0));
        
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    long number = Long.parseLong(numberField.getText());
                    if (number <= 0 || number > Math.pow(10, 9)) {
                        outputArea.setText("Dữ liệu không hợp lệ: Vui lòng nhập số theo yêu cầu.");
                    } else {
                        long sum = number * (number + 1) / 2;
                        outputArea.setText("Tổng: " + sum);
                    }
                } catch (NumberFormatException ex) {
                    outputArea.setText("Dữ liệu không hợp lệ: Vui lòng nhập số.");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        panel.add(new JLabel("Số N:"));
        panel.add(numberField);
        panel.add(calculateButton);
        panel.add(outputArea);
        
        frame.getContentPane().add(problemStatement, BorderLayout.NORTH);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
