package com.realestate.service;

import com.realestate.model.Agent;
import com.realestate.repository.AgentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentService implements ManagementService<Agent> {

    private final AgentRepository agentRepository;

    public AgentService(AgentRepository agentRepository) {
        this.agentRepository = agentRepository;
    }

    @Override
    public Agent create(Agent agent) {
        return agentRepository.save(agent);
    }

    @Override
    public List<Agent> getAll() {
        return agentRepository.findAll();
    }

    @Override
    public Agent getById(Long id) {
        return agentRepository.findById(id).orElse(null);
    }

    @Override
    public Agent update(Long id, Agent newAgent) {
        Agent oldAgent = agentRepository.findById(id).orElse(null);

        if (oldAgent != null) {
            oldAgent.setName(newAgent.getName());
            oldAgent.setEmail(newAgent.getEmail());
            oldAgent.setPhone(newAgent.getPhone());
            oldAgent.setArea(newAgent.getArea());
            oldAgent.setExperienceYears(newAgent.getExperienceYears());
            return agentRepository.save(oldAgent);
        }

        return null;
    }

    @Override
    public boolean delete(Long id) {
        if (agentRepository.existsById(id)) {
            agentRepository.deleteById(id);
            return true;
        }

        return false;
    }
}
