package semeando_futuro.view;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Frm_Menu extends javax.swing.JFrame {

    public void CursorGiz() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image img = toolkit.getImage("giz.png");
        Point point = new Point(0, 0);
        Cursor cursor = toolkit.createCustomCursor(img, point, "Cursor");

        jDesktopPane1.setCursor(cursor);
    }

    public void CursorCaneta() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image img = toolkit.getImage("caneta.png");
        Point point = new Point(0, 0);
        Cursor cursor = toolkit.createCustomCursor(img, point, "Cursor");

        setCursor(cursor);
    }

    public void CursorLapis() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image img = toolkit.getImage("lapis.png");
        Point point = new Point(0, 0);
        Cursor cursor = toolkit.createCustomCursor(img, point, "Cursor");

        btn_BancoHoras.setCursor(cursor);
        btn_Cadmae.setCursor(cursor);
        btn_CadPai.setCursor(cursor);
        btn_CadAluno.setCursor(cursor);
        btn_CadFunc.setCursor(cursor);
        btn_Cafe.setCursor(cursor);
        btn_Chamada.setCursor(cursor);
        btn_Consultas.setCursor(cursor);
        btn_Desligamento.setCursor(cursor);
        btn_FaltasFunc.setCursor(cursor);
        btn_Festas.setCursor(cursor);
        btn_FluxoCaixa.setCursor(cursor);
        btn_Visitas.setCursor(cursor);
    }

    public Frm_Menu() {
        initComponents();
        CursorCaneta();
        CursorGiz();
        CursorLapis();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btn_Cadmae = new javax.swing.JButton();
        btn_CadPai = new javax.swing.JButton();
        btn_CadAluno = new javax.swing.JButton();
        btn_CadFunc = new javax.swing.JButton();
        btn_turma = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btn_Chamada = new javax.swing.JButton();
        btn_Festas = new javax.swing.JButton();
        btn_Visitas = new javax.swing.JButton();
        btn_Desligamento = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btn_FaltasFunc = new javax.swing.JButton();
        btn_Cafe = new javax.swing.JButton();
        btn_BancoHoras = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btn_FluxoCaixa = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btn_Consultas = new javax.swing.JButton();
        ImageIcon icon = new ImageIcon(getClass().getResource("/semeando_futuro/foto/fundo.png"));
        final Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image, 0 , 0, getWidth(), getHeight(), this);
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Semeando o Futuro");
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1275, 768));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(3, 76, 56));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(3, 76, 56));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Cadastro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Cadmae.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn_Cadmae.setForeground(new java.awt.Color(0, 102, 102));
        btn_Cadmae.setText("MÃE");
        btn_Cadmae.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Cadmae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadmaeActionPerformed(evt);
            }
        });
        jPanel6.add(btn_Cadmae, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 27, 125, -1));

        btn_CadPai.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn_CadPai.setForeground(new java.awt.Color(0, 102, 102));
        btn_CadPai.setText("PAI");
        btn_CadPai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_CadPai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadPaiActionPerformed(evt);
            }
        });
        jPanel6.add(btn_CadPai, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 61, 125, -1));

        btn_CadAluno.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn_CadAluno.setForeground(new java.awt.Color(0, 102, 102));
        btn_CadAluno.setText("ALUNO");
        btn_CadAluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_CadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadAlunoActionPerformed(evt);
            }
        });
        jPanel6.add(btn_CadAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 95, 125, -1));

        btn_CadFunc.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn_CadFunc.setForeground(new java.awt.Color(0, 102, 102));
        btn_CadFunc.setText("FUNCIONÁRIO");
        btn_CadFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_CadFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadFuncActionPerformed(evt);
            }
        });
        jPanel6.add(btn_CadFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 129, 125, -1));

        btn_turma.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn_turma.setForeground(new java.awt.Color(0, 102, 102));
        btn_turma.setText("TURMA");
        btn_turma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_turma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_turmaActionPerformed(evt);
            }
        });
        jPanel6.add(btn_turma, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 163, 125, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, 190, 200));

        jPanel7.setBackground(new java.awt.Color(3, 76, 56));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Alunos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        btn_Chamada.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn_Chamada.setForeground(new java.awt.Color(0, 102, 102));
        btn_Chamada.setText("CHAMADA");
        btn_Chamada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Chamada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChamadaActionPerformed(evt);
            }
        });

        btn_Festas.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn_Festas.setForeground(new java.awt.Color(0, 102, 102));
        btn_Festas.setText("FESTAS");
        btn_Festas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Festas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FestasActionPerformed(evt);
            }
        });

        btn_Visitas.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn_Visitas.setForeground(new java.awt.Color(0, 102, 102));
        btn_Visitas.setText("VISITAS");
        btn_Visitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Visitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VisitasActionPerformed(evt);
            }
        });

        btn_Desligamento.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn_Desligamento.setForeground(new java.awt.Color(0, 102, 102));
        btn_Desligamento.setText("DESLIGAMENTO");
        btn_Desligamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Desligamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DesligamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Visitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Desligamento, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(btn_Festas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Chamada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Chamada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Festas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Visitas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Desligamento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 232, -1, -1));

        jPanel8.setBackground(new java.awt.Color(3, 76, 56));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Funcionários", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        btn_FaltasFunc.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn_FaltasFunc.setForeground(new java.awt.Color(0, 102, 102));
        btn_FaltasFunc.setText("FALTAS DO MÊS");
        btn_FaltasFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_FaltasFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FaltasFuncActionPerformed(evt);
            }
        });

        btn_Cafe.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn_Cafe.setForeground(new java.awt.Color(0, 102, 102));
        btn_Cafe.setText("HORA DO CAFÉ");
        btn_Cafe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Cafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CafeActionPerformed(evt);
            }
        });

        btn_BancoHoras.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn_BancoHoras.setForeground(new java.awt.Color(0, 102, 102));
        btn_BancoHoras.setText("BANCO DE HORAS");
        btn_BancoHoras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_BancoHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BancoHorasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_BancoHoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Cafe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_FaltasFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_FaltasFunc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Cafe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_BancoHoras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 418, -1, -1));

        jPanel9.setBackground(new java.awt.Color(3, 76, 56));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Escola", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        btn_FluxoCaixa.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn_FluxoCaixa.setForeground(new java.awt.Color(0, 102, 102));
        btn_FluxoCaixa.setText("FLUXO DE CAIXA");
        btn_FluxoCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_FluxoCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FluxoCaixaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(btn_FluxoCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(30, 30, 30)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(btn_FluxoCaixa)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, -1));

        jPanel10.setBackground(new java.awt.Color(3, 76, 56));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Consultas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        btn_Consultas.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn_Consultas.setForeground(new java.awt.Color(0, 102, 102));
        btn_Consultas.setText("CONSULTAS");
        btn_Consultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Consultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(btn_Consultas, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addGap(30, 30, 30)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(btn_Consultas)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 658, -1, -1));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1037, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 708, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 22, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btn_CadmaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadmaeActionPerformed

        IFrm_CadMae frm = new IFrm_CadMae();
        jDesktopPane1.add(frm);
        int x = (jDesktopPane1.getWidth() / 2) - frm.getWidth() / 2;
        int y = (jDesktopPane1.getHeight() / 2) - frm.getHeight() / 2;
        frm.setLocation(x, y);

        frm.setVisible(true);
    }//GEN-LAST:event_btn_CadmaeActionPerformed

    private void btn_CadPaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadPaiActionPerformed
        IFrm_CadPai frm = new IFrm_CadPai();
        jDesktopPane1.add(frm);
        int x = (jDesktopPane1.getWidth() / 2) - frm.getWidth() / 2;
        int y = (jDesktopPane1.getHeight() / 2) - frm.getHeight() / 2;
        frm.setLocation(x, y);

        frm.setVisible(true);
    }//GEN-LAST:event_btn_CadPaiActionPerformed

    private void btn_CadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadAlunoActionPerformed
        IFrm_CadAluno frm = new IFrm_CadAluno();
        jDesktopPane1.add(frm);
        int x = (jDesktopPane1.getWidth() / 2) - frm.getWidth() / 2;
        int y = (jDesktopPane1.getHeight() / 2) - frm.getHeight() / 2;
        frm.setLocation(x, y);

        frm.setVisible(true);
    }//GEN-LAST:event_btn_CadAlunoActionPerformed

    private void btn_CadFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadFuncActionPerformed
        IFrm_CadFunc frm = new IFrm_CadFunc();
        jDesktopPane1.add(frm);
        int x = (jDesktopPane1.getWidth() / 2) - frm.getWidth() / 2;
        int y = (jDesktopPane1.getHeight() / 2) - frm.getHeight() / 2;
        frm.setLocation(x, y);

        frm.setVisible(true);
    }//GEN-LAST:event_btn_CadFuncActionPerformed

    private void btn_ChamadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChamadaActionPerformed
        IFrm_Presenca frm = new IFrm_Presenca();
        jDesktopPane1.add(frm);
        int x = (jDesktopPane1.getWidth() / 2) - frm.getWidth() / 2;
        int y = (jDesktopPane1.getHeight() / 2) - frm.getHeight() / 2;
        frm.setLocation(x, y);

        frm.setVisible(true);
    }//GEN-LAST:event_btn_ChamadaActionPerformed

    private void btn_FestasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FestasActionPerformed
        IFrm_Festa frm = new IFrm_Festa();
        jDesktopPane1.add(frm);
        int x = (jDesktopPane1.getWidth() / 2) - frm.getWidth() / 2;
        int y = (jDesktopPane1.getHeight() / 2) - frm.getHeight() / 2;
        frm.setLocation(x, y);

        frm.setVisible(true);
    }//GEN-LAST:event_btn_FestasActionPerformed

    private void btn_VisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VisitasActionPerformed
        IFrm_Visita frm = new IFrm_Visita();
        jDesktopPane1.add(frm);
        int x = (jDesktopPane1.getWidth() / 2) - frm.getWidth() / 2;
        int y = (jDesktopPane1.getHeight() / 2) - frm.getHeight() / 2;
        frm.setLocation(x, y);

        frm.setVisible(true);
    }//GEN-LAST:event_btn_VisitasActionPerformed

    private void btn_DesligamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DesligamentoActionPerformed
        IFrm_Desligamento frm = new IFrm_Desligamento();
        jDesktopPane1.add(frm);
        int x = (jDesktopPane1.getWidth() / 2) - frm.getWidth() / 2;
        int y = (jDesktopPane1.getHeight() / 2) - frm.getHeight() / 2;
        frm.setLocation(x, y);

        frm.setVisible(true);
    }//GEN-LAST:event_btn_DesligamentoActionPerformed

    private void btn_FaltasFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FaltasFuncActionPerformed
        IFrm_FaltaFunc frm = new IFrm_FaltaFunc();
        jDesktopPane1.add(frm);
        int x = (jDesktopPane1.getWidth() / 2) - frm.getWidth() / 2;
        int y = (jDesktopPane1.getHeight() / 2) - frm.getHeight() / 2;
        frm.setLocation(x, y);

        frm.setVisible(true);
    }//GEN-LAST:event_btn_FaltasFuncActionPerformed

    private void btn_CafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CafeActionPerformed
        IFrm_Presenca frm = new IFrm_Presenca();
        jDesktopPane1.add(frm);
        int x = (jDesktopPane1.getWidth() / 2) - frm.getWidth() / 2;
        int y = (jDesktopPane1.getHeight() / 2) - frm.getHeight() / 2;
        frm.setLocation(x, y);

        frm.setVisible(true);
    }//GEN-LAST:event_btn_CafeActionPerformed

    private void btn_BancoHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BancoHorasActionPerformed
        IFrm_BancoHoras frm = new IFrm_BancoHoras();
        jDesktopPane1.add(frm);
        int x = (jDesktopPane1.getWidth() / 2) - frm.getWidth() / 2;
        int y = (jDesktopPane1.getHeight() / 2) - frm.getHeight() / 2;
        frm.setLocation(x, y);

        frm.setVisible(true);
    }//GEN-LAST:event_btn_BancoHorasActionPerformed

    private void btn_FluxoCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FluxoCaixaActionPerformed
        IFrm_FluxodeCaixa frm = new IFrm_FluxodeCaixa();
        jDesktopPane1.add(frm);
        int x = (jDesktopPane1.getWidth() / 2) - frm.getWidth() / 2;
        int y = (jDesktopPane1.getHeight() / 2) - frm.getHeight() / 2;
        frm.setLocation(x, y);

        frm.setVisible(true);
    }//GEN-LAST:event_btn_FluxoCaixaActionPerformed

    private void btn_ConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultasActionPerformed
        IFrm_Consulta frm = new IFrm_Consulta();
        jDesktopPane1.add(frm);
        int x = (jDesktopPane1.getWidth() / 2) - frm.getWidth() / 2;
        int y = (jDesktopPane1.getHeight() / 2) - frm.getHeight() / 2;
        frm.setLocation(x, y);

        frm.setVisible(true);
    }//GEN-LAST:event_btn_ConsultasActionPerformed

    private void btn_turmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_turmaActionPerformed
        Ifrm_Turma frm = new Ifrm_Turma();
        jDesktopPane1.add(frm);
        int x = (jDesktopPane1.getWidth() / 2) - frm.getWidth() / 2;
        int y = (jDesktopPane1.getHeight() / 2) - frm.getHeight() / 2;
        frm.setLocation(x, y);

        frm.setVisible(true);
    }//GEN-LAST:event_btn_turmaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_BancoHoras;
    private javax.swing.JButton btn_CadAluno;
    private javax.swing.JButton btn_CadFunc;
    private javax.swing.JButton btn_CadPai;
    private javax.swing.JButton btn_Cadmae;
    private javax.swing.JButton btn_Cafe;
    private javax.swing.JButton btn_Chamada;
    private javax.swing.JButton btn_Consultas;
    private javax.swing.JButton btn_Desligamento;
    private javax.swing.JButton btn_FaltasFunc;
    private javax.swing.JButton btn_Festas;
    private javax.swing.JButton btn_FluxoCaixa;
    private javax.swing.JButton btn_Visitas;
    private javax.swing.JButton btn_turma;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
