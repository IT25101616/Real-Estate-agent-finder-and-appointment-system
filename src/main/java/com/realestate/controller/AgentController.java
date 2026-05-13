package com.realestate.controller;

import com.realestate.model.Agent;
import com.realestate.service.AgentService;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/agents")
public class AgentController {
    private final AgentService agentService;
    public AgentController(AgentService agentService) { this.agentService = agentService; }

    @GetMapping
    public ArrayList<Agent> getAllAgents() { return agentService.getAllAgents(); }

    @GetMapping("/{id}")
    public Agent getAgentById(@PathVariable int id) { return agentService.getAgentById(id); }

    @PostMapping
    public Agent addAgent(@RequestBody Agent agent) { return agentService.addAgent(agent); }

    @PutMapping("/{id}")
    public Agent updateAgent(@PathVariable int id, @RequestBody Agent agent) { return agentService.updateAgent(id, agent); }

    @DeleteMapping("/{id}")
    public String deleteAgent(@PathVariable int id) { return agentService.deleteAgent(id) ? "Agent deleted" : "Agent not found"; }
}
