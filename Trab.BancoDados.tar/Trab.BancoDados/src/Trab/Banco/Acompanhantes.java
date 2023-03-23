package Trab.Banco;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Acompanhantes {
    private String RG;
    private String nome_acompanhantes;

    public void inserir () throws Exception {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            pstmt = con.prepareStatement("" +
                    "INSERT into acompanhantes (RG , nome_acompanhantes) " +
                    "       value (?, ?)");
            pstmt.setString(1, this.RG);
            pstmt.setString(2, this.nome_acompanhantes);

            // para mostrar o pstmt completa com os valores
            //System.out.println(pstmt.toString());

            pstmt.execute();

        } catch (Exception e) {
            throw e;
        } finally {
            if (pstmt != null) pstmt.close();
            if (con != null) con.close();
            System.out.println("inserido com sucesso");
        }
    }
    public void atualizar() throws Exception {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");

            pstmt = con.prepareStatement("update acompanhantes set  nome_acompanhantes = ? where RG = ?");
            pstmt.setString(1, this.nome_acompanhantes);
            pstmt.setString(2, this.RG);

            pstmt.execute();
        } catch (Exception e) {
            throw e;
        } finally {
            if (pstmt != null) pstmt.close();
            if (con != null) con.close();
            System.out.println("atualizado com sucesso");
        }
    }
    public void excluir() throws Exception {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");

            pstmt = con.prepareStatement("delete from acompanhantes where RG = ?");
            pstmt.setString(1, this.RG);

            pstmt.execute();
        } catch (Exception e) {
            throw e;
        } finally {
            if (pstmt != null) pstmt.close();
            if (con != null) con.close();
            System.out.println("excluido com sucesso");
        }
    }

    public void consultar() throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");

            pstmt = con.prepareStatement("select * from acompanhantes");

            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.print("RG: "+rs.getString("RG")+" - ");
                System.out.println("nome: "+rs.getString("nome_acompanhantes"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (pstmt != null) pstmt.close();
            if (con != null) con.close();
        }
    }


    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getNome_acompanhante() {
        return nome_acompanhantes;
    }

    public void setNome_acompanhante(String nome_acompanhante) {
        this.nome_acompanhantes = nome_acompanhante;
    }
}
