// Carlos Eduardo Gonçalves  2706946

import javax.swing.JOptionPane;

public class FormSerie extends javax.swing.JFrame {
    private static FormSerie controleUnico;
    private DBSerie gp;
    
    private FormSerie() {
        gp = DBSerie.geraDBSerie(); 
        initComponents();
    }
    
    //MÉTODO SINGLETON
    public static FormSerie geraFormSerie() {  
        if (controleUnico == null) {
            controleUnico = new FormSerie();
        }
        return controleUnico;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rtTitulo = new javax.swing.JLabel();
        rtNome = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        rtQuantidade = new javax.swing.JLabel();
        cxQuantidade = new javax.swing.JTextField();
        cxGenero = new javax.swing.JTextField();
        rtGenero = new javax.swing.JLabel();
        cxDescricao = new javax.swing.JTextField();
        rtDescricao = new javax.swing.JLabel();
        rtLancamento = new javax.swing.JLabel();
        cxLancamento = new javax.swing.JTextField();
        cxTamanho = new javax.swing.JTextField();
        rtTamanho = new javax.swing.JLabel();
        cxEpisodios = new javax.swing.JTextField();
        rtEpisodios = new javax.swing.JLabel();
        rtTemporadas = new javax.swing.JLabel();
        cxTemporadas = new javax.swing.JTextField();
        rtLocal = new javax.swing.JLabel();
        cxLocal = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btConsSeries = new javax.swing.JButton();
        rtStatus = new javax.swing.JLabel();
        cxStatus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Séries");

        rtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtTitulo.setText("Gerenciamento de Series");

        rtNome.setText("Nome:");

        cxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomeActionPerformed(evt);
            }
        });

        rtQuantidade.setText("Quantidade:");

        cxQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxQuantidadeActionPerformed(evt);
            }
        });

        rtGenero.setText("Genero:");

        rtDescricao.setText("Descrição:");

        rtLancamento.setText("Ano Lançamento:");

        rtTamanho.setText("Tamanho (Gigas):");

        rtEpisodios.setText("Epsódios:");

        rtTemporadas.setText("Temporadas:");

        rtLocal.setText("Local:");

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btConsultar.setText("Pesquisar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btConsSeries.setText("Consultar as Séries...");
        btConsSeries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsSeriesActionPerformed(evt);
            }
        });

        rtStatus.setText("Status:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btConsSeries, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(btSair)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rtTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rtTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rtTemporadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rtEpisodios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rtLancamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rtQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(rtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxTemporadas)
                            .addComponent(cxLocal)
                            .addComponent(cxStatus)
                            .addComponent(cxEpisodios, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxTamanho, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxLancamento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxDescricao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxGenero, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxQuantidade)
                            .addComponent(cxNome))))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtQuantidade)
                    .addComponent(cxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtGenero)
                    .addComponent(cxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtDescricao)
                    .addComponent(cxDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtLancamento)
                    .addComponent(cxLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtTamanho)
                    .addComponent(cxTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtEpisodios)
                    .addComponent(cxEpisodios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtTemporadas)
                    .addComponent(cxTemporadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtLocal)
                    .addComponent(cxLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtStatus)
                    .addComponent(cxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserir)
                    .addComponent(btConsultar)
                    .addComponent(btEditar)
                    .addComponent(btExcluir))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btConsSeries))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxQuantidadeActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        cadastrarSerie();
    }//GEN-LAST:event_btInserirActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultarSerie();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        editarSerie();
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        deletarSerie();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btConsSeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsSeriesActionPerformed
        RelatorioSerie.geraRelSerie().setVisible(true);
    }//GEN-LAST:event_btConsSeriesActionPerformed

    private void cxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private Serie validarDados() {
        Serie f = new Serie();
        
        try {
            f.setNome(cxNome.getText());
            f.getEslq().setQuantidade(Integer.parseInt(cxQuantidade.getText()));
            f.setGenero(cxGenero.getText());
            f.setDescricao(cxDescricao.getText());
            f.setLancamento(Integer.parseInt(cxLancamento.getText()));
            f.setTamanho(Integer.parseInt(cxTamanho.getText()));
            f.setTemporadas(Integer.parseInt(cxTemporadas.getText()));
            f.setEpisodios(Integer.parseInt(cxEpisodios.getText()));
            f.setStatus(cxStatus.getText());
            f.getEslq().setLocal(cxLocal.getText());
            
            return f;
        } catch (DadoVazioException e) {
            JOptionPane.showMessageDialog(
                null,
                "Todos os valores precisam ser preenchidos. ",
                "Cadastro de Series",
                0);
            return null;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                null,
                "Os valores de Tamanho, Temporadas e Episódios precisam ser inteiros.",
                "Cadastro de Series",
                0);
            return null;
        } catch (QuantidadeInvalidaException e) {
            JOptionPane.showMessageDialog(
                null,
                "Quantidade Inválidas. Precisa ser maior que 0.",
                "Cadastro de Series",
                0);
            return null;
        }
    }
    
    private void cadastrarSerie() {
        Serie s = validarDados();
        
        if(s != null) {
            Serie inserirSerie = gp.inserirSerie(s);
            JOptionPane.showMessageDialog(
                   null,
                   "Serie " + inserirSerie.getNome() + " Cadastrado.",
                   "Cadastro de Filmes",
                   1);
            limpar();
        } 
    }
    
    private void consultarSerie() {
        Serie s = new Serie();
        try {
            s.setNome(cxNome.getText());
        } catch (DadoVazioException ex) {
            JOptionPane.showMessageDialog(
                   null,
                   "Nome inválido. A pesquisa é feita pelo nome.",
                   "Cadastro de Filmes",
                   0);
            return;
        }
        
        s = gp.consSerieNome(s);
        
        cxNome.setText(s.getNome());
        cxQuantidade.setText(String.valueOf(s.getEslq().getQuantidade()));        
        cxGenero.setText(s.getGenero());
        cxDescricao.setText(s.getDescricao());
        cxLancamento.setText(String.valueOf(s.getLancamento()));
        cxTamanho.setText(String.valueOf(s.getTamanho()));

        cxTemporadas.setText(String.valueOf(s.getTemporadas()));
        cxEpisodios.setText(String.valueOf(s.getEpisodios()));
        cxStatus.setText(s.getStatus());

        cxLocal.setText(s.getEslq().getLocal());

    }
    
    private void editarSerie() {
        Serie f = validarDados();
        
        if (f == null) {
            return; 
        }
        try {    
           f = gp.editSerie(f);
                
            if(f != null) {
                JOptionPane.showMessageDialog(
                       null,
                       "Serie Editado com Sucesso.",
                       "Cadastro de Series",
                       1);
            }
            limpar();
        } catch (DadoVazioException ex) {
            JOptionPane.showMessageDialog(
                       null,
                       "Todos os valores precisam ser preenchidos.",
                       "Cadastro de Series",
                       0);
        } catch (QuantidadeInvalidaException ex) {
            JOptionPane.showMessageDialog(
                       null,
                       "Quantidade Inválidas. Precisa ser maior que 0.",
                       "Cadastro de Series",
                       0);
        }
    }
    
    private void deletarSerie() {
        Serie s = new Serie();
        try {
            s.setNome(cxNome.getText());
        } catch (DadoVazioException ex) {
            JOptionPane.showMessageDialog(
                   null,
                   "Nome inválido. A Deleção é feita pelo nome.",
                   "Cadastro de Series",
                   0);
            return;
        }
        
        boolean res = gp.delSerie(s);
        
        if(res) {
            limpar();
            JOptionPane.showMessageDialog(
                null,
                "Serie deletada com sucesso.",
                "Cadastro de Series",
                1);
        } else {
            JOptionPane.showMessageDialog(
                null,
                "Serie não encontrado.",
                "Cadastro de Series",
                0);
        }
    }
    
    
    private void limpar() {
        cxNome.setText("");
        cxQuantidade.setText("");        
        cxGenero.setText("");
        cxDescricao.setText("");
        cxLancamento.setText("");
        cxTamanho.setText("");
        cxTemporadas.setText("");
        cxEpisodios.setText("");
        cxStatus.setText("");
        cxLocal.setText("");
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
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormSerie().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsSeries;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxDescricao;
    private javax.swing.JTextField cxEpisodios;
    private javax.swing.JTextField cxGenero;
    private javax.swing.JTextField cxLancamento;
    private javax.swing.JTextField cxLocal;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxQuantidade;
    private javax.swing.JTextField cxStatus;
    private javax.swing.JTextField cxTamanho;
    private javax.swing.JTextField cxTemporadas;
    private javax.swing.JLabel rtDescricao;
    private javax.swing.JLabel rtEpisodios;
    private javax.swing.JLabel rtGenero;
    private javax.swing.JLabel rtLancamento;
    private javax.swing.JLabel rtLocal;
    private javax.swing.JLabel rtNome;
    private javax.swing.JLabel rtQuantidade;
    private javax.swing.JLabel rtStatus;
    private javax.swing.JLabel rtTamanho;
    private javax.swing.JLabel rtTemporadas;
    private javax.swing.JLabel rtTitulo;
    // End of variables declaration//GEN-END:variables
}
