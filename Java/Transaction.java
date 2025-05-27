import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaction {
    private static final String URL = "jdbc:mysql://localhost:3306/bank";
    private static final String USER = "root";
    private static final String PASSWORD = "root"; 

    public void transferMoney(int fromAccountId, int toAccountId, double amount) {
        String debitSQL = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
        String creditSQL = "UPDATE accounts SET balance = balance + ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            conn.setAutoCommit(false); 

            try (
                PreparedStatement debitStmt = conn.prepareStatement(debitSQL);
                PreparedStatement creditStmt = conn.prepareStatement(creditSQL)
            ) {
                
                debitStmt.setDouble(1, amount);
                debitStmt.setInt(2, fromAccountId);
                int debitResult = debitStmt.executeUpdate();

              
                creditStmt.setDouble(1, amount);
                creditStmt.setInt(2, toAccountId);
                int creditResult = creditStmt.executeUpdate();

                if (debitResult == 1 && creditResult == 1) {
                    conn.commit(); 
                    System.out.println("Transfer successful. ₹" + amount + " transferred.");
                } else {
                    conn.rollback(); 
                    System.out.println("Transfer failed. Transaction rolled back.");
                }

            } catch (SQLException e) {
                conn.rollback(); 
                System.out.println("Error occurred. Transaction rolled back: " + e.getMessage());
            }

        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Transaction transaction = new Transaction();
        transaction.transferMoney(1, 2, 200.00); 
    }
}
