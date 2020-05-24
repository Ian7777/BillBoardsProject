package com.billboards.ui;

import java.awt.Dimension;
import java.awt.Toolkit;

public class MainJFrame extends javax.swing.JFrame {

	public MainJFrame() {
		initComponents();
	}

	private void initComponents() {

		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		jButton11 = new javax.swing.JButton();
		jButton12 = new javax.swing.JButton();
		jButton13 = new javax.swing.JButton();
		jButton14 = new javax.swing.JButton();
		jButton15 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton1.setText("Create Billboard");
		jButton1.setActionCommand("");
		jButton1.setMaximumSize(new java.awt.Dimension(141, 46));
		jButton1.setMinimumSize(new java.awt.Dimension(141, 46));
		jButton1.setPreferredSize(new java.awt.Dimension(141, 46));
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("Login");
		jButton2.setToolTipText("");
		jButton2.setMaximumSize(new java.awt.Dimension(141, 46));
		jButton2.setMinimumSize(new java.awt.Dimension(141, 46));
		jButton2.setPreferredSize(new java.awt.Dimension(141, 46));
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("List Billboard");
		jButton3.setToolTipText("");
		jButton3.setMaximumSize(new java.awt.Dimension(141, 46));
		jButton3.setMinimumSize(new java.awt.Dimension(141, 46));
		jButton3.setPreferredSize(new java.awt.Dimension(141, 46));

		jButton4.setText("Get information");
		jButton4.setToolTipText("");
		jButton4.setMaximumSize(new java.awt.Dimension(141, 46));
		jButton4.setMinimumSize(new java.awt.Dimension(141, 46));
		jButton4.setPreferredSize(new java.awt.Dimension(141, 46));

		jButton5.setText("DeleteBb");
		jButton5.setToolTipText("");
		jButton5.setMaximumSize(new java.awt.Dimension(141, 46));
		jButton5.setMinimumSize(new java.awt.Dimension(141, 46));
		jButton5.setPreferredSize(new java.awt.Dimension(141, 46));

		jButton6.setText("View Schedule");
		jButton6.setToolTipText("");
		jButton6.setMaximumSize(new java.awt.Dimension(141, 46));
		jButton6.setMinimumSize(new java.awt.Dimension(141, 46));
		jButton6.setPreferredSize(new java.awt.Dimension(141, 46));

		jButton7.setText("Schedule Billboard");
		jButton7.setToolTipText("");
		jButton7.setMaximumSize(new java.awt.Dimension(141, 46));
		jButton7.setPreferredSize(new java.awt.Dimension(141, 46));

		jButton8.setText("Remove schedule");
		jButton8.setToolTipText("");
		jButton8.setMaximumSize(new java.awt.Dimension(141, 46));
		jButton8.setMinimumSize(new java.awt.Dimension(141, 46));
		jButton8.setPreferredSize(new java.awt.Dimension(141, 46));

		jButton9.setText("List users");
		jButton9.setToolTipText("");
		jButton9.setMaximumSize(new java.awt.Dimension(141, 46));
		jButton9.setMinimumSize(new java.awt.Dimension(141, 46));
		jButton9.setPreferredSize(new java.awt.Dimension(141, 46));

		jButton10.setText("Create User");
		jButton10.setToolTipText("");
		jButton10.setMaximumSize(new java.awt.Dimension(141, 46));
		jButton10.setMinimumSize(new java.awt.Dimension(141, 46));
		jButton10.setPreferredSize(new java.awt.Dimension(141, 46));

		jButton11.setText("Get permissions");
		jButton11.setToolTipText("");
		jButton11.setMaximumSize(new java.awt.Dimension(141, 46));
		jButton11.setMinimumSize(new java.awt.Dimension(141, 46));
		jButton11.setPreferredSize(new java.awt.Dimension(141, 46));
		jButton11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton11ActionPerformed(evt);
			}
		});

		jButton12.setText("Set permissions");
		jButton12.setToolTipText("");
		jButton12.setMaximumSize(new java.awt.Dimension(141, 46));
		jButton12.setMinimumSize(new java.awt.Dimension(141, 46));
		jButton12.setPreferredSize(new java.awt.Dimension(141, 46));
		jButton12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton12ActionPerformed(evt);
			}
		});

		jButton13.setText("Set password");
		jButton13.setToolTipText("");
		jButton13.setMaximumSize(new java.awt.Dimension(141, 46));
		jButton13.setMinimumSize(new java.awt.Dimension(141, 46));
		jButton13.setPreferredSize(new java.awt.Dimension(141, 46));

		jButton14.setText("Delete user");
		jButton14.setMaximumSize(new java.awt.Dimension(141, 46));
		jButton14.setMinimumSize(new java.awt.Dimension(141, 46));
		jButton14.setPreferredSize(new java.awt.Dimension(141, 46));

		jButton15.setText("LogOut");
		jButton15.setToolTipText("");
		jButton15.setMaximumSize(new java.awt.Dimension(141, 46));
		jButton15.setMinimumSize(new java.awt.Dimension(141, 46));
		jButton15.setPreferredSize(new java.awt.Dimension(141, 46));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(26, 26, 26)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jButton1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton6,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton11,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(28, 28, 28)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jButton2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton7,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton12,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(27, 27, 27)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jButton3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton13,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton8,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(26, 26, 26)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jButton9,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton14,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton4,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(30, 30, 30)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jButton5,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton10,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton15,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(49, 49, 49)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jButton1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton4,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton5,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(28, 28, 28)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jButton6,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton7,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton8,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton9,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton10,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(33, 33, 33)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jButton11,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton12,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton13,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton14,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButton15,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(121, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		PermissionShowJFrame pframes = new PermissionShowJFrame();
		pframes.setTitle("Getting Permissions");
		int windowWidth = pframes.getWidth();
		int windowHeight = pframes.getHeight();
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		pframes.setLocation(screenWidth / 2 - windowWidth / 2, screenHeight / 2
				- windowHeight);
		pframes.setVisible(true);
	}

	private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		PermissionJFrame pframes = new PermissionJFrame();
		pframes.setTitle("Setting Permissions");
		int windowWidth = pframes.getWidth();
		int windowHeight = pframes.getHeight();
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		pframes.setLocation(screenWidth / 2 - windowWidth / 2, screenHeight / 2
				- windowHeight);
		pframes.setVisible(true);
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				MainJFrame mainFrame = new MainJFrame();
				mainFrame.setTitle("Billboard Control Panel");
				int windowWidth = mainFrame.getWidth();
				int windowHeight = mainFrame.getHeight();
				Toolkit kit = Toolkit.getDefaultToolkit();
				Dimension screenSize = kit.getScreenSize();
				int screenWidth = screenSize.width;
				int screenHeight = screenSize.height;
				mainFrame.setLocation(screenWidth / 2 - windowWidth / 2,
						screenHeight / 2 - windowHeight);
				mainFrame.setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton15;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	// End of variables declaration
}
