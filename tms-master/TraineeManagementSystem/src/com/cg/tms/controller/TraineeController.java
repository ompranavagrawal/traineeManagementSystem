package com.cg.tms.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;








import com.cg.tms.entities.Trainee;
import com.cg.tms.service.TraineeService;

@Controller
public class TraineeController {
	@Autowired
	TraineeService tser;
	@RequestMapping("display")
                                                 //show details
	public String showHome(Model model) {
		List<Trainee> traineelist=tser.getAllTrainee(); 
		model.addAttribute("traineelist",traineelist);
		return "show";
	}
	
	@RequestMapping("insert")
	public String insertDetails(Model model){
		Trainee trainee = new Trainee();
		model.addAttribute("trainee",trainee);
		return "add";
	}
	
	@RequestMapping("add")
	public String insertTrainee(@Valid@ModelAttribute("trainee")Trainee trainee,
			BindingResult res, Model model){
		
		if(res.hasErrors()){
			model.addAttribute("trainee",trainee);
		    return "success";
		}
		else{
			
			tser.insertTraineedetails(trainee);
			model.addAttribute("tdetails",trainee);
			return "success";               //Menu
		}
		
	}
	
	@RequestMapping("delete")    //to show form to take trainee id
	public String deleteDetails(Model model) {
		Trainee trainee=new Trainee();
		model.addAttribute("trainee",trainee);
		return "deleteDetails";
	}
	@RequestMapping("deleteDetails")   //to delete
	public String deleteTrainee(@RequestParam("traineeId")int traineeId, Model model){
		tser.deleteTrainee(traineeId);
		model.addAttribute("traineeId",traineeId);
		return "success";   
			
	}
	
	@RequestMapping("fetch")    //to show form to take trainee id
	public String fetchDetails(Model model) {
		Trainee trainee=new Trainee();
		model.addAttribute("trainee",trainee);
		return "fetchDetails";
	}
	@RequestMapping("fetchDetails")   //to delete
	public String dfetchATrainee(@RequestParam("traineeId")int traineeId, Model model){
		Trainee trainee = tser.fetchOneTrainee(traineeId);    //trainee object based on trainee Id
		model.addAttribute("trainee",trainee);
		return "fetchOne";   
			
	}
	
	
	@RequestMapping("updateId")
	public String updateId(Model model){
		Trainee trainee = new Trainee();
		model.addAttribute("trainee",trainee);
		return "updateDetails";
	}
	
	@RequestMapping("updateDetails")
	public String updateTrainee(@Valid@ModelAttribute("trainee")Trainee trainee,
			BindingResult res, Model model){
		
		if(res.hasErrors()){
			model.addAttribute("trainee",trainee);
		    return "updateDetails";           //success
		}
		else{
			
			tser.updateTraineeDetails(trainee);
			model.addAttribute("tdetails",trainee);
			return "success";               //Menu
		}
		
	}
		
	
}
