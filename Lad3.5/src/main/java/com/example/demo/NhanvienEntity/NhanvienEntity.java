package com.example.demo.NhanvienEntity;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NhanvienEntity {
	@NotBlank(message="Vui long nhap ten !")
    String name;
	
	@NotBlank(message="Vui long khong de trong Email !")
	@Email(message="Email Khong dung dinh dang !")
    String email;
	@Min(0)
	@Max(10)
	@NotNull
    Double marks;
	
	@NotNull
    Boolean gender;
	
	@NotBlank(message="Khong duoc de trong nganh hoc")
    String faculty;
	
    @NotEmpty
    List<String> hobby;
	
}
