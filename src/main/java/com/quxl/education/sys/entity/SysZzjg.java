package com.quxl.education.sys.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
/**
 * 组织机构
 * @author: create by qxl
 * @version: v1.0
 * @description: com.quxl.education.sys.entity
 * @date:2018/11/29
 */
@Data
@Entity
@Table(name = "sys_zzjg")
public class SysZzjg  implements Serializable {

	/**
	 * 机构ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long jgid;
	/**
	 * 机构类别
	 */
	private String jglb;
	/**机构编码*/
	private String jgbm;
	/**机构简称*/
	private String jgjc;
	/**机构全称*/
	private String jgqc;
	/**负责人*/
	private String fzr;
	/**联系电话*/
	private String lxdh;
	/**备注*/
	private String bz;
	/**上级机构Id*/
	private Long sjjgid;
	/**所属单位Id*/
	private Long dwjgid;
	/**执法标识*/
	private String zfbs;
	/**排序号*/
	private Long pxh;
	/**是否有效*/
	private String sfyx;

}
