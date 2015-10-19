/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.starcrap.forms;

import br.com.fiap.starcrap.daos.EquipeDAO;
import br.com.fiap.starcrap.models.Equipe;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.swing.table.DefaultTableModel;

/**
 * @author go
 */
public class PesquisarForm extends javax.swing.JFrame {

	private String[] tableTitles = new String[]{
			"Nome da Equipe", "Turma", "Distância até o alvo", "Ângulo do lançamento", "Velocidade do vento", "Peso do foguete", "Altitude máxima", "Velocidade máxima", "tempo de propulsão", "Pico de aceleração", "Aceleração média", "Tempo entre apogeu e descida", "Tempo de ejeção", "Altitude da ejeção", "Taxa de descida", "Duração do võo"
	};
	private Class[] tiposDeColunas = new Class[]{
			java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
	};

	private boolean[] editable = new boolean[]{
			false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
	};

	private EntityManager manager;
	private EquipeDAO equipeDAO;

	/**
	 * Creates new form Pesquisar
	 */
	public PesquisarForm() {
		initComponents();
		this.manager = Persistence.createEntityManagerFactory("default").createEntityManager();
		this.equipeDAO = new EquipeDAO(manager);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		valor = new javax.swing.JTextField();
		condicaoCB = new javax.swing.JComboBox();
		opcaoPesquisaCB = new javax.swing.JComboBox();
		buttonPesquisar = new javax.swing.JButton();
		buttonVoltar = new javax.swing.JButton();
		jScrollPane2 = new javax.swing.JScrollPane();
		tabelaPesquisa = new javax.swing.JTable();
		tableModel = new javax.swing.table.DefaultTableModel(
				new Object[][]{

				}, tableTitles

		) {
			Class[] types = tiposDeColunas;

			boolean[] canEdit = editable;


			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		};

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGap(0, 100, Short.MAX_VALUE)
		);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGap(0, 100, Short.MAX_VALUE)
		);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		condicaoCB.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Maior que", "Menor que", "Igual a", "Maior ou igual a", "Menor ou igual a", "Diferente de"}));
		condicaoCB.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				condicaoCBActionPerformed(evt);
			}
		});

		opcaoPesquisaCB.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Distância até o alvo", "Ângulo do lançamento", "Velocidade do vento", "Peso do foguete", "Altitude máxima", "Velocidade máxima", "Tempo de propulsão", "Pico de Aceleração", "Aceleração media", "Tempo entre apogeu e descida", "Tempo de ejeção", "Altitude de ejeção", "Taxa de descida", "Duração do voo"}));
		opcaoPesquisaCB.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				opcaoPesquisaCBActionPerformed(evt);
			}
		});

		buttonPesquisar.setText("Pesquisar");
		buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonPesquisarActionPerformed(evt);
			}
		});

		buttonVoltar.setText("Voltar");
		buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonVoltarActionPerformed(evt);
			}
		});

		jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		tabelaPesquisa.setAutoCreateRowSorter(true);
		tabelaPesquisa.setModel(tableModel);
		tabelaPesquisa.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
		tabelaPesquisa.setShowGrid(true);
		jScrollPane2.setViewportView(tabelaPesquisa);
		larguraTabela();

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup()
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
														.addComponent(buttonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(buttonVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGap(18, 18, 18)
												.addComponent(jScrollPane2)
												.addContainerGap())
										.addGroup(layout.createSequentialGroup()
												.addComponent(opcaoPesquisaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(condicaoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(valor, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))))
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(condicaoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(opcaoPesquisaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(32, 32, 32)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup()
												.addComponent(buttonPesquisar)
												.addGap(18, 18, 18)
												.addComponent(buttonVoltar)
												.addGap(0, 112, Short.MAX_VALUE))
										.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
								.addContainerGap())
		);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void larguraTabela() {
		for (int i = 0; i < tabelaPesquisa.getColumnCount(); i++) {
			tabelaPesquisa.getColumnModel().getColumn(i).setMaxWidth(300);
			tabelaPesquisa.getColumnModel().getColumn(i).setPreferredWidth(200);
			tabelaPesquisa.getColumnModel().getColumn(i).setMinWidth(200);
		}
	}

	private void opcaoPesquisaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoPesquisaCBActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_opcaoPesquisaCBActionPerformed

	private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed
		manager.getTransaction().begin();
		List<Equipe> equipes = pesquisaAvancada();
		if (equipes != null) {
			String[][] matriz = geraMatriz(equipes);
			tableModel = new DefaultTableModel(matriz, tableTitles);
			tabelaPesquisa.setModel(tableModel);
			larguraTabela();
		}
		manager.getTransaction().commit();
		fechaTransacao();
	}//GEN-LAST:event_buttonPesquisarActionPerformed

	private String[][] geraMatriz(List<Equipe> equipes) {
		String[][] matriz = new String[equipes.size()][16];
		Equipe equipe;
		for (int i = 0; i < equipes.size(); i++) {
			equipe = equipes.get(i);
			matriz[i][0] = equipe.getNome();
			matriz[i][1] = equipe.getTurma();
			matriz[i][2] = equipe.getLancamentos().get(0).getFoguete().getDistanciaDoAlvo().toString();
			matriz[i][3] = equipe.getLancamentos().get(0).getFoguete().getAnguloDeLancamento().toString();
			matriz[i][4] = equipe.getLancamentos().get(0).getVelocidadeDoVento().toString();
			matriz[i][5] = equipe.getLancamentos().get(0).getFoguete().getPesoDoFoguete().toString();
			matriz[i][6] = equipe.getLancamentos().get(0).getAltitudeMaxima().toString();
			matriz[i][7] = equipe.getLancamentos().get(0).getVelocidadeMaxima().toString();
			matriz[i][8] = String.valueOf(equipe.getLancamentos().get(0).getTempoDePropulsao().getSeconds());
			matriz[i][9] = equipe.getLancamentos().get(0).getPicoDeAceleracao().toString();
			matriz[i][10] = equipe.getLancamentos().get(0).getAceleracaoMedia().toString();
			matriz[i][11] = String.valueOf(equipe.getLancamentos().get(0).getTempoEntreApogeuEDescida().getSeconds());
			matriz[i][12] = String.valueOf(equipe.getLancamentos().get(0).getTempoDeEjecao().getSeconds());
			matriz[i][13] = equipe.getLancamentos().get(0).getAltitudeDeEjecao().toString();
			matriz[i][14] = equipe.getLancamentos().get(0).getTaxaDeDescida().toString();
			matriz[i][15] = String.valueOf(equipe.getLancamentos().get(0).getDuracaoDoVoo().getSeconds());

		}
		return matriz;
	}

	private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
		PrincipalForm principal = new PrincipalForm();
		principal.setVisible(true);
		this.dispose();
	}//GEN-LAST:event_buttonVoltarActionPerformed

	private void condicaoCBActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private List<Equipe> pesquisaAvancada() {
		String a = opcaoPesquisaCB.getSelectedItem().toString().toLowerCase();
		String sinal;
		String valor = this.valor.getText();
		List<Equipe> equipes = null;

		a = a.trim();
		a = a.replace("ã", "a");
		a = a.replace("â", "a");
		a = a.replace("á", "a");
		a = a.replace("é", "e");
		a = a.replace("ç", "c");


		switch (condicaoCB.getSelectedIndex()) {
			case 0:
				sinal = " > ";
				break;
			case 1:
				sinal = " < ";
				break;
			case 2:
				sinal = " = ";
				break;
			case 3:
				sinal = " >= ";
				break;
			case 4:
				sinal = " <= ";
				break;
			case 5:
				sinal = " != ";
				break;
			default:
				sinal = null;
		}
		if (a.equals("distancia ate o alvo")) {
			equipes = equipeDAO.procuraPorDistanciaDoAlvo(sinal, valor);
		} else if (a.equals("angulo do lancamento")) {
			equipes = equipeDAO.procuraPorAnguloDeLancamento(sinal, valor);
		} else if (a.equals("velocidade do vento")) {
			equipes = equipeDAO.procuraPorVelocidadeDoVento(sinal, valor);
		} else if (a.equals("peso do foguete")) {
			equipes = equipeDAO.procuraPorPesoDoFoguete(sinal, valor);
		} else if (a.equals("altitude maxima")) {
			equipes = equipeDAO.procuraPorAltitudeMaxima(sinal, valor);
		} else if (a.equals("velecidade maxima")) {
			equipes = equipeDAO.procuraPorVelocidadeMaxima(sinal, valor);
		} else if (a.equals("tempo de propulsao")) {
			equipes = equipeDAO.procuraPorTempoDePropulsao(sinal, valor);
		} else if (a.equals("pico de aceleracao")) {
			equipes = equipeDAO.procuraPorPicoDeAceleracao(sinal, valor);
		} else if (a.equals("aceleracao media")) {
			equipes = equipeDAO.procuraPorAceleracaoMedia(sinal, valor);
		} else if (a.equals("tempo entre apogeu e descida")) {
			equipes = equipeDAO.procuraPorTempoEntreApogeu(sinal, valor);
		} else if (a.equals("tempo de ejecao")) {
			equipes = equipeDAO.procuraPorTempoDeEjecao(sinal, valor);
		} else if (a.equals("altitude de ejecao")) {
			equipes = equipeDAO.procuraPorAltitudeDeEjecao(sinal, valor);
		} else if (a.equals("taxa de descida")) {
			equipes = equipeDAO.procuraPorTaxaDeDescida(sinal, valor);
		} else if (a.equals("duracao do voo")) {
			equipes = equipeDAO.procuraPorDuracaoDoVoo(sinal, valor);
		}
		return equipes;
	}

	private void fechaTransacao() {
		if (manager.getTransaction().isActive()) {
			manager.getTransaction().commit();
		}
	}

	/**
	 * @param args the command line arguments
	 */

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton buttonPesquisar;
	private javax.swing.JButton buttonVoltar;
	private javax.swing.JComboBox condicaoCB;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JComboBox opcaoPesquisaCB;
	private javax.swing.JTable tabelaPesquisa;
	private javax.swing.JTextField valor;
	private javax.swing.table.TableModel tableModel;
	// End of variables declaration//GEN-END:variables
}
