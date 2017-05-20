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
      public void diference(){
      String a= JOptionPane.showInputDialog("enter the first number");
          int f=Integer.parseInt(a);
          String b=JOptionPane.showInputDialog("enter the Second number");
          int g=Integer.parseInt(b);
          int c=f+g;
          JOptionPane.showMessageDialog(null,"the sum is "+c );
      }
    public static void main(String[] args) {
      Gitab_calculetor Gc=new Gitab_calculetor();
      String a= JOptionPane.showInputDialog("enter 1 for Adition number enter 2 for subtraction");
       int f=Integer.parseInt(a);
      if(f==1){
      Gc.sum();
      
      }
      else if(f==2){
     
      Gc.diference();    
      }
      else{
      JOptionPane.showMessageDialog(null,"plese read  insraction");
      }
      //String b= JOptionPane.showInputDialog("enter B for Subtraction number");
      
    }
    
}
