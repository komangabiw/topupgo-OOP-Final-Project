/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import javax.swing.JOptionPane;

/**
 *
 * @author anoth
 */
public class multithreading extends Thread{
    @Override
    public void run() {
	for(int i = 45; i > 0; i--) {
            System.out.println("Thread #1 : "+i);
            try {
            	Thread.sleep(1000);
            } catch (InterruptedException e) {
            	e.printStackTrace();
            }
	}
	System.out.println("Thread #1 is finished");
        Main.main.toHome();
        JOptionPane.showMessageDialog(null, "Pesanan Berhasil, Silahkan cek akun game anda");
    }
}