## SpringBoot项目的Bean装配默认规则是根据Application类所在的包位置从上往下扫描。
而Application类指的是SpringBoot项目入口类，这对于SpringBoot项目是必不可少的，一般在创建SpringBoot项目时自动生成，  
在java文件夹下。如果将Application类移动在某个子包下面，则就只会扫描此包和其所有子包，  
但如果service或者dao所在包不在此包下，则不会被扫描，就会出现不能Autowired。  

解决方案：将Application类放在dao、service所在包的上级。  


