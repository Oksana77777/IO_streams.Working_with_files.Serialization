package demo4;

import javax.swing.JOptionPane;

class Authenticator {
    public static void main(String args[]) {
        String username = JOptionPane.showInputDialog("Username:");
        String password = JOptionPane.showInputDialog("Password:");

        if (username != null && password != null && username.equals("bburd") && password.equals("swordfish")) {
            boolean b = false;
            JOptionPane.showMessageDialog(null, "Вы допущены в систему!");
        } else{
            JOptionPane.showMessageDialog(null, "Попытайтесь еще раз ... ");
        }
    }
}