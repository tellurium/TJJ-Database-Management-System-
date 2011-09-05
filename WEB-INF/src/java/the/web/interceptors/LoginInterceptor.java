package the.web.interceptors;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor {
	@Override
    public String intercept(ActionInvocation invocation) throws Exception {
        ActionContext ctx=ActionContext.getContext();
        Map session=ctx.getSession();
        Boolean isLogin = (Boolean) session.get("IS_LOGIN");
        
        if(isLogin == null || !isLogin) {
            ActionSupport action=(ActionSupport)invocation.getAction();
            action.clearErrorsAndMessages();
            action.addActionError(action.getText("please.title") + action.getText("login.title"));
            
            return "login";
        }
        
        return invocation.invoke();
    }
}