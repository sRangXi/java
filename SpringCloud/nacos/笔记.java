Nacos中的配置文件变更后，微服务无需重启就可以感知。不过需要通过下面两种配置实现
-方法1：在 @Value 注入的变量所在的类上加上 @RefreshScope 注解
        @RefreshScope
        public class UserController {
            @Value("${pattern.datefromat}") 
            private String detefromat;
        }
-方法2：使用 @ConfigurationProperties 注解
        @Data
        @Component
        @ConfigurationProperties(prefix = "pattern")
        public class PatternProperties {
            private String dateformat;
        }
        
多配置共享优先级：
    当前服务名-profile.yaml > 服务名称.yaml>本地配置.yaml