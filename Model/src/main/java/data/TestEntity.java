package data;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "test")
public class TestEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String email;
	
	private String name;
	
	public TestEntity(){}
	
	public TestEntity(String email, String name){
		this.email = email;
		this.name = name;
	}
	
}
