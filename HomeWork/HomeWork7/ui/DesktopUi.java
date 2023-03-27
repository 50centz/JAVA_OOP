package HomeWork.HomeWork7.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



import HomeWork.HomeWork7.presenter.Presenter;

public class DesktopUi extends JFrame implements ActionListener, View{

    static Presenter presenter;

    static Desktop desktop;

    static JFrame frame;
    static JTextField result;
    static String a ="", b = "", operation = "";

    private Font font = new Font("Calibri", Font.BOLD, 13);
    
    

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void start() {

        DesktopUi listen = new DesktopUi();

        frame = new JFrame("Calc");
        result = new JTextField(16);
        result.setFont(font);
        result.setEditable(false);

        ArrayList<JButton> btns = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            JButton jTmpButton = new JButton(Integer.toString(i));
            jTmpButton.addActionListener(listen);
            btns.add(jTmpButton);
        }

        List<String> operations = Arrays.asList("+", "-", "/", "*", "c", "=");

        JPanel buttons = new JPanel();
        btns.forEach(buttons::add);
        operations.forEach(it -> {
            JButton jTmpButton = new JButton(it);
            jTmpButton.addActionListener(listen);
            buttons.add(jTmpButton);
        });
        
        GridLayout numsAndOpsLayout = new GridLayout(4, 4);
        buttons.setLayout(numsAndOpsLayout);



        JPanel mainPanel = new JPanel();
        mainPanel.add(result);
        mainPanel.add(buttons);

        
        frame.add(mainPanel);
        frame.setSize(200, 200);
        frame.setVisible(true);
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // System.out.println(e.getActionCommand());
        String s = e.getActionCommand();

        if (s.charAt(0) >= '0' && s.charAt(0) <= '9' ){
            if (operation.equals(""))
                a = a + s;
            else 
                b = b + s;
                result.setText(a + operation + b);
            } else if (s.charAt(0) == 'c'){
                a = operation = b = "";
                result.setText(a + operation + b);
            } else if (s.charAt(0) == '='){
                String out = a + operation + b;
                // Double rslt = switch (operation) {
                //     case "+" -> Double.parseDouble(a) + Double.parseDouble(b);
                //     case "-" -> Double.parseDouble(a) - Double.parseDouble(b);
                //     case "/" -> Double.parseDouble(a) / Double.parseDouble(b);
                //     default -> Double.parseDouble(a) * Double.parseDouble(b); 
                       
                // };
                Double rslt = Double.parseDouble(presenter.acceptСalculation(out));
                
            a = String.valueOf(rslt);
            result.setText(a);
            operation = b = "";
        }else {
            if (operation.equals("")){
                operation = s;
                result.setText(a + operation + b);
            }
        }
    }

}
