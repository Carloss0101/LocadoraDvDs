//Versão do NetBeans: Apache NetBeans IDE 26.0
//Versão do java: 24.0.2
//Carlos Eduardo Gonçalves - 2706946

import javax.swing.JOptionPane;

public class FormPrincipal extends javax.swing.JFrame {
    
    public FormPrincipal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        rtTitulo = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mNFilmes = new javax.swing.JMenuItem();
        mNSeries = new javax.swing.JMenuItem();
        mNDocumentarios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mNConsFilme = new javax.swing.JMenuItem();
        mNConsSerie = new javax.swing.JMenuItem();
        mNConsDocumentario = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu principal");

        rtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtTitulo.setText("Sistema de Gerenciamento de DvDs");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        jMenu1.setText("Gerenciamento");

        mNFilmes.setText("Filmes...");
        mNFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNFilmesActionPerformed(evt);
            }
        });
        jMenu1.add(mNFilmes);

        mNSeries.setText("Séries...");
        mNSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNSeriesActionPerformed(evt);
            }
        });
        jMenu1.add(mNSeries);

        mNDocumentarios.setText("Documentários...");
        mNDocumentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNDocumentariosActionPerformed(evt);
            }
        });
        jMenu1.add(mNDocumentarios);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatórios");

        mNConsFilme.setText("Filmes...");
        mNConsFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNConsFilmeActionPerformed(evt);
            }
        });
        jMenu2.add(mNConsFilme);

        mNConsSerie.setText("Series...");
        mNConsSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNConsSerieActionPerformed(evt);
            }
        });
        jMenu2.add(mNConsSerie);

        mNConsDocumentario.setText("Documentários...");
        mNConsDocumentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNConsDocumentarioActionPerformed(evt);
            }
        });
        jMenu2.add(mNConsDocumentario);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(rtTitulo)
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(rtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(btSair)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mNConsFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNConsFilmeActionPerformed
        RelatorioFilme.geraRelFilme().setVisible(true);
    }//GEN-LAST:event_mNConsFilmeActionPerformed

    private void mNFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNFilmesActionPerformed
        FormFilme.geraFormFilme().setVisible(true);
    }//GEN-LAST:event_mNFilmesActionPerformed

    private void mNSeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNSeriesActionPerformed
        FormSerie.geraFormSerie().setVisible(true);
    }//GEN-LAST:event_mNSeriesActionPerformed

    private void mNConsSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNConsSerieActionPerformed
        RelatorioSerie.geraRelSerie().setVisible(true);
    }//GEN-LAST:event_mNConsSerieActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void mNDocumentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNDocumentariosActionPerformed
        FormDocumentario.geraFormDocumentario().setVisible(true);
    }//GEN-LAST:event_mNDocumentariosActionPerformed

    private void mNConsDocumentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNConsDocumentarioActionPerformed
        RelatorioDocumentario.geraRelDocumentario().setVisible(true);
    }//GEN-LAST:event_mNConsDocumentarioActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(() -> new FormPrincipal().setVisible(true));
    }
    
    public void sair(){
        int resp = JOptionPane.showConfirmDialog(
                null,
                "Deseja realmente sair?",
                "Saida",
                JOptionPane.YES_NO_OPTION
        );
        if(resp == 0){
            dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem mNConsDocumentario;
    private javax.swing.JMenuItem mNConsFilme;
    private javax.swing.JMenuItem mNConsSerie;
    private javax.swing.JMenuItem mNDocumentarios;
    private javax.swing.JMenuItem mNFilmes;
    private javax.swing.JMenuItem mNSeries;
    private javax.swing.JLabel rtTitulo;
    // End of variables declaration//GEN-END:variables
}
