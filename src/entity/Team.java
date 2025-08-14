package entity;

public class Team {
	
	private int id;
	
	private String teamName;
	
	private String captainName;
	
	private String coachName;
	
	private float nRR;
	
	private boolean isQualified;
	
	
	@Override
	public String toString() {
		return "Team [id=" + id + ", teamName=" + teamName + ", captainName=" + captainName + ", coachName=" + coachName
				+ ", nRR=" + nRR + ", isQualified=" + isQualified + "]";
	}
	
	//setter-getter
	
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setTeamName(String teamName)
	{
		this.teamName=teamName;
	}
	public String getTeamName()
	{
		return teamName;
	}
	
	public void setcaptainName(String captainName)
	{
		this.captainName=captainName;
	}
	public String getCaptainName()
	{
		return captainName;
	}
	
	public void setCoachName(String coachName)
	{
		this.coachName=coachName;
	}
	public String getCoachName()
	{
		return coachName;
	}
	
	public void setNRR(float nRR)
	{
		this.nRR=nRR;
	}
	public float getNRR()
	{
		return nRR;
	}
	
	public void  setIsQualified(boolean isQualified)
	{
		this.isQualified= isQualified;
	}
	public boolean getIsQualified()
	{
		return  isQualified;
	}
	
}
