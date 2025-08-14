package service;

import java.util.Scanner;

import entity.Team;
import repository.TeamRepository;

public class TeamService {
	
	
	public void selectOptions()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the IPL Portal");
		System.out.println("Please select Following options ");
		System.out.println("1. Get All Team Details");
		System.out.println("2.Get All Team Details by short name");
		
		
		
		int input=sc.nextInt();
		System.out.println("You have selcted optin : "+input);
		
		switch(input) {
		//get all team details
		
		case 1:{
			System.out.println(TeamRepository.getMITeamDetails());
			System.out.println(TeamRepository.getCskTeamDetails());
			System.out.println(TeamRepository.getKkrTeamDetails());
			System.out.println(TeamRepository.getDcTeamDetails());
			System.out.println(TeamRepository.getGtTeamDetails());
			System.out.println(TeamRepository.getLsgTeamDetails());
			System.out.println(TeamRepository.getPkTeamDetails());
			System.out.println(TeamRepository.getRcbTeamDetails());
			System.out.println(TeamRepository.getRrTeamDetails());
			System.out.println(TeamRepository.getShTeamDetails());
			
			System.out.println(" Here is your details");
			
			break;
		}
		
		//get deatils by short name
		case 2 : 
		{
			System.out.println("Please Enter Your fav team short name and get all info:" );
			String teamShortName=sc.next();
			System.out.println("Entered team short name is : " +teamShortName);
			getTeamByShortName(teamShortName);
			
		}
	    default :
	    	System.out.println("Invalid input :"+input);
		}
		
	}
	
	private  void getTeamByShortName(String shortName)
	{
		switch(shortName)
		{
		case "MI":
		{
			System.out.println(TeamRepository.getMITeamDetails());
			break;
		}
		case "CSK":
		{
			System.out.println(TeamRepository.getCskTeamDetails());
			break;
		}
		case "KKR":
		{
			System.out.println(TeamRepository.getKkrTeamDetails());
			break;
		}
		case "DC":
		{
			System.out.println(TeamRepository.getDcTeamDetails());
			break;
		}
		case "GT":
		{
			System.out.println(TeamRepository.getGtTeamDetails());
			break;
		}
		case "LSG":
		{
			System.out.println(TeamRepository.getLsgTeamDetails());
			break;
		}
		case "PK":
		{
			System.out.println(TeamRepository.getPkTeamDetails());
			break;
		}
		case "SH":
		{
			System.out.println(TeamRepository.getShTeamDetails());
			break;
		}
		case "RR":
		{
			System.out.println(TeamRepository.getRrTeamDetails());
			break;
		}
		case "RCB":
		{
			System.out.println(TeamRepository.getRcbTeamDetails());
			break;
		}
		
		}
	}
	
	
	
	public void printTeamDetails()
	{
		
		
		Team team=TeamRepository.getMITeamDetails();		
		System.out.println(team.getId());
		System.out.println(team.getTeamName());
		System.out.println(team.getCaptainName());
		System.out.println(team.getCoachName());
		System.out.println(team.getNRR());
		System.out.println(team.getIsQualified());
		
		
		Team team1=TeamRepository.getCskTeamDetails();
		System.out.println(team1.getId());
		System.out.println(team1.getTeamName());
		System.out.println(team1.getCaptainName());
		System.out.println(team1.getCoachName());
		System.out.println(team1.getNRR());
		System.out.println(team1.getIsQualified());

		Team team3=TeamRepository.getKkrTeamDetails();
		System.out.println(team3.getId());
		System.out.println(team3.getTeamName());
		System.out.println(team3.getCaptainName());
		System.out.println(team3.getCoachName());
		System.out.println(team3.getNRR());
		System.out.println(team3.getIsQualified());
		
		Team team4=TeamRepository.getRcbTeamDetails();
		System.out.println(team4.getId());
		System.out.println(team4.getTeamName());
		System.out.println(team4.getCaptainName());
		System.out.println(team4.getCoachName());
		System.out.println(team4.getNRR());
		System.out.println(team4.getIsQualified());
		
		Team team5=TeamRepository.getDcTeamDetails();
		System.out.println(team5.getId());
		System.out.println(team5.getTeamName());
		System.out.println(team5.getCaptainName());
		System.out.println(team5.getCoachName());
		System.out.println(team5.getNRR());
		System.out.println(team5.getIsQualified());
		
		Team team6=TeamRepository.getRrTeamDetails();
		System.out.println(team6.getId());
		System.out.println(team6.getTeamName());
		System.out.println(team6.getCaptainName());
		System.out.println(team6.getCoachName());
		System.out.println(team6.getNRR());
		System.out.println(team6.getIsQualified());
		
		Team team7=TeamRepository.getShTeamDetails();
		System.out.println(team7.getId());
		System.out.println(team7.getTeamName());
		System.out.println(team7.getCaptainName());
		System.out.println(team7.getCoachName());
		System.out.println(team7.getNRR());
		System.out.println(team7.getIsQualified());
		
		Team team8=TeamRepository.getPkTeamDetails();
		System.out.println(team8.getId());
		System.out.println(team8.getTeamName());
		System.out.println(team8.getCaptainName());
		System.out.println(team8.getCoachName());
		System.out.println(team8.getNRR());
		System.out.println(team8.getIsQualified());
		
		Team team9=TeamRepository.getLsgTeamDetails();
		System.out.println(team9.getId());
		System.out.println(team9.getTeamName());
		System.out.println(team9.getCaptainName());
		System.out.println(team9.getCoachName());
		System.out.println(team9.getNRR());
		System.out.println(team9.getIsQualified());
		
		Team team10=TeamRepository. getGtTeamDetails();
		System.out.println(team10.getId());
		System.out.println(team10.getTeamName());
		System.out.println(team10.getCaptainName());
		System.out.println(team10.getCoachName());
		System.out.println(team10.getNRR());
		System.out.println(team10.getIsQualified());
		
		

	}
}
