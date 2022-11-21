使用feign
    1.在启动类加 @EnableFeignClients 注解
    2.创建接口加 @FeignClient 注解
    @FeignClient("user-service")
    public interface UserClient {
        @GetMapping("/user/{id}")
        User findById(@PathVariable Long id);
    }
feing性能优化
    - URL Co
    1