package ci.xu.crawlerbase.config.swagger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @Author:ShadowSaint
 * @Date:19-4-1 上午9:13
 * @Description: 将默认地址重定向到swagger-ui上
 */
@Controller
public class SwaggerController {
    @ApiIgnore
    @GetMapping("/")
    public String index(){
        return "redirect:/swagger-ui.html";
    }
}