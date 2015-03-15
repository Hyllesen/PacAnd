
import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo extends JFrame {
    GridLayout experimentLayout = new GridLayout(20,20);
    
    public GridLayoutDemo(String name) {
        super(name);
        setResizable(false);
    }
    
    public void addComponentsToPane(final Container pane) {
        final JPanel compsToExperiment = new JPanel();
        compsToExperiment.setLayout(experimentLayout);
        
        //Set up components preferred size
        compsToExperiment.setPreferredSize(new Dimension(500, 500));
        
        //Add buttons to experiment with Grid Layout
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("6"));
        compsToExperiment.add(new JLabel("7"));
        compsToExperiment.add(new JLabel("8"));
        compsToExperiment.add(new JLabel("9"));
        compsToExperiment.add(new JLabel("10"));
        compsToExperiment.add(new JLabel("11"));
        compsToExperiment.add(new JLabel("12"));
        compsToExperiment.add(new JLabel("13"));
        compsToExperiment.add(new JLabel("14"));
        compsToExperiment.add(new JLabel("15"));
        compsToExperiment.add(new JLabel("16"));
        compsToExperiment.add(new JLabel("17"));
        compsToExperiment.add(new JLabel("18"));
        compsToExperiment.add(new JLabel("19"));
        compsToExperiment.add(new JLabel("20"));
        
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));

        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("1"));
        compsToExperiment.add(new JLabel("2"));
        compsToExperiment.add(new JLabel("3"));
        compsToExperiment.add(new JLabel("4"));
        compsToExperiment.add(new JLabel("5"));
        compsToExperiment.add(new JLabel("391"));
        compsToExperiment.add(new JLabel("392"));
        compsToExperiment.add(new JLabel("393"));
        compsToExperiment.add(new JLabel("394"));
        compsToExperiment.add(new JLabel("395"));
        compsToExperiment.add(new JLabel("396"));
        compsToExperiment.add(new JLabel("397"));
        compsToExperiment.add(new JLabel("398"));
        compsToExperiment.add(new JLabel("399"));
        compsToExperiment.add(new JLabel("400"));
        
        
        
        pane.add(compsToExperiment, BorderLayout.NORTH);
    }
    
    /**
     * Create the GUI and show it.  For thread safety,
     * this method is invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        GridLayoutDemo frame = new GridLayoutDemo("GridLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        frame.addComponentsToPane(frame.getContentPane());
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}