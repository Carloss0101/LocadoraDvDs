// Carlos Eduardo Gonçalves  2706946

import javax.swing.JOptionPane;

public class FormFilme extends javax.swing.JFrame {
    private static FormFilme controleUnico;
    
    private DBFilme gp;
    
    private FormFilme() {
        gp = DBFilme.geraDBFilme(); 
        initComponents();
    }
    
    //MÉTODO SINGLETON
    public static FormFilme geraFormFilme() {  
        if (controleUnico == null) {
            controleUnico = new FormFilme();
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
        cxDuracao = new javax.swing.JTextField();
        rtDuracao = new javax.swing.JLabel();
        rtClassificacao = new javax.swing.JLabel();
        cxClassificacao = new javax.swing.JTextField();
        rtLocal = new javax.swing.JLabel();
        cxLocal = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btConsFilmes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de filmes");

        rtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rtTitulo.setText("Gerenciamento de Filmes");

        rtNome.setText("Nome:");

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

        rtDuracao.setText("Duração (min):");

        rtClassificacao.setText("Classificação:");

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

        btConsFilmes.setText("Consultar os Filmes...");
        btConsFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsFilmesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtTamanho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rtClassificacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rtDuracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rtLancamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rtQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxClassificacao)
                            .addComponent(cxLocal)
                            .addComponent(cxTamanho)
                            .addComponent(cxDuracao)
                            .addComponent(cxLancamento)
                            .addComponent(cxDescricao)
                            .addComponent(cxGenero)
                            .addComponent(cxQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(cxNome)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btConsFilmes, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rtTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btInserir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btConsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btExcluir)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSair)
                .addGap(29, 29, 29))
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
                    .addComponent(rtDuracao)
                    .addComponent(cxDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtClassificacao)
                    .addComponent(cxClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtLocal)
                    .addComponent(cxLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserir)
                    .addComponent(btConsultar)
                    .addComponent(btEditar)
                    .addComponent(btExcluir))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btConsFilmes))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxQuantidadeActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        cadastrarFilme();
    }//GEN-LAST:event_btInserirActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultarFilme();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        editarFilme();
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        deletarFilme();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btConsFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsFilmesActionPerformed
        RelatorioFilme.geraRelFilme().setVisible(true);
    }//GEN-LAST:event_btConsFilmesActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private Filme validarDados() {
        Filme f = new Filme();
        
        try {
            f.setNome(cxNome.getText());
            f.getEslq().setQuantidade(Integer.parseInt(cxQuantidade.getText()));
            f.setGenero(cxGenero.getText());
            f.setDescricao(cxDescricao.getText());
            f.setLancamento(Integer.parseInt(cxLancamento.getText()));
            f.setTamanho(Integer.parseInt(cxTamanho.getText()));
            f.setDuracao(Integer.parseInt(cxDuracao.getText()));
            f.setClassificacao(Integer.parseInt(cxClassificacao.getText()));
            f.getEslq().setLocal(cxLocal.getText());
            
            return f;
        } catch (DadoVazioException e) {
            JOptionPane.showMessageDialog(
                null,
                "Todos os valores precisam ser preenchidos. ",
                "Cadastro de Filmes",
                0);
            return null;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                null,
                "Os valores de Quantidade, Lançamento, Tamanho, Duração e Classificação precisam ser inteiros.",
                "Cadastro de Filmes",
                0);
            return null;
        } catch (QuantidadeInvalidaException e) {
            JOptionPane.showMessageDialog(
                null,
                "Quantidade Inválidas. Precisa ser maior que 0.",
                "Cadastro de Filmes",
                0);
            return null;
        }
    }
    
    private void cadastrarFilme() {
        Filme f = validarDados();
        
        if(f != null) {
            Filme insPes = gp.inserirFilme(f);
            JOptionPane.showMessageDialog(
                   null,
                   "Filme " + insPes.getNome() + " Cadastrado.",
                   "Cadastro de Filmes",
                   1);
            limpar();
        } 
    }
    
    private void consultarFilme() {
        Filme f = new Filme();
        try {
            f.setNome(cxNome.getText());
        } catch (DadoVazioException ex) {
            JOptionPane.showMessageDialog(
                   null,
                   "Nome inválido. A pesquisa é feita pelo nome.",
                   "Cadastro de Filmes",
                   0);
            return;
        }
        
        f = gp.consFilmeNome(f);
        
        if (f != null) { 
            cxNome.setText(f.getNome());
            cxQuantidade.setText(String.valueOf(f.getEslq().getQuantidade()));        
            cxGenero.setText(f.getGenero());
            cxDescricao.setText(f.getDescricao());
            cxLancamento.setText(String.valueOf(f.getLancamento()));
            cxTamanho.setText(String.valueOf(f.getTamanho()));
            cxDuracao.setText(String.valueOf(f.getDuracao()));
            cxClassificacao.setText(String.valueOf(f.getClassificacao()));
            cxLocal.setText(f.getEslq().getLocal());
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Filme não encontrado na lista.",
                    "Consultar Filme",
                    0);
            limpar(); 
        }
    }
    
    private void editarFilme() {
        Filme f = validarDados();
        
        if (f == null) {
            return; 
        }
        try {    
            f = gp.editFilme(f);
                
            if(f != null) {
                JOptionPane.showMessageDialog(
                       null,
                       "Filme Editado com Sucesso.",
                       "Cadastro de Filmes",
                       1);
            }
            limpar();
        } catch (DadoVazioException ex) {
            JOptionPane.showMessageDialog(
                       null,
                       "Todos os valores precisam ser preenchidos.",
                       "Cadastro de Filmes",
                       0);
        } catch (QuantidadeInvalidaException ex) {
            JOptionPane.showMessageDialog(
                       null,
                       "Quantidade Inválidas. Precisa ser maior que 0.",
                       "Cadastro de Filmes",
                       0);
        }
    }
    
    private void deletarFilme() {
        Filme f = new Filme();
        try {
            f.setNome(cxNome.getText());
        } catch (DadoVazioException ex) {
            JOptionPane.showMessageDialog(
                   null,
                   "Nome inválido. A Deleção é feita pelo nome.",
                   "Cadastro de Filmes",
                   0);
            return;
        }
        
        boolean res = gp.delFilme(f);
        
        if(res) {
            limpar();
            JOptionPane.showMessageDialog(
                null,
                "Filme deletado com sucesso.",
                "Cadastro de Filmes",
                1);
        } else {
            JOptionPane.showMessageDialog(
                null,
                "Filme não encontrado.",
                "Cadastro de Filmes",
                0);
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
    
    
    private void limpar() {
        cxNome.setText("");
        cxQuantidade.setText("");        
        cxGenero.setText("");
        cxDescricao.setText("");
        cxLancamento.setText("");
        cxTamanho.setText("");
        cxDuracao.setText("");
        cxClassificacao.setText("");
        cxLocal.setText("");
    }
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormFilme().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsFilmes;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxClassificacao;
    private javax.swing.JTextField cxDescricao;
    private javax.swing.JTextField cxDuracao;
    private javax.swing.JTextField cxGenero;
    private javax.swing.JTextField cxLancamento;
    private javax.swing.JTextField cxLocal;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxQuantidade;
    private javax.swing.JTextField cxTamanho;
    private javax.swing.JLabel rtClassificacao;
    private javax.swing.JLabel rtDescricao;
    private javax.swing.JLabel rtDuracao;
    private javax.swing.JLabel rtGenero;
    private javax.swing.JLabel rtLancamento;
    private javax.swing.JLabel rtLocal;
    private javax.swing.JLabel rtNome;
    private javax.swing.JLabel rtQuantidade;
    private javax.swing.JLabel rtTamanho;
    private javax.swing.JLabel rtTitulo;
    // End of variables declaration//GEN-END:variables
}
