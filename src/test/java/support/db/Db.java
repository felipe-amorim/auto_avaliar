package support.db;

import intern.Instances;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Db {
    private static Connection connection = null;

    private static void setConnectionMySql() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" +
                            Instances.getDbadress() + ":" +
                            Instances.getDbport() + "/" +
                            Instances.getDbname() + "?useTimezone=true&serverTimezone=UTC",
                    Instances.getDbuser(),
                    Instances.getDbpassword());
        } catch (ClassNotFoundException | SQLException e) {
            Instances.getReportClass().stepFatal(e);
            e.printStackTrace();
        }
    }

    private static void setConnectionOracle() {
        System.setProperty("oracle.net.tns_admin", Instances.getDbtnsnames());
        String dbURL = "jdbc:oracle:thin:@" + Instances.getDbname();
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            connection = DriverManager.getConnection(dbURL, Instances.getDbuser(), Instances.getDbpassword());
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void setConnectionReportInfo() {
        List<String[]> dadosBanco = new ArrayList<>();
        if (Instances.getDbtype().equals("mysql")) {
            dadosBanco.add(new String[]{"Endereço: ", Instances.getDbadress()});
            dadosBanco.add(new String[]{"Porta: ", Instances.getDbport()});
        }
        dadosBanco.add(new String[]{"Nome: ", Instances.getDbname()});
        dadosBanco.add(new String[]{"Usuário: ", Instances.getDbuser()});
        dadosBanco.add(new String[]{"Senha: ", Instances.getDbpassword()});
        //ExtentReport.getExtentTest().log(Status.INFO, "Conexão em banco MySql estabelecida em: "); //todo alterar para novo relatorio
        //ExtentReport.getExtentTest().log(Status.INFO, MarkupHelper.createTable(dadosBanco.stream().toArray(String[][]::new))); //todo alterar para novo relatorio
    }


    public void executeOnNewThread(String localizador, Object variableToReceiveValue){
        executeOnNewThread(localizador, null, variableToReceiveValue);
    }

    public void executeOnNewThread(String localizador, LinkedHashMap<String, String> parametros, Object variableToReceiveValue){
        //todo variableToReceiveValue -> thread
        new Thread().start();
    }

    public List<List<String>> execute(String localizador){
        return execute(localizador, null);
    }

    public List<List<String>> execute(String localizador, LinkedHashMap<String, String> parametros) {
        if (Instances.getDbtype().equals("oracle")) {
            setConnectionOracle();
        } else {
            setConnectionMySql();
        }
        setConnectionReportInfo();
        List<List<String>> resultado = new ArrayList<>();
        try {
            String query = "";
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(localizador));
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();
                while (line != null) {
                    sb.append(line).append("\n");
                    line = br.readLine();
                }
                query = sb.toString();
            }catch (FileNotFoundException e){
                query = localizador;
            }
            if (parametros != null) {
                for (Map.Entry<String, String> entry : parametros.entrySet()) {
                    query = query.replaceAll(entry.getKey().replace("=", ""), entry.getValue());
                }
            }
            query = query.replaceAll(";", "");
            String[] localizadorPartes = localizador.split("/");
            if (!localizadorPartes[localizadorPartes.length - 1].startsWith("get")) {
                resultado = getDataProgram(query);
            } else {
                resultado = getData(query);
            }
            if (br != null) {
                br.close();
            }
        }catch (Exception e){
            e.printStackTrace();
            Instances.getErrorClass().Fail();
        }
        return resultado;
    }

    private static List<List<String>> getDataProgram(String sql) throws SQLException {
        List<List<String>> resultado = new ArrayList<>();
        Statement stmt = connection.createStatement();
        System.out.println(sql);
        stmt.execute(sql);
        stmt.close();
        connection.close();
        return resultado;
    }

    private static List<List<String>> getData(String sql) throws SQLException {
        List<List<String>> resultado = new ArrayList<>();
        Statement stmt = connection.createStatement();
        System.out.println(sql);
        ResultSet st = stmt.executeQuery(sql);
        int columnCount = st.getMetaData().getColumnCount();
        while (st.next()) {
            List<String> linha = new ArrayList<>();
            for (int i = 1; i <= columnCount; i++) {
                linha.add(String.valueOf(st.getObject(i)));
            }
            resultado.add(linha);
        }
        connection.close();
        return resultado;
    }

    public SetDb set() {
        return Instances.getSetDbClass();
    }
}
