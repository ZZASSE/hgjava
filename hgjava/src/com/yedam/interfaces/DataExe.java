package com.yedam.interfaces;

public class DataExe {
	public static void main(String[] args) {
		// MySql vs Oracle

//		MysqlDB mysqlDB = new MysqlDB();
//		OracleDB oracleDB = new OracleDB();
		DAO dao = new MysqlDB();
//		DAO dao = new OracleDB();
		
		int menu = 0;

		if (menu == 1) {
//			mysqlDB.insert();
//			oracleDB.add();
			dao.insert();
		} else if (menu == 2) {
//			mysqlDB.update();
//			oracleDB.modify();
			dao.update();
		} else if (menu == 3) {
//			mysqlDB.delete();
//			oracleDB.remove();
			dao.delete();
		}
	}
}
