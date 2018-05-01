import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JLabel jlbF = new JLabel("華氏度 : ");
    private JLabel jlbC = new JLabel("攝氏度");
    private JLabel jlbResult = new JLabel("結果");
    private JTextField jtf = new JTextField("0");
    private JButton jbtChange = new JButton("=");
    private JButton jbtExit = new JButton("Exit");

    public MainFrame () {
        init();
    }
    private void init () {
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(40,40,1280,960);

        jlbF.setBounds(150,40,100,80);
        jtf.setBounds(260,40,300,80);
        jbtChange.setBounds(570,40,100,80);
        jlbC.setBounds(680,40,100,80);
        jbtExit.setBounds(750,240,300,80);
        jlbResult.setBounds(790,40,200,80);
        jbtChange.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlbResult.setText(Float.toString( (float)(Integer.parseInt( jtf.getText() ) - 32 ) * 5 / 9f ));
            }
        });

        jbtExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        this.add(jlbF);
        this.add(jtf);
        this.add(jbtChange);
        this.add(jlbC);
        this.add(jlbResult);
        this.add(jbtExit);
    }
}
