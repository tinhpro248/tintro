package com.project.controller;

import com.project.dto.*;
import com.project.reponse.*;
import com.project.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class ManageController {
    @Autowired
    ManageService manageService;

    @GetMapping("room/{id}")
    public RoomInfoDTO roomInfo(@PathVariable int id, @Param("s") boolean s){
        return manageService.roomInfo(id);
    }

    @GetMapping("room")
    public List<RoomInfoDTO> roomList(@Param("id") int id){
        return manageService.roomList(id);
    }

    @GetMapping("tenant")
    public List<TenantListDTO> tenantsList(@Param("id") int id){
        return manageService.getTenantList(id);
    }

    @GetMapping("tenant/{id}")
    public TenantDTO tenant(@PathVariable int id){
        return manageService.getTenant(id);
    }

    @DeleteMapping("tenant/{id}")
    public boolean tenantDelete(@PathVariable int id){
        return manageService.deleteTenant(id);
    }

    @GetMapping("revenue")
    public List<RevenueListDTO> revenues(@Param("id") int id){
        return manageService.getRevenues(id);
    }

    @GetMapping("bill")
    public List<BillListDTO> bills(@Param("id") int id){
        return manageService.getList2Bill(id);
    }

    @GetMapping("revenue/all")
    public List<RevenueListDTO> revenueAll(@Param("id") int id){
        return manageService.getRevenuesAll(id);
    }

    @GetMapping("bill/all")
    public List<BillListDTO> billAll(@Param("userId") int id){
        return manageService.getListAllBill(id);
    }

    @GetMapping("bill/all/{id}")
    public BillDTO billDetail(@PathVariable int id){
        return manageService.getBill(id);
    }

    @GetMapping("revenue/all/{id}")
    public RevenueDTO revenueDetail(@PathVariable int id){
        return manageService.getRevenue(id);
    }

    @DeleteMapping("revenue/all/{id}")
    public boolean revenueDelete(@PathVariable int id){
        return manageService.deleteRevenue(id);
    }

    @DeleteMapping("bill/all/{id}")
    public boolean billDelete(@PathVariable int id){
        return manageService.deleteBill(id);
    }

    @PostMapping("bill/all/{id}")
    public BillDetailReponse editBill(@PathVariable int id, @RequestBody BillDetailReponse bill){
        return manageService.editBill(bill);
    }

    @PutMapping("bill/all")
    public BillDetailReponse addBill(@RequestBody BillDetailReponse bill){
        return manageService.addBill(bill);
    }

    @PostMapping("bill/all/{id}/pay")
    public boolean payBill(@PathVariable int id){
        return manageService.payBill(id);
    }

    @GetMapping("incident")
    public List<IncidentListDTO> incidents(@Param("id") int id, @Param("type") int type){
        return manageService.getListIncident(id);
    }

    @GetMapping("incident/{id}")
    public IncidentDTO incidentDetail(@PathVariable int id){
        return manageService.getIncident(id);
    }

    @PostMapping("incident/{id}")
    public IncidentDetailReponse incidentEdit(@PathVariable int id, @RequestBody IncidentDetailReponse incident){
        return manageService.editIncident(incident);
    }

    @GetMapping("room/name")
    public List<RoomNameDTO> roomName(@Param("id") int id){
        return manageService.getRoomName(id);
    }

    @GetMapping("service")
    public List<ServiceListDTO> services(@Param("id") int id){
        return manageService.getServiceList(id);
    }

    @GetMapping("service/room")
    public List<ServiceListReponse> servicesRoom(@Param("id") int id){
        return manageService.getServiceListRoom(id);
    }



    @GetMapping("service/{id}")
    public ServiceDetailReponse serviceDetail(@PathVariable int id){
        return null;
    }

    @PostMapping("service/{id}")
    public ServiceDetailReponse serviceEdit(@PathVariable int id, @RequestBody ServiceDetailReponse service){
        return new ServiceDetailReponse();
    }

    @GetMapping("room/tus")
    public List<RoomTusReponse> roomTusList(@Param("id") int id){
        return manageService.getTusList(id);
    }

    @GetMapping("room/tus/no")
    public List<RoomNoTusReponse> roomNoTusList(@Param("id") int id){
        return manageService.getRoomNoTus(id);
    }

    @GetMapping("room/tus/{id}")
    public RoomTusDetailReponse roomTusDetailReponse(@PathVariable int id){
        return manageService.getTus(id);
    }

    @PostMapping("room/tus/no/{id}")
    public RoomTusDetailReponse roomTusAdd(@PathVariable int id, @RequestBody String note){
        return manageService.addTus(id, note);
    }
}
