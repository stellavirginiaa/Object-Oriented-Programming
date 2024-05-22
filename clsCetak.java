import javax.swing.JOptionPane;
/**
 *
 * @author ASUS VivoBook
 */
public class clsCetak extends clsKoneksi{
    String KodeAwal;
    String KodeAkhir;
    
    public void Cetak(String mKodeAwal, String mKodeAkhir)
    {
        try
        {
            String KodeAwal=mKodeAwal;
            String KodeAkhir=mKodeAkhir;
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
            JOptionPane.showMessageDialog(null,"Keluar dari form cetak data");
        }
       catch (Exception e)
       {
           JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
           System.out.println(e.getMessage());
       }
    }
    
}
