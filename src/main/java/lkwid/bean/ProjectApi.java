package lkwid.bean;

import lkwid.entity.Project;
import lkwid.entity.Vote;

public class ProjectApi {
	private String name;
	private String description;
	private boolean closed;
	private int votesFor;
	private int votesAgainst;
	
	public ProjectApi(Project project) {
		this.name = project.getName();
		this.description = project.getDescription();
		this.closed = project.isClosed();
		
		for (Vote vote : project.getVotes()) {
			if (vote.getVotingResult())
				votesFor++;
			else if (!vote.getVotingResult())
				votesAgainst++;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}

	public int getVotesFor() {
		return votesFor;
	}

	public void setVotesFor(int votesFor) {
		this.votesFor = votesFor;
	}

	public int getVotesAgainst() {
		return votesAgainst;
	}

	public void setVotesAgainst(int votesAgainst) {
		this.votesAgainst = votesAgainst;
	}	
	
}
