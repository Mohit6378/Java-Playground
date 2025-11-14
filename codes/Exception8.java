import java.io.IOException;
import java.sql.SQLException;

public class Exception8 {
	public static void riskyOperation() throws IOException, SQLException {
		if (Math.random() > 0.5) 
			throw new IOException("IO Failed");
		else
			throw new SQLException("DB Failed");
	}

	public static void main(String[] args) {
		try {
			riskyOperation();
		} catch (IOException | SQLException e) {
			System.out.println("Exception Caught: " + e.getMessage());
		}
	}
}