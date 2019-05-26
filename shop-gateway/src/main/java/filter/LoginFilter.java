
package filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;


/**
 * 登录过滤器
 *记得类上加Component注解
 */

@Component
public class LoginFilter extends ZuulFilter {


    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run(){
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        System.out.println(request.getRequestURI());
        Object accessToken = request.getParameter("token");
        if("wangping".equals(accessToken)){
            currentContext.setSendZuulResponse(true);
            System.out.println("进了这里，就表示gateway进行了路由跳转------------");
        }else {
            currentContext.setSendZuulResponse(false);
            System.out.println("进了这里，就表示gateway进行了路由阻止------------");
        }
        return null;
    }
}
