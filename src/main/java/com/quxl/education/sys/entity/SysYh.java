package com.quxl.education.sys.entity;

import lombok.Data;
import org.springframework.web.bind.annotation.Mapping;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "sys_yh")
public class SysYh  implements Serializable {
	/**用户ID*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long yhid;
	/**机构ID*/
	private Long jgid;
	/**登录账号*/
	private String dlzh;
	/**密码*/
	private String mm;
	/**密码助记信息*/
	private String mmzjxx;
	/**姓名*/
	private String xm;
	/**性别*/
	private String xb;
	/**身份证号码*/
	private String sfzhm;
	/**职务*/
	private String zw;
	/**联系电话*/
	private String lxdh;
	/**手机号码*/
	private String sjhm;
	/**紧急联系电话*/
	private String jjlxdh;
	/**传真*/
	private String cz;
	/**电子邮件*/
	private String dzyj;
	/**绑定微信号*/
	private String bdwxh;
	/**住址*/
	private String zz;
	/**邮政编码*/
	private String yzbm;
	/**排序号*/
	private Long pxh;
	/**最近密码修改时间*/
	private java.util.Date zjmmxgsj;
	/**是否被锁定*/
	private String sfbsd;
	/**登陆错误次数*/
	private int dlcwsc;
	/**历史密码*/
	private String lsmm;
	/**历史IP*/
	private String lsip;
	/**是否有效*/
	private String sfyx;

}
