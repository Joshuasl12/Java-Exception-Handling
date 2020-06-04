/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joshu
 */
public class soal1 {
    public static void main(String[] args){
        int n = 0;
        try{
            System.out.print("Masukan kata : ");
            n = System.in.read();
        }
        catch(java.io.IOException e){
            System.out.println(e);
        }
        System.out.println("Hasil : "+(char)n);
    }
}
