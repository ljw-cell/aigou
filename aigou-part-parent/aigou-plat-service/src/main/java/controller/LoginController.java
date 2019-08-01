package controller;

import cn.itsource.basic.util.AjaxResult;
import cn.itsource.part.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {


    //@RequestMapping(value = "/login",method = RequestMethod.POST)
    @PostMapping("/login")
    //@ApiOperation("登录接口")
    //@ApiImplicitParams({
    public AjaxResult login(@RequestBody User user){
        String username = user.getUsername();
        String password = user.getPassword();
        //假登录
        if("admin".equals(username)&&"admin".equals(password)){
            return AjaxResult.me().setSuccess(true).setMessage("登录成功!").setRestObj(user);
        }
        return AjaxResult.me().setSuccess(false).setMessage("登录失败!");
    }
}
