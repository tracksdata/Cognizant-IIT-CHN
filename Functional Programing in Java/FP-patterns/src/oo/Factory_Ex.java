package oo;

interface Connection {
}

class SQLConnection implements Connection {
}

class NoSQLConnection implements Connection {
}

class ConnectionFactory {
	public static Connection getConnection(String dbType) {
		if (dbType.equals("sql"))
			return new SQLConnection();
		if (dbType.equals("nosql"))
			return new NoSQLConnection();
		return null;
	}
}

public class Factory_Ex {

	public static void main(String[] args) {

		// -------------------------------------------------
		Connection connection = ConnectionFactory.getConnection("sql");
		// -------------------------------------------------

		// -------------------------------------------------
		Connection noSqlConnection = ConnectionFactory.getConnection("nosql");
		// -------------------------------------------------

		// -------------------------------------------------

		// -------------------------------------------------

	}

}
