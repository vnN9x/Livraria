package apslivraria.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;


public class JanelaPrincipal extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	JButton button;

	JLabel return_field;

	JTextField busca_txt_field;
	JTextField altera_txt_field;

	JComboBox altera_dropdown_menu;

	JRadioButton check_busca;
	JRadioButton check_altera;
	JRadioButton check_inclui;
	JRadioButton check_exclui;

	private JanelaPrincipal() {
		super("Livraria");

		// width, height
		setSize(400, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		button = new JButton("Executar");
		busca_txt_field = new JTextField("", 36);
		return_field = new JLabel("return field");

		ButtonGroup check_boxes = new ButtonGroup();

		check_busca = new JRadioButton("Buscar");
		check_altera = new JRadioButton("Alterar");
		check_inclui = new JRadioButton("Incluir");
		check_exclui = new JRadioButton("Excluir");

		// radio button group
		check_boxes.add(check_busca);
		check_boxes.add(check_altera);
		check_boxes.add(check_inclui);
		check_boxes.add(check_exclui);

		add(check_busca);
		add(check_altera);
		add(check_inclui);
		add(check_exclui);
		add(button);

		// action listeners
		button.addActionListener(this);

		//check_busca.addActionListener(this);
		//check_altera.addActionListener(this);
		//check_inclui.addActionListener(this);
		//check_exclui.addActionListener(this);

	}

	public static void main (String[] args) {
		new JanelaPrincipal().setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		//System.out.println(e.getSource());

		// Cleaning the jframe dynamic objects
		if (e.getSource() == check_busca || e.getSource() == check_altera || e.getSource() == check_inclui || e.getSource() == check_exclui) {
			//invalidate();
			//revalidate();
			//repaint();
		}

		if (check_busca.isSelected()) {
			System.out.println("busca selecionado");
			//System.out.println(txt_field.getText());

			if (busca_txt_field == null) {
				//add(busca_txt_field);
				//invalidate();
				//revalidate();
				//repaint();
			}

		} else if (check_altera.isSelected()) {
			System.out.println("altera selecionado");
			//System.out.println(txt_field.getText());

			if (altera_dropdown_menu == null) {
				//altera_dropdown_menu = new JComboBox();

				//altera_dropdown_menu.addItem("Teste0");
				//altera_dropdown_menu.addItem("Teste1");
				//altera_dropdown_menu.addItem("Teste2");
				//altera_dropdown_menu.addItem("Teste3");
				//altera_dropdown_menu.addItem("Teste4");

				//altera_dropdown_menu.addActionListener(this);

				//add(altera_dropdown_menu);
				//invalidate();
				//revalidate();

			}

			if (altera_txt_field == null) {
				//altera_txt_field = new JTextField("alterar para...", 36);

				//add(altera_txt_field);
				//invalidate();
				//revalidate();

			}

		} else if (check_inclui.isSelected()) {
			System.out.println("inclui selecionado");
			//System.out.println(txt_field.getText());

		} else if (check_exclui.isSelected()) {
			System.out.println("exclui selecionado");
			//System.out.println(txt_field.getText());

		}

	}

	public void clearJFrameUsableSpace() {

	}
}
