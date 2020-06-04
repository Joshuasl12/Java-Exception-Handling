/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2;

/**
 *
 * @author joshu
 */
public class soal2 {
    public static void main(String[] args){
        byte[] b = new byte[5];
        try{
            System.out.print("Masukan 5 huruf : ");
            System.in.read(b);
        }
        catch(java.io.IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Hasil : "+(char)b[0]+(char)b[1]+(char)b[2]);
    }
}
