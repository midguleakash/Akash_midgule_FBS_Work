package coincollection.repository;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import coincollection.model.Coin;
import coincollection.util.DBUtilCoin;


public class CoinDBDao implements CoinRepository {

	@Override
	public boolean addCoin(Coin c) {
		try {
			
			String query = "insert into coin (country, denomination, minting_year, current_value, acquired_date) values(? , ? , ? , ? , ?)";
			PreparedStatement pstmt = DBUtilCoin.getConnection().prepareStatement(query);
			pstmt.setString(1, c.getCountry());
			pstmt.setString(2, c.getDenomination());
			pstmt.setInt(3, c.getYear());
			pstmt.setDouble(4, c.getCurrentValue());
			pstmt.setDate(5, java.sql.Date.valueOf(c.getAcquiredDate()));
			
			pstmt.executeUpdate();
			
			return true ;
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return false;
		
	}
	
	@Override
	public boolean deleteCoin(int id) {

	    try {

	        String query = "delete from coin where id = ?";

	        PreparedStatement pstmt =
	                DBUtilCoin.getConnection().prepareStatement(query);

	        pstmt.setInt(1, id);

	        int rows = pstmt.executeUpdate();

	        if (rows > 0) {
	            return true;
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return false;
	}

	@Override
	public ArrayList<Coin> getAllCoin() {
		ArrayList<Coin> coinList = new ArrayList<>();
		try {
			String query = "select * from coin" ;
			PreparedStatement pstmt = DBUtilCoin.getConnection().prepareStatement(query);
			ResultSet result = pstmt.executeQuery(query);			
			
			while(result.next()) {
				Coin cTemp = new Coin(result.getInt(1) , result.getString(2) , result.getString(3) , result.getInt(4) , result.getInt(5) , result.getDate(6).toLocalDate() );
				coinList.add(cTemp);
			}
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		return coinList;
	}

}
