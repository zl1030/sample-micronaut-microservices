package pl.piomin.services.department;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
		info = @Info(
				title = "Departments Management",
				version = "1.0",
				description = "Department API",
				contact = @Contact(url = "http://www.abc.xyz", name = "Zhou Lei", email = "zl1030@163.com")
		)
)
public class DepartmentApplication {

	public static void main(String[] args) {
		Micronaut.run(DepartmentApplication.class);
	}
	
}
