package ar.edu.unlp.info.oo1.Ejercicio10;

public class JobSchedulerFIFO extends JobScheduler {
	
	public JobDescription next() {
    	JobDescription nextJob = null;
    	if (jobs != null) {
    		nextJob = jobs.get(0);
    		this.unschedule(nextJob);
        	return nextJob;
    		}
		return null;
	}
}
