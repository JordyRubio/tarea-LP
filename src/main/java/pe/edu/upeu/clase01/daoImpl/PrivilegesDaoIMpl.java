package pe.edu.upeu.clase01.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.upeu.clase01.dao.Todo;
import pe.edu.upeu.clase01.entity.Privileges;




@Component
public class PrivilegesDaoIMpl  implements Todo<Privileges> {
@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	@Override
	public int create(Privileges t) {
		// TODO Auto-generated method stub
		return 0;
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
		return jdbcTemplate.query("select *from Privileges", new BeanPropertyRowMapper<Privileges>(Privileges.class));
	}
	
	
}
