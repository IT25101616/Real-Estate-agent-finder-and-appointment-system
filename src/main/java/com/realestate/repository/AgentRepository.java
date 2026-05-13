package com.realestate.repository;

import com.realestate.model.Agent;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class AgentRepository {

    private ArrayList<Agent> agents = new ArrayList<>();

    public AgentRepository() {
        agents.add(new Agent(1, "Kasun Perera", "kasun@gmail.com", "0771234567", "Colombo", 5));
        agents.add(new Agent(2, "Nimal Silva", "nimal@gmail.com", "0779876543", "Kandy", 3));
        agents.add(new Agent(3, "Amal Fernando", "amal@gmail.com", "0714567890", "Galle", 4));
    }

    public ArrayList<Agent> findAll() {
        return agents;
    }

    public Agent findById(int id) {
        for (Agent agent : agents) {
            if (agent.getUserId() == id) {
                return agent;
            }
        }
        return null;
    }

    public Agent save(Agent agent) {
        agents.add(agent);
        return agent;
    }

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

    public boolean delete(int id) {
        Agent agent = findById(id);

        if (agent != null) {
            agents.remove(agent);
            return true;
        }

        return false;
    }
}