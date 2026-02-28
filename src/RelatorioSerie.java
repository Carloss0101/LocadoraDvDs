// Carlos Eduardo Gonçalves  2706946

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RelatorioSerie extends javax.swing.JFrame {
    private DBSerie gp;
    private Serie s1 = new Serie();
    
    private static RelatorioSerie controleUnico; 
    
    private RelatorioSerie() {
        initComponents();
        gp = DBSerie.geraDBSerie();
    }
    
    //MÉTODO SINGLETON
    public static RelatorioSerie geraRelSerie(){ 
        if(controleUnico == null){
            controleUnico = new RelatorioSerie();
        }
        return controleUnico;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabPes2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabSeries = new javax.swing.JTable();
        rtTitulo = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();

        tabPes2.setModel(new javax.swing.table.DefaultTableModel(
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
        tabPes2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPes2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabPes2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório Series");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tabSeries.setModel(new javax.swing.table.DefaultTableModel(
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
        tabSeries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabSeriesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabSeries);

        rtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtTitulo.setText("Relatório de Series");

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
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rtTitulo)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(rtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btSair)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabPes2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPes2MouseClicked
        //selecTab();
    }//GEN-LAST:event_tabPes2MouseClicked

    private void tabSeriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabSeriesMouseClicked
        selecionarLinha();
    }//GEN-LAST:event_tabSeriesMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        consTabSeries();
    }//GEN-LAST:event_formWindowActivated

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed
    
    public void consTabSeries(){
        DefaultTableModel tabModel = (DefaultTableModel) tabSeries.getModel();

        tabModel.setRowCount(0);

        for (Serie s : gp.getDBSerie()){
            tabModel.addRow(new Object[]{
                s.getNome(),
                s.getLancamento(),
                s.getEslq().getQuantidade()
            });
        }
    }
    
    public void selecionarLinha() {
        int posLin = tabSeries.getSelectedRow();

        if (posLin >= 0) {

            String nome = tabSeries.getValueAt(posLin, 0).toString();

            Serie s = new Serie();
            try {
                s.setNome(nome); 

                Serie serie = DBSerie.geraDBSerie().consSerieNome(s);

                if (serie != null) {
                    String mensagem = "=== DETALHES DA SERIE ===\n\n";
                    mensagem += "Nome: " + serie.getNome() + "\n";
                    mensagem += "Gênero: " + serie.getGenero() + "\n";
                    mensagem += "Lançamento: " + serie.getLancamento() + "\n";
                    mensagem += "Status: " + serie.getStatus() + "\n";
                    mensagem += "Tamanho: " + serie.getTamanho() + " GB\n";
                    mensagem += "Temporadas: " + serie.getTemporadas() + "\n";                    
                    mensagem += "Episódios: " + serie.getEpisodios() + "\n";
                    mensagem += "Local no Estoque: " + serie.getEslq().getLocal() + "\n"; 
                    mensagem += "Quantidade: " + serie.getEslq().getQuantidade() + "\n";
                    mensagem += "------------------------\n";
                    mensagem += "Descrição: " + serie.getDescricao(); 

                    JOptionPane.showMessageDialog(null, mensagem, "Detalhes Série", 1);
                }

            } catch (DadoVazioException e) {
                JOptionPane.showMessageDialog(
                    null,
                    "Todos os valores precisam ser preenchidos. ",
                    "Relatório de Séries",
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel rtTitulo;
    private javax.swing.JTable tabPes2;
    private javax.swing.JTable tabSeries;
    // End of variables declaration//GEN-END:variables
}
