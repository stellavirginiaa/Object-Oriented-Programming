import javax.swing.JOptionPane;
/**
 *
 * @author Stella Virginia
 */
public class clsStockObat extends clsKoneksi{
    
    String KodeAwal;
    String KodeAkhir;
    
    //method keluar
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
    
    public void TampilFilter(String KodeAwal, String KodeAkhir)
    {
        sql = "SELECT KodeObat,NamaObat,tblkategori.KodeKategori,tblkategori.KategoriObat, TanggalKadaluarsa, IF((CAST(NOW() as Date)>= (TanggalKadaluarsa)), \"Kadaluarsa\", \"Belum Kadaluarsa\"), HargaBeli, (0.2 * HargaBeli)+HargaBeli as HargaJual, Quantity , (Quantity)*((0.2*HargaBeli)+HargaBeli) as TotalHargaJual, ((Quantity*HargaBeli)) as TotalHargaBeli FROM (tblobat LEFT JOIN tblkategori ON tblobat.KodeKategori = tblkategori.KodeKategori) WHERE KodeObat BETWEEN '"+KodeAwal+"' AND '"+KodeAkhir+"'";
    }
    
    public void ShowStock()
    {
        sql = "SELECT KodeObat,NamaObat,tblkategori.KodeKategori,tblkategori.KategoriObat, TanggalKadaluarsa, IF((CAST(NOW() as Date)>= (TanggalKadaluarsa)), \"Kadaluarsa\", \"Belum Kadaluarsa\"), HargaBeli, (0.2 * HargaBeli)+HargaBeli as HargaJual, Quantity , (Quantity)*((0.2*HargaBeli)+HargaBeli) as TotalHargaJual, ((Quantity*HargaBeli)) as TotalHargaBeli FROM (tblobat LEFT JOIN tblkategori ON tblobat.KodeKategori = tblkategori.KodeKategori)";    
    }

    public void GrandTotalHJFilter(){
        sql = "SELECT SUM((Quantity) *((0.2 * HargaBeli) + HargaBeli)) FROM (tblobat LEFT JOIN tblkategori ON tblobat.KodeKategori = tblkategori.KodeKategori) WHERE KodeObat BETWEEN '"+KodeAwal+"' AND '"+KodeAkhir+"'";
    }
    
     public void GrandTotalHBFilter(){
        sql = "SELECT SUM ((Quantity)*(HargaBeli)) FROM (tblobat LEFT JOIN tblkategori ON tblobat.KodeKategori = tblkategori.KodeKategori) WHERE KodeObat BETWEEN '"+KodeAwal+"' AND '"+KodeAkhir+"'";
    }
    
}
