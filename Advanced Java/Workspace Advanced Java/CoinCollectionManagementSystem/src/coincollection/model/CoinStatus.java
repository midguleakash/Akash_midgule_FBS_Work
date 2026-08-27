package coincollection.model;

public class CoinStatus {
	private Coin coin;
    private String status;
    
	public CoinStatus(Coin coin, String status) {
		
		this.coin = coin;
		this.status = status;
	}

	public Coin getCoin() {
		return coin;
	}

	public void setCoin(Coin coin) {
		this.coin = coin;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
