package com.vicky.WorkerController;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.vicky.WorkerService.WorkerServiceClass;

import com.vicky.model.WorkerDetails;

@Controller
public class WorkerController {
	
	@Autowired
	private WorkerServiceClass service;
	
	@RequestMapping("/worker")
	public String home() {
		return "Worker";
	}
	
	@PostMapping("/save")
	public WorkerDetails workerSave(@RequestBody WorkerDetails wordet) {
		WorkerDetails e1= service.workSave(wordet);
		return e1;
	}
	@DeleteMapping("/delete/{worid}")
	public void workerDelete(@PathVariable Integer worid) {
		service.workDelete(worid);
		
	}
	@GetMapping("/findone/{worid}")
	public WorkerDetails findonemethod(@PathVariable Integer worid) {
		WorkerDetails wordet=service.findone(worid);
		return wordet;
	}
	@GetMapping("/findall")
	public List<WorkerDetails> findAll() {
		List<WorkerDetails> list=service.findAll();
		return list;
	}
	@PutMapping("/update/{worid}")
	public WorkerDetails workerUpdatemethod(@PathVariable Integer worid,@RequestBody WorkerDetails wordet) {
		WorkerDetails wordet1=service.workUpdate(worid,wordet);
		return wordet1;
	} 

}
