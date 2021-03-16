package ru.site.copyofthedata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Toolkit;

public class Start extends javax.swing.JFrame {

	public Start() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\pgapr\\Desktop\\\u041A\u043E\u043F\u0438\u044F \u043F\u0440\u043E\u0435\u043A\u0442\u043E\u0432 \u043F\u043E Java\\logo.png"));
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jButtonStart = new javax.swing.JButton();
		jLabelResult = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Сделать копию файлов");

		jButtonStart.setText("Сделать копию файлов");
		jButtonStart.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonStartActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jButtonStart)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jLabelResult, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
						.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jLabelResult, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jButtonStart, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
		setLocationRelativeTo(null);
		setResizable(false);
	}

	private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {
		Date Today = new Date();
		SimpleDateFormat Today2 = new SimpleDateFormat("dd MMMM yyyy");
		String formattedDate = Today2.format(Today);
		String result = formattedDate + "-" + Today.getHours() + " " + Today.getMinutes();
		File Option = new File("C:\\Users\\pgapr\\Desktop\\Копия проектов по Java\\" + result);
		Option.mkdir();

		File srcFolder = new File("C:\\Java\\workspace");
		File destFolder = new File("C:\\Users\\pgapr\\Desktop\\Копия проектов по Java\\" + result);

		// проверяет существует ли папка
		if (!srcFolder.exists()) {
			System.out.println("Не верно указан путь, с которого нужно скопировать папку или файл(ы).");
			System.exit(0);
		} else {
			try {
				copyFolder(srcFolder, destFolder);
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
		}

		String text = "Готово";
		jLabelResult.setText(text);

	}

	public static void main(String args[]) throws Exception {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Start().setVisible(true);

			}

		});
	}

	public static void copyFolder(File src, File dest) throws IOException {

		// проверяет существует ли папка
		if (src.isDirectory()) {

			if (!dest.exists()) {
				dest.mkdir();
				// System.out.println("Папка скопирована с " + src + " в " + dest);
			}

			// Считывает всё содержимое каталога
			String files[] = src.list();

			for (String file : files) {
				// построить файловую структуру src и dest
				File srcFile = new File(src, file);
				File destFile = new File(dest, file);
				// рекурсивная копия
				copyFolder(srcFile, destFile);
			}

		} else {
			// если файл, то скопируйте его
			// Используется поток байтов для поддержки всех типов файлов
			InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dest);

			byte[] buffer = new byte[1024];

			int length;
			// копирование содержимого файлов в байтах
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}

			in.close();
			out.close();
			// System.out.println("Файл скопирован с " + src + " в " + dest);
		}
	}

	private javax.swing.JButton jButtonStart;
	private javax.swing.JLabel jLabelResult;
	private javax.swing.JPanel jPanel1;
}

// На рабочем столе есть папка "Копия проектов по Java"
// Там создавать архив с сегодняшним числом (день месяц год). Формат: 12 марта 2021.
// В этот архив положить копии папок из папки workspace
