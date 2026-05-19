package com.realestate.repository;

import com.realestate.model.Agent;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public class AgentRepository {
    private final ArrayList<Agent> agents = new ArrayList<>();

    public ArrayList<Agent> findAll() { return agents; }

    public Agent findById(int id) {
        for (Agent agent : agents) {
            if (agent.getUserId() == id) return agent;
        }
        return null;
    }

    public Agent save(Agent agent) { agents.add(agent); return agent; }

    public Agent update(int id, Agent newAgent) {
        Agent agent = findById(id);
        if (agent != null) {
            agent.setName(newAgent.getName());
            agent.setEmail(newAgent.getEmail());
            agent.setPhone(newAgent.getPhone());
            agent.setArea(newAgent.getArea());
            agent.setExperienceYears(newAgent.getExperienceYears());
        }
        return agent;
    }

    public boolean delete(int id) { return agents.remove(findById(id)); }
}
