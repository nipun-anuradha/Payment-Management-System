/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import gui.Home;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Anuradha
 */
public class Clock {

    public void clockStart(Home h) {
        //clock
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                while (true) {
                    Date date = new Date();
                    String dateString = simpleDateFormat.format(date);
                    h.jLabel5.setText(dateString);
//                    System.out.println(dateString);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t = new Thread(runnable);
        t.start();
        //clock
    }
}
