package repository;

import entity.Team;

public class TeamRepository {

	//1.should return MI team Details
	public static Team getMITeamDetails()
	{
		Team team =new Team();
		team.setId(101);
		team.setTeamName("Mumbai Indians");
		team.setcaptainName("Hardik Pandya");
		team.setCoachName("Jaywardhan");
		team.setIsQualified(false);
		team.setNRR(2.3f);
		team.setShortName("MI");
		return team;
	}
	
	//2.csk
	public static Team getCskTeamDetails()
	{
		Team team =new Team();
		team.setId(102);
		team.setTeamName("Chennai Super Kings");
		team.setcaptainName("MahendraSingh Dhoni");
		team.setCoachName("Stephen Flaming");
		team.setIsQualified(false);
		team.setNRR(3.4f);
		team.setShortName("CSK");
		return team;
	}
	
	//3.KKR
	public static Team getKkrTeamDetails()
		{
		Team team =new Team();
		team.setId(103);
		team.setTeamName("Kolkatta Knight Riders");
		team.setcaptainName("Ajinkya Rahane");
		team.setCoachName("Chandrakant Pandit");
		team.setIsQualified(false);
		team.setNRR(6.2f);
		team.setShortName("KKR");
		return team;
		}
	
	//4. Rcb
	public static Team getRcbTeamDetails()
		{
		Team team =new Team();
		team.setId(104);
		team.setTeamName("Royal Challengers Banglore");
		team.setcaptainName("Virat Kohli");
		team.setCoachName("Andy Flower");
		team.setIsQualified(false);
		team.setNRR(2.3f);
		team.setShortName("RCB");
		return team;
		}
		
	//5.DC
	public static Team getDcTeamDetails()
		{
		Team team =new Team();
		team.setId(105);
		team.setTeamName("Delhi Capitals");
		team.setcaptainName("Axar Patel");
		team.setCoachName("Hemang Bdani");
		team.setIsQualified(false);
		team.setNRR(2.3f);
		team.setShortName("DC");
		return team;
		}
		
	//6.RR
	public static Team getRrTeamDetails()
	{
		Team team =new Team();
		team.setId(106);
		team.setTeamName("Rajsthan Royals");
		team.setcaptainName("Sanju Samson");
		team.setCoachName("Rahul Dravid");
		team.setIsQualified(false);
		team.setShortName("RR");
		team.setNRR(2.3f);
		return team;
	}
	
	//7.SH
	public static Team getShTeamDetails()
	{
		Team team =new Team();
		team.setId(107);
		team.setTeamName("Sunrisers Hydrabad");
		team.setcaptainName("Pat Cumins");
		team.setCoachName("Daniel Vattori");
		team.setIsQualified(false);
		team.setNRR(2.3f);
		team.setShortName("SH");
		return team;
	}
	
	//8.PK
	public static Team getPkTeamDetails()
	{
		Team team =new Team();
		team.setId(108);
		team.setTeamName("Punjab Kings");
		team.setcaptainName("Shreyas Iyer");
		team.setCoachName("Ricky Ponting");
		team.setIsQualified(false);
		team.setNRR(2.3f);
		team.setShortName("PK");
		return team;
	}
	
	//9.LSG
	public static Team getLsgTeamDetails()
	{
		Team team =new Team();
		team.setId(109);
		team.setTeamName("Lucknow Super Giants");
		team.setcaptainName("Rishabh Panth");
		team.setCoachName("Justine Langer");
		team.setIsQualified(false);
		team.setNRR(2.3f);
		team.setShortName("LSG");
		return team;
	}
	
	//10.GT
	public static Team getGtTeamDetails()
	{
		Team team =new Team();
		team.setId(110);
		team.setTeamName("Gujarat Titans");
		team.setcaptainName("Shubhman Gill");
		team.setCoachName("Ashish Nehra");
		team.setIsQualified(false);
		team.setNRR(2.3f);
		team.setShortName("GT");
		return team;
	}
	
	
	
	
	
	
}
