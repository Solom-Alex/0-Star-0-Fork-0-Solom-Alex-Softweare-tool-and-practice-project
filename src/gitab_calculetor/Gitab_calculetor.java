package gitab_calculetor;

import javax.swing.JOptionPane;

public class Gitab_calculetor {
      int a,b;
      public void sum(){
          String a= JOptionPane.showInputDialog("enter the first number");
          int f=Integer.parseInt(a);
          String b=JOptionPane.showInputDialog("enter the Second number");
          int g=Integer.parseInt(b);
          int c=f+g;
          JOptionPane.showMessageDialog(null,"the sum is "+c );
      }
    public static void main(String[] args) {
      Gitab_calculetor Gc=new Gitab_calculetor();
        Gc.sum();
    }
    
}
