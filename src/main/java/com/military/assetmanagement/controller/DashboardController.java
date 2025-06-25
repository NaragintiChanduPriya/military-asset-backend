package com.military.assetmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.military.assetmanagement.DTO.DashboardSummaryDTO;
import com.military.assetmanagement.model.Asset;
import com.military.assetmanagement.model.Assignment;
import com.military.assetmanagement.model.Purchase;
import com.military.assetmanagement.model.Transfer;
import com.military.assetmanagement.repository.AssetRepository;
import com.military.assetmanagement.repository.AssignmentRepository;
import com.military.assetmanagement.repository.PurchaseRepository;
import com.military.assetmanagement.repository.TransferRepository;

@RestController
@RequestMapping("/api/dashboard")
@CrossOrigin(origins = "*")
public class DashboardController {

    @Autowired 
    private AssetRepository assetRepository;
    @Autowired 
    private PurchaseRepository purchaseRepository;
    @Autowired 
    private TransferRepository transferRepository;
    @Autowired 
    private AssignmentRepository assignmentRepository;

    @GetMapping
    public List<DashboardSummaryDTO> getDashboardSummary() {

        List<Asset> assets = assetRepository.findAll();

        List<DashboardSummaryDTO> summaryList = new ArrayList<>();

        for (Asset asset : assets) {
            String equipmentName = asset.getName();
            String equipmentType = asset.getType();
            String baseName = asset.getBase().getName();

            int purchases = purchaseRepository.findByEquipmentNameAndBaseId(equipmentName, asset.getBase().getId())
                                .stream().mapToInt(Purchase::getQuantity).sum();

            int transfersIn = transferRepository.findByEquipmentNameAndToBaseId(equipmentName, asset.getBase().getId())
                                .stream().mapToInt(Transfer::getQuantity).sum();

            int transfersOut = transferRepository.findByEquipmentNameAndFromBaseId(equipmentName, asset.getBase().getId())
                                .stream().mapToInt(Transfer::getQuantity).sum();

            int assigned = assignmentRepository.findByEquipmentNameAndBaseId(equipmentName, asset.getBase().getId())
                                .stream().mapToInt(Assignment::getQuantity).sum();

            int expended = assignmentRepository.findByEquipmentNameAndBaseIdAndExpendedTrue(equipmentName, asset.getBase().getId())
                                .stream().mapToInt(Assignment::getQuantity).sum();

            int closingBalance = asset.getQuantity();  // latest quantity in asset table

            int openingBalance = closingBalance - purchases - transfersIn + transfersOut + assigned + expended;

            DashboardSummaryDTO dto = new DashboardSummaryDTO(
                    equipmentName, equipmentType, baseName,
                    openingBalance, purchases, transfersIn, transfersOut,
                    assigned, expended, closingBalance
            );

            summaryList.add(dto);
        }

        return summaryList;
    }
}
