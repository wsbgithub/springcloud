package com.wangsb.provider.controller;


import com.wangsb.provider.entity.Depart;
import com.wangsb.provider.service.DepartService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/provider/depart")
@RestController
public class DepartController {

    private final DepartService service;

    public DepartController(DepartService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public Depart saveHandle(@RequestBody Depart depart) {

        return service.saveDepart(depart);
    }


    @DeleteMapping("/del/{id}")
    public void deleteHandle(@PathVariable("id") int id) {
        service.deleteDepartById(id);
    }

    @PutMapping("/update")
    public Depart updateHandle(@RequestBody Depart depart) {
        return service.updateDepart(depart);
    }

    @GetMapping("/get/{id}")
    public Depart getHandle(@PathVariable("id") int id) {
        return service.getDepartById(id);
    }

    @GetMapping("/list")
    public List<Depart> listHandle() {
        return service.getDepartList();
    }

    @GetMapping("/addr")
    public String addrHandle(HttpServletRequest request) {
        String remoteAddr = request.getRemoteAddr();
        int remotePort = request.getRemotePort();

        String localAddr = request.getLocalAddr();
        int localPort = request.getLocalPort();

        StringBuilder sb = new StringBuilder();
        sb.append(remoteAddr).append("\n");
        sb.append(remotePort).append("\n");
        sb.append(localAddr).append("\n");
        sb.append(localPort).append("\n");

        System.out.println(sb);

        return sb.toString();
    }
}
