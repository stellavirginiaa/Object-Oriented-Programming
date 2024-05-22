import javax.swing.JOptionPane;
/**
 *
 * @author Stella Virginia
 */
public class clsPengguna extends clsKoneksi {
    String ID;
    String Nama;
    String KataKunci;
    String Alamat;
    String NoTlp;
    
    //Methood menampilkan data
    public void TampilData()
    {
        sql = "select * from tblpengguna";
    }
    
    //Method baru
    public void Baru()
    {
        try
        {
          ID = "";
          Nama = "";
          KataKunci = "";
          Alamat = "";
          NoTlp = "";
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    //Method sumpan data
    public void Simpan()
    {
       try
       {
         sql = "insert into tblpengguna values ('"+ ID +"', '" + Nama + "', '" + KataKunci + "','" + Alamat + "','" + NoTlp + "' )";  
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
            sql = "update tblpengguna set Nama = '" + Nama + "', KataKunci = '" + KataKunci + "', Alamat = '" + Alamat + "', NoTlp = '" + NoTlp + "' where ID ='" + ID + "'";
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
            sql = "delete from tblpengguna where ID = '" + ID + "'";
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
