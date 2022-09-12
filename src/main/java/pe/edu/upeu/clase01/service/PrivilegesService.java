package pe.edu.upeu.clase01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.clase01.dao.Todo;
import pe.edu.upeu.clase01.daoImpl.PrivilegesDaoIMpl;
import pe.edu.upeu.clase01.entity.Privileges;


@Service
public class PrivilegesService implements Todo<Privileges>{
	
	
	
	@Autowired
	private PrivilegesDaoIMpl daoIMpl;
	@Override
	public int create(Privileges t) {
		// TODO Auto-generated method stub
		return daoIMpl.create(t);
	}

	@Override
	public int update(Privileges t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Privileges read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Privileges> readAll() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll();
	}
}
