package pl.piomin.services.department.model;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperties;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Schema(description = "某个部门的描述信息")
public class Department {

    @Schema(description = "部门ID")
    private Long id;
    @Schema(description = "组织ID")
    private Long organizationId;
    @Schema(description = "部门名称")
    private String name;
    @Schema(description = "部门内员工名单")
    private List<Employee> employees = new ArrayList<>();

    public Department(Long organizationId, String name) {
        super();
        this.organizationId = organizationId;
        this.name = name;
    }

}
