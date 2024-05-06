package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bai71 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rectangle Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JLabel problemStatement = new JLabel("<html>Cho độ dài hai cạnh của hình chữ nhật. Giá trị không quá 104.  \r\n"
        		+ "\r\n"
        		+ "Viết chương trình tính chu vi và diện tích của hình chữ nhật đó. Nếu dữ liệu không hợp lệ (chiều dài hoặc chiều rộng ≤ 0 thì in ra số 0). <br/>" 
        		+ "Input\r\n"
        		+ "\r\n"
        		+ "Có duy nhất một dòng ghi hai số nguyên, cách nhau một khoảng trống.\r\n"
        		+ "\r\n"
        		+ "Output\r\n"
        		+ "\r\n"
        		+ "In kết quả trên một dòng, chu vi rồi đến diện tích, cách nhau một khoảng trống"
                +"</html>");
        JTextField lengthField = new JTextField();
        JTextField widthField = new JTextField();
        JTextArea outputArea = new JTextArea();

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int length = Integer.parseInt(lengthField.getText());
                    int width = Integer.parseInt(widthField.getText());
                    if (length <= 0 || width <= 0) {
                        outputArea.setText("Độ dài chiều dài chiều rộng phải là 1 số nguyên");
                    } else {
                        int perimeter = 2 * (length + width);
                        int area = length * width;
                        outputArea.setText("Perimeter: " + perimeter + ", Area: " + area);
                    }
                } catch (NumberFormatException ex) {
                    outputArea.setText("Hãy điền 1 con số 😢");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));
        panel.add(problemStatement);
        panel.add(new JLabel());
        panel.add(new JLabel("Length:"));
        panel.add(lengthField);
        panel.add(new JLabel("Width:"));
        panel.add(widthField);
        panel.add(calculateButton);
        panel.add(outputArea);

        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}