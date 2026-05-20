package com.realestate.controller;

import com.realestate.model.Agent;
import com.realestate.service.AgentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agents")
@CrossOrigin(origins = "*")
public class AgentController {

    private final AgentService agentService;

    public AgentController(AgentService agentService) {
        this.agentService = agentService;
    }

    @PostMapping
    public Agent createAgent(@RequestBody Agent agent) {
        return agentService.create(agent);
    }

    @GetMapping
    public List<Agent> getAllAgents() {
        return agentService.getAll();
    }

    @GetMapping("/{id}")
    public Agent getAgentById(@PathVariable Long id) {
        return agentService.getById(id);
    }

    @PutMapping("/{id}")
    public Agent updateAgent(@PathVariable Long id, @RequestBody Agent agent) {
        return agentService.update(id, agent);
    }

    @DeleteMapping("/{id}")
    public String deleteAgent(@PathVariable Long id) {
        return agentService.delete(id) ? "Agent deleted successfully" : "Agent not found";
    }
}
