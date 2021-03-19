package com.nu11p0pp0;

import java.io.IOException;
import java.nio.charset.Charset;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

/**
 * Servlet implementation class MainServlet
 */
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MainServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// リクエスト取得.
		request.setCharacterEncoding("windows-31j");

		String txt = request.getParameter("TXT");

		if (StringUtils.isEmpty(txt)) {
			txt = "";
		}

		String txt_932_utf8 = new String(txt.getBytes(Charset.forName("windows-31j")), Charset.forName("utf-8"));
		String convTxt = new String(txt_932_utf8.getBytes(), Charset.forName("windows-31j"));

		//レスポンス
		response.setContentType("text/html; charset=windows-31j");
		response.setHeader("progma","no-cache");
		response.setHeader("Cache-Control","no-cache");

		response.getWriter().append("<!DOCTYPE>")
				.append("<html lang=\"ja\">")
				.append("<head>")
				.append("<meta charset=\"windows-31j\">")
				.append("</head>")
				.append("<body>")
				.append("txt = " + txt + "<br>")
				.append("convTxt = " + convTxt + "<br>")
				.append("</body>")
				.append("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
