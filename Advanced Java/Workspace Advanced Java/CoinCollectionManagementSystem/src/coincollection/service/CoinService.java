package coincollection.service;

import java.time.LocalDate;
import java.util.ArrayList;

import coincollection.model.Coin;
import coincollection.repository.CoinDBDao;
import coincollection.repository.CoinRepository;

public class CoinService {
	CoinRepository coinRepo = new CoinDBDao();
	ArrayList<Coin> coinList = new ArrayList();
	
	public CoinService() {
		coinList = coinRepo.getAllCoin();
	}
	
	public boolean addCoin(Coin c) {
		if(coinRepo.addCoin(c)) {
			coinList.add(c);
			return true ;
		}
		
		return false ;
	}
	
	
	public ArrayList<Coin> getAllCoin(){
		return coinList ;
	}
	
	
	public ArrayList<Coin> getCoinsByCountry(String country){
		ArrayList<Coin> coinCountryList = new ArrayList<>() ;
		
		for(Coin c : coinList ) {
			if(country.equalsIgnoreCase(c.getCountry())) {
				coinCountryList.add(c);
			}
		}
		return coinCountryList ;
	}
	
	
	public ArrayList<Coin> getCoinsByYear(int year){
		ArrayList<Coin> coinCountryList = new ArrayList<>() ;
		
		for(Coin c : coinList ) {
			if(year == c.getYear()) {
				coinCountryList.add(c);
			}
		}
		return coinCountryList ;
	}
	
	public ArrayList<Coin> getCoinsByCurrentValue(double currentValue){
		ArrayList<Coin> coinCountryList = new ArrayList<>() ;
		
		for(Coin c : coinList ) {
			if(currentValue == c.getCurrentValue()) {
				coinCountryList.add(c);
			}
		}
		return coinCountryList ;
	}
	
	
	public ArrayList<Coin> searchByCountryAndDenomination(String country, String denomination){
		ArrayList<Coin> coinCountryList = new ArrayList<>() ;
		
		for(Coin c : coinList ) {
			if(country.equalsIgnoreCase(c.getCountry())  && denomination.equalsIgnoreCase(c.getDenomination())) {
				coinCountryList.add(c);
			}
		}
		return coinCountryList ;
	}
	
	
	public ArrayList<Coin> searchByCountryAndYear(String country, int year){
		ArrayList<Coin> coinCountryList = new ArrayList<>() ;
		
		for(Coin c : coinList ) {
			if(country.equalsIgnoreCase(c.getCountry())  && year == c.getYear()) {
				coinCountryList.add(c);
			}
		}
		return coinCountryList ;
	}
	
	
	public ArrayList<Coin> searchByCountryDenominationAndYear(String country, String denomination,int year){
		ArrayList<Coin> coinCountryList = new ArrayList<>() ;
		
		for(Coin c : coinList ) {
			if(country.equalsIgnoreCase(c.getCountry())  && denomination.equalsIgnoreCase(c.getDenomination()) && year == c.getYear()) {
				coinCountryList.add(c);
			}
		}
		return coinCountryList ;
	}
	
	
	public ArrayList<Coin> searchByAcquiredDateAndCountry(LocalDate acquiredDate, String country ){
		ArrayList<Coin> coinCountryList = new ArrayList<>() ;
		
		for(Coin c : coinList ) {
			if(acquiredDate.equals(c.getAcquiredDate()) &&   country.equalsIgnoreCase(c.getCountry())  ) {
				coinCountryList.add(c);
			}
		}
		return coinCountryList ;
	}
}
