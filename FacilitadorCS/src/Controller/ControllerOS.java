package Controller;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.Date.*;
import java.sql.*;
import Model.*;

public class ControllerOS {

    private OS os = new OS();
    private Pessoa cliente = new Pessoa();
    private Connection conn = null;


    public void incrementaNumOS(JTextField txNumOS){

        int i=1;
        txNumOS.setText(""+i);
        i++;
    }

//    public void Abrir(JTextField txNumOS, JComboBox cbAtendente, JComboBox cbTecnico, JComboBox cbCliente,
//            JTextArea taDescicaoOS, JTextField txDataAbertOS, JTextField txHoraAbertOS, JTable tbItemOS,
//            JTextField txTotalOS, JTextField txDescontoOS) {
//
//        cliente.setNome(cbCliente.getSelectedItem().toString());
//        os.setnOS(Long.parseLong(txNumOS.getText()));
//        os.setAtendente(cbAtendente.getSelectedItem().toString());
//        os.setTecnico(cbTecnico.getSelectedItem().toString());
//        os.setCliente(cliente);
//        os.setDescricao(taDescicaoOS.getText());
//        os.setDataAb(txDataAbertOS.getText());
//        os.setHoraAb(txHoraAbertOS.getText());
//        //itens
//        os.setDesconto(Float.parseFloat(txDescontoOS.getText()));
//        os.setTotalPagar(Float.parseFloat(txTotalOS.getText()));
//
//        String abrirOS = "INSERT INTO os(idOS, idUsuarioAtendente, idUsuarioTecnico, idCliente, descricao, databertura, horaAbertura)values('"
//                + os.getnOS() + "','" + os.getAtendente() + "','" + os.getTecnico() + "','" + os.getCliente()
//                + "','" + os.getDescricao() + "','" + os.getDataAb() + "','" + os.getHoraAb() + "')";
//        String itemOS = "INSERT INTO itemos(idOS, total)values('"
//                + os.getnOS() + "','" + os.getTotalPagar() + "')";
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/facilitadorcs?user=root&password=vertrigo");
//            System.out.println("A conexao foi um sucesso!\n");
//
//            Statement stm = conn.createStatement();
//            stm.executeUpdate(abrirOS);
//            stm.executeUpdate(itemOS);
//
////            limpar(tfNome, tfEnd, tfComercial, tfCelular, tfEmail);
//
//            System.out.println("Gravação realizada com sucesso!\n");
//        } catch (ClassNotFoundException e) {
//            System.out.println("Classe não encontrada");
//            e.printStackTrace();
//        } catch (SQLException e) {
//            System.out.println("SQL Exception ..... Erro na consulta\n");
//            e.printStackTrace();
//        } finally {
//            try {
//                conn.close();
//                System.out.println("Fechamento da conexão\n");
//            } catch (SQLException erro) {
//                System.out.println("Erro no fechamento\n");
//                erro.printStackTrace();
//            }
//        }
//
//
//    }
//
//    public void Fechar(JTextField txNumOS, JComboBox cbAtendente, JComboBox cbTecnico, JComboBox cbCliente,
//            JTextArea taDescicaoOS, JTextField txDataFc, JTextField txHoraFc, JTable tbItemOS,
//            JTextField txTotalOS, JTextField txDescontoOS) {
//
//        cliente.setNome(cbCliente.getSelectedItem().toString());
//        os.setnOS(Long.parseLong(txNumOS.getText()));
//        os.setAtendente(cbAtendente.getSelectedItem().toString());
//        os.setTecnico(cbTecnico.getSelectedItem().toString());
//        os.setCliente(cliente);
//        os.setDescricao(taDescicaoOS.getText());
//        os.setDataFc(txDataFc.getText());
//        os.setHoraFc(txHoraFc.getText());
//        //itens
//        os.setDesconto(Float.parseFloat(txDescontoOS.getText()));
//        os.setTotalPagar(Float.parseFloat(txTotalOS.getText()));
//
//    }
}
