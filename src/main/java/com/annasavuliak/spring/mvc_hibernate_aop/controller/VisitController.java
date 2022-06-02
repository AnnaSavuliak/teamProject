package com.annasavuliak.spring.mvc_hibernate_aop.controller;

import com.annasavuliak.spring.mvc_hibernate_aop.entity.Visit;
import com.annasavuliak.spring.mvc_hibernate_aop.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;


@Controller
public class VisitController {
    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }
    @Autowired
    private VisitService visitService;

    @RequestMapping("/askVisitDetails")
    public String askVisitDetails(Model model) {
        model.addAttribute("visit", new Visit());
        return "client-visit-info";
    }

    @RequestMapping("/saveClientVisit")
    public String saveClientVisit(@ModelAttribute("visit") Visit visit) {

        visitService.saveVisit(visit);

        return "redirect:/showVisitDetails";
    }

    @RequestMapping("/showVisitDetails")
    public String showVisitDetails(@Valid @ModelAttribute("visit") Visit visit, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "client-visit-info";
        }
        else{
            return "show-client-visit-info";
        }
    }
    @RequestMapping("/admin")
    public String showAllVisits(Model model) {
        List<Visit> allVisits = visitService.getAllVisits();
        model.addAttribute("allVis", allVisits);
        return "all-visits";
    }
    @RequestMapping("/addNewVisit")
    public String addNewVisit(Model model){
        Visit visit = new Visit();
        model.addAttribute("visit", visit);
        return "visit-info";
    }
    @RequestMapping("/saveVisit")
    public String saveVisit(@ModelAttribute("visit") Visit visit) {

        visitService.saveVisit(visit);

        return "redirect:/admin";
    }

    @RequestMapping("/updateInfo")
    public String updateVisit(@RequestParam("visId") int id, Model model){
        Visit visit = visitService.getVisit(id);
        model.addAttribute("visit", visit);
        return "visit-info";
    }
    @RequestMapping("/deleteVisit")
    public String deleteVisit(@RequestParam("visId") int id){
        visitService.deleteVisit(id);
        return "redirect:/admin";
    }
}
