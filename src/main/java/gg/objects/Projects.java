package gg.objects;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class is responsible for binding the XML properties to the correct attribute.
 * @author prece
 *
 */
@XmlRootElement(name="projects")
public class Projects
{	
	
	private List<Project> project;
	private String nextProjectId;
	
	public List<Project> getProject() {
		return project;
	}

	//This annotation helps set the "Project" XML tags to the Project object.
	@XmlElement(name="project")
	public void setProject(List<Project> project) {
		this.project = project;
	}

	//This annotation and setter sets the nextProjectId xml tag to the nextProjectId variable.
	@XmlElement(name="nextProjectId")
	public String getNextProjectId() {
		return nextProjectId;
	}

	public void setNextProjectId(String nextProjectId) {
		this.nextProjectId = nextProjectId;
	}
	
	
	
	
}
