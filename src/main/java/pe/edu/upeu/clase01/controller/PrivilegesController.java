package pe.edu.upeu.clase01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.clase01.entity.Privileges;
import pe.edu.upeu.clase01.service.PrivilegesService;

@RestController
public class PrivilegesController {

	@Autowired
	private  PrivilegesService privilegesService;
	
	
	@GetMapping("/privileges")
	public List<Privileges> getList(){
		return privilegesService.readAll();
}
	}
