package com.vicky.WorkerService;

import java.util.List;

import com.vicky.model.WorkerDetails;

public interface WorkerService {
	
	
	public WorkerDetails workSave(WorkerDetails wordet);
	public void workDelete(Integer worid);
	public WorkerDetails findone(Integer worid);
	public List<WorkerDetails> findAll();
	public WorkerDetails workUpdate(Integer worid,WorkerDetails wordet);
	
	

}
