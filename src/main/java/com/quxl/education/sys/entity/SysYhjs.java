package com.quxl.education.sys.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "sys_yhjs")
public class SysYhjs  implements Serializable {
	/**用户ID*/
	@Id
	private Long yhid;
	/**角色ID*/
	@Id
	private Long jsid;


}
