/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semeando_futuro.view;

import javax.swing.JOptionPane;
import semeando_futuro.dao.AlunoDAO;
import semeando_futuro.dao.MaeDAO;
import semeando_futuro.modelo.Mae;

/**
 *
 * @author Thiago
 */
public class IFrm_CadMae extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrm_CadMae
     */
    public IFrm_CadMae() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txt_Nome = new javax.swing.JTextField();
        txt_Sobrenome = new javax.swing.JTextField();
        txt_endereco = new javax.swing.JTextField();
        txt_bairro = new javax.swing.JTextField();
        txt_cidade = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_profissao = new javax.swing.JTextField();
        txt_empresa = new javax.swing.JTextField();
        txt_funcao = new javax.swing.JTextField();
        cb_Estado = new javax.swing.JComboBox();
        cb_estadocivil = new javax.swing.JComboBox();
        txt_cel = new javax.swing.JFormattedTextField();
        txt_tel = new javax.swing.JFormattedTextField();
        txt_cpf = new javax.swing.JFormattedTextField();
        txt_rg = new javax.swing.JFormattedTextField();
        txt_Cep = new javax.swing.JFormattedTextField();
        btn_cad = new javax.swing.JButton();
        btn_novo = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro Mãe");

        jPanel2.setForeground(new java.awt.Color(1, 108, 78));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(1, 108, 78));
        jLabel19.setText("Nome:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(1, 108, 78));
        jLabel20.setText("Sobrenome:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jLabel21.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(1, 108, 78));
        jLabel21.setText("Endereço:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(1, 108, 78));
        jLabel23.setText("Bairro:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        jLabel24.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(1, 108, 78));
        jLabel24.setText("Cidade:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jLabel25.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(1, 108, 78));
        jLabel25.setText("Estado:");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel26.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(1, 108, 78));
        jLabel26.setText("Cep:");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        jLabel28.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(1, 108, 78));
        jLabel28.setText("Fone Residencial:");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel29.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(1, 108, 78));
        jLabel29.setText("Celular:");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jLabel30.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(1, 108, 78));
        jLabel30.setText("Email:");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        jLabel31.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(1, 108, 78));
        jLabel31.setText("Profissão:");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        jLabel32.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(1, 108, 78));
        jLabel32.setText("Empresa em que trabalha:");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        jLabel33.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(1, 108, 78));
        jLabel33.setText("Estado Civil:");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel34.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(1, 108, 78));
        jLabel34.setText("Função:");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        jLabel35.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(1, 108, 78));
        jLabel35.setText("RG:");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        jLabel36.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(1, 108, 78));
        jLabel36.setText("CPF:");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));
        jPanel2.add(txt_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 190, -1));
        jPanel2.add(txt_Sobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 290, -1));
        jPanel2.add(txt_endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 330, -1));
        jPanel2.add(txt_bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 150, -1));
        jPanel2.add(txt_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 210, -1));
        jPanel2.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 200, -1));
        jPanel2.add(txt_profissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 190, -1));
        jPanel2.add(txt_empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 170, -1));
        jPanel2.add(txt_funcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 240, -1));

        cb_Estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC ", "AL ", "AP ", "AM ", "BA ", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG ", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS ", "RO ", "RR ", "SC ", "SP ", "SE ", "TO" }));
        jPanel2.add(cb_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 100, -1));

        cb_estadocivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Solteira", "Casada", "Viúva", "Divorciada" }));
        jPanel2.add(cb_estadocivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 100, -1));

        try {
            txt_cel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txt_cel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 120, -1));

        try {
            txt_tel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txt_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 140, -1));

        try {
            txt_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txt_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 110, -1));

        try {
            txt_rg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txt_rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 110, -1));

        try {
            txt_Cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(txt_Cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 150, -1));

        btn_cad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_cad.setForeground(new java.awt.Color(0, 102, 102));
        btn_cad.setText("Cadastrar");
        btn_cad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadActionPerformed(evt);
            }
        });

        btn_novo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_novo.setForeground(new java.awt.Color(0, 102, 102));
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_cad, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadActionPerformed
        Mae a = new Mae();

        if (txt_Nome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o nome corretamente");
        } else if (txt_Sobrenome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o sobrenome corretamente");
        }else if (txt_cidade.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite a Cidade corretamente");
        }else if (txt_bairro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o Bairro corretamente");
        }else if (txt_endereco.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite o Endereço corretamente");
        }else if (txt_Cep.getText().equals("     -   ")) {
            JOptionPane.showMessageDialog(null, "Digite o sobrenome corretamente");
        }else if (txt_rg.getText().equals("  .   .   -  ")) {
            JOptionPane.showMessageDialog(null, "Digite o RG corretamente");
        }else if (txt_cpf.getText().equals("   .   .   -  ")) {
            JOptionPane.showMessageDialog(null, "Digite o CPF corretamente");
        } else {
            try {
                
                a.setNome(txt_Nome.getText());
                a.setSobrenome(txt_Sobrenome.getText());
                a.setEstado(cb_Estado.getSelectedItem().toString());
                a.setCidade(txt_cidade.getText());
                a.setBairro(txt_bairro.getText());
                a.setEndereco(txt_endereco.getText());
                a.setCEP(txt_Cep.getText());
                a.setTelefone(txt_tel.getText());
                a.setCelular(txt_cel.getText());
                a.setEmail(txt_email.getText());
                a.setEstado_Civil(cb_estadocivil.getSelectedItem().toString());
                a.setProfissao(txt_profissao.getText());
                a.setEmpresa_Trab(txt_empresa.getText());
                a.setFuncao_trab(txt_funcao.getText());
                a.setCPF(txt_cpf.getText());
                a.setRG(txt_rg.getText());

            } catch (Exception e) {

            }
            MaeDAO adao = new MaeDAO();
            adao.adciona(a);
            JOptionPane.showMessageDialog(null, "Mae Cadastrado com sucesso");
        }

    }//GEN-LAST:event_btn_cadActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        txt_Nome.setText(null);
        txt_Sobrenome.setText(null);
        txt_cidade.setText(null);
        txt_bairro.setText(null);
        txt_endereco.setText(null);
        txt_Cep.setText(null);
        txt_tel.setText(null);
        txt_cel.setText(null);
        txt_email.setText(null);
        txt_profissao.setText(null);
        txt_empresa.setText(null);
        txt_funcao.setText(null);
        txt_cpf.setText(null);
        txt_rg.setText(null);
        cb_Estado.setSelectedIndex(0);
        cb_estadocivil.setSelectedIndex(0);
        
    }//GEN-LAST:event_btn_novoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cad;
    private javax.swing.JButton btn_novo;
    private javax.swing.JComboBox cb_Estado;
    private javax.swing.JComboBox cb_estadocivil;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JFormattedTextField txt_Cep;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_Sobrenome;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JFormattedTextField txt_cel;
    private javax.swing.JTextField txt_cidade;
    private javax.swing.JFormattedTextField txt_cpf;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_empresa;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_funcao;
    private javax.swing.JTextField txt_profissao;
    private javax.swing.JFormattedTextField txt_rg;
    private javax.swing.JFormattedTextField txt_tel;
    // End of variables declaration//GEN-END:variables
}
