
import arraystack.Arraystack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAKHUMZI
 */
public class NewClass {
    public static void main(String[] args) {
      Arraystack as = new Arraystack(3);
 as.set(0, "Aluncedo");
 as.set(1, "Lundi");
 as.set(2, "Langa");
 System.out.println(as.get(1));
 Arraystack ss = new Arraystack(1);
 ss.set(0, "Sakhumzi Chuthsela");
 System.out.println(ss.get(0));
 System.out.println(as.size());
    }
}
