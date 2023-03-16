package pl.piomin.services.department.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Schema(description = "员工信息")
public class Employee {

    @Schema(description = "工号")
    private Long id;
    @Schema(description = "姓名")
    private String name;
    @Schema(description = "年龄")
    private int age;
    @Schema(description = "职位")
    private String position;

    public Employee(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

}
