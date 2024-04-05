package com.vicky.WorkerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vicky.WorkerRepo.WorkerRepo;
import com.vicky.model.WorkerDetails;

@Service
public class WorkerServiceClass implements WorkerService {
	
	@Autowired
	private WorkerRepo worepo;

	@Override
	public WorkerDetails workSave(WorkerDetails wordet) {
		WorkerDetails e= worepo.save(wordet);
		return e;
	}

	@Override
	public void workDelete(Integer worid) {
		worepo.deleteById(worid);
		
	}

	@Override
	public WorkerDetails findone(Integer worid) {
		WorkerDetails wordet=worepo.findById(worid).get();
		return wordet;
	}

	@Override
	public List<WorkerDetails> findAll() {
		List<WorkerDetails> list=worepo.findAll();
		return list;
	}

	@Override
	public WorkerDetails workUpdate(Integer worid, WorkerDetails wordet) {
		WorkerDetails workers=worepo.findById(worid).get();
		workers.setPhonenumber(wordet.getPhonenumber());
		workers.setEmailid(wordet.getEmailid());
		return worepo.save(workers);
	}
	
	

}
