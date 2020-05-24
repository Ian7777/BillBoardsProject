package com.billboards.ui;

import com.billboards.data.Data;

public class PermissionShowJFrame extends javax.swing.JFrame {

	/**
	 * Creates new form PermissionJFrame
	 */
	public PermissionShowJFrame() {
		initComponents();
	}

	private void initComponents() {

		jCheckBox1 = new javax.swing.JCheckBox();
		jCheckBox2 = new javax.swing.JCheckBox();
		jCheckBox3 = new javax.swing.JCheckBox();
		jCheckBox4 = new javax.swing.JCheckBox();
		jButton2 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		// jCheckBox1.setSelected(true);
		jCheckBox1.setText("Create Billboards");
		jCheckBox1.setToolTipText("");
		jCheckBox1.setEnabled(false);
		if (Data.chebox1 == 1) {
			jCheckBox1.setSelected(true);
		} else {
			jCheckBox1.setSelected(false);
		}

		jCheckBox2.setText("Edit All Billboards");
		jCheckBox2.setToolTipText("");
		jCheckBox2.setEnabled(false);
		if (Data.chebox2 == 1) {
			jCheckBox2.setSelected(true);
		} else {
			jCheckBox2.setSelected(false);
		}

		jCheckBox3.setText("Schedule Billboards");
		jCheckBox3.setToolTipText("");
		jCheckBox3.setEnabled(false);
		if (Data.chebox3 == 1) {
			jCheckBox3.setSelected(true);
		} else {
			jCheckBox3.setSelected(false);
		}

		jCheckBox4.setSelected(true);
		jCheckBox4.setText("Edit Users");
		jCheckBox4.setToolTipText("");
		jCheckBox4.setEnabled(false);
		if (Data.chebox4 == 1) {
			jCheckBox4.setSelected(true);
		} else {
			jCheckBox4.setSelected(false);
		}

		jButton2.setText("return");
		jButton2.setMaximumSize(new java.awt.Dimension(75, 23));
		jButton2.setMinimumSize(new java.awt.Dimension(75, 23));
		jButton2.setPreferredSize(new java.awt.Dimension(75, 23));
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(44, 44,
																		44)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jCheckBox1)
																				.addComponent(
																						jCheckBox3))
																.addGap(32, 32,
																		32)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jCheckBox2)
																				.addComponent(
																						jCheckBox4)))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(161,
																		161,
																		161)
																.addComponent(
																		jButton2,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(59, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(70, 70, 70)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jCheckBox1)
												.addComponent(jCheckBox2))
								.addGap(43, 43, 43)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jCheckBox3)
												.addComponent(jCheckBox4))
								.addGap(48, 48, 48)
								.addComponent(jButton2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(70, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		/*setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		MainJFrame mainFrame = new MainJFrame();
		mainFrame.setTitle("Billboard Control Panel");
		mainFrame.setVisible(true);		
*/
		 this.dispose();
	}

	// Variables declaration - do not modify
	private javax.swing.JButton jButton2;
	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JCheckBox jCheckBox2;
	private javax.swing.JCheckBox jCheckBox3;
	private javax.swing.JCheckBox jCheckBox4;
	// End of variables declaration
}