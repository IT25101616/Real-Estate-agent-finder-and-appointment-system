package com.realestate.service;

import com.realestate.model.Agent;
import com.realestate.repository.AgentRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class AgentService {
    private final AgentRepository agentRepository;
    public AgentService(AgentRepository agentRepository) { this.agentRepository = agentRepository; }
    public ArrayList<Agent> getAllAgents() { return agentRepository.findAll(); }
    public Agent getAgentById(int id) { return agentRepository.findById(id); }
    public Agent addAgent(Agent agent) { return agentRepository.save(agent); }
    public Agent updateAgent(int id, Agent agent) { return agentRepository.update(id, agent); }
    public boolean deleteAgent(int id) { return agentRepository.delete(id); }
}
