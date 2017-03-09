package Conditions;

import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
 
import javax.swing.JComboBox;
import javax.swing.JFrame;

	 
	public class TestFrame extends JFrame {
	 
	    /**
		 * 
		 */
		private static final long serialVersionUID = -7849620335217916487L;

		public TestFrame() {
	        super("Тестовое окно");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        Font font = new Font("Verdana", Font.PLAIN, 25);
	 
	        String[] items = { "Item 1", "Item 2", "Item 3", "Iteam 4"};
	 
	        JComboBox combo = new JComboBox(items);
	        combo.setFont(font);
	        getContentPane().add(combo);
	 
	        try {
	            File file = new File("combobox.txt");
	 
	            if (!file.exists()) {
	                file.createNewFile();
	            }
	 
	            FileOutputStream fileOut = new FileOutputStream(file);
	            ObjectOutputStream out = new ObjectOutputStream(fileOut);
	            out.writeObject(combo);
	 
	            getContentPane().remove(combo);
	 
	            FileInputStream fileIn = new FileInputStream(file);
	            ObjectInputStream in = new ObjectInputStream(fileIn);
	 
	            combo = (JComboBox) in.readObject();
	 
	            getContentPane().add(combo);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	 
	        setPreferredSize(new Dimension(500, 100));
	        pack();
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }
	 
	    public static void main(String[] args) {
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                JFrame.setDefaultLookAndFeelDecorated(true);
	                new TestFrame();
	            }
	        });
	    }
	}

