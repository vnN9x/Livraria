package apslivraria.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JanelaPrincipal {

	public void addComponentToPane(Container pane) {
		JTabbedPane tabbedPane = new JTabbedPane();

		JPanel card1 = new JPanel() {
			private static final long serialVersionUID = 1L;
			public Dimension getPreferredSize() {
				Dimension size = super.getPreferredSize();
				size.width += 100;
				size.height += 100;
				return size;
			}
		};

		// componetes card1
		JTextField card1_busca_txt_field = new JTextField("", 36);
		JButton card1_busca_run_button = new JButton("Buscar");

		card1_busca_run_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
			}
		});

		card1.add(card1_busca_txt_field);
		card1.add(card1_busca_run_button);


		JPanel card2 = new JPanel();
		JTextField card2_altera_busca_txt_field = new JTextField("", 36);
		JButton card2_altera_busca_run_button = new JButton("Buscar");

		card2_altera_busca_run_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
			}
		});

		JTextField card2_altera_txt_field = new JTextField("", 36);
		JButton card2_altera_run_button = new JButton("Alterar");

		card2_altera_run_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
			}
		});

		card2.add(card2_altera_busca_txt_field);
		card2.add(card2_altera_busca_run_button);
		card2.add(card2_altera_txt_field);
		card2.add(card2_altera_run_button);


		JPanel card3 = new JPanel();
		JButton card3_inclui_run_button = new JButton("Incluir");

		card3_inclui_run_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
			}
		});

		card3.add(card3_inclui_run_button);


		JPanel card4 = new JPanel();
		JButton card4_exclui_run_button = new JButton("Excluir");

		card4_exclui_run_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
			}
		});

		card4.add(card4_exclui_run_button);


		tabbedPane.addTab("Buscar", card1);
		tabbedPane.addTab("Alterar", card2);
		tabbedPane.addTab("Incluir", card3);
		tabbedPane.addTab("Excluir", card4);


		pane.add(tabbedPane, BorderLayout.CENTER);
	}

	private static void createAndShowGUI() {
		// Set up the window.
		JFrame frame = new JFrame("TabDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(720, 1280);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);

		// Set up content pane.
		JanelaPrincipal demo = new JanelaPrincipal();
		demo.addComponentToPane(frame.getContentPane());

		//Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

}
