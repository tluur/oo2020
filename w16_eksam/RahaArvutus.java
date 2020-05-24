import javax.swing.*;

public class RahaArvutus {
    public static void main(String[] args) {
        String kontoJaak;
        kontoJaak = JOptionPane.showInputDialog("Sisesta konto jääk :");
        int kontoJaak_int = Integer.parseInt(kontoJaak);
        String intress;
        intress = JOptionPane.showInputDialog("Sisesta intressi määr :");
        int intress_int = Integer.parseInt(intress);
        String hoiuseAeg;
        hoiuseAeg = JOptionPane.showInputDialog("Sisesta hoiustamise aeg (aastates) :");
        int hoiuseAeg_int = Integer.parseInt(hoiuseAeg);
        konto Konto = new konto(kontoJaak_int);
        int interest;
        int balance = 0;
        int num = 0;
        
        while (num < hoiuseAeg_int) {
            num = num + 1;
            // intressi arvutus
            interest = Konto.getBalance() * intress_int / 100;
            Konto.deposit(interest);
            JOptionPane.showMessageDialog(null, "Konto seis peale " + num + " aastat on " + (Konto.getBalance()));

        } // peale hoiustamist summa
        balance = Konto.getBalance();
        JOptionPane.showMessageDialog(null, "Peale hoiustamist on raha kogunenud : " + (balance));

    }
}