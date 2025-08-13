package service;

import entity.Team;
import repository.TeamRepository;

public class TeamService {
	
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
