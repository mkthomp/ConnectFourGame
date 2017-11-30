

package connect.four.gui;


public class GameOverPanel extends javax.swing.JPanel {

	GUI gui;
	
	public GameOverPanel(GUI gui, String winner, int score1, int score2,
			String plyr1, String plyr2) {
		initComponents();
		this.gui = gui;
		setSize(1280, 800);
		System.out.println("Here!");
		winnerDisplay.setText(winner);
		scoreDisplay1.setText("" + score1);
		scoreDisplay2.setText("" + score2);
		nameDisplay1.setText(plyr1 + ":  ");
		nameDisplay2.setText(plyr2 + ":  ");
		setVisible(true);
	}
	
	

	
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                winnerDisplay = new javax.swing.JLabel();
                winner = new javax.swing.JLabel();
                labelScore = new javax.swing.JLabel();
                scoreDisplay1 = new javax.swing.JLabel();
                scoreDisplay2 = new javax.swing.JLabel();
                nameDisplay1 = new javax.swing.JLabel();
                nameDisplay2 = new javax.swing.JLabel();
                labelGameOVer = new javax.swing.JLabel();
                butPlayAgain = new javax.swing.JButton();
                butMainMenu = new javax.swing.JButton();

                setBackground(new java.awt.Color(0, 0, 0));

                winnerDisplay.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
                winnerDisplay.setForeground(new java.awt.Color(255, 255, 255));
                winnerDisplay.setText("Winner");

                winner.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
                winner.setForeground(new java.awt.Color(255, 255, 255));
                winner.setText("Winner:");
                
                labelScore.setFont(new java.awt.Font("Lucida Grande", 0, 32)); // NOI18N
                labelScore.setForeground(new java.awt.Color(255, 255, 255));
                labelScore.setText("Score:");
                
                scoreDisplay1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
                scoreDisplay1.setForeground(new java.awt.Color(255, 255, 255));
                scoreDisplay1.setText("Score 1");
                
                scoreDisplay2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
                scoreDisplay2.setForeground(new java.awt.Color(255, 255, 255));
                scoreDisplay2.setText("Score 2");
                
                nameDisplay1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
                nameDisplay1.setForeground(new java.awt.Color(255, 255, 255));
                nameDisplay1.setText("Name 1:");
                
                nameDisplay2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
                nameDisplay2.setForeground(new java.awt.Color(255, 255, 255));
                nameDisplay2.setText("Name 2:");

                labelGameOVer.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
                labelGameOVer.setForeground(new java.awt.Color(255, 255, 255));
                labelGameOVer.setText("GAME OVER");

                butPlayAgain.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
                butPlayAgain.setText("Play Again");
                butPlayAgain.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                butPlayAgainActionPerformed(evt);
                        }
                });

                butMainMenu.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
                butMainMenu.setText("Main Menu");
                butMainMenu.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                butMainMenuActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(499, 499, 499)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(winner)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(winnerDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup())
                                                        		.addComponent(labelScore)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(nameDisplay1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(scoreDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(nameDisplay2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(scoreDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(butPlayAgain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(labelGameOVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))                                      
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(551, 551, 551)
                                                .addComponent(butMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(429, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(labelGameOVer)
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(winnerDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(winner, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)  
                                .addComponent(labelScore)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(scoreDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(scoreDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addComponent(butPlayAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(butMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(304, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void butPlayAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPlayAgainActionPerformed
                
		gui.remove(this);
		gui.addGamePanel();
		gui.revalidate();
		gui.repaint();
        }//GEN-LAST:event_butPlayAgainActionPerformed

        private void butMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butMainMenuActionPerformed
		gui.remove(this);
		gui.addMainMenu();
		gui.revalidate();
		gui.repaint();
        }//GEN-LAST:event_butMainMenuActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton butMainMenu;
        private javax.swing.JButton butPlayAgain;
        private javax.swing.JLabel labelGameOVer;
        private javax.swing.JLabel labelScore;
        private javax.swing.JLabel winner;
        private javax.swing.JLabel winnerDisplay;
        private javax.swing.JLabel scoreDisplay1;
        private javax.swing.JLabel scoreDisplay2;
        private javax.swing.JLabel nameDisplay1;
        private javax.swing.JLabel nameDisplay2;
        // End of variables declaration//GEN-END:variables
}
