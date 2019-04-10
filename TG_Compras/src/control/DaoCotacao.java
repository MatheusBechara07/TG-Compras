package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cotacao;
/**
 *
 * @author Matheus Jorge
 */
public class DaoCotacao {
    private Connection conn;

    public DaoCotacao(Connection conn) {
        this.conn = conn;
    }
    
    public Cotacao consultar(int NumCotacao) {
        Cotacao c = null;
        ResultSet rs;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbl_Cotacao "
                    + "WHERE NumCotacao = ?");
            ps.setInt(1, NumCotacao);

            rs = ps.executeQuery();

            if (rs.next() == true) {
                c = new Cotacao();
                c.setNumCotacao(rs.getInt("NumCotacao"));
                c.setNumSolicitacaoCompra(rs.getInt("NumSolicitacao"));
                c.setDataPedidoCompra(rs.getString("DataCotacao"));
                c.setPrecoMaterial(rs.getFloat("PrecoUnitario"));
                
                ps = conn.prepareStatement("SELECT QtdeMaterial FROM tbl_Material_Solicitados"
                        + " WHERE NumCotacao = ? and CodMaterial = ?");
                ps.setInt(1, rs.getInt("NumSolicitacao"));
                ps.setInt(2, rs.getInt("CodMaterial"));
                
                rs = ps.executeQuery();
                
                c.setQtdeMaterial(rs.getInt("QtdeMaterial"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (c);
    }
    
    public void inserir(Cotacao c) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("INSERT INTO tbl_Cotacao (NumCotacao, NumSolicitacao,"
                    + " DataCotacao, CNPJ, CodMaterial, SituacaoCotacao)"
                    + " VALUES(?,?,?,?,?,?)");
            ps.setInt(1, c.getNumCotacao());
            ps.setInt(2, c.getNumSolicitacaoCompra());
            ps.setString(3, c.getDataPedidoCompra());
            ps.setString(4, c.getCNPJ());
            ps.setInt(5, c.getCodMaterial());
            /*ps.setFloat(6, 0);*/
            ps.setString(6, "Em Aberto");
          
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void excluir()
}
