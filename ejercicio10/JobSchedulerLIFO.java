package ejercicio10;

public class JobSchedulerLIFO extends JobScheduler{

	@Override
	public JobDescription next() {
		JobDescription nextJob = null;
        nextJob = jobs.get(jobs.size()-1);
        this.unschedule(nextJob);
        return nextJob;
	}

}
