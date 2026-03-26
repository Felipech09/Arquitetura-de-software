public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/lojinha";
    private static final String USER = "root";
    private static final String PASSWORD = "Felipe";

    public static Connection conectar() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}