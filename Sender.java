/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Messenger;

/**
 *
 * @author SUCI
 */
public class Sender {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        StdMessenger std = new StdMessenger();
        System.out.println("StdMessenger\n");
        std.sendMessage("Figura.id", "Halo!", "Welcome in Pictures.me");
        std.sendMessage("Tarnished", "Maiden", "Do you accept my offer?");

        MailMessenger mail = new MailMessenger();
        System.out.println("MailMessenger\n");
        mail.connect();
        mail.sendMessage("Suci", "Secret", "Don't tell anyone!");
        mail.sendMessage("Erdtree", "Burn", "Burned...");
        mail.disconnect();
        mail.sendMessage("Suci", "Gift", "This ring is from your boyfriend");
    }

}
