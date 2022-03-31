package gg.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import gg.objects.*;




public class GetProjectsServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException
	{

	
		
	}
	
	
	//This method will call the processRequest method which in turn will generate the list of projects and send them off to the table.jsp to prepare for their display.
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		try
		{
			processPostRequest(req, resp);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	//This method will process the post request of the user pressing the button to get the List of projects.
	protected void processPostRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
	
		ServletContext context = this.getServletContext();
		

		ServletContext servletContext = getServletContext();
		String path = servletContext.getRealPath("/WEB-INF/");
		File file = new File(path+"/projects.xml");
		

		JAXBContext jaxbContext = JAXBContext.newInstance(Projects.class);
		
		//Unmarshalling means here converting the xml to the corresponding Project object
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	   
		
				
		//Start the process of binding the xml attributes to the corresponding Project attributes in the Project class file.
		Projects projects = (Projects) jaxbUnmarshaller.unmarshal(new FileInputStream(file));
	
		
		//Obtain the list of projects and set them as an attribute to send to the jsp for display.
		List<Project> projectList = projects.getProject();
		request.setAttribute("projectList", projectList);

		//Creating a request dispatcher to dispatch the request to request to another resource (in this case the table.jsp file)
		RequestDispatcher rd = request.getRequestDispatcher("table.jsp");
		
		//Now we forward this request with the attribute to the table.jsp
		rd.forward(request, response);
		
		
		
	}

}
