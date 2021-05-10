package com.file;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class FileController2
 */
@WebServlet("/file2/upload")
public class FileController2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileController2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String savePath = "upload";
		int uploadFileSizeLimit = 5*1024*1024;
		String encType = "utf-8";
		ServletContext context = getServletContext();
		String uploadFilePath = context.getRealPath(savePath);
		System.out.println("서버상의 실제 디렉토리 : " + uploadFilePath);
		
		MultipartRequest multi = new MultipartRequest(
				request, uploadFilePath, uploadFileSizeLimit, 
				encType, new DefaultFileRenamePolicy());
		
		//업로드한 파일 이름
		String fileName = multi.getFilesystemName("uploadFile");
		System.out.println("파일 명 : " + fileName);
		if(fileName==null) fileName=""; 
		String name = multi.getParameter("name");
		String title = multi.getParameter("title");
		String image = fileName;
		FileDAO dao = FileDAO.getInstance();
		FileDTO file = new FileDTO(name, title, image); //setter나 생성자를 이용해서 값 할당
		dao.fileInsert(file);
		response.sendRedirect("imageList");
	}

}
