package x7.tools;

import java.lang.reflect.Method;

public class MethodParsed {

	private Method method;
	private String name;
	private String mapping;
	private String methodStr;
	private String calledMethodStr;
	
	public MethodParsed(){}
	public MethodParsed(Method method){
		this.method = method;
		this.name = this.method.getName();
		this.mapping = "/"+this.method.getName();
	}
	
	public Method getMethod() {
		return method;
	}
	public void setMethod(Method method) {
		this.method = method;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMapping() {
		return mapping;
	}
	public void setMapping(String mapping) {
		this.mapping = mapping;
	}
	public String getMethodStr() {
		return methodStr;
	}
	public void setMethodStr(String methodStr) {
		this.methodStr = methodStr;
	}
	public String getCalledMethodStr() {
		return calledMethodStr;
	}
	public void setCalledMethodStr(String calledMethodStr) {
		this.calledMethodStr = calledMethodStr;
	}
	@Override
	public String toString() {
		return "MethodParsed [method=" + method + ", name=" + name + ", mapping=" + mapping + ", methodStr=" + methodStr
				+ ", calledMethodStr=" + calledMethodStr + "]";
	}

}
