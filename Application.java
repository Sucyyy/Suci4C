/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;
import data.Laptop3;

/**
 *
 * @author SUCI
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Laptop3 uts13 = new Laptop3("Suci", "Asus", "Intel 2019", 5, "Windows 7", 64, "SSD M 2",1000,"Pink","Best") ;
        System.out.println(uts13);
        Laptop3 uts23 = new Laptop3("Suci", "Asus", "Intel 2019", 5, "Windows 10", 64, "SSD SATA",1000,"Biru","Good") ;
        System.out.println(uts23);
        Laptop3 uts33 = new Laptop3("Suci", "Asus", "Intel 2019", 5, "Windows 11", 64, "HDD",1000,"Hitam","Middle") ;
        System.out.println(uts33);
    }

}
