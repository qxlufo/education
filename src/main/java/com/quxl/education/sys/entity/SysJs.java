package com.quxl.education.sys.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "sys_js")
public class SysJs  implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long jsid;
	/**编码*/
	private String bm;
	/**名称*/
	private String mc;
	/**备注*/
	private String bz;
	/**排序号*/
	private int pxh;
	/**数据权限类型*/
	private String sjqxlx;
	/**上级角色ID*/
	private Long sjjsid;

}
