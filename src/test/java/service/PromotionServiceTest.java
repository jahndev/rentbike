package service;

import com.intive.fdv.rentbike.dao.PromotionDao;
import com.intive.fdv.rentbike.model.*;
import com.intive.fdv.rentbike.service.PromotionService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PromotionServiceTest {

    private static PromotionDao promotionDao = mock(PromotionDao.class);

    private static PromotionService promotionService = new PromotionService(promotionDao);

    private static RentType rentTypeHour = new RentType("hour","hour");
    private static RentType rentTypeDay = new RentType("day","day");
    private static RentType rentTypeWeek = new RentType("week","week");

    private static Currency currency = new Currency("USD","Dollar","$");

    private static Long RENT_ID_HOUR = 1l;
    private static Long RENT_ID_DAY = 2l;
    private static Long RENT_ID_WEEK= 3l;

    private static Double PRICE_HOUR = 5.0;
    private static Double PRICE_DAY = 20.0;
    private static Double PRICE_WEEK = 60.0;

    private static Rent rentByHour = new Rent(RENT_ID_DAY,PRICE_HOUR,rentTypeHour,currency);
    private static Rent rentByDay = new Rent(RENT_ID_HOUR,PRICE_DAY,rentTypeDay,currency);
    private static Rent rentByWeek = new Rent(RENT_ID_WEEK,PRICE_WEEK,rentTypeWeek,currency);

    private static Bike bike1 = new Bike(1L,"ABC232");
    private static Bike bike2 = new Bike(2L,"ABC565");
    private static Bike bike3 = new Bike(3L,"ABC676");
    private static Bike bike4 = new Bike(4L,"ABC878");
    private static Bike bike5 = new Bike(5L,"ABC288");

    private static Long PROMOTION_FAMILY_RENTAL_ID = 1l;
    private static Double PROMOTION_FAMILY_RENTAL_DISCOUNT = 0.3;
    private static Integer PROMOTION_FAMILY_RENTAL_MIN_RENTS = 3;
    private static Integer PROMOTION_FAMILY_RENTAL_MAX_RENTS = 5;

    private static Promotion promotion = new Promotion(PROMOTION_FAMILY_RENTAL_ID,
            "family_rental",
            "Family Rental",
            PROMOTION_FAMILY_RENTAL_DISCOUNT,
            PROMOTION_FAMILY_RENTAL_MIN_RENTS,
            PROMOTION_FAMILY_RENTAL_MAX_RENTS);

    private static Date date = new Date(1l);

    private static RentDatail rentDatail1 = new RentDatail(bike1,1,date,date,date,date,rentByHour);
    private static RentDatail rentDatail2 = new RentDatail(bike2,1,date,date,date,date,rentByHour);
    private static RentDatail rentDatail3 = new RentDatail(bike3,1,date,date,date,date,rentByHour);
    private static RentDatail rentDatail4 = new RentDatail(bike4,1,date,date,date,date,rentByHour);
    private static RentDatail rentDatail5 = new RentDatail(bike5,1,date,date,date,date,rentByHour);

    private static List<RentDatail> rentDatailList = new ArrayList<>();

    private static RentContract rentContract = new RentContract(rentDatailList);

    private static List<Promotion> promotionList = new ArrayList<>();

    @BeforeClass
    public static void onSetup() {

        promotionList.add(promotion);
        when(promotionDao.getPromotions()).thenReturn(promotionList);
    }

    @Test
    public void testRentContractWithPromotionAND2Rent() {

        rentDatailList.add(rentDatail1);
        rentDatailList.add(rentDatail2);

        rentContract.setRentDatails(rentDatailList);

        promotionService.applyPromotion(rentContract);

        Assert.assertEquals(rentContract.getPromotion(),null);
    }

    @Test
    public void testRentContractWithPromotionAND3Rent() {

        rentDatailList.add(rentDatail1);
        rentDatailList.add(rentDatail2);
        rentDatailList.add(rentDatail3);

        promotionService.applyPromotion(rentContract);

        Assert.assertTrue(rentContract.getPromotion().getId().equals(PROMOTION_FAMILY_RENTAL_ID));
    }

    @Test
    public void testRentContractWithPromotionAND6Rent() {

        rentDatailList.add(rentDatail1);
        rentDatailList.add(rentDatail2);
        rentDatailList.add(rentDatail3);
        rentDatailList.add(rentDatail4);
        rentDatailList.add(rentDatail5);
        rentDatailList.add(rentDatail1);

        promotionService.applyPromotion(rentContract);

        Assert.assertEquals(rentContract.getPromotion(),null);
    }

}
