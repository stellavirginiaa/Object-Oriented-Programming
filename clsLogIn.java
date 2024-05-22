import javax.swing.JOptionPane;
/**
 *
 * @author Stella Virginia
 */
public class clsLogIn extends clsKoneksi{
    String mID;
    String mNama;
    String mKataKunci;
    
    public void Masuk()
    {
        try
        {
            sql = "select * from tblpengguna where ID = '" + mID + "' and KataKunci = '" + mKataKunci + "'";
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Keluar()
    {
        try
        {
            JOptionPane.showMessageDialog(null,"Keluar dari form login");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
}
