package ejercicio10;

public class JobSchedulerFIFO extends JobScheduler {

	public JobSchedulerFIFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public JobDescription next() {
		JobDescription nextJob = null;
        nextJob = jobs.get(0);
        this.unschedule(nextJob);
        return nextJob;
	}
	
	

}
