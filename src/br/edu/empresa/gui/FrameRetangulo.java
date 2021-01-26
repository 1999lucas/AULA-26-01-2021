package br.edu.empresa.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.edu.empresa.model.Retangulo;

public class FrameRetangulo {

	public void criarTela() {
		
		JFrame telaRetangulo = new JFrame();
		telaRetangulo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaRetangulo.setSize(500, 300);
		telaRetangulo.setTitle("Cálculos com Retângulo");
		telaRetangulo.setLayout(null);
		
		//*** Criar um Label da Altura***//
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura");
		
		// Definir a posição e tamanho do Label (x, y, width, height)
		labelAltura.setBounds(10, 10, 80, 30);
		
		// Colocar o labelAltura dentro do painel de conteúdo -> contentPane 
		telaRetangulo.getContentPane().add(labelAltura);
		
		
		// *** Criar uma TextField da Altura *** //
		JTextField textAltura = new JTextField();
		textAltura.setBounds(90, 10, 100, 30);
		
		//** Criar um Label da Base **//
		JLabel labelBase = new JLabel();
		labelBase.setText("Base");
		labelBase.setBounds(10, 45, 80, 30);
		
		//**Criar um TextField da Base**//
		
		JTextField textBase = new JTextField();
		textBase.setBounds(90, 45, 100, 30);
		
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		Color laranja = new Color(255,99,50);
		buttonCalcular.setBackground(laranja);
		buttonCalcular.setBounds(10, 95, 180, 30);
		
		
		telaRetangulo.getContentPane().add(labelBase);
		telaRetangulo.getContentPane().add(textAltura);
		telaRetangulo.getContentPane().add(textBase);
		telaRetangulo.getContentPane().add(buttonCalcular);
		telaRetangulo.setVisible(true);
		
		
		// Cliques da Tela //
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				// textAltura.setText("Lucas");
				
				Retangulo r = new Retangulo();
				r.setAltura(Double.parseDouble(textAltura.getText()));
				r.setBase(Double.parseDouble(textBase.getText()));
				
				labelAltura.set(String.ValueOf(r.calcularArea()));
				labelBase.setText(String.ValueOf(r.calcularPerimetro()));
				
			}
		});
	}
	
}
