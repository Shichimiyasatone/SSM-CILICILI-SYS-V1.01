/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-04-30 02:11:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.manage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import cn.cilicili.entity.Video;

public final class videocomment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    ");
if(session.getAttribute("adminid")==null){
	response.sendRedirect("../admin_login.html");
}
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title></title>\r\n");
      out.write("<link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/jquery.pagination.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"margin:20px 20px 20px 20px;\">\r\n");
      out.write("\t<table class=\"table table-hover\">\r\n");
      out.write("\t\t<thead style=\"background-color: #E9E9E9\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>视频编号</td>\r\n");
      out.write("\t\t\t\t<td>视频名</td>\r\n");
      out.write("\t\t\t\t<td>视频</td>\r\n");
      out.write("\t\t\t\t<td>查看评论</td>\r\n");
      out.write("\t\t\t\t<td>查看弹幕</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t");
ArrayList<Video> list = (ArrayList<Video>) request.getAttribute("video");
				for (int i = 0; i < Integer.parseInt(request.getAttribute("length")
						.toString()); i++) {
					out.println("<tr><td>"
							+ list.get(i).getVideoid()
							+ "</td><td>"
							+ list.get(i).getVideoname()
							+ "</td><td><video controls=controls height=110px width=200px src=../../"
							+ list.get(i).getFileurl() + "></td><td>"
							+ "<a href=../"+list.get(i).getVideoid()+"/commentview.htm><span class='glyphicon glyphicon-comment'>查看评论</span></a></td><td><a href=../"+list.get(i).getVideoid()+"/barrageview.htm><span class='glyphicon glyphicon-edit'>查看弹幕</span></a></td></tr>");
				}
			
      out.write("\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<div style=\"text-align: center\">\r\n");
      out.write("\t\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pages}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"pages\">\r\n");
      out.write("\t\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"pageNum\">\r\n");
      out.write("\t\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${typeid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"typeid\">\r\n");
      out.write("\t\t<div id=\"pagination3\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<script src=\"../js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("<script src=\"../js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"../js/jquery.pagination.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\t\t$().ready(function() {\r\n");
      out.write("\t\t\tvar pagen=parseInt($('#pageNum').val());\r\n");
      out.write("\t\t\tvar pages=parseInt($('#pages').val());\r\n");
      out.write("\t\t\t$(\"#pagination3\").pagination({\r\n");
      out.write("\t\t\t\tcurrentPage: pagen,\r\n");
      out.write("\t\t\t\ttotalPage: pages,\r\n");
      out.write("\t\t\t\tisShow: true,\r\n");
      out.write("\t\t\t\tcount: 7,\r\n");
      out.write("\t\t\t\thomePageText: \"首页\",\r\n");
      out.write("\t\t\t\tendPageText: \"尾页\",\r\n");
      out.write("\t\t\t\tprevPageText: \"上一页\",\r\n");
      out.write("\t\t\t\tnextPageText: \"下一页\",\r\n");
      out.write("\t\t\t\tcallback: function(current) {\r\n");
      out.write("\t\t\t\t\twindow.location.href=current+\".htm\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t})\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
