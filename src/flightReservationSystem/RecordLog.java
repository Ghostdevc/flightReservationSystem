package flightReservationSystem;

public class RecordLog {
	
	private Reservation reservation;
	private CentralAuditor reserveNumber;

	public RecordLog(Reservation reservation,CentralAuditor reserveNumber) {
		this.reservation = reservation;
		this.reserveNumber = reserveNumber;
	}
	
	public void save(Reservation reservation) {
		
	}
	
	public void getReservationNo(CentralAuditor reserveNumber) {
		
	}
	
}
