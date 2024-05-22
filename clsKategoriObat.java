import javax.swing.JOptionPane;
/**
 *
 * @author Stella Virginia
 */
public class clsKategoriObat extends clsKoneksi{
    String KategoriObat;
    String KodeKategori;
    
    public void TampilData()
    {
        sql = "select * from tblkategori";
    }
    
    public void Baru(String mKodeKategori, String mKategoriObat)
    {
        try
        {
            mKodeKategori = "";
            mKategoriObat = "";
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    public void Simpan(String mKodeKategori, String mKategoriObat)
    {
        try
        {
            sql = "insert into tblkategori values ('"+ mKodeKategori +"', '" + mKategoriObat + "')";
        }
        catch (Exception e)
        {
          JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
          System.out.println(e.getMessage());
        }
    }
    
   public void Edit(String mKodeKategori, String mKategoriObat)
   {
       try
       {
          sql = "update tblkategori set KategoriObat = '" + mKategoriObat + "'where KodeKategori ='" + mKodeKategori + "'"; 
       }
       catch (Exception e)
       {
           JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
           System.out.println(e.getMessage());
       }
   }
    
    public void Hapus(String mKategoriObat)
    {
        try
        {
            sql = "delete from tblkategori where KategoriObat = '" + mKategoriObat+ "'";
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
           JOptionPane.showMessageDialog(null,"Keluar dari form kategori obat"); 
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
}
