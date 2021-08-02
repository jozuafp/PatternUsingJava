/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator_01;

/**
 *
 * @author Jozua Palandi
 */
public class Iterator_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IniConcreteClass oIniConcreteClass = new IniConcreteClass();

        for (Iterator iter = oIniConcreteClass.getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }

}
