package coincollection.repository;

import java.util.ArrayList;

import coincollection.model.Coin;

public interface CoinRepository {
	public boolean addCoin(Coin c);
	public ArrayList<Coin> getAllCoin();
}
