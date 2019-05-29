package com.intive.fdv.rentbike.service;

import com.intive.fdv.rentbike.dao.PromotionDao;
import com.intive.fdv.rentbike.model.Promotion;
import com.intive.fdv.rentbike.model.RentContract;

import java.util.Optional;

public class PromotionService {

    PromotionDao promotionDao;

    public PromotionService(PromotionDao promotionDao) {
        this.promotionDao = promotionDao;
    }

    public void applyPromotion(RentContract rentContract) {

        int rentsCounter = rentContract.getRentDatails().size();

        Optional<Promotion> promotion = promotionDao.getPromotions()
                .stream()
                .filter(p -> rentsCounter >= p.getMin() && rentsCounter  <= p.getMax())
                .findFirst();

        promotion.ifPresent(
                p -> rentContract.setPromotion(p)
        );
    }
}
