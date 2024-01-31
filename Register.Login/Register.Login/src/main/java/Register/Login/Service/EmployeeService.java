package Register.Login.Service;

import Register.Login.Response.LoginResponse;
import Register.Login.dto.EmployeeDTO;
import Register.Login.dto.LoginDTO;


public interface EmployeeService {
	 String addEmployee(EmployeeDTO employeeDTO);
	    LoginResponse loginEmployee(LoginDTO loginDTO);

}
