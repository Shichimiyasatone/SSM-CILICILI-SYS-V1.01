/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-05-01 02:41:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.manage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cn.cilicili.entity.Submission;
import java.util.*;

public final class contribute_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
      out.write('	');
if(session.getAttribute("adminid")==null){
	response.sendRedirect("../admin_login.html");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title></title>\r\n");
      out.write("<link href=\"../../css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../css/jquery.pagination.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"margin:20px 20px 20px 20px;\">\r\n");
      out.write("\t<form role=\"form\">\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>视频分类:</td>\r\n");
      out.write("\t\t\t\t\t<td><select class=\"form-control\" id=\"ss\" onchange=\"func();\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"0\">全部</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">待审核</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"2\">已通过</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"3\">未通过</option>\r\n");
      out.write("\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\t<table class=\"table table-hover\">\r\n");
      out.write("\t\t<thead style=\"background-color: #E9E9E9\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>视频名</td>\r\n");
      out.write("\t\t\t\t<td>作者</td>\r\n");
      out.write("\t\t\t\t<td>文件大小</td>\r\n");
      out.write("\t\t\t\t<td>视频封面</td>\r\n");
      out.write("\t\t\t\t<td>视频</td>\r\n");
      out.write("\t\t\t\t<td>文件格式</td>\r\n");
      out.write("\t\t\t\t<td>上传时间</td>\r\n");
      out.write("\t\t\t\t<td>视频类型</td>\r\n");
      out.write("\t\t\t\t<td>状态</td>\r\n");
      out.write("\t\t\t\t<td>操作</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t");

				ArrayList<Submission> list = (ArrayList<Submission>) request
							.getAttribute("submission");
				String gettypename=null;
				String time=null;
					for (int i = 0; i < Integer.parseInt(request.getAttribute("length")
							.toString()); i++) {
						if(list.get(i).getTypeid()==1){
							gettypename="娱乐";
						}
						else if(list.get(i).getTypeid()==2){
							gettypename="游戏";
						}
						else if(list.get(i).getTypeid()==3){
							gettypename="动画";
						}
						else if(list.get(i).getTypeid()==4){
							gettypename="音乐";
						}
						else if(list.get(i).getTypeid()==5){
							gettypename="舞蹈";
						}
						time=list.get(i).getSubmissiontime().substring(0,4)+'-'+list.get(i).getSubmissiontime().substring(4,6)+'-'+list.get(i).getSubmissiontime().substring(6,8)+' '+list.get(i).getSubmissiontime().substring(8,10)+':'+list.get(i).getSubmissiontime().substring(10,12)+':'+list.get(i).getSubmissiontime().substring(12,14);
						out.print("<tr><td  width=194px>"
								+ list.get(i).getVideoname()
								+ "</td><td>"
								+ list.get(i).getUserid()
								+ "</td><td>"
								+ list.get(i).getFilesize()+"</td>");
						if(list.get(i).getState().equals("未通过")){
							out.print("<td>-</td><td>-</td><td>");
						}
						else{
							out.print("<td><img src=../../../"+ list.get(i).getImgurl()+ " width=200px;height=100px;></td><td><video controls=controls height=110px width=200px src=../../../"+ list.get(i).getFileurl() + "></td><td>");
						}
								out.print(list.get(i).getFormat().substring(6) + "</td><td>"
								+ time + "</td><td>"
								+ gettypename + "</td><td>"
								+ list.get(i).getState() + 
								"</td><td>");
						if(list.get(i).getState().equals("待审核")){
							out.print("<div class='btn-group'><button type='button' class='btn btn-primary dropdown-toggle' data-toggle='dropdown'>未审核 <span class='caret'></span></button><ul class='dropdown-menu' role='menu'><li><a onclick=pass('"+list.get(i).getSubmissionid()+"')>通过</a></li><li><a onclick=unpass('"+list.get(i).getSubmissionid()+"')>不通过</a></li></ul></div></td></tr>");
						}
						else if(list.get(i).getState().equals("未通过")){
							out.print("-");
						}
						else if(list.get(i).getState().equals("已通过")){
							out.print("<button class='btn btn-danger' onclick=delvbys('"+list.get(i).getSubmissionid()+"')>删除</button>");
						}
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
      out.write("\t<script src=\"../../js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("\t<script src=\"../../js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"../../js/jquery.pagination.min.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction func() {\r\n");
      out.write("\t\t\tvar vs = $('select  option:selected').val();\r\n");
      out.write("\t\t\twindow.location.href = \"../1/\" + vs + \".htm\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t// 当总页数为1时，不显示分页插件\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\tvar s = $('#typeid').val();\r\n");
      out.write("\t\t\t$('#ss').val(s);\r\n");
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
      out.write("\t\t\t\t\twindow.location.href=\"../\"+current+\"/\"+$('#typeid').val()+\".htm\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tfunction pass(subid) {\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : \"get\",\r\n");
      out.write("\t\t\t\tasync : true,\r\n");
      out.write("\t\t\t\turl : \"../../1/\" + subid + \"/subpass.htm\",\r\n");
      out.write("\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\twindow.location.reload();\r\n");
      out.write("\t\t\t\t\twindow.parent.opsuccess();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction unpass(subid) {\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : \"get\",\r\n");
      out.write("\t\t\t\tasync : true,\r\n");
      out.write("\t\t\t\turl : \"../../0/\" + subid + \"/subpass.htm\",\r\n");
      out.write("\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\twindow.location.reload();\r\n");
      out.write("\t\t\t\t\twindow.parent.opsuccess();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction delvbys(str){\r\n");
      out.write("\t\t\talert(str);\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : \"get\",\r\n");
      out.write("\t\t\t\tasync : true,\r\n");
      out.write("\t\t\t\turl : \"../../\" + str + \"/delvbys.htm\",\r\n");
      out.write("\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\twindow.location.reload();\r\n");
      out.write("\t\t\t\t\twindow.parent.opsuccess();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
