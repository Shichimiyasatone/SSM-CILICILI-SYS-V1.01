/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-04-30 07:36:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.manage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
if(session.getAttribute("adminid")==null){
	response.sendRedirect("../admin_login.html");
}
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"Dashboard\">\r\n");
      out.write("<meta name=\"keyword\"\r\n");
      out.write("\tcontent=\"Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina\">\r\n");
      out.write("\r\n");
      out.write("<title>CL视频后台管理</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap core CSS -->\r\n");
      out.write("<link href=\"manage/assets/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("<!--external css-->\r\n");
      out.write("<link href=\"manage/assets/font-awesome/css/font-awesome.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"manage/assets/css/zabuto_calendar.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"manage/assets/js/gritter/css/jquery.gritter.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"manage/assets/lineicons/style.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom styles for this template -->\r\n");
      out.write("<link href=\"manage/assets/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"manage/assets/css/style-responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"manage/assets/js/chart-master/Chart.js\"></script>\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"favicon.ico\" type=\"image/x-icon\" />\r\n");
      out.write("<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"margin:20px 20px 20px 20px;\">\r\n");
      out.write("\r\n");
      out.write("\t<section id=\"container\">\r\n");
      out.write("\t\t<!-- **********************************************************************************************************************************************************\r\n");
      out.write("      TOP BAR CONTENT & NOTIFICATIONS\r\n");
      out.write("      *********************************************************************************************************************************************************** -->\r\n");
      out.write("\t\t<!--header start-->\r\n");
      out.write("\t\t<header class=\"header black-bg\">\r\n");
      out.write("\t\t\t<div class=\"sidebar-toggle-box\">\r\n");
      out.write("\t\t\t\t<div class=\"fa fa-bars tooltips\" data-placement=\"right\"\r\n");
      out.write("\t\t\t\t\tdata-original-title=\"显示/隐藏导航\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--logo start-->\r\n");
      out.write("\t\t\t<a onclick=\"home()\" class=\"logo\" href=\"adminhome.htm\" target=\"mainframe\"><b>CL视频后台</b></a>\r\n");
      out.write("\t\t\t<!--logo end-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"top-menu\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav pull-right top-menu\">\r\n");
      out.write("\t\t\t\t\t<li><a class=\"logout\" href=\"manage/changepwd.jsp\" target=\"mainframe\">修改密码</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a class=\"logout\" href=\"adminlogout.htm\">退出登录</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t<!--header end-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- **********************************************************************************************************************************************************\r\n");
      out.write("      MAIN SIDEBAR MENU\r\n");
      out.write("      *********************************************************************************************************************************************************** -->\r\n");
      out.write("\t\t<!--sidebar start-->\r\n");
      out.write("\t\t<aside>\r\n");
      out.write("\t\t\t<div id=\"sidebar\" class=\"nav-collapse \">\r\n");
      out.write("\t\t\t\t<!-- sidebar menu start-->\r\n");
      out.write("\t\t\t\t<ul class=\"sidebar-menu\" id=\"nav-accordion\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<p class=\"centered\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"manage/assets/img/user_default.png\" class=\"img-circle\"\r\n");
      out.write("\t\t\t\t\t\t\twidth=\"60\">\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<h5 class=\"centered\">管理员");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin.adminid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h5>\r\n");
      out.write("\t\t\t\t\t");
session.setAttribute("password", request.getAttribute("password")); 
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"mt\"><a class=\"active\" href=\"adminhome.htm\" target=\"mainframe\" id=\"red\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-dashboard\"></i> <span>主页</span>\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"sub-menu\"><a href=\"javascript:;\" id=\"vm\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-desktop\"></i> <span>视频管理</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"manage/upload.jsp\" target=\"mainframe\">上传视频</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"manage/videoinfo/1/0.htm\" target=\"mainframe\">视频信息</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"manage/contribute/1/0.htm\" target=\"mainframe\" id=\"ug\">用户投稿</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"manage/videocomment/1.htm\" target=\"mainframe\">视频评论与弹幕</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"sub-menu\"><a href=\"javascript:;\" id=\"um\"> <i\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-cogs\"></i> <span>用户管理</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"manage/userinfo.html\" target=\"mainframe\" id=\"ui\">用户信息</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<!-- sidebar menu end-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</aside>\r\n");
      out.write("\t\t<!--sidebar end-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- **********************************************************************************************************************************************************\r\n");
      out.write("      MAIN CONTENT\r\n");
      out.write("      *********************************************************************************************************************************************************** -->\r\n");
      out.write("\t\t<!--main content start-->\r\n");
      out.write("\t\t<section id=\"main-content\">\r\n");
      out.write("\t\t\t<section class=\"wrapper\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<iframe class=\"col-lg-12 main-chart\" src=\"adminhome.htm\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"height: 720px; width: 100%\" name=\"mainframe\"></iframe>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t<!--main content end-->\r\n");
      out.write("\t\t<!-- js placed at the end of the document so the pages load faster -->\r\n");
      out.write("\t\t<script src=\"manage/js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"manage/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t<!--手风琴js-->\r\n");
      out.write("\t\t<script class=\"include\" type=\"text/javascript\"\r\n");
      out.write("\t\t\tsrc=\"manage/js/jquery.dcjqaccordion.2.7.js\"></script>\r\n");
      out.write("\t\t<script src=\"manage/js/jquery.scrollTo.min.js\"></script>\r\n");
      out.write("\t\t<!--滚动条js-->\r\n");
      out.write("\t\t<script src=\"manage/js/jquery.nicescroll.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<!--common script for all pages-->\r\n");
      out.write("\t\t<script src=\"manage/assets/js/common-scripts.js\"></script>\r\n");
      out.write("\t\t<!--弹出框js-->\r\n");
      out.write("\t\t<script type=\"text/javascript\"\r\n");
      out.write("\t\t\tsrc=\"manage/assets/js/gritter/js/jquery.gritter.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"manage/assets/js/gritter-conf.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t\t$('#red').click();\r\n");
      out.write("\t\t\t\tvar unique_id = $.gritter.add({\r\n");
      out.write("\t\t\t\t\t// (string | mandatory) the heading of the notification\r\n");
      out.write("\t\t\t\t\ttitle: '欢迎使用CL视频后台管理!',\r\n");
      out.write("\t\t\t\t\t// (string | mandatory) the text inside the notification\r\n");
      out.write("\t\t\t\t\ttext: '您可以在此页面管理视频信息、用户信息、用户投稿、视频评论、视频弹幕。',\r\n");
      out.write("\t\t\t\t\t// (string | optional) the image to display on the left\r\n");
      out.write("\t\t\t\t\timage: 'manage/assets/img/white.png',\r\n");
      out.write("\t\t\t\t\t// (bool | optional) if you want it to fade out on its own or just sit there\r\n");
      out.write("\t\t\t\t\tsticky: true,\r\n");
      out.write("\t\t\t\t\t// (int | optional) the time you want it to be alive for before fading out\r\n");
      out.write("\t\t\t\t\ttime: '',\r\n");
      out.write("\t\t\t\t\t// (string | optional) the class name you want to apply to that specific message\r\n");
      out.write("\t\t\t\t\tclass_name: 'my-sticky-class'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tfunction ug() {\r\n");
      out.write("\t\t\t\t$('#vm').click();\r\n");
      out.write("\t\t\t\t$('#ug').click();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction ui() {\r\n");
      out.write("\t\t\t\t$('#um').click();\r\n");
      out.write("\t\t\t\t$('#ui').click();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction delu(){\r\n");
      out.write("\t\t\t\t$(\".gritter-item-wrapper\").remove();\r\n");
      out.write("\t\t\t\tvar unique_id = $.gritter.add({\r\n");
      out.write("\t\t\t\t\t// (string | mandatory) the heading of the notification\r\n");
      out.write("\t\t\t\t\ttitle: '删除成功!',\r\n");
      out.write("\t\t\t\t\t// (string | mandatory) the text inside the notification\r\n");
      out.write("\t\t\t\t\ttext: '该记录及其所有关联数据均已被删除。',\r\n");
      out.write("\t\t\t\t\t// (string | optional) the image to display on the left\r\n");
      out.write("\t\t\t\t\timage: 'manage/assets/img/Delete.png',\r\n");
      out.write("\t\t\t\t\t// (bool | optional) if you want it to fade out on its own or just sit there\r\n");
      out.write("\t\t\t\t\tsticky: true,\r\n");
      out.write("\t\t\t\t\t// (int | optional) the time you want it to be alive for before fading out\r\n");
      out.write("\t\t\t\t\ttime: '',\r\n");
      out.write("\t\t\t\t\t// (string | optional) the class name you want to apply to that specific message\r\n");
      out.write("\t\t\t\t\tclass_name: 'my-sticky-class'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction delufail(){\r\n");
      out.write("\t\t\t\t$(\".gritter-item-wrapper\").remove();\r\n");
      out.write("\t\t\t\tvar unique_id = $.gritter.add({\r\n");
      out.write("\t\t\t\t\t// (string | mandatory) the heading of the notification\r\n");
      out.write("\t\t\t\t\ttitle: '删除失败!',\r\n");
      out.write("\t\t\t\t\t// (string | mandatory) the text inside the notification\r\n");
      out.write("\t\t\t\t\ttext: '删除失败，请联系管理员',\r\n");
      out.write("\t\t\t\t\t// (string | optional) the image to display on the left\r\n");
      out.write("\t\t\t\t\timage: 'manage/assets/img/error.png',\r\n");
      out.write("\t\t\t\t\t// (bool | optional) if you want it to fade out on its own or just sit there\r\n");
      out.write("\t\t\t\t\tsticky: true,\r\n");
      out.write("\t\t\t\t\t// (int | optional) the time you want it to be alive for before fading out\r\n");
      out.write("\t\t\t\t\ttime: '',\r\n");
      out.write("\t\t\t\t\t// (string | optional) the class name you want to apply to that specific message\r\n");
      out.write("\t\t\t\t\tclass_name: 'my-sticky-class'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction danhang(){\r\n");
      out.write("\t\t\t\t$(\".gritter-item-wrapper\").remove();\r\n");
      out.write("\t\t\t\tvar unique_id = $.gritter.add({\r\n");
      out.write("\t\t\t\t\t// (string | mandatory) the heading of the notification\r\n");
      out.write("\t\t\t\t\ttitle: '无效操作!',\r\n");
      out.write("\t\t\t\t\t// (string | mandatory) the text inside the notification\r\n");
      out.write("\t\t\t\t\ttext: '只能选择一行数据进行删除',\r\n");
      out.write("\t\t\t\t\t// (string | optional) the image to display on the left\r\n");
      out.write("\t\t\t\t\timage: 'manage/assets/img/error.png',\r\n");
      out.write("\t\t\t\t\t// (bool | optional) if you want it to fade out on its own or just sit there\r\n");
      out.write("\t\t\t\t\tsticky: true,\r\n");
      out.write("\t\t\t\t\t// (int | optional) the time you want it to be alive for before fading out\r\n");
      out.write("\t\t\t\t\ttime: '',\r\n");
      out.write("\t\t\t\t\t// (string | optional) the class name you want to apply to that specific message\r\n");
      out.write("\t\t\t\t\tclass_name: 'my-sticky-class'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction youxiao(){\r\n");
      out.write("\t\t\t\t$(\".gritter-item-wrapper\").remove();\r\n");
      out.write("\t\t\t\tvar unique_id = $.gritter.add({\r\n");
      out.write("\t\t\t\t\t// (string | mandatory) the heading of the notification\r\n");
      out.write("\t\t\t\t\ttitle: '无效操作!',\r\n");
      out.write("\t\t\t\t\t// (string | mandatory) the text inside the notification\r\n");
      out.write("\t\t\t\t\ttext: '请选择有效数据',\r\n");
      out.write("\t\t\t\t\t// (string | optional) the image to display on the left\r\n");
      out.write("\t\t\t\t\timage: 'manage/assets/img/error.png',\r\n");
      out.write("\t\t\t\t\t// (bool | optional) if you want it to fade out on its own or just sit there\r\n");
      out.write("\t\t\t\t\tsticky: true,\r\n");
      out.write("\t\t\t\t\t// (int | optional) the time you want it to be alive for before fading out\r\n");
      out.write("\t\t\t\t\ttime: '',\r\n");
      out.write("\t\t\t\t\t// (string | optional) the class name you want to apply to that specific message\r\n");
      out.write("\t\t\t\t\tclass_name: 'my-sticky-class'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction empty(){\r\n");
      out.write("\t\t\t\t$(\".gritter-item-wrapper\").remove();\r\n");
      out.write("\t\t\t\tvar unique_id = $.gritter.add({\r\n");
      out.write("\t\t\t\t\t// (string | mandatory) the heading of the notification\r\n");
      out.write("\t\t\t\t\ttitle: '无效操作!',\r\n");
      out.write("\t\t\t\t\t// (string | mandatory) the text inside the notification\r\n");
      out.write("\t\t\t\t\ttext: '请填写完整',\r\n");
      out.write("\t\t\t\t\t// (string | optional) the image to display on the left\r\n");
      out.write("\t\t\t\t\timage: 'manage/assets/img/error.png',\r\n");
      out.write("\t\t\t\t\t// (bool | optional) if you want it to fade out on its own or just sit there\r\n");
      out.write("\t\t\t\t\tsticky: true,\r\n");
      out.write("\t\t\t\t\t// (int | optional) the time you want it to be alive for before fading out\r\n");
      out.write("\t\t\t\t\ttime: '',\r\n");
      out.write("\t\t\t\t\t// (string | optional) the class name you want to apply to that specific message\r\n");
      out.write("\t\t\t\t\tclass_name: 'my-sticky-class'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction pwdce(){\r\n");
      out.write("\t\t\t\t$(\".gritter-item-wrapper\").remove();\r\n");
      out.write("\t\t\t\tvar unique_id = $.gritter.add({\r\n");
      out.write("\t\t\t\t\t// (string | mandatory) the heading of the notification\r\n");
      out.write("\t\t\t\t\ttitle: '无效操作!',\r\n");
      out.write("\t\t\t\t\t// (string | mandatory) the text inside the notification\r\n");
      out.write("\t\t\t\t\ttext: '确认密码与新密码输入不一致，请检查',\r\n");
      out.write("\t\t\t\t\t// (string | optional) the image to display on the left\r\n");
      out.write("\t\t\t\t\timage: 'manage/assets/img/error.png',\r\n");
      out.write("\t\t\t\t\t// (bool | optional) if you want it to fade out on its own or just sit there\r\n");
      out.write("\t\t\t\t\tsticky: true,\r\n");
      out.write("\t\t\t\t\t// (int | optional) the time you want it to be alive for before fading out\r\n");
      out.write("\t\t\t\t\ttime: '',\r\n");
      out.write("\t\t\t\t\t// (string | optional) the class name you want to apply to that specific message\r\n");
      out.write("\t\t\t\t\tclass_name: 'my-sticky-class'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction oldpwde(){\r\n");
      out.write("\t\t\t\t$(\".gritter-item-wrapper\").remove();\r\n");
      out.write("\t\t\t\tvar unique_id = $.gritter.add({\r\n");
      out.write("\t\t\t\t\t// (string | mandatory) the heading of the notification\r\n");
      out.write("\t\t\t\t\ttitle: '修改失败!',\r\n");
      out.write("\t\t\t\t\t// (string | mandatory) the text inside the notification\r\n");
      out.write("\t\t\t\t\ttext: '请输入正确的原密码',\r\n");
      out.write("\t\t\t\t\t// (string | optional) the image to display on the left\r\n");
      out.write("\t\t\t\t\timage: 'manage/assets/img/error.png',\r\n");
      out.write("\t\t\t\t\t// (bool | optional) if you want it to fade out on its own or just sit there\r\n");
      out.write("\t\t\t\t\tsticky: true,\r\n");
      out.write("\t\t\t\t\t// (int | optional) the time you want it to be alive for before fading out\r\n");
      out.write("\t\t\t\t\ttime: '',\r\n");
      out.write("\t\t\t\t\t// (string | optional) the class name you want to apply to that specific message\r\n");
      out.write("\t\t\t\t\tclass_name: 'my-sticky-class'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction cpwdsuccess(){\r\n");
      out.write("\t\t\t\t$(\".gritter-item-wrapper\").remove();\r\n");
      out.write("\t\t\t\tvar unique_id = $.gritter.add({\r\n");
      out.write("\t\t\t\t\t// (string | mandatory) the heading of the notification\r\n");
      out.write("\t\t\t\t\ttitle: '成功!',\r\n");
      out.write("\t\t\t\t\t// (string | mandatory) the text inside the notification\r\n");
      out.write("\t\t\t\t\ttext: '修改密码成功',\r\n");
      out.write("\t\t\t\t\t// (string | optional) the image to display on the left\r\n");
      out.write("\t\t\t\t\timage: 'manage/assets/img/success.png',\r\n");
      out.write("\t\t\t\t\t// (bool | optional) if you want it to fade out on its own or just sit there\r\n");
      out.write("\t\t\t\t\tsticky: true,\r\n");
      out.write("\t\t\t\t\t// (int | optional) the time you want it to be alive for before fading out\r\n");
      out.write("\t\t\t\t\ttime: '',\r\n");
      out.write("\t\t\t\t\t// (string | optional) the class name you want to apply to that specific message\r\n");
      out.write("\t\t\t\t\tclass_name: 'my-sticky-class'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction opsuccess(){\r\n");
      out.write("\t\t\t\t$(\".gritter-item-wrapper\").remove();\r\n");
      out.write("\t\t\t\tvar unique_id = $.gritter.add({\r\n");
      out.write("\t\t\t\t\t// (string | mandatory) the heading of the notification\r\n");
      out.write("\t\t\t\t\ttitle: '成功!',\r\n");
      out.write("\t\t\t\t\t// (string | mandatory) the text inside the notification\r\n");
      out.write("\t\t\t\t\ttext: '操作成功完成',\r\n");
      out.write("\t\t\t\t\t// (string | optional) the image to display on the left\r\n");
      out.write("\t\t\t\t\timage: 'manage/assets/img/success.png',\r\n");
      out.write("\t\t\t\t\t// (bool | optional) if you want it to fade out on its own or just sit there\r\n");
      out.write("\t\t\t\t\tsticky: true,\r\n");
      out.write("\t\t\t\t\t// (int | optional) the time you want it to be alive for before fading out\r\n");
      out.write("\t\t\t\t\ttime: '',\r\n");
      out.write("\t\t\t\t\t// (string | optional) the class name you want to apply to that specific message\r\n");
      out.write("\t\t\t\t\tclass_name: 'my-sticky-class'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction removeall(){\r\n");
      out.write("\t\t\t\t$(\".gritter-item-wrapper\").remove();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction home(){\r\n");
      out.write("\t\t\t\t$(\"#red\").click();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</section>\r\n");
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
