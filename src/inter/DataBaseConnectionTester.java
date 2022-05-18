package inter;

public class DataBaseConnectionTester {
	
	public static void main(String[] args) {
		
		DatabaseConnector dataBase= new OracleDataBase();
		dataBase.connectToDataBase();
		
		DatabaseConnector dataBaseTwo= new MongoDataBase();
		dataBaseTwo.connectToDataBase();
		
		DatabaseConnector dataBaseThree= new SqlServerDataBase();
		dataBaseThree.connectToDataBase();
		
		
	}

}
