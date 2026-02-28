// Carlos Eduardo Gonçalves  2706946

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RelatorioFilme extends javax.swing.JFrame {

    private DBFilme gp;
    private Filme f1 = new Filme();

    private static RelatorioFilme controleUnico; 
    
    private RelatorioFilme() { 
        initComponents();
        gp = DBFilme.geraDBFilme();
    }
    
    //MÉTODO SINGLETON
    public static RelatorioFilme geraRelFilme(){ 
        if(controleUnico == null){
            controleUnico = new RelatorioFilme();
        }
        return controleUnico;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabFilmes = new javax.swing.JTable();
        rtTitulo = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório Filmes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tabFilmes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Ano", "Quantidade"
            }
        ));
        tabFilmes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabFilmesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabFilmes);

        rtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtTitulo.setText("Relatório de Filmes");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btSair)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rtTitulo)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(rtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSair)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        consTabPes();
    }//GEN-LAST:event_formWindowActivated

    private void tabFilmesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabFilmesMouseClicked
        selecionarLinha();
    }//GEN-LAST:event_tabFilmesMouseClicked

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed
    
    public void consTabPes(){
        DefaultTableModel tabModel = (DefaultTableModel) tabFilmes.getModel();

        tabModel.setRowCount(0); // limpa tabela

        for (Filme f : gp.getDBFilme()){
            tabModel.addRow(new Object[]{
                f.getNome(),
                f.getLancamento(),
                f.getEslq().getQuantidade()
            });
        }
    }
    
    
    public void selecionarLinha() {
        int posLin = tabFilmes.getSelectedRow();

        if (posLin >= 0) {

            String nome = tabFilmes.getValueAt(posLin, 0).toString();

            Filme f = new Filme();
            try {
                f.setNome(nome); 

                Filme filme = DBFilme.geraDBFilme().consFilmeNome(f);

                if (filme != null) {
                    String mensagem = "=== DETALHES DO FILME ===\n\n";
                    mensagem += "Nome: " + filme.getNome() + "\n";
                    mensagem += "Gênero: " + filme.getGenero() + "\n";
                    mensagem += "Lançamento: " + filme.getLancamento() + "\n";
                    mensagem += "Duração: " + filme.getDuracao() + " min\n";
                    mensagem += "Tamanho: " + filme.getTamanho() + " GB\n";
                    mensagem += "Classificação: " + filme.getClassificacao() + " anos\n";
                    mensagem += "Local no Estoque: " + filme.getEslq().getLocal() + "\n"; 
                    mensagem += "Quantidade: " + filme.getEslq().getQuantidade() + "\n";
                    mensagem += "------------------------\n";
                    mensagem += "Descrição: " + filme.getDescricao(); 

                    JOptionPane.showMessageDialog(null, mensagem, "Detalhes Filme", 1);
                }

            } catch (DadoVazioException e) {
                JOptionPane.showMessageDialog(
                    null,
                    "Todos os valores precisam ser preenchidos. ",
                    "Cadastro de Filmes",
                    0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela primeiro.");
        }
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rtTitulo;
    private javax.swing.JTable tabFilmes;
    // End of variables declaration//GEN-END:variables
}
