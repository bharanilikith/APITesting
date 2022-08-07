package seralizationandseseralization;

public class Project {
	
	String ProjectName;
	int projectId;
	int teamsize;
	String status;
	
	
	public Project(String projectName, int projectId, int teamsize, String status) {
		super();
		ProjectName = projectName;
		this.projectId = projectId;
		this.teamsize = teamsize;
		this.status = status;
	}
	
	public Project() {
		
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getTeamsize() {
		return teamsize;
	}

	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

	
	
	
	
	
	
	
	
	

}
