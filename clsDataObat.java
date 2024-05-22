import javax.swing.JOptionPane;
/**
 *
 * @author Stella Virginia
 */
public class clsDataObat extends clsKoneksi {
    String KodeObat;
    String NamaObat;
    String KodeKategori;
    String TanggalKadaluarsa;
    int Quantity;
    int HargaBeli;
    
    //Methood menampilkan data
    public void TampilData()
    {
       sql = "select tblobat.KodeObat, tblobat.NamaObat,tblkategori.KodeKategori,tblkategori.KategoriObat, tblobat.TanggalKadaluarsa, tblobat.Quantity, tblobat.HargaBeli from (tblobat LEFT JOIN tblkategori ON tblobat.KodeKategori = tblkategori.KodeKategori)";
    
    }
    
    //Method baru
    public void Baru()
    {
        try
        {
          KodeObat ="";
          NamaObat = "";
          KodeKategori = "";
          TanggalKadaluarsa = "";
          Quantity = 0;
          HargaBeli = 0;
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
    
    //Method simpan data
    public void Simpan()
    {
       try
       {
         sql = "insert into tblobat values ('"+ KodeObat +"', '" + NamaObat + "', '" + KodeKategori + "','" + TanggalKadaluarsa + "','" + Quantity + "','" + HargaBeli + "' )";  
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
            sql = "update tblobat set NamaObat = '" + NamaObat + "', KodeKategori = '" + KodeKategori + "' ,TanggalKadaluarsa = '" + TanggalKadaluarsa + "', Quantity = '" + Quantity + "', HargaBeli = '" + HargaBeli + "' where KodeObat ='" + KodeObat + "'";
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
            sql = "delete from tblobat where NamaObat = '" + NamaObat + "'";
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
            JOptionPane.showMessageDialog(null,"Keluar dari form data obat");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Terjadi kesalahan");
            System.out.println(e.getMessage());
        }
    }
}


