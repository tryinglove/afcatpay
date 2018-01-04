-- 创建名为merchant的数据库.
create database if not exists `merchant`;

-- 在mysql中使用该数据库进行表结构的创建.
use merchant;

-- 1.用户表 IM_USER
create table `IM_USER` (
  id_user varchar(32) primary key comment '用户登录的id编号,整张数据表的主键',
  user_name varchar(64) not null comment '登录系统的用户名',
  user_acc varchar(20) not null comment '',
  user_phone varchar(30) comment '用户的电话',
  user_email varchar(128) comment '用户的email邮箱地址',
  user_certype varchar(2) comment '用户的证件类型: 1.身份证',
  user_certno varchar(30) comment '用户的证件号码：用户的身份证号',
  user_pwd varchar(60) comment '用户的登录密码',
  user_initpwd char(1) not null default '1' comment '0:强制要求修改 1:未强制要求修改',
  user_stt char(1) not null comment '0:正常, 2:暂时冻结, 3:用户停用, 4:永久冻结',
  user_desc varchar(200) comment '用户信息描述',
  user_remark1 varchar(200) comment '预留字段1',
  user_remark2 varchar(200) comment '预留字段2',
  user_remark3 varchar(200) comment '预留字段3'
)ENGINE=InnoDB default charset=utf8 comment '用户基本信息表';

-- 2.菜单表 IM_ITEM
create table `IM_ITEM` (
  id_item varchar(32) primary key comment '菜单功能表的主键列',
  item_name varchar(60) not null comment '功能名称',
  item_url varchar(8) not null comment '菜单功能指向的url地址列表',
  item_auth char(1) not null default '0' comment '是否需要进行授权 0否，1是',
  item_type char(1) not null default '1' comment '功能类型: 0管理功能 1:经办类功能 2：授权类功能 3:查询统计类',
  item_stt char(1) not null comment '功能状态 0:正常 1:冻结'
)ENGINE=InnoDB default charset=utf8 comment '菜单表';

-- 3.角色表 IM_ROLE
create table `IM_ROLE` (
  id_role varchar(32) primary key comment '角色编号',
  role_name varchar(100) not null comment '角色名称',
  role_desc varchar(300) comment '角色描述',
  role_privilege char(1) comment '角色权限: 0指定机构 1指定机构及下属 2指定级别',
  role_moditime varchar(14) comment '最后修改时间',
  role_mofiuser varchar(20) comment '最后修改人',
  role_stt char(1) not null default '0' comment '角色状态: 0正常 1暂时冻结 2永久冻结 3停用'
)ENGINE=InnoDB default charset=utf8 comment '角色表';

-- 4.用户与角色对应关系之间的关联表 IM_USER_ROLE_REL
create table `IM_USER_ROLE_REL` (
  rel_userid varchar(32) not null primary key comment '用户编号',
  rel_roleid varchar(32) not null comment '角色编号'
)ENGINE=InnoDB default charset=utf8 comment '用户角色之间的关联表';

-- 5.角色与功能对应关系表 IM_ROLE_ITEM_REL
create table `IM_ROLE_ITEM_REL` (
  id_role_item varchar(32) primary key comment '主键id',
  role_item_roleid varchar(32) not null comment '角色编号',
  role_item_itemid varchar(32) not null comment '功能编号'
)ENGINE=InnoDB default charset=utf8 comment '角色与功能对应关系表';

-- 6.菜单表 IM_MENU
create table `IM_MENU` (
  id_menu varchar(32) primary key comment '菜单编号',
  menu_name varchar(60) not null comment '菜单名称',
  menu_desc varchar(300) comment '菜单描述',
  menu_parentid varchar(8) comment '上级菜单编号',
  menu_stt char(1) not null comment '菜单状态 0:激活 1：冻结',
  menu_level tinyint not null comment '菜单的级别',
  menu_serialno tinyint not null default 0 comment '显示的顺序',
  menu_icon varchar(10) comment '菜单的图标'
)ENGINE=InnoDB default charset=utf8 comment '内管菜单表';

-- 7.菜单功能关联表 IM_MENU_ITEM_REL
create table `IM_MENU_ITEM_REL` (
  id_menu_item varchar(32) primary key comment '记录id编号',
  menu_item_menuid varchar(32) not null comment '菜单编号',
  menu_item_itemid varchar(32) not null comment '功能名称'
)ENGINE=InnoDB default charset=utf8 comment '菜单功能关联表';

create table `PAY_LOG` (
  log_id varchar (32) primary key comment '日志id',
  log_ip VARCHAR (50)  comment '请求ip',
  log_mac VARCHAR (50) comment '请求mac',
  log_success VARCHAR (2) comment '请求是否成功',
  log_class VARCHAR (50) comment '记录日志的位置',
  log_msg VARCHAR (100) comment '备注信息',
  log_errorcode VARCHAR (20) comment '错误码',
  log_time VARCHAR (30) comment '记录日志时间'
 )ENGINE=InnoDB default charset=utf8 comment '日志表';

-- 9.应用参数表.
create table `PUB_APPPAR` (
  id_appar varchar(32) primary key comment '主键id',
  appar_name varchar(40) not null comment '参数名称',
  appar_code varchar(20) not null comment '参数代码',
  appar_value varchar(40) not null comment '参数对应的数值',
  appar_desc varchar(40) comment '参数信息简要描述',
  appar_remark1 varchar(20) comment '预留字段一',
  appar_remark2 varchar(20) comment '预留字段二'
)ENGINE=InnoDB default charset=urf8 comment '应用参数表';