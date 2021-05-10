package com.product.action;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.product.model.Product;
import com.product.model.ProductDAO;
import com.product.model.ProductDAOImpl;

/**
 * Servlet implementation class ProductUpdateController
 */
@WebServlet("/product/pupdate")
public class ProductUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		long productId = Long.parseLong(request.getParameter("productId"));
		ProductDAO pdao = ProductDAOImpl.getInstance();
		Product product = pdao.findById(productId);
		request.setAttribute("product", product);
		request.getRequestDispatcher("productUpdate.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String savePath = "upload"; 
		int uploadFileSizeLimit = 10*1024*1024;
		String encType = "UTF-8";
		ServletContext context = getServletContext();
		String uploadFilePath =  context.getRealPath(savePath);
		System.out.println("�������� ���� ���丮 :" + uploadFilePath);
		MultipartRequest multi = new MultipartRequest(
				request,
				uploadFilePath,
				uploadFileSizeLimit,
				encType,
				new DefaultFileRenamePolicy());
		

		String fileName = multi.getFilesystemName("productImage");
		System.out.println("���ϸ� :" +fileName);
		if(fileName==null) fileName=multi.getParameter("filename");
		ProductDAO pdao = ProductDAOImpl.getInstance();
		Product product = new Product();
		product.setProductId(Long.parseLong(multi.getParameter("productId")));
		product.setPname(multi.getParameter("name"));
		product.setWriter(multi.getParameter("writer"));
		product.setUnitPrice(Integer.parseInt(multi.getParameter("unitPrice")));
		product.setDescription(multi.getParameter("description"));
		product.setUnitsInStock(Integer.parseInt(multi.getParameter("unitsInStock")));
		product.setCategory(multi.getParameter("category"));
		product.setCondition(multi.getParameter("condition"));
		product.setManufacturer(multi.getParameter("manufacturer"));
		product.setFilename(fileName);
		pdao.productUpdate(product);
		response.sendRedirect("plist");
	}

}
