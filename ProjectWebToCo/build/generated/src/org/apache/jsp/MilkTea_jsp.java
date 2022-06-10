package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MilkTea_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <!--<link href=\"css/pagger.css\" rel=\"stylesheet\" type=\"text/css\"/>-->\n");
      out.write("        <!--<link href=\"css/Account.css\" rel=\"stylesheet\" type=\"text/css\"/>-->\n");
      out.write("        <link href=\"assets/css/animate.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"assets/css/color.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"assets/css/helper.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"assets/css/pe-icon-7-stroke.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"assets/css/product.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"assets/css/slidenav.almost-flat.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"assets/css/slideshow.almost-flat.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"assets/css/sticky.almost-flat.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"assets/css/template.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"assets/css/tooltip.almost-flat.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"assets/css/uikit.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"https://getbootstrap.com/docs/4.5/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("   <style>\n");
      out.write("        .navbar {\n");
      out.write("            overflow: hidden;\n");
      out.write("            background-color: #333;\n");
      out.write("            position: fixed; /* Set the navbar to fixed position */\n");
      out.write("            top: 0; /* Position the navbar at the top of the page */\n");
      out.write("            width: 100%; /* Full width */\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("             <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("                 <a class=\"navbar-brand\" href=\"MilkTea.jsp\"><img src=\"assets/images/logo.png\"></a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("    <ul class=\"navbar-nav\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"MilkTea.jsp\">Trang chủ <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\">Giới Thiệu</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\">Danh Mục Sản Phẩm</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\">Tin Tức</a>\n");
      out.write("      </li>\n");
      out.write("         <li class=\"nav-item\">\n");
      out.write("             <a class=\"nav-link\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.TK}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("        </li>\n");
      out.write("                    <form action=\"MilkTea\">\n");
      out.write("                        ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                         \n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("      <div>\n");
      out.write("        <div class=\"uk-grid\">\n");
      out.write("            <div class=\"uk-width-medium-1-1\">\n");
      out.write("                <img width=\"445\" height=\"445\" alt=\"Shop Slide\" src=\"assets/images/headerr.png\"\n");
      out.write("                     style=\" width: 100%; height: auto\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"uk-overlay-panel\">                                                                                              \n");
      out.write("            <div class=\"uk-container uk-container-center uk-height-1-1 uk-width-1-1 uk-flex uk-flex-middle\">\n");
      out.write("                <div class=\"uk-width-medium-3-6 uk-text-left\">\n");
      out.write("                    <div class=\"wow fadeInLeft slider-text\" data-wow-delay=\"0.7s\">\n");
      out.write("                        <h3 class=\"lato85 lato56 uk-text-primary\">Trà Sữa</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"wow fadeInLeft slider-text slider-text-2\" data-wow-delay=\"1.2s\">\n");
      out.write("                        <h1 class=\"lato85 lato56 uk-text-primary\">Quất</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"wow fadeInUp  slider-text-3\" data-wow-delay=\"1.7s\">\n");
      out.write("                        <h1 class=\"lato85 lato56 uk-text-white\">Nha Đam</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"wow fadeInUp\" data-wow-delay=\"2.5s\">\n");
      out.write("                        <a class=\"text-uppercase btn btn-primary btn-lg shop-button\"\n");
      out.write("                           href=\"ca-hoi-na-uy.html\">Mua ngay</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        <section class=\"bottom-a\">\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-12 col-md-12\">\n");
      out.write("                <div class=\"module title2\">\n");
      out.write("                    <h3 class=\"module-title text-uppercase\">Sản phẩm nổi bật</h3>\n");
      out.write("                    <div class=\"module-content\">\n");
      out.write("                        \n");
      out.write("<div id=\"w0\" class=\"uk-grid product-list uk-grid-match\"><div class=\"uk-width-small-1-2 uk-width-medium-1-3 uk-width-large-1-4\" data-key=\"170\">\n");
      out.write("<div class=\"product\">\n");
      out.write("    <a class=\"product-thumbnail\" style=\"display: block\" href=\"ba-chi-bo-my-dong-lanh-an-lau-nuong.html\">\n");
      out.write("        <div><img src=\"assets/images/ts1.jpg\" alt=\"\"></div>        <div class=\"product-overlay\">\n");
      out.write("            <span class=\"read-link\"><i class=\"fa fa-link\"></i></span>        </div>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"product-title\" href=\"ba-chi-bo-my-dong-lanh-an-lau-nuong.html\">Ba chỉ bò Mỹ đông lạnh ăn lẩu/nướng </a>\n");
      out.write("    <div class=\"product-price\">\n");
      out.write("        185.000 VND     </div>\n");
      out.write("    \n");
      out.write("    <div class=\"text-uppercase\">\n");
      out.write("        <div class=\"button-group btn-group-justified\">\n");
      out.write("            <a class=\"btn btn-primary btn-lg\" href=\"ba-chi-bo-my-dong-lanh-an-lau-nuong.html\" data-cart='{\"entity_id\":170,\"quantity\":1,\"quickcart\":1}'>Mua ngay</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div></div>\n");
      out.write("<div class=\"uk-width-small-1-2 uk-width-medium-1-3 uk-width-large-1-4\" data-key=\"176\">\n");
      out.write("<div class=\"product\">\n");
      out.write("    <a class=\"product-thumbnail\" style=\"display: block\" href=\"ca-hoi-tuou-nguyen-con.html\">\n");
      out.write("        <div><img src=\"../file.freshfoods.vn/global/product/s1-ca-hoi-tuou-nguyen-con.gif\" alt=\"\"></div>        <div class=\"product-overlay\">\n");
      out.write("            <span class=\"read-link\"><i class=\"fa fa-link\"></i></span>        </div>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"product-title\" href=\"ca-hoi-tuou-nguyen-con.html\">Cá hồi tươi nguyên con </a>\n");
      out.write("    <div class=\"product-price\">\n");
      out.write("        380.000 VND     </div>\n");
      out.write("    \n");
      out.write("    <div class=\"text-uppercase\">\n");
      out.write("        <div class=\"button-group btn-group-justified\">\n");
      out.write("            <a class=\"btn btn-primary btn-lg\" href=\"ca-hoi-tuou-nguyen-con.html\" data-cart='{\"entity_id\":176,\"quantity\":1,\"quickcart\":1}'>Mua ngay</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div></div>\n");
      out.write("<div class=\"uk-width-small-1-2 uk-width-medium-1-3 uk-width-large-1-4\" data-key=\"233\">\n");
      out.write("<div class=\"product\">\n");
      out.write("    <a class=\"product-thumbnail\" style=\"display: block\" href=\"ca-hoi-phi-le-tuoi.html\">\n");
      out.write("        <div><img src=\"../file.freshfoods.vn/global/product/s1-ca-hoi-phi-le-tuoi.gif\" alt=\"\"></div>        <div class=\"product-overlay\">\n");
      out.write("            <span class=\"read-link\"><i class=\"fa fa-link\"></i></span>        </div>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"product-title\" href=\"ca-hoi-phi-le-tuoi.html\">Cá hồi tươi Nauy phi lê </a>\n");
      out.write("    <div class=\"product-price\">\n");
      out.write("        560.000 VND     </div>\n");
      out.write("    \n");
      out.write("    <div class=\"text-uppercase\">\n");
      out.write("        <div class=\"button-group btn-group-justified\">\n");
      out.write("            <a class=\"btn btn-primary btn-lg\" href=\"ca-hoi-phi-le-tuoi.html\" data-cart='{\"entity_id\":233,\"quantity\":1,\"quickcart\":1}'>Mua ngay</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div></div>\n");
      out.write("<div class=\"uk-width-small-1-2 uk-width-medium-1-3 uk-width-large-1-4\" data-key=\"169\">\n");
      out.write("<div class=\"product\">\n");
      out.write("    <a class=\"product-thumbnail\" style=\"display: block\" href=\"suon-non-cat-lau.html\">\n");
      out.write("        <div><img src=\"../file.freshfoods.vn/global/product/s1-suon-non-cat-lau.gif\" alt=\"\"></div>        <div class=\"product-overlay\">\n");
      out.write("            <span class=\"read-link\"><i class=\"fa fa-link\"></i></span>        </div>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"product-title\" href=\"suon-non-cat-lau.html\">Sườn non bò Mỹ không xương Cắt lát </a>\n");
      out.write("    <div class=\"product-price\">\n");
      out.write("        750.000 VND     </div>\n");
      out.write("    \n");
      out.write("    <div class=\"text-uppercase\">\n");
      out.write("        <div class=\"button-group btn-group-justified\">\n");
      out.write("            <a class=\"btn btn-primary btn-lg\" href=\"suon-non-cat-lau.html\" data-cart='{\"entity_id\":169,\"quantity\":1,\"quickcart\":1}'>Mua ngay</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div></div>\n");
      out.write("<div class=\"uk-width-small-1-2 uk-width-medium-1-3 uk-width-large-1-4\" data-key=\"168\">\n");
      out.write("<div class=\"product\">\n");
      out.write("    <a class=\"product-thumbnail\" style=\"display: block\" href=\"suon-cuu-co-xuong-song.html\">\n");
      out.write("        <div><img src=\"../file.freshfoods.vn/global/product/s1-suon-cuu-co-xuong-song.gif\" alt=\"\"></div>        <div class=\"product-overlay\">\n");
      out.write("            <span class=\"read-link\"><i class=\"fa fa-link\"></i></span>        </div>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"product-title\" href=\"suon-cuu-co-xuong-song.html\">Sườn cừu Úc có xương sống </a>\n");
      out.write("    <div class=\"product-price\">\n");
      out.write("        450.000 VND     </div>\n");
      out.write("    \n");
      out.write("    <div class=\"text-uppercase\">\n");
      out.write("        <div class=\"button-group btn-group-justified\">\n");
      out.write("            <a class=\"btn btn-primary btn-lg\" href=\"suon-cuu-co-xuong-song.html\" data-cart='{\"entity_id\":168,\"quantity\":1,\"quickcart\":1}'>Mua ngay</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div></div>\n");
      out.write("<div class=\"uk-width-small-1-2 uk-width-medium-1-3 uk-width-large-1-4\" data-key=\"281\">\n");
      out.write("<div class=\"product\">\n");
      out.write("    <a class=\"product-thumbnail\" style=\"display: block\" href=\"sot-thit-nuong-cay.html\">\n");
      out.write("        <div><img src=\"../file.freshfoods.vn/global/product/s1-sot-thit-nuong-cay.gif\" alt=\"\"></div>        <div class=\"product-overlay\">\n");
      out.write("            <span class=\"read-link\"><i class=\"fa fa-link\"></i></span>        </div>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"product-title\" href=\"sot-thit-nuong-cay.html\">Sốt thịt nướng cay (Yakiniku no tare hot) </a>\n");
      out.write("    <div class=\"product-price\">\n");
      out.write("        140.000 VND     </div>\n");
      out.write("    \n");
      out.write("    <div class=\"text-uppercase\">\n");
      out.write("        <div class=\"button-group btn-group-justified\">\n");
      out.write("            <a class=\"btn btn-primary btn-lg\" href=\"sot-thit-nuong-cay.html\" data-cart='{\"entity_id\":281,\"quantity\":1,\"quickcart\":1}'>Mua ngay</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div></div>\n");
      out.write("<div class=\"uk-width-small-1-2 uk-width-medium-1-3 uk-width-large-1-4\" data-key=\"277\">\n");
      out.write("<div class=\"product\">\n");
      out.write("    <a class=\"product-thumbnail\" style=\"display: block\" href=\"mu-tat-yamachu.html\">\n");
      out.write("        <div><img src=\"../file.freshfoods.vn/global/product/s1-mu-tat-yamachu.gif\" alt=\"\"></div>        <div class=\"product-overlay\">\n");
      out.write("            <span class=\"read-link\"><i class=\"fa fa-link\"></i></span>        </div>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"product-title\" href=\"mu-tat-yamachu.html\">Mù tạt Yamachu </a>\n");
      out.write("    <div class=\"product-price\">\n");
      out.write("        72.000 VND     </div>\n");
      out.write("    \n");
      out.write("    <div class=\"text-uppercase\">\n");
      out.write("        <div class=\"button-group btn-group-justified\">\n");
      out.write("            <a class=\"btn btn-primary btn-lg\" href=\"mu-tat-yamachu.html\" data-cart='{\"entity_id\":277,\"quantity\":1,\"quickcart\":1}'>Mua ngay</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div></div>\n");
      out.write("<div class=\"uk-width-small-1-2 uk-width-medium-1-3 uk-width-large-1-4\" data-key=\"107\">\n");
      out.write("<div class=\"product\">\n");
      out.write("    <a class=\"product-thumbnail\" style=\"display: block\" href=\"than-ngoai-tuoi.html\">\n");
      out.write("        <div><img src=\"../file.freshfoods.vn/global/product/s1-than-ngoai-tuoi.gif\" alt=\"\"></div>        <div class=\"product-overlay\">\n");
      out.write("            <span class=\"read-link\"><i class=\"fa fa-link\"></i></span>        </div>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"product-title\" href=\"than-ngoai-tuoi.html\">Thăn ngoại bò Úc tươi </a>\n");
      out.write("    <div class=\"product-price\">\n");
      out.write("        320.000 VND     </div>\n");
      out.write("    \n");
      out.write("    <div class=\"text-uppercase\">\n");
      out.write("        <div class=\"button-group btn-group-justified\">\n");
      out.write("            <a class=\"btn btn-primary btn-lg\" href=\"than-ngoai-tuoi.html\" data-cart='{\"entity_id\":107,\"quantity\":1,\"quickcart\":1}'>Mua ngay</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div></div></div>\n");
      out.write("                        <div class=\"uk-text-center\">\n");
      out.write("                            <a class=\"btn btn-primary btn-lg\" href=\"san-pham-ban-le.html\">Xem thêm</a>                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("            <section class=\"bottom-b hidden-print\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-4 col-md-3\">\n");
      out.write("                        <div class=\"module title1\">\n");
      out.write("                            <h3 class=\"module-title\">Liên hệ</h3>\n");
      out.write("                            <div class=\"module-content\">\n");
      out.write("                                <div class=\"no-margin\">\n");
      out.write("                                    <p><i class=\"uk-icon-envelope\"></i>&nbsp;&nbsp;<a\n");
      out.write("                                                href=\"mailto:contact@freshfoods.vn\">contact@freshfoods.vn</a></p>\n");
      out.write("                                    <p><i class=\"uk-icon-phone\"></i>&nbsp; <a href=\"tel:0438716138\">0438716138</a>\n");
      out.write("                                    </p>\n");
      out.write("                                    <p><i class=\"uk-icon-hospital-o\"></i>&nbsp;&nbsp; 25 Gia Quất, Thượng Thanh,\n");
      out.write("                                        Long\n");
      out.write("                                        Biên, Hà Nội</p>\n");
      out.write("\n");
      out.write("                                    <p>Hotline: &nbsp;&nbsp;<a\n");
      out.write("                                                href=\"tel:18006866\">18006866</a></p>\n");
      out.write("                                </div>\n");
      out.write("                                <p>\n");
      out.write("                                    <a class=\"uk-icon-button uk-icon-facebook\"\n");
      out.write("                                       href=\"https://www.facebook.com/freshfoodsthucphamsachTP/\"></a>\n");
      out.write("                                    <a class=\"uk-icon-button uk-icon-youtube\"\n");
      out.write("                                       href=\"https://www.youtube.com/channel/UCov8stz5gsTSaQfrNH08QcA/feed\"></a>\n");
      out.write("                                </p>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4 col-md-3\">\n");
      out.write("                        <div class=\"module title1\">\n");
      out.write("                            <h3 class=\"module-title\"> Trợ giúp nhanh </h3>\n");
      out.write("                            <div class=\"module-content\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"tro-giup-thanh-toan.html\">Hướng dẫn thanh toán</a>                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"tro-giup-mua-hang.html\">Hướng dẫn mua hàng</a>                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"site/contact.html\">Liên hệ</a>                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4 col-md-3\">\n");
      out.write("                        <div class=\"module title1\">\n");
      out.write("                            <h3 class=\"module-title\">Chính sách bán hàng</h3>\n");
      out.write("                            <div class=\"module-content\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"chinh-sach-va-quy-dinh-chung.html\">Chính sách và quy định chung</a></li>\n");
      out.write("                                    <li><a href=\"chinh-sach-van-chuyen-hang-hoa.html\">Chính sách vận chuyển</a></li>\n");
      out.write("                                    <li><a href=\"chinh-sach-doi-tra-hang.html\">Chính sách đổi trả hàng</a></li>\n");
      out.write("                                    <li><a href=\"chinh-sach-bao-mat-thong-tin-khach-hang.html\">Chính sách bảo mật thông tin</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4 col-md-3\">\n");
      out.write("                        <div class=\"module title1\">\n");
      out.write("                            <div class=\"module-content\">\n");
      out.write("                                <div class=\"fb-page\" data-href=\"https://www.facebook.com/freshfoodsthucphamsachTP/\"\n");
      out.write("                                     data-small-header=\"false\" data-adapt-container-width=\"true\" data-hide-cover=\"false\"\n");
      out.write("                                     data-show-facepile=\"true\">\n");
      out.write("                                    <blockquote cite=\"https://www.facebook.com/freshfoodsthucphamsachTP/\"\n");
      out.write("                                                class=\"fb-xfbml-parse-ignore\"><a\n");
      out.write("                                                href=\"https://www.facebook.com/freshfoodsthucphamsachTP/\">Fresh Foods\n");
      out.write("                                            Thực Phẩm Sạch Thương Mại T&amp;P</a></blockquote>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <br>\n");
      out.write("                                <br>\n");
      out.write("                                <a href=\"http://online.gov.vn/HomePage/CustomWebsiteDisplay.aspx?DocId=38662\">\n");
      out.write("                                    <img src=\"../online.gov.vn/PublicImages/2015/08/27/11/20150827110756-dathongbao.png\"\n");
      out.write("                                         style=\"width: 200px; height: auto\">\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("         <footer id=\"footer\" class=\"footer hidden-print\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12 col-md-12\">\n");
      out.write("                        <div class=\"column \">\n");
      out.write("                            <span class=\"copyright\"> &copy; 2020 Freshfoods.vn</span>\n");
      out.write("                            <div style=\"font-size: 13px\">CÔNG TY TNHH THỰC PHẨM SẠCH THƯƠNG MẠI T&P Số ĐKKD: 0105957237\n");
      out.write("                                - Ngày cấp: 31/07/2012, được sửa đổi lần thứ 7, ngày 15/06/2015\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.TK != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li class=\"nav-item\">\n");
        out.write("                                    <a class=\"nav-link\" href=\"logout\">Logout</a>\n");
        out.write("                                </li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li class=\"nav-item\">\n");
        out.write("                                <a class=\"nav-link\" href=\"login\">Login</a>\n");
        out.write("                                </li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
