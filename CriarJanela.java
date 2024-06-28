import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.*;

public class CriarJanela {

   public static void main(String[]args){
      JFame janela = new JFrame();
      janela.setVisible(b:true);
      janela.setSize(windth:800,height:500);
      janela.setTile(title:"minha primeira janela");
      janela.setDefaultCloseOperatioin(JFrame.EXIT_ON_CLOSE);
      janela.setResizable(resizable:false);
      janela.setLocationRelativeTo(c:null);
      janela.setLayout(manager:null);
      JButton botao = new JBbutton();
      botao.setText(text:"Clique Aqui");
      botao.setBounds(x:100, y,200 height:70);
      janela.add(botao);

      JButton botaoO = new JButton();
      botaoOK.setText(text:"voçêclicou em ok!");
      botao.setBounds(x:400, y:200, width:200, height:70);
      janela.add(botaoOK);

      botao.addActionListenner new (ActionListenner) {
         public void actionPerformed(ActionEvent e){
         JOptionPane.showMessageDialog(janela,menssage:"Deu tudo certo");
         }

}
