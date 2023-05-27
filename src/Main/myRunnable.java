/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author anoth
 */
public class myRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 30; i > 0; i--) {
            System.out.println("Thread #2 : " + i);
            MainDialog.CodeQR.timeLimit.setText(Integer.toString(i));            
            try {
            	Thread.sleep(1000);
            } catch (InterruptedException e) {
            	e.printStackTrace();
            }
	}   
            Main.main.sendBukti();
            MainDialog.CodeQR.label2.setText("");
            System.out.println("Thread #1 is finished");
        if(Main.main.bahasa.getText().equalsIgnoreCase("   id")){
            MainDialog.CodeQR.timeLimit.setText("Waktu habis");
        }else{
            MainDialog.CodeQR.timeLimit.setText("Times out"); 
        }  
    }
}