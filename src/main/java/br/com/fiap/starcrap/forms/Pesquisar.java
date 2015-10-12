/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.starcrap.forms;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 * @author go
 */
public class Pesquisar extends javax.swing.JFrame {
        
	/**
	 * Creates new form Pesquisar
	 */
	public Pesquisar() {
		initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        buttonPesquisar = new javax.swing.JButton();
        buttonVoltar = new javax.swing.JButton();

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

        condicaoCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Maior que", "Menor que", "Igual a", "Maior ou igual a", "Menor ou igual a", "Diferente de" }));
        condicaoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condicaoCBActionPerformed(evt);
            }
        });

        opcaoPesquisaCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dist�ncia at� o alvo", "�ngulo do lan�amento", "Velocidade do vento", "Peso do foguete", "Altitude m�xima", "Velocidade m�xima", "Tempo de propuls�o", "Pico de Acelera��o", "Acelera��o media", "Tempo entre apogeu e descida", "Tempo de eje��o", "Altitude de eje��o", "Taxa de descida", "Dura��o do voo" }));
        opcaoPesquisaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoPesquisaCBActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        buttonPesquisar.setText("Pesquisar");
        buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarActionPerformed(evt);
            }
        });

        buttonVoltar.setText("Voltar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(opcaoPesquisaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(condicaoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valor))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(condicaoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcaoPesquisaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(buttonPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(buttonVoltar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcaoPesquisaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoPesquisaCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcaoPesquisaCBActionPerformed

    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed
        pesquisaAvancada(opcaoPesquisaCB.getSelectedItem().toString(),condicaoCB.getSelectedIndex(),Double.valueOf( valor.getText() ));
    }//GEN-LAST:event_buttonPesquisarActionPerformed
    
    private void condicaoCBActionPerformed(java.awt.event.ActionEvent evt){
        // TODO add your handling code here:
    }
    
    private void pesquisaAvancada(String a,int b, double c){
        String aux;
        //tratamento das informa��es
        
        a=a.trim();
        a=a.replace("�","a");
        a=a.replace("�","a");
        a=a.replace("�","a");
        a=a.replace("�","e");
        a=a.replace("�","c");
        aux=a;
        
        switch(b){
            case 0:
                aux += " > ";
            break;
            case 1:
                aux += " < ";
            break;
            case 2:
                aux += " = ";
            break;
            case 3:
                aux += " >= ";
            break;
            case 4:
                aux += " <= ";
            break;
            case 5:
                aux += " != ";
            break;
        }
        
        aux+=c;
        //usar aux pro m�todo de banco de dados
    }
	/**
	 * @param args the command line arguments
	 */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JComboBox condicaoCB;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox opcaoPesquisaCB;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
