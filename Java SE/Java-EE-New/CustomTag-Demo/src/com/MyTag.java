package com;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
public class MyTag extends TagSupport{

	@Override
	public int doStartTag() throws JspException {
		
		JspWriter out= pageContext.getOut();
		
		try {
			out.println("This is my WOn Tag");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return SKIP_PAGE;
	}
	
}
