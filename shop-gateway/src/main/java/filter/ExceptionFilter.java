/*
package filter;

import com.alibaba.fastjson.JSONObject;
import com.facemeng.stars.common.support.Result;
import com.facemeng.stars.common.support.exception.CommonException;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.ERROR_TYPE;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.SEND_ERROR_FILTER_ORDER;

@Component
public class ExceptionFilter extends ZuulFilter {

    @Value("${spring.application.name}")
    private String serviceName;

    @Override
    public String filterType() {
        return ERROR_TYPE;
    }

    @Override
    public int filterOrder() {
        return SEND_ERROR_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
        return true; // 默认处理
    }

    @Override
    public Object run() {
        // 可以在此统一处理执行之前的异常
        RequestContext ctx = RequestContext.getCurrentContext();
        Throwable throwable = ctx.getThrowable();
        try {
            Result result;
            // 输出异常
            throwable.printStackTrace();
            if (throwable instanceof ZuulException && throwable.getCause() instanceof CommonException) {
                CommonException exception = (CommonException) throwable.getCause();
                result = Result.builder().error(exception.getCustomMsg()).status(exception.getExceptionCode()).service(serviceName).build();
            } else {
                result = Result.builder().error(throwable.getMessage()).service(serviceName).build();
            }
            // 正常response
            ctx.setResponseStatusCode(200);
            ctx.getResponse().setContentType("application/json;charset=UTF-8");
            ctx.setResponseBody(JSONObject.toJSONString(result));
            // 避免SendErrorFilter处理，直接进入post类型过滤器处理
//            ctx.setThrowable(null);
            ctx.remove("throwable");
        } catch (Exception var5) {
            ReflectionUtils.rethrowRuntimeException(var5);
        }
        return null;
    }
}
*/
