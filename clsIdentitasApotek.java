import javax.swing.JOptionPane;
/**
 *
 * @author Stella Virginia
 */
public class clsIdentitasApotek extends clsKoneksi{
    
    String NamaApotek;
    String Alamat;
    String NoTlp;
    String Pimpinan;
    String AlamatEmail;
    
    public void TampilData()
    {
        sql = "select * from tblidentitasapotek";
    }
    
    //Method sumpan data
    public void Simpan()
    {
       try
       {
         sql = "insert into tblidentitasapotek values ('"+ NamaApotek +"', '" + Alamat + "', '" + NoTlp + "','" + Pimpinan + "','" + AlamatEmail + "' )";  
       }
       catch (Exception e)
       {
          JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
          System.out.println(e.getMessage());
       }
    }
    
    //Method edit data
    public void Edit()
    {
        try
        {
            sql = "update tblidentitasapotek set Alamat = '" + Alamat + "', NoTlp = '" + NoTlp + "', Pimpinan = '" + Pimpinan + "' , AlamatEmail = '" + AlamatEmail + "' where NamaApotek ='" + NamaApotek + "'";
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    //Method hapus data
    public void Hapus()
    {
        try
        {
            sql = "delete from tblidentitasapotek where NamaApotek = '" + NamaApotek + "'";
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    //Method keluar
    public void Keluar()
    {
        try
        {
            JOptionPane.showMessageDialog(null,"Keluar dari form pengguna");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
}
