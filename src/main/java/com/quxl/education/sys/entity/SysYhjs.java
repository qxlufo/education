package com.quxl.education.sys.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sys_yhjs")
@Data
public class SysYhjs  {
	@EmbeddedId
	private SysYhjsKey id;

	public SysYhjs() {
	}
	public SysYhjs(SysYhjsKey id) {
		this.id = id;
	}
}
